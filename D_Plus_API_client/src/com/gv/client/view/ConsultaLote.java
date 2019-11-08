package com.gv.client.view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.gv.client.controller.Controller;
import com.gv.client.model.EstadoLote;

public class ConsultaLote extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldLote;
	private JLabel lblEmpresa;
	private JLabel lblUsuario;
	private JLabel lblEntidad;
	private JLabel lblFechaCarga;
	private JLabel lblFechaFin;
	private JLabel lblEstado;
	private JTextField textFieldEmpresa;
	private JTextField textFieldUsuario;
	private JTextField textFieldEntidad;
	private JTextField textFieldFechaCarga;
	private JTextField textFieldFechaFin;
	private JTextField textFieldEstado;
	private JLabel lblError;
	private JTextField textFieldError;

	/**
	 * Create the frame.
	 */
	public ConsultaLote() {
		setTitle("Consulta lote");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 390, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdLote = new JLabel("Id Lote:");
		lblIdLote.setBounds(10, 11, 55, 26);
		contentPane.add(lblIdLote);
		
		textFieldLote = new JTextField();
		textFieldLote.setBounds(75, 14, 258, 20);
		contentPane.add(textFieldLote);
		textFieldLote.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(120, 307, 89, 23);
		contentPane.add(btnOk);
		
		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(10, 58, 55, 14);
		contentPane.add(lblEmpresa);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(182, 58, 55, 14);
		contentPane.add(lblUsuario);
		
		lblEntidad = new JLabel("Entidad:");
		lblEntidad.setBounds(10, 93, 55, 14);
		contentPane.add(lblEntidad);
		
		lblFechaCarga = new JLabel("Fecha carga:");
		lblFechaCarga.setBounds(10, 133, 77, 14);
		contentPane.add(lblFechaCarga);
		
		lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setBounds(10, 170, 55, 14);
		contentPane.add(lblFechaFin);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 209, 46, 14);
		contentPane.add(lblEstado);
		
		textFieldEmpresa = new JTextField();
		textFieldEmpresa.setEditable(false);
		textFieldEmpresa.setBounds(75, 55, 86, 20);
		contentPane.add(textFieldEmpresa);
		textFieldEmpresa.setColumns(10);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setEditable(false);
		textFieldUsuario.setBounds(247, 55, 86, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldEntidad = new JTextField();
		textFieldEntidad.setEditable(false);
		textFieldEntidad.setBounds(75, 90, 258, 20);
		contentPane.add(textFieldEntidad);
		textFieldEntidad.setColumns(10);
		
		textFieldFechaCarga = new JTextField();
		textFieldFechaCarga.setEditable(false);
		textFieldFechaCarga.setBounds(97, 130, 121, 20);
		contentPane.add(textFieldFechaCarga);
		textFieldFechaCarga.setColumns(10);
		
		textFieldFechaFin = new JTextField();
		textFieldFechaFin.setEditable(false);
		textFieldFechaFin.setBounds(97, 167, 121, 20);
		contentPane.add(textFieldFechaFin);
		textFieldFechaFin.setColumns(10);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setEditable(false);
		textFieldEstado.setBounds(97, 206, 236, 20);
		contentPane.add(textFieldEstado);
		textFieldEstado.setColumns(10);
		
		lblError = new JLabel("Error");
		lblError.setBounds(10, 247, 46, 14);
		contentPane.add(lblError);
		
		textFieldError = new JTextField();
		textFieldError.setEditable(false);
		textFieldError.setBounds(97, 244, 236, 20);
		contentPane.add(textFieldError);
		textFieldError.setColumns(10);
		btnOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().contentEquals("OK")) {
			contentPane.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			this.textFieldEmpresa.setText("");
			this.textFieldUsuario.setText("");
			this.textFieldFechaCarga.setText("");
			this.textFieldFechaFin.setText("");
			this.textFieldEntidad.setText("");
			this.textFieldEstado.setText("");
			
			EstadoLote el = null;
			if((el = Controller.getInstance().consultarLote(this.textFieldLote.getText())) != null) {

				this.textFieldEmpresa.setText(Integer.toString(el.getEmpresa()));
				this.textFieldUsuario.setText(Integer.toString(el.getIdUsuario()));
				this.textFieldEntidad.setText(el.getEntidad());
				this.textFieldFechaCarga.setText(el.getFechaHoraCarga());
				this.textFieldFechaFin.setText(el.getFechaHoraFin());
				this.textFieldEstado.setText(el.getEstado() + "-" + el.getDescEstado());
				this.textFieldError.setText(el.getLineaError() + "-" + el.getDescError());
			}else {
				
				JOptionPane.showMessageDialog(this,"Error al consultar el lote", "Error ", JOptionPane.ERROR_MESSAGE);

			}
			
			contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		}
		
	}
}
