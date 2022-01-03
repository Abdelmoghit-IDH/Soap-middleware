import service.BanqueService;
import javax.xml.ws.Endpoint;

public class ServeurJaxWS {
    public static void main(String[] args) {
    	String url = "http://localhost:8585/";
    	Endpoint.publish (url , new BanqueService());
    }
}


