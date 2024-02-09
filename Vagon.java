
public class Vagon {
    
    private Vagon primero;
    private Vagon siguiente;

    public Vagon(String color){
        
    }

    
    private void setSiguiente(Vagon v) {
        this.siguiente = v;
    }

    private Vagon getSiguiente() {
        return siguiente;
    }

    public void agregarAlFinalError(String color){

        Vagon aux=this.primero; 
        while(aux!=null){  
                aux=aux.getSiguiente();
        }    
        Vagon v=new Vagon(color);     
        aux.setSiguiente(v);
    }
    
    public void agregarAlFinalCorregido(String color) {

        Vagon aux = this.primero;
        while (aux.getSiguiente() != null) { 
            aux = aux.getSiguiente();
        }
        Vagon v = new Vagon(color);
        aux.setSiguiente(v);
    }

}
