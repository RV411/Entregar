import java.io.Serializable;

public class Irrigador implements Serializable{
    int id;
    String tiempRiego;
    Long horaRiego_hor,horaRiego_min;

    public Irrigador(int id,String tiempRiego,Long horaRiego_min,Long horaRiego_hor){
        this.id=id;
        this.tiempRiego=tiempRiego;
        this.horaRiego_min=horaRiego_min;
        this.horaRiego_hor=horaRiego_hor;
    }   

    public int getid(){return id;}

    public String gettiempRiego(){return tiempRiego;}

    public Long gethoraRiego_min(){return horaRiego_min;}

    public Long gethoraRiego_hor(){return horaRiego_hor;}

    public void imprimeCortinas(){
        System.out.println("Cortinas: id= "+id+" tiempRiego = "+tiempRiego+" hora de apertura= "+horaRiego_hor+":"+horaRiego_min);
    }
}