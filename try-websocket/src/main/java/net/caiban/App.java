package net.caiban;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint(value = "/websocket")
public class App {
	
	@OnMessage
	public void onMessage(String message, Session session) throws IOException{
		session.getBasicRemote().sendText(">>>>这是从客户端得到的信息："+message);
	}
	
	@OnOpen
	public void onOpen(){
		System.out.println(">>>>> open session!");
	}
	
	@OnClose
	public void onClose(){
		System.out.println(">>>>> close session!");
	}
}
