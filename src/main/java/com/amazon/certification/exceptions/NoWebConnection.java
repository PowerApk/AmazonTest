package com.amazon.certification.exceptions;

public class NoWebConnection extends AssertionError{
	/**
	 * PowerApk Exceptions ¡¡¡¡
	 */
	private static final long serialVersionUID = 1L;

	public NoWebConnection(String message, Throwable cause) {       
        super(message, cause);
    }
}
