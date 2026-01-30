package practices;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
	public static void main (String args[]) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		
		
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hai Client ");
		dos.close();
	}
}
