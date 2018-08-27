package ru.artnazarov.notepad;

import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;



public class OnURLOpen extends AbstractAction{
	public MyNotepad notepad; 
	private JFileChooser f = new JFileChooser();
	
	
	
	public OnURLOpen(MyNotepad cNotepad) {
		super();
		this.notepad = cNotepad;
	}
    public void actionPerformed(ActionEvent evt)  {
 
    String from = JOptionPane.showInputDialog ("Input URL:");
    UrlConnectionReader UrlReader = new UrlConnectionReader();
    try {
    String content = UrlReader.getText(from);
    InputStream in = new URL( from ).openStream();	
    Scroll scroll = new Scroll(new JTextArea(content), from);
	  this.notepad.tabs.add(scroll);	
    } catch (Exception e) {
    	System.out.println(e.getMessage());
    }
       
        }
}
