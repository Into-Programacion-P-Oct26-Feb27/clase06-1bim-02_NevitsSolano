
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el número de día de la semana");
        int numeroDia = entrada.nextInt();

        if (numeroDia == 1) {
            System.out.printf("Día %d es %s\n", numeroDia,
                              "Lunes");
        } else {
            if (numeroDia == 2) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Martes");
        } else {
            if (numeroDia == 3) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Miércoles");
        } else {
            if (numeroDia == 4) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Jueves");
        } else {
            if (numeroDia == 5) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Viernes");
        } else {
            if (numeroDia == 6) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Sábado");
        } else {
            if (numeroDia == 7) {
                System.out.printf("Día %d es %s\n", numeroDia,
                                  "Domingo");
        } else {
                System.out.println("Opción incorrecta");
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
