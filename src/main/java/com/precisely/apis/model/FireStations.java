/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3.1
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
import com.precisely.apis.model.FireStation;
import com.precisely.apis.model.RiskAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FireStations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class FireStations {
  public static final String SERIALIZED_NAME_FIRE_STATION = "fireStation";
  @SerializedName(SERIALIZED_NAME_FIRE_STATION)
  private List<FireStation> fireStation = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public FireStations() { 
  }

  public FireStations fireStation(List<FireStation> fireStation) {
    
    this.fireStation = fireStation;
    return this;
  }

  public FireStations addFireStationItem(FireStation fireStationItem) {
    if (this.fireStation == null) {
      this.fireStation = new ArrayList<FireStation>();
    }
    this.fireStation.add(fireStationItem);
    return this;
  }

   /**
   * Get fireStation
   * @return fireStation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FireStation> getFireStation() {
    return fireStation;
  }


  public void setFireStation(List<FireStation> fireStation) {
    this.fireStation = fireStation;
  }


  public FireStations matchedAddress(RiskAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(RiskAddress matchedAddress) {
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
    FireStations fireStations = (FireStations) o;
    return Objects.equals(this.fireStation, fireStations.fireStation) &&
        Objects.equals(this.matchedAddress, fireStations.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireStation, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireStations {\n");
    sb.append("    fireStation: ").append(toIndentedString(fireStation)).append("\n");
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

