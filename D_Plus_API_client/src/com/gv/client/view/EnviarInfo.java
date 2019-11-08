package com.gv.client.view;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.gv.client.controller.Controller;
import com.gv.client.rest.ResponseLote;

public class EnviarInfo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMensaje;
	private JTextField textFieldLote;
	private JComboBox<String> comboBox;
	private JLabel lblError;
	private JTextField textFieldError;
	/**
	 * Create the frame.
	 */
	public EnviarInfo() {
		setTitle("Enviar info.");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(93, 33, 133, 20);
		comboBox.addItem("Clientes.");
		comboBox.addItem("Personal comercial.");
		comboBox.addItem("Rutas de venta.");
		comboBox.addItem("Clientes en ruta.");
		contentPane.add(comboBox);
		comboBox.setSelectedIndex(0);
		
		JLabel lblEntidad = new JLabel("Entidad: ");
		lblEntidad.setBounds(20, 36, 63, 14);
		contentPane.add(lblEntidad);
		
		JLabel lblMensaje = new JLabel("Mensaje: ");
		lblMensaje.setBounds(20, 93, 63, 14);
		contentPane.add(lblMensaje);
		
		JLabel lblIdLote = new JLabel("Id Lote:");
		lblIdLote.setBounds(20, 139, 46, 14);
		contentPane.add(lblIdLote);
		
		textFieldMensaje = new JTextField();
		textFieldMensaje.setBounds(93, 90, 294, 20);
		contentPane.add(textFieldMensaje);
		textFieldMensaje.setColumns(10);
		
		textFieldLote = new JTextField();
		textFieldLote.setBounds(93, 136, 294, 20);
		contentPane.add(textFieldLote);
		textFieldLote.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(171, 227, 89, 23);
		contentPane.add(btnOk);
		
		lblError = new JLabel("Error:");
		lblError.setBounds(20, 181, 46, 14);
		contentPane.add(lblError);
		
		textFieldError = new JTextField();
		textFieldError.setBounds(93, 175, 294, 20);
		contentPane.add(textFieldError);
		textFieldError.setColumns(10);
		btnOk.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().contentEquals("OK")) {

			this.textFieldMensaje.setText("");
			this.textFieldLote.setText("");
			this.textFieldError.setText("");
			this.repaint();
			
			contentPane.setCursor(new Cursor(Cursor.WAIT_CURSOR));

			
			switch (this.comboBox.getSelectedIndex()) {
			case 0:
				try {
					ResponseLote rl = Controller.getInstance().enviarClientes();
					this.textFieldMensaje.setText(rl.getMensajes().get(0));
					this.textFieldLote.setText(rl.getIdImportacion());
					this.textFieldError.setText(rl.getError());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RuntimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 1:
				try {
					ResponseLote rl = Controller.getInstance().enviarPersonal();
					this.textFieldMensaje.setText(rl.getMensajes().get(0));
					this.textFieldLote.setText(rl.getIdImportacion());
					this.textFieldError.setText(rl.getError());
				} catch (RuntimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2:
				try {
					ResponseLote rl = Controller.getInstance().enviarRutasDeVenta();
					this.textFieldMensaje.setText(rl.getMensajes().get(0));
					this.textFieldLote.setText(rl.getIdImportacion());
					this.textFieldError.setText(rl.getError());
				} catch (RuntimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 3:
				try {
					ResponseLote rl = Controller.getInstance().enviarClientesEnRutasDeVenta();
					this.textFieldMensaje.setText(rl.getMensajes().get(0));
					this.textFieldLote.setText(rl.getIdImportacion());
					this.textFieldError.setText(rl.getError());
				} catch (RuntimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
				
			}
			contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			
		}
		
	}
}
