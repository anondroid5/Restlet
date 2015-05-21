package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class DefaultResouce extends ServerResource{
	
	@Get
    public String represent() {
		// Print the requested URI path
        return  "HelloRestlet" + '\n' +
        "Resource URI  : " + getReference() + '\n' + "Root URI      : "
        + getRootRef() + '\n' + "Routed part   : "
        + getReference().getBaseRef() + '\n' + "Remaining part: "
        + getReference().getRemainingPart();
    }

}
