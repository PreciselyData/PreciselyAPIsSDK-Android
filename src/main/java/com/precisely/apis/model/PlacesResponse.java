/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 15.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.Address;
import com.precisely.apis.model.Poi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PlacesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class PlacesResponse {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public static final String SERIALIZED_NAME_CANDIDATES = "candidates";
  @SerializedName(SERIALIZED_NAME_CANDIDATES)
  private String candidates;

  public static final String SERIALIZED_NAME_TOTAL_MATCHING_CANDIDATES = "totalMatchingCandidates";
  @SerializedName(SERIALIZED_NAME_TOTAL_MATCHING_CANDIDATES)
  private String totalMatchingCandidates;

  public static final String SERIALIZED_NAME_POI = "poi";
  @SerializedName(SERIALIZED_NAME_POI)
  private List<Poi> poi = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private Address matchedAddress;

  public PlacesResponse() { 
  }

  public PlacesResponse page(String page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPage() {
    return page;
  }


  public void setPage(String page) {
    this.page = page;
  }


  public PlacesResponse candidates(String candidates) {
    
    this.candidates = candidates;
    return this;
  }

   /**
   * Get candidates
   * @return candidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidates() {
    return candidates;
  }


  public void setCandidates(String candidates) {
    this.candidates = candidates;
  }


  public PlacesResponse totalMatchingCandidates(String totalMatchingCandidates) {
    
    this.totalMatchingCandidates = totalMatchingCandidates;
    return this;
  }

   /**
   * Get totalMatchingCandidates
   * @return totalMatchingCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalMatchingCandidates() {
    return totalMatchingCandidates;
  }


  public void setTotalMatchingCandidates(String totalMatchingCandidates) {
    this.totalMatchingCandidates = totalMatchingCandidates;
  }


  public PlacesResponse poi(List<Poi> poi) {
    
    this.poi = poi;
    return this;
  }

  public PlacesResponse addPoiItem(Poi poiItem) {
    if (this.poi == null) {
      this.poi = new ArrayList<Poi>();
    }
    this.poi.add(poiItem);
    return this;
  }

   /**
   * Get poi
   * @return poi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Poi> getPoi() {
    return poi;
  }


  public void setPoi(List<Poi> poi) {
    this.poi = poi;
  }


  public PlacesResponse matchedAddress(Address matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacesResponse placesResponse = (PlacesResponse) o;
    return Objects.equals(this.page, placesResponse.page) &&
        Objects.equals(this.candidates, placesResponse.candidates) &&
        Objects.equals(this.totalMatchingCandidates, placesResponse.totalMatchingCandidates) &&
        Objects.equals(this.poi, placesResponse.poi) &&
        Objects.equals(this.matchedAddress, placesResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, candidates, totalMatchingCandidates, poi, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacesResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    totalMatchingCandidates: ").append(toIndentedString(totalMatchingCandidates)).append("\n");
    sb.append("    poi: ").append(toIndentedString(poi)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

