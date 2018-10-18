import client.CrexiOauthClient;
import dto.crexi.AuthorizationDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Created by xyzer on 9/22/2018.
 */
public class CrexiOauthClientIT {

    CrexiOauthClient client = new CrexiOauthClient();

    @Test
    public void testOauth() throws IOException{
        CrexiOauthClient client = new CrexiOauthClient();
        AuthorizationDTO token = client.authorizationDTO();
        System.out.println(token.getAccess_token());
        System.out.println(token.getExpires_in());
    }

}
