package entities;

import java.util.Date;

public class Giorno 
{
	int id;
	int matricola;
	Date data;
	int ore;
	int orex;
	String codicecommessa;
	String note;
	
	public Giorno(int id, int matricola, Date data, int ore, int orex, String codicecommessa, String note) {
		this.id = id;
		this.matricola = matricola;
		this.data = data;
		this.ore = ore;
		this.orex = orex;
		this.codicecommessa = codicecommessa;
		this.note = note;
	}
	
	public Giorno() {}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public int getOrex() {
		return orex;
	}

	public void setOrex(int orex) {
		this.orex = orex;
	}

	public String getCodicecommessa() {
		return codicecommessa;
	}

	public void setCodicecommessa(String codicecommessa) {
		this.codicecommessa = codicecommessa;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	

}
