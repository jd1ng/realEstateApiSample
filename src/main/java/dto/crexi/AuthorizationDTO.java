package dto.crexi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by xyzer on 9/22/2018.
 */

public class AuthorizationDTO {

    private String access_token;
    private String token_type;
    private String expires_in;
    private String new_user;

    public AuthorizationDTO(@JsonProperty(value="access_token")String access_token,
                            @JsonProperty(value="token_type")String token_type,
                            @JsonProperty(value="expires_in")String expires_in,
                            @JsonProperty(value="new_user")String new_user){
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.new_user = new_user;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getNew_user() {
        return new_user;
    }

    public void setNew_user(String new_user) {
        this.new_user = new_user;
    }


}
