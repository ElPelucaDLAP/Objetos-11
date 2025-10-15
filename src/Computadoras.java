import java.util.ArrayList;

public abstract class Computadoras {
    String nombreEquipo;
    double memoriaRam;
    ArrayList<Procesos> procesosEnCola;
    public Computadoras (String nombreEquipo,double memoriaRam){
        this.nombreEquipo=nombreEquipo;
        this.memoriaRam=memoriaRam;
        this.procesosEnCola=new ArrayList<>();
    }
    public abstract boolean aptoParaComputadora (Procesos proceso);
    public void resolverTarea () {
        for (int i = 0; i<procesosEnCola.size(); i++){
            System.out.println("Tarea hecha: "+(procesosEnCola.get(i).getNombre()));
            this.memoriaRam=(memoriaRam+procesosEnCola.get(i).getCantidadDeRam());
        }
        procesosEnCola.clear();
    }
    public void anadirAlaCola (Procesos proceso){
        procesosEnCola.add(proceso);
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public ArrayList<Procesos> getProcesosEnCola() {
        return procesosEnCola;
    }

    public void setProcesosEnCola(ArrayList<Procesos> procesosEnCola) {
        this.procesosEnCola = procesosEnCola;
    }
}
