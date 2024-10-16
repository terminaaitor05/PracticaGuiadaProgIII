package gui.main;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame{
	
	public MainWindow() {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setTitle("JJ.OO. París 2024");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		ArrayList<String> nombres = new ArrayList<String>();
		for (int i = 0; i < 40; i++) {
			nombres.add("Atleta " + i);
		}
		
		
		JList<String> lista = new JList<String>(nombres.toArray(new String[nombres.size()]));
		lista.setFixedCellWidth(200);
		JScrollPane scroll = new JScrollPane(lista);
		this.add(scroll, BorderLayout.WEST);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("Datos", null);
		tabbedPane.add("Medallas", null);
		this.add(tabbedPane);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Fichero");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		JMenuItem menuNuevoAtleta = new JMenuItem("Nuevo Atleta");
		menuNuevoAtleta.setMnemonic(KeyEvent.VK_N);
		menu.add(menuNuevoAtleta);
		
		menu.addSeparator();

		JMenuItem menuImportar = new JMenuItem("Importar");
		menuImportar.setMnemonic(KeyEvent.VK_I);
		menu.add(menuImportar);
		
		JMenuItem menuExportar = new JMenuItem("Exportar");
		menuExportar.setMnemonic(KeyEvent.VK_E);
		menu.add(menuExportar);
		
		menu.addSeparator();
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setMnemonic(KeyEvent.VK_S);
		menuSalir.addActionListener(e -> {
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
			if(respuesta == 0) {
				System.exit(0);
			}
		});
		menu.add(menuSalir);
		
		this.addWindowListener(new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
				if(respuesta == 0) {
					System.exit(0);
				}
			}
		});
		
		setVisible(true);
	}

}
