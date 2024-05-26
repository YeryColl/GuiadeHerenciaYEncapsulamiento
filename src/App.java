public class App {
    public static void main(String[] args) throws Exception {
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);
        
        System.out.println("Informacion del auto");
        auto.mostrarInfo();

        auto.realizarMantenimiento();
        auto.calcularCostoMantenimiento(0.60,5000);
        
        System.out.println("\nInformacion del camion");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
    }
}
