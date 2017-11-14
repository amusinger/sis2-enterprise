package cart.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Session Bean implementation class CartBean
 */
@Stateless
@LocalBean
@Path("/cart")
@WebService
public class CartBean implements Cart{
	List<String> contents;
	@PersistenceContext(name="entityManager") 
    EntityManager em;

    /**
     * Default constructor. 
     */
    public CartBean() {
        // TODO Auto-generated constructor stub
    }

    
 
    @GET
    @Path("addProduct")
    @WebMethod
    public void addProduct(String title)
    {
        contents.add(title);
    }
    @GET
    @Path("removeProduct")
    @WebMethod
    public void removeProduct( String title)
    {
    		contents.remove(title);
    }
    
    @GET
    @Produces("application/json")
    @Path("getAllProducts")
    @WebMethod
    public List<String> getAllProducts(){
        return null;
    }

}
