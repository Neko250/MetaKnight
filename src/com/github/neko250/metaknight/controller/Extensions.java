package com.github.neko250.metaknight.controller;

import java.io.File;

public class Extensions {
	public static final String jpeg = "jpeg";
	public static final String jpg = "jpg";
	
	public static String getExtension(File f) {
		String ext = null;
		String s = f.getName();
		int i = s.lastIndexOf('.');
		
		if (i > 0 && i < s.length() - 1) {
			ext = s.substring(i + 1).toLowerCase();
		}
		
		return ext;
	}
	
	public static String getName(File f) {
		String name = null;
		String s = f.getName();
		int i = s.lastIndexOf('.');
		
		if (i > 0 && i < s.length() - 1) {
			name = s.substring(0, i);
		}
		
		return name;
	}
}
