package com.goit.gojavaonline.offline4.task7;



import java.util.HashSet;
import java.util.Set;

/**
 * Created by ANTON on 19.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Set<String> menSet = new HashSet<>();
        menSet.add("John");
        menSet.add("Michael");
        menSet.add("David");
        menSet.add("Mircha");
        menSet.add("Gregory");

        Set<String> womenSet = new HashSet<>();
        womenSet.add("Ann");
        womenSet.add("Claudia");
        womenSet.add("Matilda");
        womenSet.add("Victoria");

        SetUnion setUnion = new SetUnion();
        setUnion.unionSet(menSet, womenSet);

    }
}
