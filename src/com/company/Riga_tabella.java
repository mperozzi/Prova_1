package com.company;

public class Riga_tabella {
    private Colonna1 c1 = new Colonna1();
    private Colonna2 c2 = new Colonna2();
    private Colonna3 c3 = new Colonna3();

    public Colonna1 getC1() {
        return c1;
    }

    public Colonna2 getC2() {
        return c2;
    }

    public Colonna3 getC3() {
        return c3;
    }

    public void setC1(int c1) {
        this.c1.setColonna1(c1);
    }

    public void setC2(String c2) {
        this.c2.setColonna2(c2);
    }

    public void setC3(String c3) {
        this.c3.setColonna3(c3);
    }
}

