
package classarray;

import java.util.Arrays;
public class ClassArray {

    public static void main(String[] args) {
        // TODO code application logic here
       double [] doubleArray = {8.3, 6.7, 2.11, 7.99};
       Arrays.sort(doubleArray);
        System.out.println("Double array: ");
        for(double i: doubleArray){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.print("Filled array: ");
        output(filledArray);
        
        int[] intArray = {1, 2, 3 ,4};
        int[] intArrayCopy = new int[intArray.length];
        
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        System.out.print("Copied array: ");
        output(intArrayCopy);
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.println(b);
        b = Arrays.equals(intArray,filledArray);
        System.out.println(b);
        
        int l = Arrays.binarySearch(intArray, 3);
        if(l >= 0){
            System.out.println("Found at " + l);
        }
        else{
            System.out.println("Not found");
        }
        
        l = Arrays.binarySearch(intArray, 5);
        if(l >= 0){
            System.out.println("Found at " + l);
        }
        else{
            System.out.println("Not found");
        }
        
        
        
    }
    public static void output(int[] a){
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
}
