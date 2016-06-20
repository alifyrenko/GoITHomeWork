package com.goit.gojavaonline.offline4.task7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ANTON on 19.06.2016.
 */
public class SetUnion {

    Set<String> unionSet = new HashSet<>();

    public void unionSet(Set set1, Set set2){
        unionSet.addAll(set1);
        unionSet.addAll(set2);

        unionSet.stream().forEach(p -> System.out.println(p));
    }
}
