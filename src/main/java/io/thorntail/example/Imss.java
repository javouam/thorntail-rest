package io.thorntail.example;


public class Imss {
	private final String paciente;
	
	public Imss() {
		this.paciente = null;
	}
	
	public Imss(String paciente) {
		this.paciente = paciente;
	}
	
	public String getPaciente() {
		return this.paciente;
	}
	
}
