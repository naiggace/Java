package guia1.pkg2.ej10;

public class Pensador {

    int valor;

    public Pensador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int largoNumero() {
        int largo = Integer.toString(valor).length();

        return largo;
    }

    public int invertir() {
        int num = this.valor;
        int inv = 0;
        while (Math.floor(num) != 0) {
            inv = 10 * inv + num % 10;
            num = num / 10;
        }
        return inv;
    }

    public int parAntes() {
        if (this.valor % 2 == 0) {
            return (this.valor - 2);
        } else {
            return (this.valor - 1);
        }
    }

    public int parPosterior() {
        if (this.valor % 2 == 0) {
            return (this.valor + 2);
        } else {
            return (this.valor + 1);
        }
    }

    public int primerDigito() {
        int aux = this.valor;
        int primer = this.valor;
        do {
            aux = (int) Math.floor(aux / 10);
            if (aux >= 1) {
                primer = aux;
            }
        } while (aux >= 10);
        return primer;
    }
//otra opcion

    public int primerDigito2() {

        int num = this.valor;
        while (num > 9) {
            num = (int) Math.floor(num / 10);
        }
        return num;
    }

    public int ultimoDigito() {

        return valor % 10;
    }
}
