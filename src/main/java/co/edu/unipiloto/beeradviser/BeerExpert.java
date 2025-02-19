package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public static List<String> getBrands(String color){
        /*
        light
        amber
        brown
        dark
        */
        List<String> beerList = new ArrayList<>();
        beerList.add("Estos son los resultados de su busqueda:");
        switch(color){
            case "ligth":
                beerList.add("Club Colombia Dorada");
                beerList.add("Jali Pale Ale");
                beerList.add("Gout Stout");
                break;
            case "amber":
                beerList.add("Club Colombia Roja");
                beerList.add("Jack Amber");
                beerList.add("Red Moose");
                break;
            case "brown":
                beerList.add("3 Cordilleras Mestiza");
                beerList.add("Negra Modelo");
                beerList.add("Bohemia Oscura");
                break;
            case "dark":
                beerList.add("Club Colombia Negra");
                beerList.add("Guiness Draught");
                beerList.add("BBC Macondo Coffee Stout");
                break;
            default:
                beerList.clear();
                beerList.add("Hubo un error");
        }
        return beerList;
    }
}
