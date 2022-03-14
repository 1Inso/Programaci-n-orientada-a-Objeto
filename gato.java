
import java.util.Scanner;
class Gato{
  public static void main (String [] args){
    Scanner leer  = new Scanner(System.in);
    System.out.println("Ingrese su edad: ");
    int edad = leer.nextInt();
    System.out.println("Hola usuario de " + edad + ". ");
    System.out.println("FIN DEL PROGRAMA...");
  }
}
