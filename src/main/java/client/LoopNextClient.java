package client;

import RequestUtil.RequestUtilities;

import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Optional;

/**
 * Created by xyzer on 9/24/2018.
 */
public class LoopNextClient extends AbstractClient{

    public void loopnetSearchDTO(HashMap<String, String> query, JsonObject json) throws IOException {
        HttpResponse response = null;
        try {
            String queryAppend = RequestUtilities.queryUrlAppend(Optional.of(query));
            url = new URIBuilder("http://www.loopnet.com/services/search?"+queryAppend);
            HttpPost post = new HttpPost(url.build());
            StringEntity outboundPayload = new StringEntity(json.toString());
            post.setEntity(outboundPayload);
            response = client.execute(post);
            System.out.println(response.getStatusLine());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
