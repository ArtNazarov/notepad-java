package ru.artnazarov.notepad;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OnFileNew extends AbstractAction{
	public MyNotepad notepad; 
	public OnFileNew(MyNotepad cNotepad) {
		super();
		this.notepad = cNotepad;
	}
    public void actionPerformed(ActionEvent evt) {
            // open new dialog here
           	  JTextArea text = new JTextArea();
   			  Scroll scroll = new Scroll(text, this.notepad.NAME);
   			  this.notepad.tabs.addTab(this.notepad.NAME, scroll);	
          
        }
}
