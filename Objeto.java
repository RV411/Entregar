import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;

public class Objeto implements Serializable{
    int tipoClase;
    int cantidad;
    //Objeto[] objetos;
    
    public Objeto(int tipoClase,int cantidad){
        this.tipoClase=tipoClase;
        this.cantidad=cantidad;
        //this.objetos=objetos;
    }
    public int gettipoClase() {return tipoClase;}

    public int getcantidad() {return cantidad;}
    
    //public Usuario[] getobjetos() {return objetos;}
    
    public void muestraObjeto(){
        System.out.println("Objeto, Identificador del Objeto: "+tipoClase+", cantidad= "+cantidad);}
}

class ListaObjetos implements Serializable{
    private LinkedList lista = new LinkedList();
    int valor;
    
    ListaObjetos(int tamano,int[] tipoClase,int[] cantidad){
        for(int i =0; i < tamano; i++)
            lista.add(new Objeto(tipoClase[i],cantidad[i]));
    }
    
    ListaObjetos(int tamano, Objeto[] o1){
        for(int i=0; i<tamano;i++)
            lista.add(o1[i]);
    }
    
    public int getTamano(){return lista.size();}
    
    public Objeto getObjeto(int i){return (Objeto) lista.get(i);}
    
    public void muestraObjeto(){
        ListIterator li = lista.listIterator();
        Objeto o1;
        System.out.println("Objeto["+lista.size()+"]=");
        while(li.hasNext()){
            o1 = (Objeto) li.next();
            o1.muestraObjeto();
        }
    }
}