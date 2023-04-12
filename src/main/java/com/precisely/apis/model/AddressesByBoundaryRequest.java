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
import com.precisely.apis.model.AddressesPreferences;
import com.precisely.apis.model.Geometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressesByBoundaryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class AddressesByBoundaryRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private AddressesPreferences preferences;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_GEOMETRY_AS_TEXT = "geometryAsText";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_AS_TEXT)
  private String geometryAsText;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_TRAVEL_TIME = "travelTime";
  @SerializedName(SERIALIZED_NAME_TRAVEL_TIME)
  private String travelTime;

  public static final String SERIALIZED_NAME_TRAVEL_TIME_UNIT = "travelTimeUnit";
  @SerializedName(SERIALIZED_NAME_TRAVEL_TIME_UNIT)
  private String travelTimeUnit;

  public static final String SERIALIZED_NAME_TRAVEL_DISTANCE = "travelDistance";
  @SerializedName(SERIALIZED_NAME_TRAVEL_DISTANCE)
  private String travelDistance;

  public static final String SERIALIZED_NAME_TRAVEL_DISTANCE_UNIT = "travelDistanceUnit";
  @SerializedName(SERIALIZED_NAME_TRAVEL_DISTANCE_UNIT)
  private String travelDistanceUnit;

  public static final String SERIALIZED_NAME_TRAVEL_MODE = "travelMode";
  @SerializedName(SERIALIZED_NAME_TRAVEL_MODE)
  private String travelMode;

  public AddressesByBoundaryRequest() { 
  }

  public AddressesByBoundaryRequest preferences(AddressesPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressesPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(AddressesPreferences preferences) {
    this.preferences = preferences;
  }


  public AddressesByBoundaryRequest geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public AddressesByBoundaryRequest geometryAsText(String geometryAsText) {
    
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


  public AddressesByBoundaryRequest latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public AddressesByBoundaryRequest longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public AddressesByBoundaryRequest travelTime(String travelTime) {
    
    this.travelTime = travelTime;
    return this;
  }

   /**
   * Get travelTime
   * @return travelTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelTime() {
    return travelTime;
  }


  public void setTravelTime(String travelTime) {
    this.travelTime = travelTime;
  }


  public AddressesByBoundaryRequest travelTimeUnit(String travelTimeUnit) {
    
    this.travelTimeUnit = travelTimeUnit;
    return this;
  }

   /**
   * Get travelTimeUnit
   * @return travelTimeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelTimeUnit() {
    return travelTimeUnit;
  }


  public void setTravelTimeUnit(String travelTimeUnit) {
    this.travelTimeUnit = travelTimeUnit;
  }


  public AddressesByBoundaryRequest travelDistance(String travelDistance) {
    
    this.travelDistance = travelDistance;
    return this;
  }

   /**
   * Get travelDistance
   * @return travelDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelDistance() {
    return travelDistance;
  }


  public void setTravelDistance(String travelDistance) {
    this.travelDistance = travelDistance;
  }


  public AddressesByBoundaryRequest travelDistanceUnit(String travelDistanceUnit) {
    
    this.travelDistanceUnit = travelDistanceUnit;
    return this;
  }

   /**
   * Get travelDistanceUnit
   * @return travelDistanceUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelDistanceUnit() {
    return travelDistanceUnit;
  }


  public void setTravelDistanceUnit(String travelDistanceUnit) {
    this.travelDistanceUnit = travelDistanceUnit;
  }


  public AddressesByBoundaryRequest travelMode(String travelMode) {
    
    this.travelMode = travelMode;
    return this;
  }

   /**
   * Get travelMode
   * @return travelMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelMode() {
    return travelMode;
  }


  public void setTravelMode(String travelMode) {
    this.travelMode = travelMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesByBoundaryRequest addressesByBoundaryRequest = (AddressesByBoundaryRequest) o;
    return Objects.equals(this.preferences, addressesByBoundaryRequest.preferences) &&
        Objects.equals(this.geometry, addressesByBoundaryRequest.geometry) &&
        Objects.equals(this.geometryAsText, addressesByBoundaryRequest.geometryAsText) &&
        Objects.equals(this.latitude, addressesByBoundaryRequest.latitude) &&
        Objects.equals(this.longitude, addressesByBoundaryRequest.longitude) &&
        Objects.equals(this.travelTime, addressesByBoundaryRequest.travelTime) &&
        Objects.equals(this.travelTimeUnit, addressesByBoundaryRequest.travelTimeUnit) &&
        Objects.equals(this.travelDistance, addressesByBoundaryRequest.travelDistance) &&
        Objects.equals(this.travelDistanceUnit, addressesByBoundaryRequest.travelDistanceUnit) &&
        Objects.equals(this.travelMode, addressesByBoundaryRequest.travelMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, geometry, geometryAsText, latitude, longitude, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesByBoundaryRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    geometryAsText: ").append(toIndentedString(geometryAsText)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    travelTimeUnit: ").append(toIndentedString(travelTimeUnit)).append("\n");
    sb.append("    travelDistance: ").append(toIndentedString(travelDistance)).append("\n");
    sb.append("    travelDistanceUnit: ").append(toIndentedString(travelDistanceUnit)).append("\n");
    sb.append("    travelMode: ").append(toIndentedString(travelMode)).append("\n");
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

