/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.1
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
import com.precisely.apis.model.Accuracy;
import com.precisely.apis.model.GeolocationGeometry;
import com.precisely.apis.model.IpInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GeoLocationIpAddr
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T12:37:28.987707300+05:30[Asia/Calcutta]")
public class GeoLocationIpAddr {
  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private GeolocationGeometry geometry;

  public static final String SERIALIZED_NAME_ACCURACY = "accuracy";
  @SerializedName(SERIALIZED_NAME_ACCURACY)
  private Accuracy accuracy;

  public static final String SERIALIZED_NAME_IP_INFO = "ipInfo";
  @SerializedName(SERIALIZED_NAME_IP_INFO)
  private IpInfo ipInfo;

  public GeoLocationIpAddr() { 
  }

  public GeoLocationIpAddr geometry(GeolocationGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeolocationGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(GeolocationGeometry geometry) {
    this.geometry = geometry;
  }


  public GeoLocationIpAddr accuracy(Accuracy accuracy) {
    
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Accuracy getAccuracy() {
    return accuracy;
  }


  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }


  public GeoLocationIpAddr ipInfo(IpInfo ipInfo) {
    
    this.ipInfo = ipInfo;
    return this;
  }

   /**
   * Get ipInfo
   * @return ipInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IpInfo getIpInfo() {
    return ipInfo;
  }


  public void setIpInfo(IpInfo ipInfo) {
    this.ipInfo = ipInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationIpAddr geoLocationIpAddr = (GeoLocationIpAddr) o;
    return Objects.equals(this.geometry, geoLocationIpAddr.geometry) &&
        Objects.equals(this.accuracy, geoLocationIpAddr.accuracy) &&
        Objects.equals(this.ipInfo, geoLocationIpAddr.ipInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, accuracy, ipInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationIpAddr {\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    ipInfo: ").append(toIndentedString(ipInfo)).append("\n");
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

