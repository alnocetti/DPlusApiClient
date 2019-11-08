package com.gv.client.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow implements ActionListener {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnServices = new JMenu("Services");
		menuBar.add(mnServices);
		
		JMenuItem mntmConsultaEstadoLote = new JMenuItem("Consulta estado lote");
		mnServices.add(mntmConsultaEstadoLote);
		mntmConsultaEstadoLote.addActionListener(this);

		JMenuItem mntmEnviarInfo = new JMenuItem("Enviar info");
		mnServices.add(mntmEnviarInfo);
		mntmEnviarInfo.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().contentEquals("Consulta estado lote")) {
			ConsultaLote window = new ConsultaLote();
			window.setVisible(true);
		}
		if (e.getActionCommand().contentEquals("Enviar info")) {
			EnviarInfo window = new EnviarInfo();
			window.setVisible(true);
		}
		if(e.getActionCommand().contentEquals("Exit")) {
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		
		// TODO Auto-generated method stub
		
	}

}
