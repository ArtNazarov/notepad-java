package ru.artnazarov.notepad;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scroll extends JScrollPane {
	public JTextArea text;
	public String name;
	
	public Scroll(JTextArea text, String name) {
		super(text);
		this.text = text;
		this.name = name;
	}
	
	public String getText() {
		return text.getText();
	}
	
	public String getName() {
		return this.name;
	}

}
