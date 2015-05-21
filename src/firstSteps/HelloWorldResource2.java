package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource2 extends ServerResource{
	
	@Get
    public String represent() {
        return "HELLO, WORLD2!";
    }

}
