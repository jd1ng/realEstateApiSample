package dto.crexi;

/**
 * Created by xyzer on 9/23/2018.
 */
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dto.crexi.BestAndFinalDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BestAndFinal",
        "BrokerTeamLogoUrl",
        "Description",
        "HasFlyer",
        "HasOM",
        "Id",
        "IsOutdated",
        "IsPaused",
        "IsPrivate",
        "IsSaved",
        "IsSavedToBoards",
        "IsSold",
        "Name",
        "OffersDueOn",
        "ShowCountdownAsDate",
        "Status",
        "ThumbnailUrl",
        "UpdatedOn",
        "UserIsAssetOwner"
})
public class PropertyDTO {
    @JsonProperty("BestAndFinal")
    private BestAndFinalDTO bestAndFinal;
    @JsonProperty("BrokerTeamLogoUrl")
    private String brokerTeamLogoUrl;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("HasFlyer")
    private Boolean hasFlyer;
    @JsonProperty("HasOM")
    private Boolean hasOM;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("IsOutdated")
    private Boolean isOutdated;
    @JsonProperty("IsPaused")
    private Boolean isPaused;
    @JsonProperty("IsPrivate")
    private Boolean isPrivate;
    @JsonProperty("IsSaved")
    private Boolean isSaved;
    @JsonProperty("IsSavedToBoards")
    private Boolean isSavedToBoards;
    @JsonProperty("IsSold")
    private Boolean isSold;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("OffersDueOn")
    private String offersDueOn;
    @JsonProperty("ShowCountdownAsDate")
    private Boolean showCountdownAsDate;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("ThumbnailUrl")
    private String thumbnailUrl;
    @JsonProperty("UpdatedOn")
    private String updatedOn;
    @JsonProperty("UserIsAssetOwner")
    private Boolean userIsAssetOwner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BestAndFinal")
    public BestAndFinalDTO getBestAndFinal() {
        return bestAndFinal;
    }

    @JsonProperty("BestAndFinal")
    public void setBestAndFinalDTO(BestAndFinalDTO bestAndFinal) {
        this.bestAndFinal = bestAndFinal;
    }

    @JsonProperty("BrokerTeamLogoUrl")
    public String getBrokerTeamLogoUrl() {
        return brokerTeamLogoUrl;
    }

    @JsonProperty("BrokerTeamLogoUrl")
    public void setBrokerTeamLogoUrl(String brokerTeamLogoUrl) {
        this.brokerTeamLogoUrl = brokerTeamLogoUrl;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("HasFlyer")
    public Boolean getHasFlyer() {
        return hasFlyer;
    }

    @JsonProperty("HasFlyer")
    public void setHasFlyer(Boolean hasFlyer) {
        this.hasFlyer = hasFlyer;
    }

    @JsonProperty("HasOM")
    public Boolean getHasOM() {
        return hasOM;
    }

    @JsonProperty("HasOM")
    public void setHasOM(Boolean hasOM) {
        this.hasOM = hasOM;
    }

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("IsOutdated")
    public Boolean getIsOutdated() {
        return isOutdated;
    }

    @JsonProperty("IsOutdated")
    public void setIsOutdated(Boolean isOutdated) {
        this.isOutdated = isOutdated;
    }

    @JsonProperty("IsPaused")
    public Boolean getIsPaused() {
        return isPaused;
    }

    @JsonProperty("IsPaused")
    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    @JsonProperty("IsPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("IsPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("IsSaved")
    public Boolean getIsSaved() {
        return isSaved;
    }

    @JsonProperty("IsSaved")
    public void setIsSaved(Boolean isSaved) {
        this.isSaved = isSaved;
    }

    @JsonProperty("IsSavedToBoards")
    public Boolean getIsSavedToBoards() {
        return isSavedToBoards;
    }

    @JsonProperty("IsSavedToBoards")
    public void setIsSavedToBoards(Boolean isSavedToBoards) {
        this.isSavedToBoards = isSavedToBoards;
    }

    @JsonProperty("IsSold")
    public Boolean getIsSold() {
        return isSold;
    }

    @JsonProperty("IsSold")
    public void setIsSold(Boolean isSold) {
        this.isSold = isSold;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("OffersDueOn")
    public String getOffersDueOn() {
        return offersDueOn;
    }

    @JsonProperty("OffersDueOn")
    public void setOffersDueOn(String offersDueOn) {
        this.offersDueOn = offersDueOn;
    }

    @JsonProperty("ShowCountdownAsDate")
    public Boolean getShowCountdownAsDate() {
        return showCountdownAsDate;
    }

    @JsonProperty("ShowCountdownAsDate")
    public void setShowCountdownAsDate(Boolean showCountdownAsDate) {
        this.showCountdownAsDate = showCountdownAsDate;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("ThumbnailUrl")
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @JsonProperty("ThumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @JsonProperty("UpdatedOn")
    public String getUpdatedOn() {
        return updatedOn;
    }

    @JsonProperty("UpdatedOn")
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    @JsonProperty("UserIsAssetOwner")
    public Boolean getUserIsAssetOwner() {
        return userIsAssetOwner;
    }

    @JsonProperty("UserIsAssetOwner")
    public void setUserIsAssetOwner(Boolean userIsAssetOwner) {
        this.userIsAssetOwner = userIsAssetOwner;
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
