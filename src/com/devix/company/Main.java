package com.devix.company;

import java.util.ArrayList;

import static com.devix.company.Main.Program.hasDuplicates;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> values = new ArrayList<>();



        values.add("A");
        values.add("B");
        values.add("C");
        values.add("D");
        values.add("D");

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        if (hasDuplicates(values)) {
            System.out.println(true);
        }

        values.removeIf(element -> element == "D");
        System.out.println(hasDuplicates(values));

       for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
    }

    public static class Program {
        public static boolean hasDuplicates(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                for (int x = i + 1; x < list.size(); x++) {
                    if (list.get(i) == list.get(x))
                        return true;
                }
            }

            return false;
        }
    }
}
