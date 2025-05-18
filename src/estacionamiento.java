import java.util.Scanner;

public class estacionamiento {

    public static void main(String[] args) {

        // VARIOS CLIENTES
        // EL PROGRAMA DEBE SOLICITAR POR TECLADO DOS DATOS
        // LA PATENTE DEL VEHICULO
        // EL TIPO DE ESTACIONAMIENTO

        String patente = "";
        int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double total, totalDia = 0;

        Scanner teclado = new Scanner(System.in);

        // EL PROGRAMA DEBE CALCULAR EL MONTO A PAGAR PARA CADA CLIENTE EN FUNCION
        // DEL TIPO DE ESTACIONAMIENTO SELECCIONADO. LA CARGA DE DATOS DEBE CONTINUAR
        // HASTA QUE EL USUARIO INGRESE LA PALABRA "FIN" EN LUGAR DE LA PATENTE

        while (!patente.equalsIgnoreCase("fin")) {

            System.out.println("¡Hola! Bievenidos a estacionamientos FETCH. Indique la patente de su vehiculo");

            patente = teclado.nextLine();

            if(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1 -- POR HORA");
            System.out.println("2 -- MEDIA JORNADA (5 horas)");
            System.out.println("3 -- JORNADA COMPLETA(10 horas)");

            teclado = new Scanner(System.in);
            tipoServicio = teclado.nextInt();

            if (tipoServicio <= 0 || tipoServicio > 3) {

                System.out.println("No ingresó un tipo de servicio correcto");

            } else {

                /*
                 * LOS TIPOS DE ESTACIONAMIENTO DISPONIBLES SON 3:
                 * 
                 * - POR HORA (Valor de 3 usd por hora)
                 * - MEDIA JORNADA (Valor de 15 usd y posee 5% de descuento)
                 * - JORNADA COMPLETA (Valor de 30 usd y posee 10% de descuento)
                 */

                if (tipoServicio == 1) {

                    System.out.println("Ingrese la cantidad de horas que desea estacionar");
                    cantHoras = teclado.nextInt();

                    total = cantHoras * 3;
                    System.out.println("El total de su estacionamiento es de: " + total);

                    cont1 = cont1 + 1;
                    totalDia = totalDia + total;

                } else {

                    if (tipoServicio == 2) {
                        System.out.println(
                                "El servicio de MEDIA JORNADA corresponde a 5 horas y posee un descuento del 5%");

                        total = 15 - (15 * 0.05);

                        System.out.println("El total de su estacionamiento es de: " + total);

                        cont2 = cont2 + 1;
                        totalDia = totalDia + total;

                    }

                    else {

                        System.out.println(
                                "El servicio de JORNADA COMPLETA corresponde a 10 horas y posee un descuento del 10%");

                        total = 30 - (30 * 0.10);

                        System.out.println("El total de su estacionamiento es de: " + total);

                        cont3 = cont3 + 1;
                        totalDia = totalDia + total;
                    }
                }

            }

            System.out.println("MUCHAS GRACIAS POR SU COMPRA");
            System.out.println("------------------------------------------------");

            teclado = new Scanner(System.in);
        }
        }

        System.out.println("===============================");
        System.out.println("Totales Monetarios del dia");
        System.out.println("Cantidad servicios por Hora " + cont1);
        System.out.println("Cantidad servicios de media jornada " + cont2);
        System.out.println("Cantidad servicios de jornada completa " + cont3);

        System.out.println("El monto recaudado del dia es de $" + totalDia + "USD");

    }

}
