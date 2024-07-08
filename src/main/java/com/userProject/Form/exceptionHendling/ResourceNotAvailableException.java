package com.userProject.Form.exceptionHendling;

public class ResourceNotAvailableException extends RuntimeException {

	public ResourceNotAvailableException (String msg) {
		super(msg);
	}
}
