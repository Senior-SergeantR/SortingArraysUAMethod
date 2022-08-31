package SortingNumricArray;




import java.util.Arrays;

public class SortingArrayLogic {
    public static void main(String[] args) {

        String[] names ={
                "Irene", "Wendy","Felix","Abdi","Kauthar","Melany",
                "Alex","Winfred","Calvin","Bien","Kevin"
        };

        int[] data ={3,89,56,34,1,5,23,67,78,42,9};


        System.out.println("Array Elements after sorting: ");

        for (int i = 0; i< data.length;i++){
           for (int j = i+1;j< data.length;j++){
               int k = 0;
               if (data[i]>data[j]){
                   k=data[i];
                   data[i]=data[j];
                   data[j]=k;
               }
           }
            System.out.println(data[i]);
        }

        Arrays.sort(names);
        System.out.println("Names include: ");
        for (String i : names) {
            System.out.println(i);
        }
    }







}
