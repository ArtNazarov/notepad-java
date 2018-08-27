package ru.artnazarov.notepad;
import javax.swing.*;


public class MyNotepad {
	
	public final String NAME = "noname.txt";
	
	public JTabbedPane tabs = new JTabbedPane();
	

	public MyNotepad() {
		
		
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem newFile = new JMenuItem("New file");
		JMenuItem openFile = new JMenuItem("Open file...");
		JMenuItem saveFile = new JMenuItem("Save file...");
		
		file.add(newFile);
		file.add(openFile);
		file.add(saveFile);
		
		menu.add(file);
		
		
		JFrame window = new JFrame("My Notepad");
		window.setSize(800, 600);
		window.setJMenuBar(menu);
		window.add(tabs);
		tabs.add("test", new JTextArea());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		
		newFile.addActionListener(new OnFileNew(this));
		saveFile.addActionListener(new OnFileSave(this));
		openFile.addActionListener(new OnFileOpen(this));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				new runApp()
				);
	}

}
