import java.util.ArrayList;

public abstract class Computadoras {
    String nombreEquipo;
    double memoriaRam;
    double hzProcesador;
    ArrayList<Procesos> procesosEnCola;
    public Computadoras (String nombreEquipo,double memoriaRam,double hzProcesador){
        this.nombreEquipo=nombreEquipo;
        this.memoriaRam=memoriaRam;
        this.hzProcesador=hzProcesador;
        this.procesosEnCola=new ArrayList<>();
    }
    public abstract void aptoParaComputadora ();
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

    public double getHzProcesador() {
        return hzProcesador;
    }

    public void setHzProcesador(double hzProcesador) {
        this.hzProcesador = hzProcesador;
    }

    public ArrayList<Procesos> getProcesosEnCola() {
        return procesosEnCola;
    }

    public void setProcesosEnCola(ArrayList<Procesos> procesosEnCola) {
        this.procesosEnCola = procesosEnCola;
    }
}
