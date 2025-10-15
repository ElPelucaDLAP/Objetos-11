import java.util.ArrayList;

public class CentroDeComputo {
ArrayList<Computadoras> computadorasDisponibles;
ArrayList<Computadoras> computadorasOcupadas;
ArrayList<Procesos>procesosEnEspera;
public  CentroDeComputo () {
    computadorasDisponibles=new ArrayList<>();
    computadorasOcupadas=new ArrayList<>();
    procesosEnEspera=new ArrayList<>();
}
public void resolverTareas (){
  for (int i = 0; i<computadorasOcupadas.size(); i++){
      computadorasOcupadas.get(i).resolverTarea();
  }
    computadorasDisponibles.addAll(computadorasOcupadas);
    computadorasOcupadas.clear();
}


public void asignarTareas (){
    int j = 0;
    while (j<procesosEnEspera.size()){
        boolean asignado = false;
        int i = 0;
        while (i<computadorasDisponibles.size() && !asignado){
            if (computadorasDisponibles.get(i).aptoParaComputadora(procesosEnEspera.get(j))){
                computadorasDisponibles.get(i).anadirAlaCola(procesosEnEspera.get(j));
                computadorasOcupadas.add(computadorasDisponibles.get(i));
                computadorasDisponibles.remove(i);
                asignado=true;
            }else i++;
        }
        j++;
    }
}
    public void ordenarProcesos() {
        ArrayList<Procesos> copiaArray = new ArrayList<>(procesosEnEspera);
        procesosEnEspera.clear();

        while (!copiaArray.isEmpty()) {
            double mayorMemoriaRam = 0;
            int posicionDelMayor = 0;

            for (int i = 0; i < copiaArray.size(); i++) {
                if (copiaArray.get(i).getCantidadDeRam() >= mayorMemoriaRam) {
                    mayorMemoriaRam = copiaArray.get(i).getCantidadDeRam();
                    posicionDelMayor = i;
                }
            }

            procesosEnEspera.add(copiaArray.remove(posicionDelMayor));
        }
    }
public  void ordenarComputadoras (){
    ArrayList<Computadoras>copiaArray = new ArrayList<>(computadorasDisponibles);
    int j=0;
    while (j<computadorasDisponibles.size()){
        double mayorMemoriaRam = 0;
        int posicionDelMayor = 0;
        for (int i = 0; i<copiaArray.size();i++){{
            if (copiaArray.get(i).getMemoriaRam()>mayorMemoriaRam){
                mayorMemoriaRam=copiaArray.get(i).memoriaRam;
                posicionDelMayor=i;

            }
        }
        computadorasDisponibles.set(j,copiaArray.get(posicionDelMayor));
        copiaArray.remove(posicionDelMayor);
    }
        j++;
    }
}
public void anadirComputadora (Computadoras nuevaComputadora) {
    computadorasDisponibles.add(nuevaComputadora);
}
public void anadirProcesos (Procesos nuevoProceso) {
    procesosEnEspera.add(nuevoProceso);
}
    public ArrayList<Computadoras> getComputadorasDisponibles() {
        return computadorasDisponibles;
    }

    public void setComputadorasDisponibles(ArrayList<Computadoras> computadorasDisponibles) {
        this.computadorasDisponibles = computadorasDisponibles;
    }

    public ArrayList<Computadoras> getComputadorasOcupadas() {
        return computadorasOcupadas;
    }

    public void setComputadorasOcupadas(ArrayList<Computadoras> computadorasOcupadas) {
        this.computadorasOcupadas = computadorasOcupadas;
    }
}
