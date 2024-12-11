package Registro;

public class Studente {

	private String nome;
	private String cognome;
	private int matricola;

	public String getNome() {
		return nome;

	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public Studente() {
	}

	// costruttore
	public Studente(String nome, String cognome, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;

	}
}

/*
 * Creare un programma Java che consenta di gestire un registro degli studenti.
 * Il programma deve:
 * 
 * Registrare nuovi studenti con: Nome, Cognome, Matricola (univoca).
 * Visualizzare l'elenco degli studenti. Cercare uno studente tramite la
 * matricola. Requisiti Tecnici: Creare una classe Studente con i campi
 * necessari. Utilizzare un ArrayList per memorizzare gli studenti. Creare un
 * menu testuale che permetta all'utente di:
 * 
 * Aggiungere uno studente. Visualizzare tutti gli studenti. Cercare uno
 * studente per matricola. Uscire dal programma
 */