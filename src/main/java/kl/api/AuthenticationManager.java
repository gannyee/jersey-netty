package kl.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authentications/")
public class AuthenticationManager {

	@POST
	@Path("user/code")
	@Produces( MediaType.APPLICATION_JSON )
	public String codeInfo() {
		return "返回授权码信息";
	}
	
	@PUT
	@Path("user/authen")
	@Produces(MediaType.APPLICATION_JSON )
	public String authenOpe() {
		return "进行验证操作";
	}
	
	
	@DELETE
	@Path("user/invalidate")
	@Produces(MediaType.APPLICATION_JSON )
	public String invalidateCode() {
		return "验证码已用于验证，验证码失效";
	}
	
	@POST
	@Path("terminal/code")
	@Produces(MediaType.APPLICATION_JSON)
	public String authenQues(){
		return "请求获得认证问题";
	}
	
	@PUT
	@Path("terminal/authen")
	@Produces(MediaType.APPLICATION_JSON)
	public String authen(){
		return "客户端认证操作";
	}
	
	@DELETE
	@Path("terminal/invalidate")
	@Produces( MediaType.APPLICATION_JSON )
	public String delteteCode() {
		return "客户端验证码已用于验证，验证码失效";
	}
}
