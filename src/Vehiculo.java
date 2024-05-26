public class Vehiculo {

    private String Marca;
    private String Modelo;
    private int Año;
    private int Kilometraje;

    public Vehiculo(String marca, String modelo, int año, int kilometraje){
        this.Marca = marca;
        this.Modelo = modelo;
        this.Año = año;
        this.Kilometraje = kilometraje;

    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String marca){
        this.Marca = marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }
    public int getAño(){
        return Año;
    }
    public void setAño(int año){
        this.Año = año;
    }
    public int getKilometraje(){
        return Kilometraje;
    }
    public void setKilometraje(int kilometraje){
        this.Kilometraje = kilometraje;
    }
    public void mostrarInfo(){
        System.out.println("Marca: "+ Marca);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Año: "+Año);
        System.out.println("Kilometraje: "+Kilometraje);
    }
    public void realizarMantenimiento(){
        System.out.println("Realizando mantenimiento....");
    }
}
