package ejercicio2_guia4;

public class Electrodomestico {

    protected double precio;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumo(char letra) {
        Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
                System.out.println("---> El consumo es de nivel A");
                break;
            case 'B':
                System.out.println("---> El consumo es de nivel B");
                break;
            case 'C':
                System.out.println("---> El consumo es de nivel C");
                break;
            case 'D':
                System.out.println("---> El consumo es de nivel D");
                break;
            case 'E':
                System.out.println("---> El consumo es de nivel E");
                break;
            default:
                System.out.println("---> El consumo es de nivel F");
                this.setConsumoEnergetico('F');
                break;
        }
    }

    protected void comprobarColor(String color) {
        switch (color.toUpperCase()) {
            case "ROJO":
                System.out.println("---> El Color es Rojo");
                break;
            case "AZUL":
                System.out.println("---> El Color es Azul");
                break;
            case "NEGRO":
                System.out.println("---> El Color es Negro");
                break;
            case "GRIS":
                System.out.println("---> El Color es Gris");
                break;
            default:
                System.out.println("---> El Color es Blanco");
                this.setColor("BLANCO");
                break;
        }
    }

    public void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 1100;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 1500;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1800;
                } else {
                    this.precio += 2000;
                }
                break;
            case 'B':
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 900;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 1300;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1600;
                } else {
                    this.precio += 1800;
                }
                break;
            case 'C':
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 700;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 1100;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1400;
                } else {
                    this.precio += 1600;
                }
                break;
            case 'D':
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 600;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 1000;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1300;
                } else {
                    this.precio += 1500;
                }
                break;
            case 'E':
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 400;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 800;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1100;
                } else {
                    this.precio += 1300;
                }
                break;
            default:
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += 200;
                } else if (this.peso >= 20 && this.peso <= 49) {
                    this.precio += 700;
                } else if (this.peso >= 50 && this.peso <= 79) {
                    this.precio += 1000;
                } else {
                    this.precio += 1200;
                }
                break;
        }
    }
}
