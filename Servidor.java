import java.net.*;
import java.io.*;

public class Servidor{
    public static void main(String args[]){
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Usuario[] usuarios=new Usuario[10];
        Objeto[] objetos=new Objeto[10];

        try{
            ServerSocket s = new ServerSocket(9999);
            System.out.println("Servidor iniciado...");
            
            for( ; ; ){
                Socket cl = s.accept();
                System.out.println("Cliente conectado desde "+cl.getInetAddress()+" : "+cl.getPort());
                oos = new ObjectOutputStream(cl.getOutputStream());
                ois = new ObjectInputStream(cl.getInputStream());
                
                DataInputStream dis = new DataInputStream(cl.getInputStream());
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("Objeto.txt"));
                byte[] b = new byte[1024];

                Usuario u = (Usuario)ois.readObject(); // **
                
                if(u != null){
                    System.out.println("Objeto recibido... Extrayendo informacion");
                    System.out.println("Edad: "+u.gettipoClase());
                    System.out.println("Devolviendo objeto...");
                    oos.writeObject(u);
                    oos.flush();
                }else{

                }
                
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}