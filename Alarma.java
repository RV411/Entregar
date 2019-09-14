import java.io.Serializable;

public class Alarma implements Serializable{
    int id;
    Boolean Estado;
    Long horaInicio_hor,horaInicio_min,horaTermino_hor,horaTermino_min;

    public Alarma(int id,Boolean Estado,Long horaInicio_min,Long horaInicio_hor,Long horaTermino_min,Long horaTermino_hor){
        this.id=id;
        this.Estado=Estado;
        this.horaInicio_min=horaInicio_min;
        this.horaInicio_hor=horaInicio_hor;
        this.horaTermino_min=horaTermino_min;
        this.horaTermino_hor=horaTermino_hor;
    }   

    public int getid(){return id;}

    public Boolean getEstado(){return Estado;}

    public Long gethoraInicio_min(){return horaInicio_min;}

    public Long gethoraInicio_hor(){return horaInicio_hor;}

    public Long gethoraTermino_min(){return horaTermino_min;}

    public Long gethoraTermino_hor(){return horaTermino_hor;}

    public void imprimeAlarma(){
        System.out.println("Alarma: id= "+id+" Estado = "+Estado+
                " hora de apertura= "+horaInicio_hor+":"+horaInicio_min+" hora de cierre= "+horaTermino_hor+":"+horaTermino_min);
    }

}