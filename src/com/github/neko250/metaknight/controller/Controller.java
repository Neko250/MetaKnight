package com.github.neko250.metaknight.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import com.github.neko250.metaknight.model.Remover;
import com.github.neko250.metaknight.view.Panel;
import com.github.neko250.metaknight.view.View;

public class Controller implements ActionListener {
	Remover remover;
	View view;
	
	public Controller(Remover remover, View view) {
		this.remover = remover;
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		view.message(" ");
		
		if (command.equals(View.LOAD)) {
			JFileChooser fc = ((Panel) view).fc;
			int returnVal = fc.showOpenDialog((Panel) view);
			
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				
				if (remover.load(f)) {
					view.message("File opened!");
					((Panel) view).enableSave();
				} else {
					view.message("Couldn't open file");
				}
			}
		} else if (command.equals(View.SAVE)) {
			JFileChooser fc = ((Panel) view).fc;
			int returnVal = fc.showSaveDialog((Panel) view);
			
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				
				if (remover.save(f)) {
					view.message("File saved!");
				} else {
					view.message("Couldn't save file");
				}
			}
		}
	}
}
