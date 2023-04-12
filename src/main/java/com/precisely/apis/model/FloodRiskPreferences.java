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
 * FloodRiskPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class FloodRiskPreferences {
  public static final String SERIALIZED_NAME_INCLUDE_GEOMETRY = "includeGeometry";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GEOMETRY)
  private String includeGeometry;

  public static final String SERIALIZED_NAME_INCLUDE_ZONE_DESC = "includeZoneDesc";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ZONE_DESC)
  private String includeZoneDesc;

  public static final String SERIALIZED_NAME_RICHTER_VALUE = "richterValue";
  @SerializedName(SERIALIZED_NAME_RICHTER_VALUE)
  private String richterValue;

  public FloodRiskPreferences() { 
  }

  public FloodRiskPreferences includeGeometry(String includeGeometry) {
    
    this.includeGeometry = includeGeometry;
    return this;
  }

   /**
   * Get includeGeometry
   * @return includeGeometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncludeGeometry() {
    return includeGeometry;
  }


  public void setIncludeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
  }


  public FloodRiskPreferences includeZoneDesc(String includeZoneDesc) {
    
    this.includeZoneDesc = includeZoneDesc;
    return this;
  }

   /**
   * Get includeZoneDesc
   * @return includeZoneDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncludeZoneDesc() {
    return includeZoneDesc;
  }


  public void setIncludeZoneDesc(String includeZoneDesc) {
    this.includeZoneDesc = includeZoneDesc;
  }


  public FloodRiskPreferences richterValue(String richterValue) {
    
    this.richterValue = richterValue;
    return this;
  }

   /**
   * Get richterValue
   * @return richterValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRichterValue() {
    return richterValue;
  }


  public void setRichterValue(String richterValue) {
    this.richterValue = richterValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskPreferences floodRiskPreferences = (FloodRiskPreferences) o;
    return Objects.equals(this.includeGeometry, floodRiskPreferences.includeGeometry) &&
        Objects.equals(this.includeZoneDesc, floodRiskPreferences.includeZoneDesc) &&
        Objects.equals(this.richterValue, floodRiskPreferences.richterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeGeometry, includeZoneDesc, richterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskPreferences {\n");
    sb.append("    includeGeometry: ").append(toIndentedString(includeGeometry)).append("\n");
    sb.append("    includeZoneDesc: ").append(toIndentedString(includeZoneDesc)).append("\n");
    sb.append("    richterValue: ").append(toIndentedString(richterValue)).append("\n");
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

