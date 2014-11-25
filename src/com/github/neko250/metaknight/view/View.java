package com.github.neko250.metaknight.view;

import java.awt.event.ActionListener;

public interface View {
	public static final String LOAD = "LOAD";
	public static final String SAVE = "SAVE";
	
	/**
	 * Set an information message in the window
	 * 
	 * @param msg
	 *            message to display
	 */
	void message(String msg);
	
	/**
	 * Set the controller for the view
	 * 
	 * @param ctr
	 *            the controller to use
	 */
	void controller(ActionListener ctr);
}
