package com.github.neko250.metaknight.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.neko250.metaknight.controller.JPGFilter;

@SuppressWarnings("serial")
public class Panel extends JPanel implements View {
	public JFileChooser fc;
	private JLabel messageJL;
	private JButton loadJB;
	private JButton saveJB;
	
	public Panel() {
		this.setLayout(new BorderLayout());
		
		fc = new JFileChooser();
		fc.addChoosableFileFilter(new JPGFilter());
		fc.setAcceptAllFileFilterUsed(false);
		messageJL = new JLabel("Welcome to MetaKnight!");
		loadJB = new JButton("Load");
		saveJB = new JButton("Save");
		saveJB.setEnabled(false);
		
		this.add(loadJB, BorderLayout.WEST);
		this.add(saveJB, BorderLayout.CENTER);
		this.add(messageJL, BorderLayout.SOUTH);
	}
	
	public void enableSave() {
		saveJB.setEnabled(true);
	}
	
	@Override
	public void message(String msg) {
		messageJL.setText(msg);
	}
	
	@Override
	public void controller(ActionListener ctr) {
		loadJB.addActionListener(ctr);
		loadJB.setActionCommand(LOAD);
		saveJB.addActionListener(ctr);
		saveJB.setActionCommand(SAVE);
	}
}
