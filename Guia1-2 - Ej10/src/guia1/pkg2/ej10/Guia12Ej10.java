package guia1.pkg2.ej10;

public class Guia12Ej10 {

    public static void main(String[] args) {

        Pensador valor = new Pensador(2000);
        System.out.println("El largo del numero es " + valor.largoNumero() + " digitos");
        System.out.println("El numero invertido es " + valor.invertir());

        System.out.println("El par anterior es " + valor.parAntes());
        System.out.println("El par posterior es " + valor.parPosterior());
        System.out.println("OPC1-El primer digito es " + valor.primerDigito());
        System.out.println("OPC2-El primer digito es " + valor.primerDigito2());
        System.out.println("El ultimo digito es " + valor.ultimoDigito());
    }

}
