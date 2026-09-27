public class MainBiblioteca {

    public static void main(String[] args) {
 // new Libro(); //No compila porque el constructor vacio que da el compilador deja de existir al declarar constructores propios.

        Libro libro1 = new Libro(
            "Clean Code",
            "Robert C. Martin",
            "9780132350884"
        );

        Libro libro2 = new Libro(
            "Efectivo con Java",
            "Ana Restrepo",
            "9781234567897",
            3,
            22000.0
        );

        Libro libro3 = new Libro(
            "Cien Años de Soledad",
            "Gabriel García Márquez",
            "9780307474728",
            2,
            18500.0
        );

        // Libro con título inválido
        Libro libroInvalido = new Libro(
            "",
            "Autor desconocido",
            "ISBN-000",
            1,
            15000.0
        );

        System.out.println(
            "Título guardado: " + libroInvalido.getTitulo()
        );

        double precioAnterior = libro1.getPrecioReposicion();

        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);

        System.out.println(
            "¿Se aceptó el precio -100.0? " +
            precioAceptado +
            " (se mantiene el precio anterior: $" +
            libro1.getPrecioReposicion() + ")"
        );

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        boolean prestamo1 = libro1.prestar();
        boolean prestamo2 = libro1.prestar();

        System.out.println("Primer préstamo aceptado: " + prestamo1);
        System.out.println("Segundo préstamo aceptado: " + prestamo2);

        libro1.devolver();

        double precioViejo = libro1.getPrecioReposicion();

        if (libro1.setPrecioReposicion(18000.0)) {
            System.out.println(
                "Precio de reposición actualizado de \"" +
                libro1.getTitulo() +
                "\": $" + precioViejo +
                " -> $" + libro1.getPrecioReposicion()
            );
        }
    }
}
