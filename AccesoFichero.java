import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class AccesoFichero implements Constantes{
	public static List<Desayuno> parsearXML()
	{
		File fichero=new File(RUTA_XML);
		SAXBuilder constructor=new SAXBuilder();
		ArrayList<Desayuno> desayunos=new ArrayList();
		try {
			Document documento_xml=constructor.build(fichero);
			Element elemento_breakfast=documento_xml.getRootElement();
			List<Element> lista_elementos_food=elemento_breakfast.getChildren();
			for (Element elemento_food : lista_elementos_food) {
				Element elemento_nombre=elemento_food.getChild("name");
				String tipo="";
				if (elemento_nombre.getAttribute("tipo")!=null)
				{
					tipo=elemento_nombre.getAttribute("tipo").getValue();	
				}
				 
				String nombre=elemento_nombre.getValue();
				String descripcion=elemento_food.getChild("description").getValue();
				String precio=elemento_food.getChild("price").getValue();
				String calorias=elemento_food.getChild("calories").getValue();
				Desayuno d=new Desayuno(nombre, precio, descripcion, calorias);
				desayunos.add(d);
				
			}
			
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desayunos;
	}

}
