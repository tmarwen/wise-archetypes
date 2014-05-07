#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.exoplatform.services.rest.resource.ResourceContainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by eXo Platform MEA on 06/05/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */

@Path("/my-resource")
public class MyRestResource implements ResourceContainer {

  @GET
  @Path("/get/{name}")
  public String get(@PathParam("word") String word) {
    return "Hello " + word;
  }

}
