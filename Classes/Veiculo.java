package Classes;
import java.util.Scanner;

public abstract class Veiculo implements ComportamentoVeiculo {
    private final int IdadeMinimaMotorista = 18;
    private String marca;
    private String placa;
    private double preco;
    public Motor motor;

    //Construtores
    public Veiculo() {}
    public Veiculo(String marca, String placa, double preco) {
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }
    public Veiculo(String marca, String placa, double preco, Motor motor) {
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
        this.motor = motor;
    }
    public Veiculo(String marca, String placa, Motor motor) {
        this.marca = marca;
        this.placa = placa;
        this.motor = motor;
    }
    public Veiculo(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    public Veiculo(String marca) {
        this.marca = marca;
    }
    public Veiculo(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    //Getters
    public int getIdadeMinimaMotorista() {
        return IdadeMinimaMotorista;
    }
    public String getMarca() {
        return marca;
    }
    public String getPlaca() {
        return placa;
    }
    public double getPreco() {
        return preco;
    }
    public Motor getMotor() {
       return motor;
    }

    //Setters
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setMarca(String marca) {
        this.marca = verificarCampo(marca);
    }
    public void setPlaca(String placa) {
        this.placa = verificarCampo(placa);
    }
    public void setPreco(double preco) {
        this.preco = verificarCampoDouble(preco);
    }

    //Método adicional
    public String verificarCampo(String campo) {
        if (campo == null || campo.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo não pode ser vazio!");
        }
        return campo;
    }
    public int verificarCampoInteiro(int campo) {
        if (campo < 0) {
            throw new IllegalArgumentException("O campo não pode ser negativo!");
        }
        return campo;
    }
    public double verificarCampoDouble(double campo) {
        if (campo < 0) {
            throw new IllegalArgumentException("O campo não pode ser negativo!");
        }
        return campo;
    }
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite a placa: ");
        setPlaca(sc.nextLine());
        System.out.println("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));

        motor = new Motor();

        System.out.println("Digite a potência do motor: ");
        motor.setPotencia(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o tipo de combustivel: ");
        motor.setTipoCombustivel(sc.nextLine());
    }
    public void cadastrar(String marca, String placa, double preco, Motor motor) {
        setMarca(marca);
        setPlaca(placa);
        setPreco(preco);
        setMotor(motor);
    }
    public void imprimir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Preço: " + getPreco());
        System.out.println("Motor: ");
        motor.imprimir();

    }

}
