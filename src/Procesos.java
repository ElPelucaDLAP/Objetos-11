public class Procesos {
    String nombre;
    double cantidadDeRam;
    public Procesos (String nombre, double cantidadDeRam){
        this.nombre=nombre;
        this.cantidadDeRam=cantidadDeRam;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadDeRam() {
        return cantidadDeRam;
    }

    public void setCantidadDeRam(double cantidadDeRam) {
        this.cantidadDeRam = cantidadDeRam;
    }
}
