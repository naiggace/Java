package guia1.pkg2.ej2;

public class Conversor {

    //Si quiero crear un objeto uso atributos, constructores, get,set
    private double valor;

    public Conversor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //el static me permite no crear un objeto, y poder usar los met directamente
    //aca lo hago con una funcion
    public static double ConvertirAPesos(double valor) {
        return valor * 400;
    }

    //aca como un proceso
    public static void ConversorADolares(double valor) {
        System.out.println("Ud tiene " + valor / 400 + " dolares");

    }

}
