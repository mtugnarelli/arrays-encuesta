
public class Encuesta {

    private Opcion[] opciones;

    /**
     * pre : descripciones tiene al menos dos elementos.
     * post: crea la encuesta con tantas opciones como descripciones se han provisto, 
     *       todas inicialmente sin votos.
     */
    public Encuesta(String[] descripciones) {
        
        if (descripciones.length < 2) {
            
            throw new Error("Se debe proveer al menos una descripción");
        }
        
        this.opciones = new Opcion[descripciones.length];
        
        for (int i = 0; i < this.opciones.length; i++) {
            
            this.opciones[i] = new Opcion(descripciones[i]);
        }
    }
    
    public int getCantidadDeOpciones() {
        
        return this.opciones.length;
    }
    
    /**
     * pre : numero está comprendido entre 1 y la cantida de opciones que tiene la encuesta.
     * post: incrementa la cantidad de votos de la opción indicada por numero.
     */
    public void votarOpcion(int numero) {
        
        this.getOpcion(numero).votar();
    }
    
    /**
     * pre : numero está comprendido entre 1 y la cantidad de opciones que tiene la encuesta.
     * post: devuelve la descripción de la opción indicada por numero.
     */
    public String obtenerDescripcionDeLaOpcion(int numero) {
        
        return this.getOpcion(numero).getDescripcion();
    }
    
    /**
     * pre : numero está comprendido entre 1 y la cantidad de opciones que tiene la encuesta.
     * post: devuelve la cantidad de votos que tiene la opción indicada por numero.
     */
    public int obtenerCantidadDeVotos(int numero) {
        
        return this.getOpcion(numero).getVotos();
    }
    
    /**
     * post: devuelve la opcion en la posición indicada validando el rango de número.
     */
    private Opcion getOpcion(int numero) {
        
        if (numero < 1 || numero > this.opciones.length) {
            
            throw new Error("Número de opcion incorrecto. Debe estar entre 1 y " + this.opciones.length);
        }
        
        return this.opciones[numero - 1];
    }
    
    /**
     * post: devuelve la cantida de votos totales sumarizando los votos de cada opción.
     */
    public int calcularVotosTotales() {
        
        int totalDeVotos = 0;
        
        for (int i = 0; i < this.opciones.length; i++) {
            
            totalDeVotos += this.opciones[i].getVotos();
        }

        return totalDeVotos;
    }
    
    /**
     * pre : al menos ha sido votada una opción.
     * post: devuelve la cantidad de votos obtenidos por la/s opción/es más votada/s. 
     */
    public int calcularVotosDeLaOpcionMasVotada() {

        int votosDeLaMasVotada = 0;
        
        for (int i = 0; i < this.opciones.length; i++) {
            
            if (votosDeLaMasVotada < this.opciones[i].getVotos()) {
                
                votosDeLaMasVotada = this.opciones[i].getVotos();
            }
        }
        
        return votosDeLaMasVotada;
    }
}
