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
		return "������Ȩ����Ϣ";
	}
	
	@PUT
	@Path("user/authen")
	@Produces(MediaType.APPLICATION_JSON )
	public String authenOpe() {
		return "������֤����";
	}
	
	
	@DELETE
	@Path("user/invalidate")
	@Produces(MediaType.APPLICATION_JSON )
	public String invalidateCode() {
		return "��֤����������֤����֤��ʧЧ";
	}
	
	@POST
	@Path("terminal/code")
	@Produces(MediaType.APPLICATION_JSON)
	public String authenQues(){
		return "��������֤����";
	}
	
	@PUT
	@Path("terminal/authen")
	@Produces(MediaType.APPLICATION_JSON)
	public String authen(){
		return "�ͻ�����֤����";
	}
	
	@DELETE
	@Path("terminal/invalidate")
	@Produces( MediaType.APPLICATION_JSON )
	public String delteteCode() {
		return "�ͻ�����֤����������֤����֤��ʧЧ";
	}
}
