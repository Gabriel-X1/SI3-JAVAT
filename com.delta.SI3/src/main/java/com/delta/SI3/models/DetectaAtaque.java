package com.delta.SI3.models;

import javax.persistence.Entity;

@Entity
public class DetectaAtaque extends CapturaTF {
private String classificacaoataque;

public String getClassificacaoataque() {
	return classificacaoataque;
}

public void setClassificacaoataque(String classificacaoataque) {
	this.classificacaoataque = classificacaoataque;
}

}
