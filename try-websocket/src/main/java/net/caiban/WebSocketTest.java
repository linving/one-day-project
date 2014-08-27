package net.caiban;

import java.net.UnknownHostException;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class WebSocketTest extends WebSocketServer{

	public WebSocketTest() throws UnknownHostException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>message:"+message);
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		// TODO Auto-generated method stub
		
	}

}
