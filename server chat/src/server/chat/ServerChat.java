/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat{
    String msg;
      public ServerChat()
    {
        try
        {
            ServerSocket s1=new ServerSocket(4029);
            System.out.println("Server Started");
            Socket s2=s1.accept();
            DataInputStream f=new DataInputStream(s2.getInputStream());
        DataOutputStream to=new DataOutputStream(s2.getOutputStream());
            f=new DataInputStream((s2.getInputStream()));
            Scanner s11=new Scanner(System.in);
            String r;
            to=new DataOutputStream(s2.getOutputStream());
            do
            {
                msg=f.readUTF();
                System.out.println("Client Said :"+msg);
                r=s11.nextLine();
                to.writeUTF(r);
            }while(!r.equals("stop"));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


/**
 *
 * @author KARTIK
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServerChat a = new ServerChat();
               
        // TODO code application logic here
        
    }
}    

