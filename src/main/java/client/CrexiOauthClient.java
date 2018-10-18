package client; /**
 * Created by xyzer on 9/22/2018.
 */

import RequestUtil.RequestUtilities;
import dto.crexi.AuthorizationDTO;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class CrexiOauthClient extends AbstractClient{


    String url = "https://api.crexi.com/token";
    HttpPost post = new HttpPost(url);

    List<NameValuePair> credentials;

    public void readCredentials(){
        credentials = new ArrayList<NameValuePair>();
        credentials.add(new BasicNameValuePair("grant_type","password"));
        credentials.add(new BasicNameValuePair("username","jeffdin"));
        credentials.add(new BasicNameValuePair("password","Bobdog144"));
    }

    public AuthorizationDTO authorizationDTO() throws IOException{
        readCredentials();
        HttpResponse response = null;
        try {
            post.setEntity(new UrlEncodedFormEntity(credentials));
            post.addHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
            response = client.execute(post);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objectMapper.readValue(RequestUtilities.parseResponse(response.getEntity().getContent()).toString(),AuthorizationDTO.class);
    }

}
