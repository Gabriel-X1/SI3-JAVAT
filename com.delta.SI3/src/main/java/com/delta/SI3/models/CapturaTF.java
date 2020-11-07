package com.delta.SI3.models;

import javax.persistence.Entity;

@Entity
public class CapturaTF {
private String nome;
private String dispositivo;
private String ip;
private String rede;
private String mascara;
private String brodcast;
private String protocol;
private String gateway;
private String interfaceOrigem;
private String interfaceDestino;
private int portaOrigem;
private int portaDestino;



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDispositivo() {
	return dispositivo;
}
public void setDispositivo(String dispositivo) {
	this.dispositivo = dispositivo;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getRede() {
	return rede;
}
public void setRede(String rede) {
	this.rede = rede;
}
public String getMascara() {
	return mascara;
}
public void setMascara(String mascara) {
	this.mascara = mascara;
}
public String getBrodcast() {
	return brodcast;
}
public void setBrodcast(String brodcast) {
	this.brodcast = brodcast;
}
public String getProtocol() {
	return protocol;
}
public void setProtocol(String protocol) {
	this.protocol = protocol;
}
public String getGateway() {
	return gateway;
}
public void setGateway(String gateway) {
	this.gateway = gateway;
}
public String getInterfaceOrigem() {
	return interfaceOrigem;
}
public void setInterfaceOrigem(String interfaceOrigem) {
	this.interfaceOrigem = interfaceOrigem;
}
public String getInterfaceDestino() {
	return interfaceDestino;
}
public void setInterfaceDestino(String interfaceDestino) {
	this.interfaceDestino = interfaceDestino;
}
public int getPortaOrigem() {
	return portaOrigem;
}
public void setPortaOrigem(int portaOrigem) {
	this.portaOrigem = portaOrigem;
}
public int getPortaDestino() {
	return portaDestino;
}
public void setPortaDestino(int portaDestino) {
	this.portaDestino = portaDestino;
}


}
