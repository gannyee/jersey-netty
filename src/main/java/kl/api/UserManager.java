package kl.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
public class UserManager {
	    public static Map<String,User> userList = new HashMap<String, User>();
	    
	    public UserManager() {
		    if(userList.isEmpty()){
		    	userList.put("1",new User("1","李四","123456","0123-123"));
		    	userList.put("2",new User("2","王五","123456","0123-123"));
		    	userList.put("3",new User("3","周六","123456","0123-123"));
		    }
		}
	    
	    
	    @GET
	    @Path("/")
	    @Produces(MediaType.APPLICATION_JSON)
	    public String developGuider() {
	       return "用户开发指南";
	    }
	    
	    @GET
	    @Path("/{userId}")
	    @Produces( MediaType.APPLICATION_JSON)
	    public User getMetadata(@PathParam("userId") String userId) {
	        if(userList.containsKey(userId))
	            return userList.get(userId);
	        else
	            return new User("Nil", "Nil", "Nil","Nil");
	    }
	    
	    @GET
	    @Path("user")
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<User> getAllUsers() {
	        List<User> user = new ArrayList<User>();
	        user.addAll(userList.values());
	        return user;
	    }
	    
	    @POST
	    @Path("register")
	    @Produces("text/plain")
	    public String register(){
	    	return "注册成功";
	    }
	    
	    @PUT
	    @Path("updateUser")
	    @Produces("text/plain")
	    public String updateUsers(){
	    	return "用户证书更新成功";
	    }  
	    
}
















