package entities;

public class Commessa 
{
	private String codice;
	private String nome;
	private int matDip;
	private int idCliente;
	public Commessa(String codice, String nome, int matDip, int idCliente) 
    {	
		this.codice = codice;
		this.nome = nome;
		this.matDip = matDip;
		this.idCliente = idCliente;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatDip() {
		return matDip;
	}
	public void setMatDip(int matDip) {
		this.matDip = matDip;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() 
	{
		return "Commessa [codice=" + codice + ", nome=" + nome + ", matDip=" + matDip + ", idCliente=" + idCliente
				+ "]";
	}

	public String seiStronzo()
	{
		return "si";
	}
	

}
