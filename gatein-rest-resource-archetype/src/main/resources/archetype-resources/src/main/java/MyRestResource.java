#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.exoplatform.services.rest.resource.ResourceContainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by WiseBrains on 06/05/14.
 *
 * The <code>MyRestResource</code> class represents a RESTful GateIn
 * resource container.
 *
 * @author <a href="mailto:marwen.trabelsi.insat@gmail.com">Marwen Trabelsi</a>
 */

@Path("/my-resource")
public class MyRestResource implements ResourceContainer {

  /**
   * A GET style method that returns a {@code String} object that
   * formed of <pre>Hello </pre> along with a <pre>word</pre> forwarded
   * to the the method endpoint URL as a {@code PathParam}.
   */
  @GET
  @Path("/get/{name}")
  public String get(@PathParam("word") String word) {
    return "Hello " + word;
  }

}
