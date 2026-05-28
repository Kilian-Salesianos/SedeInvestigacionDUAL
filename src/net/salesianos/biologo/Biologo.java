package net.salesianos.biologo;
import java.util.ArrayList;

import net.salesianos.investigador.Investigador;
import net.salesianos.trabajodual.Trabajodual;

public class Biologo extends Investigador implements Trabajodual {

    private ArrayList<String> especimenes;

    public Biologo(String nombre, String especialidad, double sueldo) {

        super(nombre, especialidad, sueldo);

        especimenes = new ArrayList<>();

    }

    public void añadirEspecimen(String especimen) {

        especimenes.add(especimen);

    }


    @Override
    public void trabajar() {

        // ORDENAR POR LONGITUD
        for (int i = 0; i < especimenes.size(); i++) {

            for (int j = 0; j < especimenes.size() - 1; j++) {

                if (especimenes.get(j).length()
                        > especimenes.get(j + 1).length()) {

                    String auxiliar = especimenes.get(j);

                    especimenes.set(j, especimenes.get(j + 1));

                    especimenes.set(j + 1, auxiliar);

                }
            }
        }

        if (!especimenes.isEmpty()) {

            especimenes.remove(especimenes.size() - 1);

        }

        System.out.println("Trabajo de biología realizado.");

    }

    @Override
    public String estadoSueldo() {

        if (sueldo < 1500) {

            return "Solicito aumento de sueldo.";

        }

        return "El sueldo es correcto.";

    }

    @Override
    public void trabajodual() {

        for (int i = 0; i < especimenes.size() / 2; i++) {

            String auxiliar = especimenes.get(i);

            especimenes.set(i,
                    especimenes.get(especimenes.size() - 1 - i));

            especimenes.set(especimenes.size() - 1 - i,
                    auxiliar);

        }

        System.out.println("Trabajo dual realizado.");

    }

    public void mostrarEspecimenes() {

        System.out.println(especimenes);

    }

}
    

