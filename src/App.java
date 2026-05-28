import java.util.InputMismatchException;
import java.util.Scanner;

import net.salesianos.biologo.Biologo;
import net.salesianos.matematico.Matematico;
import net.salesianos.quimico.Quimico;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            
            Matematico matematico = new Matematico("Kilian",  "Matrices", 1900);

            Biologo biologo = new Biologo("Fernando",  "Animales", 1400);

            Quimico quimico = new Quimico( "Sai", "Reacciones", 1100);


            biologo.añadirEspecimen("Guillotina");
            biologo.añadirEspecimen("Elefante");
            biologo.añadirEspecimen("Tigre");

            biologo.identificacion();

            System.out.println(
                    biologo.estadoSueldo());

            biologo.mostrarEspecimenes();

            biologo.trabajar();

            biologo.mostrarEspecimenes();

            biologo.trabajodual();

            biologo.mostrarEspecimenes();



            quimico.añadirElemento("Hidrogeno");
            quimico.añadirElemento("Oxigeno");
            quimico.añadirElemento("Carbono");

            quimico.identificacion();

            System.out.println(
                    quimico.estadoSueldo());

            quimico.mostrarElementos();

            quimico.trabajar();

            quimico.mostrarElementos();

            quimico.trabajodual();

            quimico.mostrarElementos();


            matematico.identificacion();

            System.out.println(
                    matematico.estadoSueldo());

            matematico.mostrarMatriz();

            matematico.trabajar(2);

            matematico.mostrarMatriz();

            int[][] nuevaMatriz = {
                    {1, 1, 1},
                    {1, 1, 1},
                    {1, 1, 1}
            };

            matematico.trabajar(nuevaMatriz);

            matematico.mostrarMatriz();

            System.out.println(
                    "Introduce un número:");

            int numero = scanner.nextInt();

            System.out.println(
                    "Número introducido: " + numero);

        } catch (InputMismatchException e) {

            System.out.println(
                    "ERROR: Debes introducir un número válido.");

        } finally {

            System.out.println(
                    "Programa finalizado.");

        }

        scanner.close();

    }

}