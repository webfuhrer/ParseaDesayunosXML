
public class Desayuno {
private String nombre, precio, descripcion, calorias;

public Desayuno(String nombre, String precio, String descripcion, String calorias) {
	super();
	this.nombre = nombre;
	this.precio = precio;
	this.descripcion = descripcion;
	this.calorias = calorias;
}

@Override
public String toString() {
	return "******************\nombre: " + nombre + "\n precio:" + precio + "\n descripcion:" + descripcion + "\n calorias="
			+ calorias+"\n" ;
}

}
