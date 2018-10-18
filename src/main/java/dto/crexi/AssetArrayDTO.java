package dto.crexi;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xyzer on 9/23/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Data",
        "TotalCount"
})
public class AssetArrayDTO {
    @JsonProperty("Data")
    private List<PropertyDTO> data = null;
    @JsonProperty("TotalCount")
    private Integer totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Data")
    public List<PropertyDTO> getData() {
        return data;
    }

    @JsonProperty("Data")
    public void setData(List<PropertyDTO> data) {
        this.data = data;
    }

    @JsonProperty("TotalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("TotalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
