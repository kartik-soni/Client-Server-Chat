
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author KARTIK
 */
public class ClientChat {
    
    String msg,result;
public ClientChat(){
    try
    {
        Socket c=new Socket("127.0.0.1",4029);
        Scanner s1=new Scanner(System.in);
        DataInputStream f=new DataInputStream(c.getInputStream());
        DataOutputStream to=new DataOutputStream(c.getOutputStream());
        do
        {
            System.out.println("Enter Message");
            msg=s1.nextLine();
            to.writeUTF(msg);
            result=f.readUTF();
            System.out.println("Server Replied :"+result);
            
        }while(!result.equals("stop"));
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientChat b=new ClientChat();
        // TODO code application logic here
    }
    
}
