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
import com.precisely.apis.model.DemographicsAdvancedPreferences;
import com.precisely.apis.model.DemographicsGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DemographicsAdvancedRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class DemographicsAdvancedRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private DemographicsAdvancedPreferences preferences;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private DemographicsGeometry geometry;

  public static final String SERIALIZED_NAME_GEOMETRY_AS_TEXT = "geometryAsText";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_AS_TEXT)
  private String geometryAsText;

  public DemographicsAdvancedRequest() { 
  }

  public DemographicsAdvancedRequest preferences(DemographicsAdvancedPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DemographicsAdvancedPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(DemographicsAdvancedPreferences preferences) {
    this.preferences = preferences;
  }


  public DemographicsAdvancedRequest geometry(DemographicsGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DemographicsGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(DemographicsGeometry geometry) {
    this.geometry = geometry;
  }


  public DemographicsAdvancedRequest geometryAsText(String geometryAsText) {
    
    this.geometryAsText = geometryAsText;
    return this;
  }

   /**
   * Get geometryAsText
   * @return geometryAsText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeometryAsText() {
    return geometryAsText;
  }


  public void setGeometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemographicsAdvancedRequest demographicsAdvancedRequest = (DemographicsAdvancedRequest) o;
    return Objects.equals(this.preferences, demographicsAdvancedRequest.preferences) &&
        Objects.equals(this.geometry, demographicsAdvancedRequest.geometry) &&
        Objects.equals(this.geometryAsText, demographicsAdvancedRequest.geometryAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, geometry, geometryAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsAdvancedRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    geometryAsText: ").append(toIndentedString(geometryAsText)).append("\n");
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

