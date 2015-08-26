package demoisellelab;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
 
@Path("calculator")
public class CalculatorREST {
 
    @POST
    @Path("sum")
    public Integer sum(@FormParam("a") Integer a, @FormParam("b") Integer b) {
        return a + b;
    }
}