import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PHISHINGEXPLORADOR {

	public static void main(String[] args) {
		String archivoTexto = "ruta/al/archivo.txt";//Reemplaza con la ruta
			int totalPuntos = 0;
			
	try ( BufferedReader br = new BufferedReader(new FileReader(archivoTexto) )) {
		String linea;
			
		
			
while ((linea =br.readLine()) !=null) {
					totalPuntos += contarPuntos(linea);
	   }
					
	}				
					
					
catch (IOException e) {
			e.printStackTrace();
	}
	
	System.out.println( 
			e.printStackTrace();
	}

	
	"Total de puntos: " + totalPuntos);
	
}
	
		
	}
	
	}
	
	
	public static int contarPuntos(String texto) {
		
	int puntos = 0;
	
			String[] palabrasClave = {
					
			String[] palabrasClave = {
					
			String[] palabrasClave = {
					
					//Lista de palabras y frases de phishing aquí
					
					);
					
					);
					
	for (String palabra : palabrasClave) {
			int ocurrencias = contarOcurrencias(texto, palabra);
			
	if (ocurrencias > 0) {
			System.out.println(
	"'" + palabra + " ' - Ocurrencias: " + ocurrencias + " - Puntos: " + 
					puntos += (ocurrencias * getPuntosAsignados(palabra)
		     	}
	
			}
	
					int ocurrencias;
					int getPuntosAsign;
					puntos += (ocurrencias * getPuntosAsignados(palabra)
			    }
			}
			
			
			
					puntos += (ocurrencias * getPuntosAsign
							
					puntos += (ocurrencias
							
	return puntos;
					
			}
			
		public static int contarOcurrencias(String texto, String palabra
				int contador = 0;
				int indice = texto.indexOf(palabra)
				while (índice != -1) {
					contador++;
					índice = texto.indexOf(palabra, índice + 
					contador++;
					índice = texto.indexOf(palabra, índice +
					contador++;
					
					índice = texto.indexOf
							
					contador++;
					índice
					
					contador++;
					
	1);
			}
			return contador;
		
	}
	
	}
	
	}
	
	
	public static int getPuntosAsignados(String palabra) {
		
	//Asignar el valor de puntos según la lista de palabras y frases 
		
	//Puedes usar un Map<String, Integer> para asignar los puntos 
		
	         //o puedes implementar una lógica condicional para asignar los puntos
		
		
    //Aquí según tus necesidades.
		
	//Ejemplo:
		if (palabra.equals("Verificación de cuenta"))  {
				return 2;

		}

		else if (palabra.equals("Problema de inicio de sesión")) 	{
				return 4;

		}
		
	}
	
		else if (palabra.equals("Advertencia de seguridad"))  {
			return 3;
	}

	}
	else if (palabra.equals("Contraseña"))  {	
			return 2;
			
	    } else {
	    	
	    	//Asignar un valor predeterminado si no se encuentra la palabra o frase
	    	return 1;
	    	
			}
		}
	}
	        }
	    }
	}
	..