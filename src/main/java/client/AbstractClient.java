package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by xyzer on 9/24/2018.
 */
public class AbstractClient {
    URIBuilder url;
    HttpClient client = HttpClientBuilder.create().build();
    ObjectMapper objectMapper = new ObjectMapper();
}
