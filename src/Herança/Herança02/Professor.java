package Herança.Herança02;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario ;

    public Professor(float salario) {
        this.salario = salario;
    }

    public void receberAumento(){

        this.setSalario(this.getSalario() + 100);

        System.out.println("Salario aumentado! Novo sálario de " + this.getSalario() );


    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
