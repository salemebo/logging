package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class DebugLogger extends Logger {

	public DebugLogger(PrintStream print) {
		super(print);
	}
	
	public DebugLogger(LogFormater formate) {
		super(formate);
	}
	

	@Override public void trace(String message) {}
	@Override public void fine(String message) {}
	@Override public void finer(String message) {}

	@Override public void trace(Class<?> classname, String message) {}
	@Override public void fine(Class<?> classname, String message) {}
	@Override public void finer(Class<?> classname, String message) {}

	@Override public void trace(String title, String message) {}
	@Override public void fine(String title, String message) {}
	@Override public void finer(String title, String message) {}

	@Override public void trace(Class<?> classname, String title, String message) {}
	@Override public void fine(Class<?> classname, String title, String message) {}
	@Override public void finer(Class<?> classname, String title, String message) {}
	
	
}
