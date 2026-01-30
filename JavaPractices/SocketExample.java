package practices;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketExample {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost", 9999);
		DataInputStream read = new DataInputStream(s.getInputStream());
		String msg = read.readUTF();
		System.out.println("Server says: "+msg);
	}

}
