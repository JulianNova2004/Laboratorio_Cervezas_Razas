package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;
public class DogExpert {

    public static List<String> getPets(String raza){
        /*
        pastor catalán, pastor aleman, komodor, pastor australiano.
        Dobermann, Pinscher alemán, Pinscher miniatura, Schnauzer.
         */
        List<String> dogList = new ArrayList<>();
        dogList.add("Estos son los resultados de su busqueda:");
        switch(raza){
            case "pastores":
                dogList.add("Pastor Catalan");
                dogList.add("Pastor Aleman");
                dogList.add("Komodor");
                dogList.add("Pastor Australiano");
                break;
            case "pinscher":
                dogList.add("Dobermann");
                dogList.add("Pinscher aleman");
                dogList.add("Pinscher miniatura");
                dogList.add("Schnauzer");
                break;
            default:
                dogList.clear();
                dogList.add("Hubo un error");
        }
        return dogList;
    }
}
