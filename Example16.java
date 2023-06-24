// import java.lang.reflect.Array;
import java.util.Scanner;

public class Example16 {

  
        public static void main(String[] args) {

            String nombres[] = {"Sofia", "Ingeniera América", "Luis"};

            int x = -1;
            Scanner numero = new Scanner(System.in);

            System.out.println("Introduzca primer numero: ");
                      
            try{
                x = numero.nextInt();
                if(x >= nombres.length){
                    throw new Exception("Valor no valido");
                }
                System.out.println("El nombre es " + nombres[x]);
            }catch (Exception e){
                    System.out.println("El error es " + e.getMessage());
                }
            }

         
        }
    
