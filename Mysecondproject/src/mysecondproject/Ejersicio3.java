package ejersicio.pkg2;
import java.util.Scaner;
import java.util.Scanner;
public class Ejersicio2 {
    
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("ingrese el primer numero: ");
        int n1 = n.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int n2 = n.nextInt();
        System.out.println("los numeros impares de " + n1 + "a" + n2 + "son:");
        for (int i= 1; n1 <= n2; i++){
            if (i % 2 == 1){
                System.out.println(i);
        }
    }                
    }      
}  