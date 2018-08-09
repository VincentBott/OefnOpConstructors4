package com.company;

public class Cursus {


    private int maxCursisten;

    private String[] cursisten;

    private int teller = 0;

    public Cursus(int maxCursisten) {

        this.maxCursisten = maxCursisten;

        this.cursisten = new String[maxCursisten];
    }

    public boolean schrijfCursistIn(String naam) {

        if (teller == this.maxCursisten)
            return false;
        else {
            cursisten[teller] = naam;

            teller++;

            return true;
        }
    }

    public int getAantalCursisten() {
        return this.maxCursisten;
    }

    public String getCursist(int i) {
        return cursisten[i];
    }
}
