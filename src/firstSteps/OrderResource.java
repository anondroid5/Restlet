package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class OrderResource extends ServerResource{
	@Get
	 public String represent() {
	        return "注文件数は20件です。";
	    }
}
