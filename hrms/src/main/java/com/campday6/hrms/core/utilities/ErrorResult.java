package com.campday6.hrms.core.utilities;

public class ErrorResult extends Result{
	public ErrorResult() {
		super(false);
	} 
	
	public ErrorResult(String message) {
		super(false,message);
	} 
}