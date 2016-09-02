package kl.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/certs")
public class CertManager {

	public static Map<String, UserCertificate> certList = new HashMap<String, UserCertificate>();
	
	public CertManager() {
		if(certList.isEmpty()){
			certList.put("1",new UserCertificate("1","koal","validate"));
			certList.put("2",new UserCertificate("2","koal","validate"));
			certList.put("3",new UserCertificate("3","koal","validate"));
		}
	}
	
    @GET
    @Path("{certId}")
    @Produces( MediaType.APPLICATION_JSON)
    public UserCertificate getMetadata(@PathParam("certId") String certId) {
        if(certList.containsKey(certId))
            return certList.get(certId);
        else
            return new UserCertificate("Nil", "Nil","Nil");
    }
    
    @GET
    @Path("cert")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserCertificate> getAllUserCerts() {
        List<UserCertificate> cert = new ArrayList<UserCertificate>();
        cert.addAll(certList.values());
        return cert;
    }
    
    @GET
    @Path("certtypes")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCertType(){
    	return "֤������";
    }
    
    @POST
    @Path("certservices/issue")
    @Produces(MediaType.APPLICATION_JSON)
    public String asignCert(){
    	return "֤��ǩ���ɹ�";
    }
    
    @POST
    @Path("certservices/update")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateCert(){
    	return "֤����³ɹ�";
    }
    @POST
    @Path("applicat")
    @Produces("text/plain")
    public String applicateCert(){
    	return "֤������ɹ�";
    }  
    
    @PUT
    @Path("updateCert")
    @Produces("text/plain")
    public String updateCerts(){
    	return "֤����³ɹ�";
    }
    
    @DELETE
    @Path("delete")
    @Produces("text/plain")
    public String deleteCert(){
    	return "֤��ɾ���ɹ�";
    }
    

}
