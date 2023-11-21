public class Arbol extends Planta{

    private String variedad;
    private String tipoTronco;
    private double diametroTronco;

    private String color;
    private String tipoHojas;






    public Arbol() {
    }

    public Arbol(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, double diametroTronco, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.diametroTronco = diametroTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getDiametroTronco() {
        return diametroTronco;
    }

    public void setDiametroTronco(double diametroTronco) {
        this.diametroTronco = diametroTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }
}
