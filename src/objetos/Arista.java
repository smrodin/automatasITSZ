

package objetos;

public class Arista{
    private int idArista;
    private String nombreArista;
    private int peso;//Distancia
    private String entrada =" ";    
    private LineaQuebrada lineaQuebrada;//Ésta es la via representada graficamente    
    private boolean habilitado;

    public Arista(){
        // initialise instance variables
        this(-1,"");
    }
    public Arista(int idArista){
        // initialise instance variables
        this(-1,"");
    }
    public Arista(int idArista,String nombreArista){
        // initialise instance variables
        this(-1,"",1);
    }
    public Arista(int idArista,String nombreArista,int peso){
        // initialise instance variables
        this.idArista = idArista;
        this.nombreArista = nombreArista;
        this.peso = peso;
        lineaQuebrada = null;
        habilitado = true;
    }
    public void setIdArista(int idArista){
        this.idArista = idArista;
    }
    public int getIdArista(){
        return idArista;
    }
    public void setNombreArista(String nombreVia){
        this.nombreArista = nombreVia;
    }
    public String getNombreArista(){
        return nombreArista;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    public void setLineaQuebrada(LineaQuebrada lineaQuebrada){
        this.lineaQuebrada = lineaQuebrada;
        if(lineaQuebrada != null){
            this.lineaQuebrada.setInput(entrada );
        }
    }
    public LineaQuebrada getLineaQuebrada(){
        return lineaQuebrada;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
}
