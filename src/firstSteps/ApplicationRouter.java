package firstSteps;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class ApplicationRouter extends Application{
	
    @Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext());  
        router.attachDefault(DefaultResouce.class);
        router.attach("/order",OrderResource.class);
        router.attach("/hello",HelloWorldResource.class);
        router.attach("/hello2",HelloWorldResource2.class);
        return router;
    }

}
