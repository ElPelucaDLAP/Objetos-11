public class Main {
    public static void main(String[] args) {
        //Creo el centro de computo
        CentroDeComputo apa = new CentroDeComputo();
        //Creo computadoras
        ComputadoraCPU c1 = new ComputadoraCPU("alambrito",4.4);
        ComputadoraRam c2 = new ComputadoraRam("Sus",2.2);
       //Creo procesos
        Procesos a1 = new Procesos("Tarea1",2.2);
        Procesos a2 = new Procesos("Tarea2",4.4);
        //Añado las computadoras y procesos a su arraylist correspondiente
        apa.anadirProcesos(a1);
        apa.anadirProcesos(a2);

        apa.anadirComputadora(c1);
        apa.anadirComputadora(c2);
        //ordenar los arraylist
        apa.ordenarComputadoras();
        apa.ordenarProcesos();
        //
        apa.asignarTareas();
         //
        apa.resolverTareas();
    }
}