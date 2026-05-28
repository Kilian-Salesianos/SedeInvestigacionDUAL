package net.salesianos.quimico;

import java.util.ArrayList;

import net.salesianos.investigador.Investigador;
import net.salesianos.trabajodual.Trabajodual;

public class Quimico extends Investigador implements Trabajodual {

    private ArrayList<String> elementosReaccion;

    public Quimico(String nombre, String especialidad, double sueldo) {

        super(nombre, especialidad, sueldo);

        elementosReaccion = new ArrayList<>();

    }


    public void añadirElemento(String elemento) {

        elementosReaccion.add(elemento);

    }

    @Override
    public void trabajar() {

        for (int i = 0; i < elementosReaccion.size() / 2; i++) {

            String auxiliar = elementosReaccion.get(i);

            elementosReaccion.set(i,
                    elementosReaccion.get(elementosReaccion.size() - 1 - i));

            elementosReaccion.set(elementosReaccion.size() - 1 - i,
                    auxiliar);

        }

        System.out.println("Reacción química mezclada.");

    }

    @Override
    public String estadoSueldo() {

        if (sueldo < 1200) {

            return "Solicito aumento de sueldo.";

        }

        return "El sueldo es correcto.";

    }

    @Override
    public void trabajodual() {

        for (int i = 0; i < elementosReaccion.size(); i++) {

            for (int j = 0; j < elementosReaccion.size() - 1; j++) {

                if (elementosReaccion.get(j).length()
                        > elementosReaccion.get(j + 1).length()) {

                    String auxiliar = elementosReaccion.get(j);

                    elementosReaccion.set(j,
                            elementosReaccion.get(j + 1));

                    elementosReaccion.set(j + 1,
                            auxiliar);

                }
            }
        }

        if (!elementosReaccion.isEmpty()) {

            elementosReaccion.remove(
                    elementosReaccion.size() - 1);

        }

        System.out.println("Trabajo dual realizado.");

    }

    public void mostrarElementos() {

        System.out.println(elementosReaccion);

    }

}
