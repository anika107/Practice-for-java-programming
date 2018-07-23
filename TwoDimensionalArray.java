
package twodimentionalarray;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a1 = {{1, 2, 3},{4, 5, 6}};
        int a2[][] = {{1, 2}, {3 }, {4, 5, 6}};
        System.out.println("Values in a1 by row: ");
        output(a1);
        
        System.out.println("Values in a2 by row: ");
        output(a2);
    }
    
    public static void output(int a [][]){
        for(int r = 0; r <a.length; r ++){
            for(int c = 0; c < a[r].length; c ++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println("");
        }
    }
    
}
