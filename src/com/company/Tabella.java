package com.company;

import java.util.*;

public class Tabella {
    private List<Riga_tabella> l;

    //Costruttore della classe
    Tabella() {
        l = new ArrayList<>();
    }

    public List<Riga_tabella> getL() { return l; }

    public void setL(List<Riga_tabella> l) { this.l = l; }

    //Restituisce la dimensione della lista (numero di righe della tabella)
    public int return_size(){
        return this.l.size();
    }

    //Inserimento di un oggetto in coda alla lista (in fondo alla tabella)
    public void insert_one_object(int i, String s, String s1) {
        Riga_tabella r = new Riga_tabella();
        r.setC1(i);
        r.setC2(s);
        r.setC3(s1);
        int size = l.size();
        l.add(size, r);
    }

    //Inserimento di n oggetti in coda alla lista (in fondo alla tabella)
    public void insert_tab(int n) {
        int size = return_size();
        for (int i = size; i<size + n; i++) {
            Riga_tabella r = new Riga_tabella();
            r.setC1(i);
            r.setC2("Cane " + (i));
            r.setC3("Casa " + (i));
            l.add(i, r);
        }
    }

    //Stampa a schermo la lista di oggetti con tutti gli attributi (stampa a schermo la tabella completa)
    public void print_tab() {
        int size = return_size();
        for (int i=0; i<size; i++) {
            System.out.print(l.get(i).getC1().getColonna1() + "    ");
            System.out.print(l.get(i).getC2().getColonna2() + "    ");
            System.out.print(l.get(i).getC3().getColonna3() + "    ");
            System.out.println();
        }
        System.out.println();
    }

    //Sovrascrive un attributo di un oggetto della lista
    public void overwrite_attribute(int i, String s) {
        l.get(i).setC2(s);
    }
}