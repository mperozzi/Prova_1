package com.company;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	Tabella t = new Tabella();
	t.insert_tabella();

	    for (int i=0; i<4; i++) {
	        System.out.println(t.l.get(i));
	    }
    }
}
