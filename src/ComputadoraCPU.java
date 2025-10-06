public class ComputadoraCPU extends Computadoras{
    public ComputadoraCPU (String nombre, double memoriaRam, double hzProcesador){
        super(nombre,memoriaRam,hzProcesador);
    }

    @Override
    public void aptoParaComputadora() {

    }

    @Override
    public void anadirAlaCola(Procesos proceso) {
        super.anadirAlaCola(proceso);
    }
}
