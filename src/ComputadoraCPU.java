public class ComputadoraCPU extends Computadoras{
    public ComputadoraCPU (String nombre, double memoriaRam){
        super(nombre,memoriaRam);
    }

    @Override
    public void resolverTarea() {
        super.resolverTarea();
    }

    @Override
    public boolean aptoParaComputadora(Procesos proceso) {
        if (proceso.getCantidadDeRam()<=this.memoriaRam){
            setMemoriaRam(this.memoriaRam-proceso.getCantidadDeRam());
            System.out.println("Tarea aceptada");
            return true;
        }else return false;
    }

    @Override
    public void anadirAlaCola(Procesos proceso) {
        super.anadirAlaCola(proceso);
    }
}
