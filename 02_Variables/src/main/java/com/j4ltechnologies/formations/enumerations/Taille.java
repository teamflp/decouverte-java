package com.j4ltechnologies.formations.enumerations;

import java.util.Arrays;

public enum Taille {
    PETIT, MOYEN, GRAND, TRES_GRAND
}

class TestTaille {
    public static void main(String[] args) {
        // Declaration d'une variable de type enum
        Taille taille = Taille.MOYEN;
        System.out.println("taille = " + taille);
        System.out.println(Arrays.toString(Taille.values()));
    }
}