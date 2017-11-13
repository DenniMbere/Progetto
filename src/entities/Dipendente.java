package entities;

public class Dipendente 
{
	int matricola;
	String nome;
	String cognome;
	
	
	
	public Dipendente(int matricola, String nome, String cognome) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Dipendente() {}
	
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
