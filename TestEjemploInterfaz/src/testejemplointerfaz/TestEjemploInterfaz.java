package testejemplointerfaz;

/**
 *
 * @author Yaki's
 */

class TestEjemploInterfaz {

    public static void main(String[] args) {

        Avion avion = new Avion();
        Helicoptero helicoptero = new Helicoptero();
        avion.setVelMax(1200);
        helicoptero.setVelMax(500);
        System.out.println(avion.compareTo(helicoptero));
        System.out.println(helicoptero.compareTo(avion));

    }

}
