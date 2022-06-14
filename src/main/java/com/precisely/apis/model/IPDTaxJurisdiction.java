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
import com.precisely.apis.model.TaxCounty;
import com.precisely.apis.model.TaxPlace;
import com.precisely.apis.model.TaxState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IPDTaxJurisdiction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class IPDTaxJurisdiction {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private TaxState state;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private TaxCounty county;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private TaxPlace place;

  public IPDTaxJurisdiction() { 
  }

  public IPDTaxJurisdiction state(TaxState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxState getState() {
    return state;
  }


  public void setState(TaxState state) {
    this.state = state;
  }


  public IPDTaxJurisdiction county(TaxCounty county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxCounty getCounty() {
    return county;
  }


  public void setCounty(TaxCounty county) {
    this.county = county;
  }


  public IPDTaxJurisdiction place(TaxPlace place) {
    
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxPlace getPlace() {
    return place;
  }


  public void setPlace(TaxPlace place) {
    this.place = place;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPDTaxJurisdiction ipDTaxJurisdiction = (IPDTaxJurisdiction) o;
    return Objects.equals(this.state, ipDTaxJurisdiction.state) &&
        Objects.equals(this.county, ipDTaxJurisdiction.county) &&
        Objects.equals(this.place, ipDTaxJurisdiction.place);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, county, place);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPDTaxJurisdiction {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
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

