import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int veces = 0;


        System.out.println("Cuantas veces quieres tirar el dado?");
        veces = sc.nextInt();
        int suma[] = new int[veces];
        int dado1[] = new int[veces];
        int dado2[] = new int[veces];
        int cont[] = new int[11];

        for (int i = 0; i < veces; i++) {
            dado1[i] = random.nextInt(6)+1;
            dado2[i] = random.nextInt(6)+1;
        }

        for (int i = 0; i < veces; i++) {
            suma[i] = dado1[i] + dado2[i];
            if (dado1[i] + dado2[i] == 2){
                cont[0]++;
            }
            if (dado1[i] + dado2[i] == 3){
                cont[1]++;
            }
            if (dado1[i] + dado2[i] == 4){
                cont[2]++;
            }
            if (dado1[i] + dado2[i] == 5){
                cont[3]++;
            }
            if (dado1[i] + dado2[i] == 6){
                cont[4]++;
            }
            if (dado1[i] + dado2[i] == 7){
                cont[5]++;
            }
            if (dado1[i] + dado2[i] == 8){
                cont[6]++;
            }
            if (dado1[i] + dado2[i] == 9){
                cont[7]++;
            }
            if (dado1[i] + dado2[i] == 10){
                cont[8]++;
            }
            if (dado1[i] + dado2[i] == 11){
                cont[9]++;
            }
            if (dado1[i] + dado2[i] == 12){
                cont[10]++;
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("Numero " + (i+2) + " ------> " + cont[i] + " veces");
        }
    }
}
