package Classes;

import java.util.Scanner;

public class Motor {
    private int potencia;
    private int rpm;
    private String tipoCombustivel;

    //Constructor
    public Motor(int potencia, int rpm, String tipoCombustivel) {
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }
    public Motor(int potencia, int rpm) {
        this.potencia = potencia;
        this.rpm = rpm;
    }
    public Motor(int potencia) {
        this.potencia = potencia;
    }
    public Motor(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public Motor() {}

    //Getter
    public int getPotencia() {
        return potencia;
    }
    public int getRpm() {
        return rpm;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    //Setters
    public void setPotencia(int potencia) {
        if (potencia < 0) {
            throw new IllegalArgumentException("Potencia deve ser maior que zero");
        }
        this.potencia = potencia;
    }
    public void setRpm(int rpm) {
        this.rpm += rpm;
    }
    public void setRpm2(int rpm) {
        this.rpm -= rpm;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        if (tipoCombustivel == null || tipoCombustivel.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo combustivel não pode ser nulo");
        }
        this.tipoCombustivel = tipoCombustivel;
    }

    //Métodos adicionais
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Potencia: ");
        setPotencia(Integer.parseInt(sc.nextLine()));
        System.out.print("RPM: ");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.print("Tipo combustivel: ");
        setTipoCombustivel(sc.nextLine());
    }
    public void cadastrar(int potencia, int rpm, String tipoCombustivel) {
        setPotencia(potencia);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }
    public void imprimir() {
        System.out.println("Potencia: " + getPotencia());
        System.out.println("RPM: " + getRpm());
        System.out.println("Tipo combustivel: " + getTipoCombustivel());
    }

}
