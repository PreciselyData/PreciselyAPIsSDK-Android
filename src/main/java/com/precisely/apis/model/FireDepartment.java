/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.FireStationContactDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FireDepartment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class FireDepartment {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NUMBER_OF_STATIONS = "numberOfStations";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_STATIONS)
  private Integer numberOfStations;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_OFFICE_ONLY = "administrativeOfficeOnly";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_OFFICE_ONLY)
  private Boolean administrativeOfficeOnly;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contactDetails";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private FireStationContactDetails contactDetails;

  public FireDepartment() { 
  }

  public FireDepartment name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FireDepartment type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FireDepartment numberOfStations(Integer numberOfStations) {
    
    this.numberOfStations = numberOfStations;
    return this;
  }

   /**
   * Get numberOfStations
   * @return numberOfStations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfStations() {
    return numberOfStations;
  }


  public void setNumberOfStations(Integer numberOfStations) {
    this.numberOfStations = numberOfStations;
  }


  public FireDepartment administrativeOfficeOnly(Boolean administrativeOfficeOnly) {
    
    this.administrativeOfficeOnly = administrativeOfficeOnly;
    return this;
  }

   /**
   * Get administrativeOfficeOnly
   * @return administrativeOfficeOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdministrativeOfficeOnly() {
    return administrativeOfficeOnly;
  }


  public void setAdministrativeOfficeOnly(Boolean administrativeOfficeOnly) {
    this.administrativeOfficeOnly = administrativeOfficeOnly;
  }


  public FireDepartment contactDetails(FireStationContactDetails contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FireStationContactDetails getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(FireStationContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireDepartment fireDepartment = (FireDepartment) o;
    return Objects.equals(this.name, fireDepartment.name) &&
        Objects.equals(this.type, fireDepartment.type) &&
        Objects.equals(this.numberOfStations, fireDepartment.numberOfStations) &&
        Objects.equals(this.administrativeOfficeOnly, fireDepartment.administrativeOfficeOnly) &&
        Objects.equals(this.contactDetails, fireDepartment.contactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, numberOfStations, administrativeOfficeOnly, contactDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireDepartment {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    numberOfStations: ").append(toIndentedString(numberOfStations)).append("\n");
    sb.append("    administrativeOfficeOnly: ").append(toIndentedString(administrativeOfficeOnly)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
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

