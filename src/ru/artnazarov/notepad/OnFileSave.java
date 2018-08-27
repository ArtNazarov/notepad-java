package ru.artnazarov.notepad;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OnFileSave extends AbstractAction{
	public MyNotepad notepad; 
	private JFileChooser f = new JFileChooser();
	public OnFileSave(MyNotepad cNotepad) {
		super();
		this.notepad = cNotepad;
	}
    public void actionPerformed(ActionEvent evt) {
    	if (this.notepad.tabs.getComponentCount()==0) return;
          JTextArea SelectedTextArea = (JTextArea) this.notepad.tabs.getSelectedComponent();
          String output = SelectedTextArea.getText();
          f.showOpenDialog(null);
          File file = f.getSelectedFile();
          try {
        	 FileWriter writer = new FileWriter(file);
        	 writer.write(output);
        	 writer.flush();
        	 writer.close();
          } catch (IOException ex) { 
        	  ex.printStackTrace();
          }
          
          //JOptionPane.showMessageDialog(null, output);
        }
}
