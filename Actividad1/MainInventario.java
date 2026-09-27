public class MainInventario {
    
public static void main(String[] args){
    Producto productoUno = new Producto();
    Producto productoDos = new Producto();
    Producto productoTres = new Producto();
    
productoUno.nombre = "Teclado mecánico";
productoUno.codigo = "P-001";
productoUno.precio = 45000.0;
productoUno.stock = 12;

productoDos.nombre = "Mouse inalámbrico";
productoDos.codigo = "P-002";
productoDos.precio = 25000.0;
productoDos.stock = 20;

productoTres.nombre = "Auriculares";
productoTres.codigo = "P-003";
productoTres.precio = 35000.0;
productoTres.stock = 15;

productoUno.mostrarFicha();

productoUno.venderUnidades(3);
productoUno.venderUnidades(50);
productoUno.reponerStock(20);
productoUno.actualizarPrecio(39900.0);

Producto copia = productoUno;
copia.stock = 29;

System.out.println("Stock de productoUno despues de modificar copia: " + productoUno.stock+"(mismo objeto en el heap)");
}
}
