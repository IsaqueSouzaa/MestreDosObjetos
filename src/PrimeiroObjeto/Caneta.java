package PrimeiroObjeto;

public class Caneta {

    /*
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }
        else{
            System.out.println("Estou rabiscando");
        }

    }

   public void tampar(){
        this.tampada = true;
    }

   public void destampar(){
        this.tampada = false;


    }
     */

    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;


    // Metodo construtor.
    public Caneta(String m, String c,float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
        }
    public void destampar(){
        this.tampada = false;

    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
