package com.github.neko250.metaknight.controller;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class JPGFilter extends FileFilter {
	public boolean accept(File f) {
		if (f.isDirectory()) {
			return true;
		}
		
		String extension = Extensions.getExtension(f);
		if (extension != null) {
			if (extension.equals(Extensions.jpeg)
					|| extension.equals(Extensions.jpg)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String getDescription() {
		return "JPEG and JPG files";
	}
}
