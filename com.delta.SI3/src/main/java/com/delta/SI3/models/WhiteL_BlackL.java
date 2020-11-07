package com.delta.SI3.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WhiteL_BlackL  {
private String ip;

@ManyToOne
private RegrasES regrasES;

public String getIp() {
	return ip;
}

public void setIp(String ip) {
	this.ip = ip;
}

}
