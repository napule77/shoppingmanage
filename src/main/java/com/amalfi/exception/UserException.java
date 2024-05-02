package com.amalfi.exception;

public class UserException extends Exception {
	
	public UserException(String errorNumber) {
        super("Problema nel salvataggio dell'utente! Errore : " + errorNumber);
    }

}
