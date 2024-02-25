package array;
public class Array{
       public static void main(String[] args) {
      // Array 1D tipe data primitif
    int[] a = new int[5]; 
    double[] b = new double[4];

    // Array 1D tipe data non-primitif (String)
    String[] c = new String[7]; 
    
    // Array 2D tipe data primitif (int)
    int[][] d = new int[2][2]; 
    
    
     // Menampilkan output
        System.out.println("Array 1D tipe data primitif:");
        System.out.println("intArray: " + java.util.Arrays.toString(a));
        System.out.println("doubleArray: " + java.util.Arrays.toString(b));
        System.out.println();

        System.out.println("Array 1D tipe data non-primitif:");
        System.out.println("stringArray: " + java.util.Arrays.toString(c));
        System.out.println();
        
        
        System.out.println("Array 2D tipe data primitif:");
        for (int[] row : d) {
            System.out.println(java.util.Arrays.toString(row));
        }
        System.out.println();

    }
}
