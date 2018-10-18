package dto.crexi;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyzer on 9/23/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Type",
        "UserCanSeeCurrentOffer",
        "UserHasAccess",
        "UserRequestedAccessToBnF"
})
public class BestAndFinalDTO {
    @JsonProperty("Type")
    private Object type;
    @JsonProperty("UserCanSeeCurrentOffer")
    private Boolean userCanSeeCurrentOffer;
    @JsonProperty("UserHasAccess")
    private Boolean userHasAccess;
    @JsonProperty("UserRequestedAccessToBnF")
    private Boolean userRequestedAccessToBnF;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Type")
    public Object getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("UserCanSeeCurrentOffer")
    public Boolean getUserCanSeeCurrentOffer() {
        return userCanSeeCurrentOffer;
    }

    @JsonProperty("UserCanSeeCurrentOffer")
    public void setUserCanSeeCurrentOffer(Boolean userCanSeeCurrentOffer) {
        this.userCanSeeCurrentOffer = userCanSeeCurrentOffer;
    }

    @JsonProperty("UserHasAccess")
    public Boolean getUserHasAccess() {
        return userHasAccess;
    }

    @JsonProperty("UserHasAccess")
    public void setUserHasAccess(Boolean userHasAccess) {
        this.userHasAccess = userHasAccess;
    }

    @JsonProperty("UserRequestedAccessToBnF")
    public Boolean getUserRequestedAccessToBnF() {
        return userRequestedAccessToBnF;
    }

    @JsonProperty("UserRequestedAccessToBnF")
    public void setUserRequestedAccessToBnF(Boolean userRequestedAccessToBnF) {
        this.userRequestedAccessToBnF = userRequestedAccessToBnF;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
