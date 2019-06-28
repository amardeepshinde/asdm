package clnts;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		System.out.println("Enter server IP n server port");
		try (Scanner sc = new Scanner(System.in);
				//establish cn
				Socket s1 = new Socket(sc.next(), sc.nextInt())) {
			//cn information
			System.out.println("connected to " + s1.getInetAddress().getHostName() + " server port " + s1.getPort()
					+ " local port " + s1.getLocalPort());
			//attach data strms
			DataOutputStream out=new DataOutputStream(s1.getOutputStream());
			DataInputStream in=new DataInputStream(s1.getInputStream());
			System.out.println("clnt : strms attached");
		    //clnt send request
			out.writeUTF("Hello server , how r u ?");
			//read resp
			System.out.println("srvr sent "+in.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
