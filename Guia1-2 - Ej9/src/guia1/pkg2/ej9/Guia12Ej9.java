
package guia1.pkg2.ej9;


public class Guia12Ej9 {


    public static void main(String[] args) {
        
        Fecha fecha1=new Fecha(14,05,1996);
        Fecha fecha2=new Fecha(14,05,1997);
        
        System.out.println(fecha1.getAño()+" es biciesto? "+fecha1.esBiciesto());
        
        System.out.println(fecha2.getAño()+" es biciesto? "+fecha2.esBiciesto());
         
         System.out.println("La diferencia entre las fechas es "+fecha1.calcularAños(fecha2)+" años");
    }
    
}
