package com.amalfi.exception;

public class UserException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserException(String errorNumber) {
        super("Problema nel salvataggio dell'utente! Errore : " + errorNumber);
    }

}
