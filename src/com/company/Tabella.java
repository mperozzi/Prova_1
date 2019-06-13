package com.company;

import java.util.LinkedList;
import java.util.List;

public class Tabella {
    List l;

    public void insert_tabella() {
        l = new LinkedList();
        for (int i=0; i<4; i++) {
            Riga_tabella r = new Riga_tabella();
            r.c1.setColonna1(i);
            r.c2.setColonna2("Cane" + i);
            r.c3.setColonna3("Casa" + i);
            l.add(r);
        }
    }
}
