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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressesPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class AddressesPreferences {
  public static final String SERIALIZED_NAME_MAX_CANDIDATES = "maxCandidates";
  @SerializedName(SERIALIZED_NAME_MAX_CANDIDATES)
  private String maxCandidates;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public AddressesPreferences() { 
  }

  public AddressesPreferences maxCandidates(String maxCandidates) {
    
    this.maxCandidates = maxCandidates;
    return this;
  }

   /**
   * Get maxCandidates
   * @return maxCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxCandidates() {
    return maxCandidates;
  }


  public void setMaxCandidates(String maxCandidates) {
    this.maxCandidates = maxCandidates;
  }


  public AddressesPreferences page(String page) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesPreferences addressesPreferences = (AddressesPreferences) o;
    return Objects.equals(this.maxCandidates, addressesPreferences.maxCandidates) &&
        Objects.equals(this.page, addressesPreferences.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCandidates, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesPreferences {\n");
    sb.append("    maxCandidates: ").append(toIndentedString(maxCandidates)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

