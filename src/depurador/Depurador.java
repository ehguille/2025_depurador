/**
 * Paquete para la depuración de proyectos en clase
 */
package depurador;

/**
 * Clase abstracta con los métodos para imprimir trazas
 */
public abstract class Depurador {
	
	/** true si queremos que las trazas se impriman. Por defecto está apagado.*/
	private static boolean ACTIVO=false;
	/** Momento de inicio de la ejecución de la aplicación */
	private static long inicio=System.currentTimeMillis();
	
	/**
	 * Enciende el depurador.
	 */
	public static void encender() {
		ACTIVO=true;
	}
	
	/**
	 * Apaga el depurador.
	 */
	public static void apagar() {
		ACTIVO=false;
	}
	
	/**
	 * Si el depurador está activo, imprime una traza.
	 * @param mensaje Mensaje a imprimir en la traza.
	 */
	public static void trazar(String mensaje) {
		if(ACTIVO) {
			long tiempoEjecucion=(System.currentTimeMillis()-inicio);
			System.err.println("[TRAZA] ("+tiempoEjecucion+" ms) "+mensaje);
		}
	}

}
