package client;

import RequestUtil.RequestUtilities;
import dto.crexi.AssetArrayDTO;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Optional;

/**
 * Created by xyzer on 9/23/2018.
 */
public class CrexiAssetClient extends AbstractClient{

    public AssetArrayDTO assetDto(HashMap<String, String> query) throws IOException{
        HttpResponse response = null;
        try {
            String queryAppend = RequestUtilities.queryUrlAppend(Optional.of(query));
            url = new URIBuilder("https://api.crexi.com/assets?"+queryAppend);
            HttpGet getCall = new HttpGet(url.build());
            response = client.execute(getCall);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return objectMapper.readValue(RequestUtilities.parseResponse(response.getEntity().getContent()).toString(),AssetArrayDTO.class);
    }

}
