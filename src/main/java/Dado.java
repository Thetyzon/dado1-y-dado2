import java.util.Random;

public class Dado {

    Random random = new Random();
    int valor = 0;


    public void tirarDado() {
        valor = random.nextInt(6)+1;
    }

    void imprimirDado() {
            System.out.println(valor);
    }


}