/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
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
import com.precisely.apis.model.FireRiskResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FireRiskResponseList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class FireRiskResponseList {
  public static final String SERIALIZED_NAME_FIRE_RISK = "fireRisk";
  @SerializedName(SERIALIZED_NAME_FIRE_RISK)
  private List<FireRiskResponse> fireRisk = null;

  public FireRiskResponseList() { 
  }

  public FireRiskResponseList fireRisk(List<FireRiskResponse> fireRisk) {
    
    this.fireRisk = fireRisk;
    return this;
  }

  public FireRiskResponseList addFireRiskItem(FireRiskResponse fireRiskItem) {
    if (this.fireRisk == null) {
      this.fireRisk = new ArrayList<FireRiskResponse>();
    }
    this.fireRisk.add(fireRiskItem);
    return this;
  }

   /**
   * Get fireRisk
   * @return fireRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FireRiskResponse> getFireRisk() {
    return fireRisk;
  }


  public void setFireRisk(List<FireRiskResponse> fireRisk) {
    this.fireRisk = fireRisk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireRiskResponseList fireRiskResponseList = (FireRiskResponseList) o;
    return Objects.equals(this.fireRisk, fireRiskResponseList.fireRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireRiskResponseList {\n");
    sb.append("    fireRisk: ").append(toIndentedString(fireRisk)).append("\n");
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

