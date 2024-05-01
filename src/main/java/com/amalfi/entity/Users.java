package com.amalfi.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long iduser;
	public String nome;
	public String cognome;
	
	public String email;
	public String password;
	public String token_send;
	public String token_received;
	public boolean abilitato;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone = "Europe/Rome")
	public java.sql.Date datacreazione;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone = "Europe/Rome")
	public java.sql.Date dataricezionetoken;

}