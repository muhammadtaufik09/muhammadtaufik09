import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        //array 1D tipe data primitif
        int [] a = {4,7,9};
        

        
        //array 2D bertipe data non primitif
        String [] b = {"jeruk","nanas","lemon"};
        

        
        //array 2D tipe data primitif
        double [][] angka = new double [2][2];
        angka [0][0] = 10.7;
        angka [0][1] = 20.4;
        angka [1][0] = 30.9;
        angka [1][1] = 40.2;
        
        //mencetak 1D primitif
        System.out.println(Arrays.toString(a));
        
        
        //mencetak 1D non primitif
        System.out.println(Arrays.toString(b));
        
        
        //mencetak 2D primitif
        System.out.println(Arrays.deepToString(angka));
        
        
        
    }
    
}
