package Banco;

public class ObjetoConta {
    public static void main(String[] args) {

        Conta p1 = new Conta();
        p1.setNumConta(10101);
        p1.setUsuario("Jubileu");
        p1.abrirConta("cc");
        p1.depositar(100);



        Conta p2 = new Conta();
        p2.setNumConta(20202);
        p2.setUsuario("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);



        p1.estadoAtual();
        p2.estadoAtual();

    }
}
