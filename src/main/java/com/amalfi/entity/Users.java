package com.amalfi.entity;

import java.util.Date;

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
	private long iduser;
	private String nome;
	private String cognome;
	
	private String email;
	private String password;
	private String token_send;
	private String token_received;
	private boolean abilitato;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone = "Europe/Rome")
	private Date datacreazione;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone = "Europe/Rome")
	private Date dataricezionetoken;

}