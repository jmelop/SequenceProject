import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Secuencia {
    ArrayList<Integer> sec = new ArrayList<>();


    public Secuencia(ArrayList sec) {
        this.sec = sec;
    }

    public ArrayList getSecuencia() {
        ArrayList<Integer> arrayCopy = new ArrayList<>();
        arrayCopy.addAll(sec);
        return arrayCopy;
    }

    public Secuencia fusionarCon(Secuencia ses) {
        Secuencia secuencia = new Secuencia(fusionar(ses.getSecuencia(), sec));
        System.out.println(secuencia.getSecuencia());
        return secuencia;
    }

    public Secuencia interseccionCon(Secuencia ses) {
        Secuencia secuencia = new Secuencia(interseccion(ses.getSecuencia(), sec));
        System.out.println(secuencia.getSecuencia());
        return secuencia;
    }

    private ArrayList fusionar(ArrayList arr1, ArrayList arr2) {
        arr1.addAll(arr2);
        return arr1;
    }

    private ArrayList interseccion(ArrayList arr1, ArrayList arr2) {

        for (int i = 0; i < arr2.size(); i++) {
            arr1.add(arr2.get(i));
        }

        Collections.sort(arr1);

        return arr1;
    }


}
