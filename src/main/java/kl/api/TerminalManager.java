package kl.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("terminals")
public class TerminalManager {
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON )
	public String terminalInfo() {
		return "∑µªÿ÷’∂À–≈œ¢";
	}
}
