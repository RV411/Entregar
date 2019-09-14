import java.io.Serializable;

public class Termostato implements Serializable{
    int id,temperatura;

    public Termostato(int id,int temperatura){
        this.id=id;
        this.temperatura=temperatura;
    }   

    public int getid(){return id;}

    public int gettemperatura(){return temperatura;}

    public void imprimeTermostato(){
        System.out.println("Termostato: id= "+id+" temperatura = "+temperatura);
    }

}