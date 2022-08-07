package com.revature.pirateRev.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CaptainsLogger {
	public static enum LogLevel {
		INFO, DEBUG, VERBOSE, WARNING, FATAL, ERROR
	}

	private CaptainsLogger() {
	}

	public static CaptainsLogger getLogger() {
		return new CaptainsLogger();
	}

	public void log(LogLevel level, String message) {
		CaptainsLog newLog = new CaptainsLog(level, LocalDate.now(), message);
		writeToFile(newLog.toString());
	}
 
	private void writeToFile(String message) {
		try (FileWriter writer = new FileWriter("resources/logs/"+LocalDate.now().toString() + ".log", true)) {

			writer.append(message + "\n");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	private class CaptainsLog {
		LogLevel logLevel;
		LocalDate timestamp;
		String message;

		public CaptainsLog(LogLevel logLevel, LocalDate timestamp, String message) {
			super();
			this.logLevel = logLevel;
			this.timestamp = timestamp;
			this.message = message;
		}

		@Override
		public String toString() {
			return logLevel + "\n" + timestamp + message;

		}
	}
}
