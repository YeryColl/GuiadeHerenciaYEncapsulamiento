public class Camion extends VehiculoCarga{
    
    private int numEjes;
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }
    public int getNumEjes(){
        return numEjes;
    }
    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ejes "+ numEjes);
    }
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Dandole mantenimiento de las llantas...");
        System.out.println("Haciendo los cambios de filtros y aceite...");
        System.out.println("Revisando los frenos y el sistema de suspensión...");
    }

}
