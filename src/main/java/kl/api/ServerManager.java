package kl.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/server")
public class ServerManager {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String serverInfo() {
		return "返回服务器信息";
	}
}
