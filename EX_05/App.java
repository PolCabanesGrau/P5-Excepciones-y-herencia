import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean numero = false;
        Scanner lector = new Scanner(System.in);
        while(numero==false){
            try{
                System.out.println("Esciu un número: ");
                int num = Integer.parseInt(lector.nextLine());
                int numero10;
                numero10 = num*10/num;
                System.out.println(numero10);

            }catch(Exception lletra) {
                System.out.println("El valor no és correcte.");
            }
        }
    }
}

