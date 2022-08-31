package com.revature.networking.dotNet;

import java.io.IOException;
//Demonstrate datagrams
import java.net.*;

public class WriteServer {

	public static int serverPort = 998;
	public static int clientPort = 999;
	public static int buffer_size = 1024;
	public static DatagramSocket ds;
	public static byte[] buffer = new byte[buffer_size];

	public static void TheServer() {

		int pos = 0;

		try {
			while (true) {

				int c;
				c = System.in.read();
				switch (c) {

				case -1:
					System.out.println("Server Quits.");
					ds.close();
					return;
				case '\r':
					break;
				case '\n':
					ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
					pos = 0;
					break;
				default:
					buffer[pos++] = (byte) c;
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void TheClient() {

		try {
			while (true) {
				DatagramPacket p = new DatagramPacket(buffer, buffer.length);
				ds.receive(p);

				System.out.println(new String(p.getData(), 0, p.getLength()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			if(args.length==1) {

			
				ds = new DatagramSocket(serverPort);
				TheServer();
			}else {
				ds = new DatagramSocket(clientPort);
				TheClient();
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
