package com.github.neko250.metaknight;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.github.neko250.metaknight.controller.Controller;
import com.github.neko250.metaknight.model.Remover;
import com.github.neko250.metaknight.view.Panel;
import com.github.neko250.metaknight.view.View;

public class MetaKnight {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			;
		}
		
		Remover remover = new Remover();
		View view = new Panel();
		Controller ctr = new Controller(remover, view);
		view.controller(ctr);
		
		JFrame window = new JFrame("MK!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane((Panel) view);
		window.setSize(200, 100);
		
		window.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize()
				.getWidth() / 2)
				- (window.getWidth() / 2), (int) (Toolkit.getDefaultToolkit()
				.getScreenSize().getHeight() / 2)
				- (window.getHeight()));
		Image icon = Toolkit.getDefaultToolkit().getImage("res/tick.png");
		window.setIconImage(icon);
		window.setVisible(true);
	}
}
