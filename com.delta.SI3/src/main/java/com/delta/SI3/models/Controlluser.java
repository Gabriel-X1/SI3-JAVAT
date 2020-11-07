package com.delta.SI3.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Controlluser {
private String login;

@OneToMany
private RegrasES regrasES;

@OneToOne
private CapturaTF capturaTF;

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

}
