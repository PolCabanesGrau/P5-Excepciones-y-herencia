import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean numero = false;
        Scanner num = new Scanner(System.in);
        while(numero==false){
            try{
                System.out.println("Esciu un número: ");
                int operacio = Integer.parseInt(num.nextLine());
                int num_quadrat;
                    num_quadrat = operacio * operacio;
                    System.out.println(num_quadrat);

            }catch(Exception lletra) {
                System.out.println("El valor no és correcte.");
            }
        }
    }
}
