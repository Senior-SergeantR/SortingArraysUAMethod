package SortingNumricArray;

import java.util.Arrays;

public class sortingArrays {


    //in java arrays java util provides a sort() method that allows for this

    public static void main(String[] args) {

        //sorting out an array list
        int[] array ={3,89,56,34,1,5,23,67,78,42,9};

        Arrays.sort(array);

        for (int i: array) {
            System.out.println(i);
        }

        String[] names ={
                "Irene", "Wendy","Felix","Abdi","Kauthar","Melany",
                "Alex","Winfred","Calvin","Bien","Kevin"
        };

        Arrays.sort(names);
        for (String i: names) {
            System.out.println("Name: "+i);
        }


    }
}
