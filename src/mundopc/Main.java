package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.modelo.servicio.Orden;

public class Main {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "DEll" );
        //System.out.println(raton);

        Teclado teclado1 = new Teclado("USB", "DELL");
        //System.out.println(teclado);

        Monitor monitor1 = new Monitor("Samsung", 24);
        //System.out.println(monitor);


        Computadora computadora1 = new Computadora("Latitude 3750", monitor1, teclado1, raton1);
        //System.out.println(computadora);

        Raton raton2 = new Raton("USB", "Logitech");
        Teclado teclado2 =  new Teclado("USB", "Logitech");
        Monitor monitor2 = new Monitor("Logitech", 32);
        Computadora computadora2 =  new Computadora("Inspiron 3500", monitor2, teclado2, raton2);

        //Se crea una Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();

        //Nueva computadora
        Raton raton3 = new Raton("USB", "HP");
        Teclado teclado3 = new Teclado("USB", "HP");
        Monitor monitor3 = new Monitor("HP", 22);
        Computadora computadora3 = new Computadora("Pavilon 2022", monitor3, teclado3, raton3);

        //Nueva Orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora3);
        orden2.mostrarOrden();
    }
}