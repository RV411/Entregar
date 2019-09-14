import java.io.Serializable;

public class Refrigerador implements Serializable{
    int id;
    int temFrigo,temCentro,temCharola;

    public Refrigerador(int id,int temFrigo,int temCentro,int temCharola){
        this.id=id;
        this.temFrigo=temFrigo;
        this.temCentro=temCentro;
        this.temCharola=temCharola;
    }   
    public int getid(){return id;}

    public int gettemFrigo(){return temFrigo;}

    public int gettemCentro(){return temCentro;}

    public int gettemCharola(){return temCharola;}

    public void imprimeRefrigerador(){
        System.out.println("Refrigerador: id="+id+" temperatura del frigorifico ="+temFrigo+
                " temperatura del centro="+temCentro+" temperatura de la charola de verduras="+temCharola);
    }

}