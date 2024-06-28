package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro extends Veiculo implements ComportamentoVeiculo {
    private int numeroPassageiros;
    private int volumeMala;

    //Construtores
    public Carro() {
    }
    public Carro(int numeroPassageiros, int volumeMala) {
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }
    public Carro(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    public Carro(String marca, String placa, double preco, Motor motor, int numeroPassageiros, int volumeMala) {
        super(marca, placa, preco, motor);
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }
    public Carro(String marca, String placa, double preco, Motor motor) {
        super(marca, placa, preco, motor);
    }
    public Carro(String marca, String placa, double preco) {
        super(marca, placa, preco);
    }
    public Carro(String marca, String placa) {
        super(marca, placa);
    }
    public Carro(String marca) {
        super(marca);
    }

    //Getters
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public int getVolumeMala() {
        return volumeMala;
    }
    public int getPotenciaMotor() {
        return motor.getPotencia();
    }
    public int getRpm() {
        return motor.getRpm();
    }
    //Setters
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = verificarCampoInteiro(numeroPassageiros);
    }
    public void setVolumeMala(int volumeMala) {
        this.volumeMala = verificarCampoInteiro(volumeMala);
    }

    public void acelerar() {
        motor.setRpm(100);
    }
    public void desacelerar() {
        motor.setRpm2(100);
    }

    public void frear() {
        System.out.println("Carro freando");
    }
    public void virarDireita() {
        System.out.println("Carro virando a direita");
    }
    public void virarEsquerda() {
        System.out.println("Carro virando a esquerda");
    }

    //Métodos adicionais
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de passageiros: " + getNumeroPassageiros());
        System.out.println("Volume de mala: " + getVolumeMala());
    }
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o número de passageiros: ");
        setNumeroPassageiros(sc.nextInt());
        System.out.println("Digite o volume de mala: ");
        setVolumeMala(sc.nextInt());
    }
}
