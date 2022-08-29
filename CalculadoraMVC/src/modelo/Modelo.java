package modelo;

public class Modelo {

    private int numero1;
    private int numero2;
    private int result;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int multiplicar() {

        this.result = this.numero1 * this.numero2;
        return this.result;

    }

    public int sumar() {

        this.result = this.numero1 + this.numero2;
        return this.result;
    }

    public int restar() {

        this.result = this.numero1 - this.numero2;
        return this.result;
    }

    public int Dividir() {

        this.result = this.numero1 / this.numero2;
        return this.result;
    }

}
