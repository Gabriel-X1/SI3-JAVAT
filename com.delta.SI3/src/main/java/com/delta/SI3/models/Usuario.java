package com.delta.SI3.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	
private String nome;
private String email;
@OneToOne
private Controlluser  controlluser;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
