package com.company;

import java.util.*;

public class Tabella {
    List<Riga_tabella> l = new ArrayList<Riga_tabella>();


    public void insert_tab() {
        for (int i = 0; i<4; i++) {
            Riga_tabella r = new Riga_tabella();
            r.setC1(i);
            r.setC2("Cane" + i);
            r.setC3("Casa" + i);
            l.add(r);
        }
    }

    public void print_list() {
        for (int i=0; i<4; i++) {
            System.out.println(l.get(i).getC1().getColonna1());
            System.out.println(l.get(i).getC2().getColonna2());
            System.out.println(l.get(i).getC3().getColonna3());
            System.out.println("\n");

        }
    }
}