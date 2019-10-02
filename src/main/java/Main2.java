import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    JocdeDados jocdeDados = new JocdeDados();

        System.out.println("1- Tirar daus");
        System.out.println("0- Acabar");
        Scanner sc = new Scanner(System.in);

        int mov = sc.nextInt();
        if (mov == 0) {
            return;
        } else if (mov == 1) {
            int ronda =0;
            int totalPerdidas = 0;
            int numRondas = 5000000;
            while (ronda++ < numRondas) {
                jocdeDados.ganar = false;
                jocdeDados.contp = 0;
                jocdeDados.contg = 0;
                while (!jocdeDados.ganar) {
                    jocdeDados.jugar();
                }

//                System.out.println("Has ganado  " + jocdeDados.contg + " y has perdido " + jocdeDados.contp);
//                System.out.println("Ronda " + ronda + " Intentos: " + jocdeDados.contp);
                totalPerdidas += jocdeDados.contp;
            }

            System.out.println("MEDIA " + (float) totalPerdidas/ (float) ronda);

        }
    }
}
