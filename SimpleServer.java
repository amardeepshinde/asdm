package srvrs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		System.out.println("waiting for clnts...");
		try (ServerSocket ss = new ServerSocket(5000, 1); Socket ds = ss.accept()) {
			System.out.println("Accepted cn from " + ds.getInetAddress().getHostName() + " clnt port " + ds.getPort()
					+ " local port " + ds.getLocalPort());
			// attach data strms
			DataOutputStream out = new DataOutputStream(ds.getOutputStream());
			DataInputStream in = new DataInputStream(ds.getInputStream());
			System.out.println("srvr : strms attached");
			// read request
			System.out.println("cnt  sent " + in.readUTF());
			// send resp
			out.writeUTF("I m good !! Bye....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
