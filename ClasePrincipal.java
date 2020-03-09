import java.util.List;

public class ClasePrincipal {
public static void main(String[] args) {
	List<Desayuno> lista_desayunos=AccesoFichero.parsearXML();
	for (Desayuno desayuno : lista_desayunos) {
		System.out.println(desayuno);
	}
}
}
