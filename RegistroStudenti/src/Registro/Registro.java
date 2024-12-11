package Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

	public static void main(String[] args) {

		ArrayList<Studente> studenti = new ArrayList<Studente>();
		// dichiaro e inizializzo gli studenti tramite il costruttore
		Studente s1 = new Studente("Giovanni", "Rossi", 1234);
		Studente s2 = new Studente("Chiara", "Belli", 3456);
		Studente s3 = new Studente("Giulia", "Bianchi", 7685);
		Studente s4 = new Studente("Marco", "Battisti", 4567);
		Studente s5 = new Studente("Elena", "Santi", 9786);
		Studente s6 = new Studente("Alessio", "Romani", 5647);
		// aggiungo gli studenti all'ArrayList studenti
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		studenti.add(s4);
		studenti.add(s5);
		studenti.add(s6);

		Scanner scanner = new Scanner(System.in);

		// richiamo il metodo menu che permetterà all'utente di scegliere quale azione
		// compiere sul registro
		menu(scanner, studenti);

		scanner.close();

	}

	public static void menu(Scanner scanner, ArrayList<Studente> studenti) {
		// dichiaro una variabile azione di tipo int da passare allo scanner per
		// prendere l'input dell'utente
		int azione;
		do {
			System.out.println("Ciao! Quale azione vuoi svolgere?" + "\n1.Aggiungi uno studente"
					+ "\n2.Cerca uno studente" + "\n3.Visualizza elenco studenti" + "\n4.Esci dal programma");
			azione = scanner.nextInt();

			if (azione == 1) {
				aggiungi(studenti);
			}
			if (azione == 2) {
				cerca(studenti);
			}
			if (azione == 3) {
				elenco(studenti);
			}
			if (azione == 4) {
				System.exit(0);
			}
		} while (azione >= 0 || azione < 3);
	}

	// creo i metodi per le diverse azioni da far svolgere all'utente
	public static void elenco(ArrayList<Studente> studenti) {
		System.out.println("ELENCO STUDENTI");
		// ciclo per stampare tutti gli studenti all'interno dell'ArrayList studenti
		for (Studente i : studenti) {
			System.out.println(i.getNome() + " " + i.getCognome() + "\n");
		}
	}

	public static void aggiungi(ArrayList<Studente> studenti) {
		int matricola;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire il nome dello studente:");
		String nome = scanner.nextLine();
		System.out.println("Inserire il cognome dello studente:");
		String cognome = scanner.nextLine();
		do {
			System.out.println("Inserire nuova matricola di 4 cifre per lo studente:");
			matricola = scanner.nextInt();
			// ciclo per controllare che la matricola inserita dall'utente sia diversa da
			// quelle degli studenti già esistenti
			for (Studente i : studenti) {
				if (i.getMatricola() == matricola) {
					System.out.println("Matricola già esistente. Riprovare.");

				}
				if (i.getMatricola() != matricola) {
					System.out.println("Matricola disponibile, studente aggiunto all'elenco.");
					Studente nuovo = new Studente(nome, cognome, matricola);
					studenti.add(nuovo);
				}
				break;
			}
			menu(scanner, studenti);
		} while (true);

	}

	public static void cerca(ArrayList<Studente> studenti) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Inserire matricola dello studente che vuoi cercare:");
			int matricola = scanner.nextInt();

			for (Studente i : studenti) {
				if (i.getMatricola() != matricola) {
					System.out.println("Matricola non esistente");
					
				} else {
					System.out.println("Lo studente che stavi cercando è: " + i.getNome() + " " + i.getCognome());
					
				} break;
			}
			menu(scanner, studenti);
		} while (true);
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