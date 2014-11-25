package com.github.neko250.metaknight.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.neko250.metaknight.controller.Extensions;

public class Remover {
	BufferedImage image;
	String name, extension;
	
	public Remover() {
		name = null;
		extension = null;
	}
	
	public boolean load(File file) {
		try {
			image = ImageIO.read(file);
			name = Extensions.getName(file);
			extension = Extensions.getExtension(file);
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}
	
	public boolean save(File file) {
		try {
			ImageIO.write(image, extension, file);
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}
}
