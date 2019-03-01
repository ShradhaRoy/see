package com.cg.mra.exceptions;

public class InvalidMobileNumberException extends Exception {

	public InvalidMobileNumberException() {
		super();
			}

	public InvalidMobileNumberException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidMobileNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidMobileNumberException(String message) {
		super(message);
	}

	public InvalidMobileNumberException(Throwable cause) {
		super(cause);
	}

}
