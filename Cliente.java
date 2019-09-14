import java.io.*;
import java.net.*;
public class Cliente{
    public static void main(String[] args) {
        String host = "8.40.1.122";
        int pto = 9000;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Usuario[] usuarios=new Usuario[10];
        try {
            InetAddress srv = InetAddress.getByName(host);
            Socket cl = new Socket(srv, pto);
            System.out.println("Conexion establecida...");
//////////////usuario y contraseña///////////////////////////////////////////7
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba el nombre del usuario:");
            String nameuser = br1.readLine();
            System.out.println("\n\nEscriba la contraseña:");
            String password = br1.readLine();
            usuario[0]=nameuser;
            usuario[1]=password;

            oos = new ObjectOutputStream(cl.getOutputStream());
            //ois = new ObjectInputStream(cl.getInputStream());
            Persona u = new Persona(0, 17630391, "Jesus Crispin Montalvo", 2000);
            System.out.println("Enviando objeto");
            oos.writeObject(u);
            oos.flush();
            System.out.print("Esperando respuesta");
            oos.close();
            //Usuario u2 = (Usuario)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}