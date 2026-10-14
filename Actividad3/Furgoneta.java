public class Furgoneta extends Vehiculo {
    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm,
                     boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = distanciaKm * costoBaseKm;

        if (tieneRefrigeracion) {
            costo += 5000;
        }

        return costo;
    }

    @Override
    public void mostrarFicha() {
        String refrigerado = tieneRefrigeracion ? "Sí" : "No";

        System.out.println("[Vehículo] Furgoneta | Patente: " + patente
                + " | Marca: " + marca
                + " | Refrigerado: " + refrigerado);
    }
}