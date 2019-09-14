import java.io.Serializable;

public class Termostato implements Serializable{
    int id;
    Long horaDes_hor,horaDes_min,horaCom_hor,horaCom_min,horaCena_hor,horaCena_min;
    float cantDes,cantCom,cantCena;

    public Termostato(int id,long horaDes_min,long horaDes_hor,long horaCom_hor,long horaCom_min,long horaCena_min,long horaCena_hor,float cantDes,float cantCom,float cantCena){
        this.id=id;
        this.horaDes_min=horaDes_min;
        this.horaDes_hor=horaDes_hor;
        this.horaCom_min=horaCom_min;
        this.horaCom_hor=horaCom_hor;
        this.horaCena_min=horaCena_min;
        this.horaCena_hor=horaCena_hor;

        this.cantDes=cantDes;
        this.cantCom=cantCom;
        this.cantCena=cantCena;
    }   

    public int getid(){return id;}

    public long gethoraDes_min(){return horaDes_min;}

    public long gethoraDes_hor(){return horaDes_hor;}

    public long gethoraCom_min(){return horaCom_min;}

    public long gethoraCom_hor(){return horaCom_hor;}

    public long gethoraCena_min(){return horaCena_min;}

    public long gethoraCena_hor(){return horaCena_hor;}

    public void imprimeTermostato(){
        System.out.println("Termostato: id= "+id+" hora del desayuno = "+horaDes_hor+":"+horaDes_min+
        " hora de la comida= "+horaCom_hor+":"+horaCom_min+" hora de la cena= "+horaCena_hor+":"+horaCena_min);
    }

}