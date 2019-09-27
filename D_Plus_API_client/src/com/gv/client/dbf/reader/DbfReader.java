package com.gv.client.dbf.reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gv.client.model.Cliente;
import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFRow;
import com.linuxense.javadbf.DBFUtils;

public class DbfReader {
	
	private DBFReader reader;
	public static DbfReader instance;
	
	public static DbfReader getInstance() {
		
		return instance == null ? new DbfReader() : instance;	
		
	}
	
	public DbfReader() {
		super();
	}
	
	public ArrayList<Cliente> readClientes() throws ParseException{
	
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//		cliente.setFechaAlta(format.parse("2019/09/18"));
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		reader = null;

		try {

			// create a DBFReader object
			reader = new DBFReader(new FileInputStream("//192.168.90.2/visual/cccuenta.dbf"));

			// get the field count if you want for some reasons like the following
			DBFRow row;

			while ((row = reader.nextRow()) != null) {
				
				if (row.getDate("CLIFECBAJA") != null)
					continue;
				
				String condicionIva = null;
				switch (row.getInt("CLICDIVA")) {
					case 1:
						condicionIva = "RI";
						break;
					case 3:
						condicionIva = "MO";
						break;
					case 5:
						condicionIva = "CF";
						break;
				}
				
				Cliente cliente = new Cliente();									
				
				cliente.setCodigoCliente(row.getString("CLICODIGO"));
				cliente.setNombre(row.getString("CLIRAZSOC"));
				cliente.setDomicilio(row.getString("CLIDOMICI"));
				cliente.setFechaAlta(format.format(row.getDate("CLIFECALTA")));
				cliente.setAnulado(false);	
				cliente.setTipoContribuyente(condicionIva);
				cliente.setIdTipoDocumentoCliente(99);
//				cliente.setIdTipoDocumentoCliente(row.getInt("CLICODCUIT"));
				
				cliente.setCodListaPrecio(0);
				cliente.setCodigoSucursal(1);
				
				
				clientes.add(cliente);

			}

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
		
		return clientes;
		
	}

}
