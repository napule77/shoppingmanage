package com.amalfi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	
	private long idUser;
	private String email;
	private String nome;
	private String cognome;
	private String tokenSend;
	private String tokenRic;
	

}
