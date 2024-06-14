package Application;

import Classes.Carro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            Carro carro = new Carro();
            carro.entradaDados();
            carro.acelerar();
            carro.acelerar();
            carros.add(carro);
        }
        for (Carro carro : carros) {
            carro.imprimir();
        }
    }
}
