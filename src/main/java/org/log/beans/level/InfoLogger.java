package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class InfoLogger extends Logger {

	public InfoLogger(PrintStream print) {
		super(print);
	}
	
	public InfoLogger(LogFormater formate) {
		super(formate);
	}
	

	public void fine(String message) {
		
	}

	public void trace(String message) {
		
	}

	public void finest(String message) {
		
	}

	public void fine(Class<?> classname, String message) {
		
	}

	public void trace(Class<?> classname, String message) {
		
	}

	public void finest(Class<?> classname, String message) {
		
	}
	

	public void fine(Class<?> classname, String title, String message) {
		
	}

	public void finer(Class<?> classname, String title, String message) {
		
	}

	public void finest(Class<?> classname, String title, String message) {
		
	}
	
}