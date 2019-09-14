import java.io.Serializable;

public class Cortinas implements Serializable{
    int id;
    String ubicacion,posicion;
    Long horaAper_hor,horaAper_min,horaCierre_hor,horaCierre_min;

    public Cortinas(int id,String ubicacion,String posicion,Long horaAper_min,Long horaAper_hor,Long horaCierre_min,Long horaCierre_hor){
        this.id=id;
        this.ubicacion=ubicacion;
        this.posicion=posicion;
        this.horaAper_min=horaAper_min;
        this.horaAper_hor=horaAper_hor;
        this.horaCierre_min=horaCierre_min;
        this.horaCierre_hor=horaCierre_hor;
    }   

    public int getid(){return id;}

    public String getubicacion(){return ubicacion;}

    public String getposicion(){return posicion;}

    public Long gethoraAper_min(){return horaAper_min;}

    public Long gethoraAper_hor(){return horaAper_hor;}

    public Long gethoraCierre_min(){return horaCierre_min;}

    public Long gethoraCierre_hor(){return horaCierre_hor;}

    public void imprimeCortinas(){
        System.out.println("Cortinas: id= "+id+" ubicacion = "+ubicacion+
                " posicion= "+posicion+" hora de apertura= "+horaAper_hor+":"+horaAper_min+" hora de cierre= "+horaCierre_hor+":"+horaCierre_min);
    }

}