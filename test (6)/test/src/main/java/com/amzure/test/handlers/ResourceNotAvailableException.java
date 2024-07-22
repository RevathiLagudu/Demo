package com.amzure.test.handlers;

public class ResourceNotAvailableException extends RuntimeException {
	public ResourceNotAvailableException(String msg)
	{
		super(msg);
	}
}
