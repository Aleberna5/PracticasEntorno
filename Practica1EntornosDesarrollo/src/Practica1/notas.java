package Practica1;
/**
 * @author Alejandro Bernabe Guerrero.
 */
import java.util.Scanner;

/**
 * Programa para calcular las notas y mostrar las notas finales del estudiante.
 */

public class notas {
	//declaramos la variables que nos hacen falta
	
	/**
	 * Variables de las notas y los resultados.
	 */
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	
	/**
	 * Metodos para ingresar las notas.
	 */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		
		/**
		 *@param uf1, uf2, uf2. Al ingresar las notas las guardara en la variable para utilizarlas posteriormente.
		 */
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	/**
	 * Metodos para la comprobacion de la introduccion de las notas.
	 */
	
	public void comprobarcion(){
		/**
		 * @return verificacion si estan bien introducidos los parametros.
		 */
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		/**
		 * Metodos para calcular las notas.
		 */
		
	}
	// metodo para calcular nota
	
	public void Calculonotas() {
		/**
		 * @return calculo de las notas.
		 */
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	
	}
	
	
	/**
	 * Metodos para mostrar las notas y resultados.
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		
		/**
		 * @return mostrara por consola el calculo de las notas.
		 */
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	/**
	 * Metodos para saber si esta aprobado o no.
	 */

	public void aprobado() {
		/**
		 * @return mostrara si esta aprobado, suspendido o error en las notas.
		 */
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * Ejecucion del programa, metodo principal.
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}

