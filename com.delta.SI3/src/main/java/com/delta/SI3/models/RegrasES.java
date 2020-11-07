package com.delta.SI3.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RegrasES {
private String nome;
private String descricao;
private int port;
private String protocol;

@OneToMany
private WhiteL_BlackL whiteL_blackL;

@ManyToOne
private Controlluser controlluser;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public String getProtocol() {
	return protocol;
}
public void setProtocol(String protocol) {
	this.protocol = protocol;
}

}
