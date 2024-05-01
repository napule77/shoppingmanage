package com.amalfi.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users
{
	public long iduser;
	public String nome;
	public String cognome;
	public String email;
	public String password;
	public String token_send;
	public String token_received;
	public boolean abilitato;
	public java.sql.Date datacreazione;
	public java.sql.Date dataricezionetoken;

}