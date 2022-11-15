import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String[] alumnes;
        alumnes = new String[4];

        try{
            Scanner alumne = new Scanner(System.in);
            System.out.println("Introdueix alumnes: ");
            for(int i=0; i<20; i++){
                alumnes[i]=alumne.next();
            }
        }catch (Exception maxLongitud){
            System.out.println("La longitud s'ha sobrepassat.");
        }
    }
}
