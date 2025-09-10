package Encapsulamento;

public class ObjetoControleRemoto {
    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();



        c.abrirMenu();
        c.fecharMenu();
    }
}
