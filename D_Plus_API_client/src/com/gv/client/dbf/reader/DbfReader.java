package com.gv.client.dbf.reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.gv.client.model.Cliente;
import com.gv.client.model.ClienteEnRutaDeVenta;
import com.gv.client.model.PersonalComercial;
import com.gv.client.model.RutaDeVenta;
import com.linuxense.javadbf.DBFException;
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
	
	public ArrayList<Cliente> readClientes() throws ParseException {
	
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		cliente.setFechaAlta(format.parse("2019/09/18"));
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		reader = null;

		try {

			// create a DBFReader object
			reader = new DBFReader(new FileInputStream("//192.168.90.2/visual/cccuenta.dbf"));

			// get the field count if you want for some reasons like the following
			DBFRow row;

			while ((row = reader.nextRow()) != null) {
				
				String condicionIva = null;
				switch (row.getInt("CLICDIVA")) {
					case 1:
						condicionIva = "RI";
						break;
					case 3:
						condicionIva = "MT";
						break;
					case 4:
						condicionIva = "EX";	
						break;
					case 5:
						condicionIva = "CF";
						break;
					case 7:
						condicionIva = "NC";
						break;
						
				}
				
				Cliente cliente = new Cliente();									
				
				cliente.setCodigoSucursal(1);
				
				cliente.setCodigoCliente(row.getString("CLICODIGO"));
				
				cliente.setNombre(row.getString("CLIRAZSOC"));
				
				cliente.setDomicilio(row.getString("CLIDOMICI"));
				
				cliente.setDescripcionLocalidad(row.getString("CLILOCALI"));
				
				cliente.setVendeAlcohol(row.getString("CLIALCOHOL").contentEquals("S") ? true : false);
				
				if (row.getDate("CLIFECALTA") != null)
					cliente.setFechaAlta(format.format(row.getDate("CLIFECALTA")));
								
				if (row.getDate("CLIFECBAJA") != null) {
					cliente.setAnulado(true);
					cliente.setFechaAnulacion(format.format(row.getDate("CLIFECBAJA")));
				}
				
				if(row.getString("CLILATI") != null && !row.getString("CLILATI").isEmpty())
					cliente.setLatitudCoord(Float.parseFloat(row.getString("CLILATI")));
				
				if(row.getString("CLILONG") != null && !row.getString("CLILONG").isEmpty())
					cliente.setLongitudCoord(Float.parseFloat(row.getString("CLILONG")));
				
				cliente.setTipoContribuyente(condicionIva);
				
				cliente.setIdTipoDocumentoCliente(row.getInt("CLICODCUIT"));
				
				cliente.setNumeroCuit(row.getString("CLICUIT"));
				
				cliente.setTelefonos(row.getString("CLITELEF"));				
				
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
	
	public ArrayList<PersonalComercial> readPersonalComercial() {
				
		ArrayList<PersonalComercial> personalComercial = new ArrayList<PersonalComercial>();
		
		reader = null;

		try {

			// create a DBFReader object
			reader = new DBFReader(new FileInputStream("//192.168.90.2/visual/dtchofer.dbf"));

			// get the field count if you want for some reasons like the following
			DBFRow row;

			while ((row = reader.nextRow()) != null) {
				
				if (row.getInt("CHOCAMION") > 0)
					continue;
				
				PersonalComercial pc = new PersonalComercial();									
				
//				cliente.setIdTipoDocumentoCliente(row.getInt("CLICODCUIT"));

				pc.setCodigoSucursal(1);
				pc.setCodigoPersonal(Integer.parseInt(row.getString("CHOCODI")));
				
				if(row.getString("CHOTELE").equals("S")) 
					pc.setCodigoModoAtencion("TEL");
				else
					pc.setCodigoModoAtencion("PRE");
				
				pc.setDescripcion(row.getString("CHONOMBRE"));
				
				if(row.getString("CHOCODI").equals(row.getString("CHOSUPERVI"))) {
					pc.setCargo("S");
				} else { 
					pc.setCargo("V");
					pc.setCodigoPersonalSuperior(Integer.valueOf(row.getString("CHOSUPERVI")));
				}
				
				if(row.getString("CHOACTIVO").equals("S"))
					pc.setAnulado(false);
				else
					pc.setAnulado(true);
				
				pc.setCodigoFuerza(1);
				
				personalComercial.add(pc);

			}

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
		
		return personalComercial;
		
	}
	
	public ArrayList<RutaDeVenta> readRutasDeVenta() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		ArrayList<RutaDeVenta> rutasDeVenta = new ArrayList<RutaDeVenta>();
		
		reader = null;

		try {

			// create a DBFReader object
			reader = new DBFReader(new FileInputStream("//192.168.90.2/visual/dtruta.dbf"));

			// get the field count if you want for some reasons like the following
			DBFRow row;
			
			while ((row = reader.nextRow()) != null) {
			
				if(row.getString("RTVENDED") == null || row.getString("RTVENDED").contentEquals(""))
					continue;
				
				RutaDeVenta rdv = new RutaDeVenta();									
				
				rdv.setCodigoSucursal(1);
				
				rdv.setCodigoFuerza(1);
				
				rdv.setCodigoModoAtencion(row.getString("RTMODATEN"));
				
				rdv.setCodigoRuta(row.getInt("RTCODIGO"));
				
				rdv.setDescripcionRuta(row.getString("RTDESCRIP"));
				
				@SuppressWarnings("unused")
				String aux = row.getString("RTVENDED");
				
				if(row.getString("RTVENDED") != null && !row.getString("RTVENDED").equals(""))
					rdv.setCodigoPersonal(Integer.parseInt(row.getString("RTVENDED")));
				
				if (row.getDate("RTFECHA") != null)
					rdv.setFechaDesde(format.format(row.getDate("RTFECHA")));
								
				rdv.setPeriodicidad(row.getInt("RTPERIODI"));
				
				rdv.setSemana(row.getInt("RTSEMANA"));
				
				rdv.setAtiendeLunes(row.getString("RTATLUN").equals("S") ? true : false);
				
				rdv.setAtiendeMartes(row.getString("RTATMAR").equals("S") ? true : false);

				rdv.setAtiendeMiercoles(row.getString("RTATMIE").equals("S") ? true : false);

				rdv.setAtiendeJueves(row.getString("RTATJUE").equals("S") ? true : false);

				rdv.setAtiendeViernes(row.getString("RTATVIE").equals("S") ? true : false);

				rdv.setAtiendeSabado(row.getString("RTATSAB").equals("S") ? true : false);

				rdv.setAtiendeDomingo(row.getString("RTATDOM").equals("S") ? true : false);

				rdv.setAnulado(row.getString("RTANULA").equals("S") ? true : false);
				
				rutasDeVenta.add(rdv);

			}

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
		
		return rutasDeVenta;
	}

	
	public ArrayList<ClienteEnRutaDeVenta> readClientesEnRutasDeVenta() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		ArrayList<ClienteEnRutaDeVenta> clientesEnRutas = new ArrayList<ClienteEnRutaDeVenta>();
		
		ArrayList<RutaDeVenta> rutas = this.readRutasDeVenta();
		
		reader = null;
		
		try {

			// create a DBFReader object
			reader = new DBFReader(new FileInputStream("//192.168.90.2/visual/cccuenta.dbf"));
			
			// get the field count if you want for some reasons like the following
			DBFRow rowCliente;
			
			// recorro todos los clientes
			while ((rowCliente = reader.nextRow()) != null) {
				
				// si tiene codigo de ruta externa lo cargo
				if(rowCliente.getString("CLICODRTEX") != null) {
					
					ClienteEnRutaDeVenta crdv = new ClienteEnRutaDeVenta();		
					
					// recorro todas las rutas hasta encontrar la que coincide
					for(RutaDeVenta rdv : rutas) {
						
						if(rdv.getCodigoRuta() == rowCliente.getInt("CLICODRTEX")) {
							
							// cargo el cliente en ruta
							crdv.setCodigoSucursal(1);
							crdv.setCodigoFuerza(1);
							crdv.setCodigoModoAtencion(rdv.getCodigoModoAtencion());
							crdv.setCodigoRuta(rdv.getCodigoRuta());
							crdv.setCodigoCliente(rowCliente.getString("CLICODIGO"));
							
							if (rowCliente.getDate("CLIFECBAJA") != null)
								crdv.setAnulado(true);
							
							crdv.setFechaDesde(rdv.getFechaDesde());
							
							crdv.setPeriodicidad(rdv.getPeriodicidad());
							
							crdv.setSemana(rdv.getSemana());
							
							//atiende lunes
							if(rowCliente.getString("CLIDIASVIS").substring(0, 1).equals("S"))
								crdv.setAtiendeLunes(true);
							else
								crdv.setAtiendeLunes(false);
							
							//atiende martes
							if(rowCliente.getString("CLIDIASVIS").substring(1, 2).equals("S"))
								crdv.setAtiendeMartes(true);
							else
								crdv.setAtiendeMartes(false);
							
							//atiende miercoles
							if(rowCliente.getString("CLIDIASVIS").substring(2, 3).equals("S"))
								crdv.setAtiendeMiercoles(true);
							else
								crdv.setAtiendeMiercoles(false);
							
							//atiende jueves
							if(rowCliente.getString("CLIDIASVIS").substring(3, 4).equals("S"))
								crdv.setAtiendeJueves(true);
							else
								crdv.setAtiendeJueves(false);
							
							//atiende viernes
							if(rowCliente.getString("CLIDIASVIS").substring(4, 5).equals("S"))
								crdv.setAtiendeViernes(true);
							else
								crdv.setAtiendeViernes(false);
							
							//atiende sabado
							if(rowCliente.getString("CLIDIASVIS").substring(5, 6).equals("S"))
								crdv.setAtiendeSabado(true);
							else
								crdv.setAtiendeSabado(false);
							
							//atiende domingo
							if(rowCliente.getString("CLIDIASVIS").substring(6, 7).equals("S"))
								crdv.setAtiendeDomingo(true);
							else
								crdv.setAtiendeDomingo(false);
							
							
							if (rowCliente.getDate("CLIFECBAJA") != null)
								crdv.setFechaAnulacion(format.format(rowCliente.getDate("CLIFECBAJA")));
							
							clientesEnRutas.add(crdv);
							
						}
						
					}
				}
				
				
				// si tiene codigo de ruta interna lo cargo
				if(rowCliente.getString("CLICODRTIN") != null) {
					
					ClienteEnRutaDeVenta crdv = new ClienteEnRutaDeVenta();		
					
					// recorro todas las rutas hasta encontrar la que coincide
					for(RutaDeVenta rdv : rutas) {
						
						if(rdv.getCodigoRuta() == rowCliente.getInt("CLICODRTIN")) {
							
							// cargo el cliente en ruta
							crdv.setCodigoSucursal(1);
							crdv.setCodigoFuerza(1);
							crdv.setCodigoModoAtencion(rdv.getCodigoModoAtencion());
							crdv.setCodigoRuta(rdv.getCodigoRuta());
							crdv.setCodigoCliente(rowCliente.getString("CLICODIGO"));
							
							if (rowCliente.getDate("CLIFECBAJA") != null)
								crdv.setAnulado(true);
							
							crdv.setFechaDesde(rdv.getFechaDesde());
							
							crdv.setPeriodicidad(rdv.getPeriodicidad());
							crdv.setSemana(rdv.getSemana());
							
							//atiende lunes
							if(rowCliente.getString("CLITELDIA").substring(0, 1).equals("S"))
								crdv.setAtiendeLunes(true);
							else
								crdv.setAtiendeLunes(false);
							
							//atiende martes
							if(rowCliente.getString("CLITELDIA").substring(1, 2).equals("S"))
								crdv.setAtiendeMartes(true);
							else
								crdv.setAtiendeMartes(false);
							
							//atiende miercoles
							if(rowCliente.getString("CLITELDIA").substring(2, 3).equals("S"))
								crdv.setAtiendeMiercoles(true);
							else
								crdv.setAtiendeMiercoles(false);
							
							//atiende jueves
							if(rowCliente.getString("CLITELDIA").substring(3, 4).equals("S"))
								crdv.setAtiendeJueves(true);
							else
								crdv.setAtiendeJueves(false);
							
							//atiende viernes
							if(rowCliente.getString("CLITELDIA").substring(4, 5).equals("S"))
								crdv.setAtiendeViernes(true);
							else
								crdv.setAtiendeViernes(false);
							
							//atiende sabado
							if(rowCliente.getString("CLITELDIA").substring(5, 6).equals("S"))
								crdv.setAtiendeSabado(true);
							else
								crdv.setAtiendeSabado(false);
							
							//atiende domingo
							if(rowCliente.getString("CLITELDIA").substring(6, 7).equals("S"))
								crdv.setAtiendeDomingo(true);
							else
								crdv.setAtiendeDomingo(false);
														
							if (rowCliente.getDate("CLIFECBAJA") != null)
								crdv.setFechaAnulacion(format.format(rowCliente.getDate("CLIFECBAJA")));
							
							clientesEnRutas.add(crdv);
							
						}
						
					}
				}								
			}

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
		
		return clientesEnRutas;
	}

	
}
