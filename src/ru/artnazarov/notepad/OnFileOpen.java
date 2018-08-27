package ru.artnazarov.notepad;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class OnFileOpen extends AbstractAction{
	public MyNotepad notepad; 
	private JFileChooser f = new JFileChooser();
	public OnFileOpen(MyNotepad cNotepad) {
		super();
		this.notepad = cNotepad;
	}
    public void actionPerformed(ActionEvent evt) {
    	//if (this.notepad.tabs.getComponentCount()==0) return;
          JTextArea SelectedTextArea = (JTextArea) this.notepad.tabs.getSelectedComponent();
          String output = SelectedTextArea.getText();
          f.showOpenDialog(null);
          File file = f.getSelectedFile();
          try {
        	  String content;

        	  content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        	  Scroll scroll = new Scroll(new JTextArea(content), file.getAbsolutePath());
        	  this.notepad.tabs.add(scroll);
        	  
        	  
          } catch (IOException ex) { 
        	  ex.printStackTrace();
          }
          
          //JOptionPane.showMessageDialog(null, output);
        }
}
