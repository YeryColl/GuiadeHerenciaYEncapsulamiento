public class Auto extends VehiculoPasajeros{

    private String TipoConbustible;
    private double CostoPorKm;
    private int KilometrosRecorridos;
    
    public Auto(String marca, String modelo, int año, int Kilometraje, int numPasajeros, String tipoConbustible ){
        super(marca, modelo, año, Kilometraje, numPasajeros);
        this.TipoConbustible = tipoConbustible;
        
    }
    public String getTipoConbustible(){
        return TipoConbustible;
    }
    public void SetTipoConbustible(String tipoConbustible){
        this.TipoConbustible = tipoConbustible;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de conbustible "+ TipoConbustible);
    }
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Revisando la presión de los neumáticos....");
        System.out.println("Chequeando el líquido de frenos....");
        System.out.println("Cambiando el aceite y el filtro de aceite....");
    }
    public double getCostoPorKm(){
        return CostoPorKm;
    }
    public void setCostoporKm(double costoPorKm){
        this.CostoPorKm = costoPorKm;
    }
    public int getKilometrosRecorridos(){
        return KilometrosRecorridos;
    }
    public void setKilometrosRecorridos(int KilometrosRecorridos){
        this.KilometrosRecorridos = KilometrosRecorridos;
    }
    public void calcularCostoMantenimiento(Double costoPorKm,double kilometrosRecorridos){
        double costoTotal = costoPorKm * kilometrosRecorridos;
        System.out.println("El costo total del mantenimiento es $" + costoTotal);
    }
}
