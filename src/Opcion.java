
public class Opcion {

    private String descripcion;
    private int votos;

    public Opcion(String descripcion) {
        
        this.descripcion = descripcion;
        this.votos = 0;
    }
    
    public String getDescripcion() {
        
        return this.descripcion;
    }
    
    public int getVotos() {
        
        return this.votos;
    }
    
    public void votar() {
        
        this.votos++;
    }
}
