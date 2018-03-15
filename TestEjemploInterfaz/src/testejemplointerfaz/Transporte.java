package testejemplointerfaz;

/**
 *
 * @author Yaki's
 */

abstract class Transporte implements Comparable {

    int velocidadMax;

    public void setVelMax(int vel) {
        velocidadMax = vel;
    }

    public int getVelMax() {
        return velocidadMax;
    }

    public int compareTo(Object obj) {
        Transporte t = (Transporte) obj;
        if (velocidadMax < t.getVelMax()) {
            return -1;
        }
        if (velocidadMax == t.getVelMax()) {
            return 0;
        }
        return 1;
    }

}
