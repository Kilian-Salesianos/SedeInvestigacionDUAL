package net.salesianos.matematico;

import net.salesianos.investigador.Investigador;

//Te soy sincero los calculos y eso lo busque por google y con la ia, soy muy malo con las mates y eso

public class Matematico extends Investigador {

    private int[][] resultadosActuales;

    public Matematico(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);

        resultadosActuales = new int[3][3];

        resultadosActuales[0][0] = 1;
        resultadosActuales[0][1] = 2;
        resultadosActuales[0][2] = 3;

        resultadosActuales[1][0] = 4;
        resultadosActuales[1][1] = 5;
        resultadosActuales[1][2] = 6;

        resultadosActuales[2][0] = 7;
        resultadosActuales[2][1] = 8;
        resultadosActuales[2][2] = 9;
    }

    public void trabajar(int numero) {

        for (int i = 0; i < resultadosActuales.length; i++) {

            for (int j = 0; j < resultadosActuales[i].length; j++) {

                resultadosActuales[i][j] *= numero;

            }
        }

        System.out.println("Matriz multiplicada.");
    }

    public void trabajar(int[][] matriz) {

        for (int i = 0; i < resultadosActuales.length; i++) {

            for (int j = 0; j < resultadosActuales[i].length; j++) {

                resultadosActuales[i][j] += matriz[i][j];

            }
        }

        System.out.println("Matrices sumadas.");
    }

    @Override
    public void trabajar() {

        mostrarMatriz();

    }

    @Override
    public String estadoSueldo() {

        if (sueldo < 1800) {
            return "Solicito aumento de sueldo.";
        }

        return "El sueldo es correcto.";
    }

    public void mostrarMatriz() {

        for (int i = 0; i < resultadosActuales.length; i++) {

            for (int j = 0; j < resultadosActuales[i].length; j++) {

                System.out.print(resultadosActuales[i][j] + " ");

            }

            System.out.println();
        }
    }
}
