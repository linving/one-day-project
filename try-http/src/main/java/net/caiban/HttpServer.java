/**
 * 
 */
package net.caiban;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author parox
 *
 */
public class HttpServer implements Runnable {

	@Override
	public void run() {
		
	}
	
	public static String root ;
	public static int port;
	
	private Socket socket;
	
	public HttpServer(Socket socket){
		this.socket = socket;
	}
	
	public static void listen(){
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(	port);
			
			while (true) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
