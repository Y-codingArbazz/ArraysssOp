import java.util.Scanner;

public class Array3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []b=new int[5];
        for(int i=0;i<=b.length-1;i++){
            System.out.println("Enter the value at index "+i);
            int c=s.nextInt();
            b[i]=c;
             
        
        }
        for (int c: b) {
            System.out.println(c);
        }
        
                 
    }
// Prepare an Element of an Array and Implement Values using Scanner
}
