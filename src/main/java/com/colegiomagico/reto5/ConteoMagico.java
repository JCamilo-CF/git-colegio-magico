package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
        int sumar = 0;
        int contador = 1;

        while (contador <= limite) {
            sumar += contador;
            contador++;
        }

        return sumar;
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
