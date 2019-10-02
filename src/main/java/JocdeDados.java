public class JocdeDados {

    Dado dado1;
    Dado dado2;
    Dado dado3;
    boolean ganar = false;
    int contg=0;
    int contp=0;

    public JocdeDados(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        int contg;
    }

    public void jugar(){
        dado1.tirarDado();
        dado2.tirarDado();
        dado3.tirarDado();

//        dado1.imprimirDado();
//        dado2.imprimirDado();
//        dado3.imprimirDado();

        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor){
//            System.out.println("Has ganado");
            contg++;
            ganar=true;
        }
        else {
            contp++;
        }

    }
}
