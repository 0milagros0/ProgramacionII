public class MainFlota {

    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AA123BB", "Scania", 450.87719298245614, 18.0);
        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz", 450.0, false);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        double costoTotal = 0;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        for (Vehiculo v : flota) {
            v.mostrarFicha();

            double costo = v.calcularCostoViaje(150.0);
            System.out.printf("Costo de viaje (150.0 km): $%.2f%n", costo);

            costoTotal += costo;

            System.out.println("--------------------------------------------------");
        }

        System.out.printf("Costo total operativo de la flota: $%.2f%n", costoTotal);
    }
}