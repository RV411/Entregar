import java.io.Serializable;

public class Usuario implements Serializable{
    int id;
    int usr;
    String pwd,nombre,tipo;
    //Usuario[] usuarios;

    public  Usuario(int id,int usr,String pwd,String nombre,String tipo){
        this.id = id;
        this.usr=usr;
        this.pwd=pwd;
        this.nombre=nombre;
        this.tipo=tipo;
    }

    public int getid() {return id;}

    public int getusr() {return usr;}

    public String getpwd() {return pwd;}

    public String getnombre() {return nombre;}

    public String gettipo() {return tipo;}
    
    //public Usuario[] getusuarios() {return usuarios;}

    void setid(int id){this.id = id;}

    void setusr(int usr){this.usr = usr;}

    void setpwd(String pwd){this.pwd = pwd;}

    void setnombre(String nombre){this.nombre = nombre;}
    
    void settipo(String tipo){this.tipo = tipo;}

    //void setusr(Usuario[] usuarios){this.usuarios = usuarios;}
}