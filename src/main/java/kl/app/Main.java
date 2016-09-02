package kl.app;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.netty.channel.Channel;
import kl.api.Authentication;
import kl.api.CertManager;
import kl.api.ServerManager;
import kl.api.TerminalManager;
import kl.api.UserManager;

import org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {
	 static final String ROOT_PATH = "cds-m";

	    private static final URI BASE_URI = URI.create("http://localhost:8080/");

	    public static void main(String...args) {
	        try {
	        	
	        
	            ResourceConfig resourceConfig = new ResourceConfig(UserManager.class,CertManager.class,ServerManager.class,TerminalManager.class,Authentication.class);
	            final Channel  server = NettyHttpContainerProvider.createHttp2Server(BASE_URI, resourceConfig, null);

	            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
	                @Override
	                public void run() {
	                    server.close();
	                }
	            }));

	            System.out.println(String.format("Application started. (HTTP/2 enabled!)\nTry out %s%s\nStop the application using "
	                                                     + "CTRL+C.", BASE_URI, ROOT_PATH));
	            Thread.currentThread().join();
	        } catch (InterruptedException ex) {
	            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	        }

	    }
}
