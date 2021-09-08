package br.com.cursoNelioAlves.genericssetMap.treeSet.application;

import br.com.cursoNelioAlves.genericssetMap.treeSet.entities.ProductTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<ProductTreeSet> set = new TreeSet<>();
        set.add(new ProductTreeSet("TV", 900.0));
        set.add(new ProductTreeSet("Notebook", 1200.0));
        set.add(new ProductTreeSet("Tablet", 400.0));


        for (ProductTreeSet p : set) {
            System.out.println(p);
        }
    }
}
