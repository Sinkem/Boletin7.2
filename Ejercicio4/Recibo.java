package Ejercicio4;

import java.text.SimpleDateFormat;

import java.util.*;



public class ReciboLuz {



	private static Calendar cal;

	private static SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yy");

	private static Scanner teclado=new Scanner(System.in);



	public ReciboLuz(int dia, int mes, int anyo) {



		cal=new GregorianCalendar(anyo, mes-1, dia);





	} //FIN CONSTRUCTOR

	

	/*

	 * Precondiciones: La instancia de la clase calendar debe ser valida

	 * Postcondiciones: Se sumaran 15 dias al dia actual, teniendo en cuenta el mes en el que estamos

	 * Entrada: nada

	 * Salida: nada

	 */



	public void siguienteCobro() {



		cal.add(Calendar.DAY_OF_MONTH, 15);



	} //FIN METODO siguienteCobro()



	@Override

	public String toString() {

		return "La fecha es:" +sdf.format(cal.getTime());

	}

	

	/*

	 * Precondiciones: Repeticiones debe ser mayor a 0

	 * Postcondiciones: Se dara la fecha de los siguientes 'n' (n significa un numero) cobros

	 * Entrada: entero repeticiones

	 * Salida: nada

	 */



	public void getSiguienteCobro(int repeticiones) throws IllegalArgumentException{



		if(repeticiones<=0) {

			throw new IllegalArgumentException(); //EN CASO DE QUE LAS REPETICIONES SEAN MENOR O IGUAL A 0, LANZAMOS EXCEPCION

		}else {

			for(int i=0;i<(repeticiones);i++) { //FOR PARA SABER LOS SIGUIENTES 'n' COBROS



				siguienteCobro();

				System.out.println(toString());

			} //FIN FOR

		} //FIN IF_ELSE





	} //FIN METODO getSiguienteCobro()



} //FIN CLASE