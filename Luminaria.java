public class Luminaria implements Serializable{
    int id;
    Boolean estado;
    String ubicacion;
    long intensidad;

    public Luminaria(int id,String ubicacion,long intensidad,Boolean estado){
        this.id=id;
        this.estado=estado;
        this.ubicacion=ubicacion;
        this.intensidad=intensidad;
    }   

    public int getid(){return id;}

    public Boolean getestado(){return estado;}

    public String getubicacion(){return ubicacion;}

    public long getintensidad(){return intensidad;}

    public void imprimeLuminaria(){
        System.out.println("Luminaria: id= "+id+" Ubicacion:"+ubicacion+" Intensidad de luz:"+intensidad+" estado = "+estado);
    }
}