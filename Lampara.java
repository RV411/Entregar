import java.io.Serializable;

public class Lampara implements Serializable{
    int id;
    Boolean estado;
    String ubicacion;

    public Lampara(int id,String ubicacion,Boolean estado){
        this.id=id;
        this.estado=estado;
        this.ubicacion=ubicacion;
    }   

    public int getid(){return id;}

    public Boolean getestado(){return estado;}

    public String getubicacion(){return ubicacion;}

    public void imprimeLampara(){
        System.out.println("Lampara: id= "+id+" Ubicacion"+ubicacion+" estado = "+estado);
    }
}