package gui.main;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame{
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		JTabbedPane tabbedpane = new JTabbedPane();
		tabbedpane.add("Datos", null);
		tabbedpane.add("Medallas", null);
		this.add(tabbedpane);
		
		
		
		setVisible(true);
	}

}
