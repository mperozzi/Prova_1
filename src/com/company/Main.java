package com.company;

public class Main {

    public static void main(String[] args) {
	Tabella t = new Tabella();

		for (int i=0; i<5; i++) {
			t.insert_one_object(i, "Matteo " + (i), "Perozzi " + (i));
		}

		//int size = t.return_size();  //dimensione attuale della lista
		System.out.println("Stampo la tabella la prima volta");
		t.print_tab();
		System.out.println();

		t.overwrite_attribute(3, "Ciccia");  //sovrascrivo un attributo di un oggetto alla riga 3 della tabella
		System.out.println("Stampo la tabella sovrascritta");
		t.print_tab();
		System.out.println();

		t.insert_tab(2);  //inserimento di altri due oggetti all'interno della tabella
		//size = t.return_size();  //dimensione attuale della tabella (modificata perche ho inserito altri elementi)
		System.out.println("Stampo la tabella dopo aver aggiunto due righe");
		t.print_tab();
    }
}
