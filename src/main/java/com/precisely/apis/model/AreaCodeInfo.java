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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AreaCodeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class AreaCodeInfo {
  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_OCN = "ocn";
  @SerializedName(SERIALIZED_NAME_OCN)
  private String ocn;

  public static final String SERIALIZED_NAME_OCN_CATEGORY = "ocnCategory";
  @SerializedName(SERIALIZED_NAME_OCN_CATEGORY)
  private String ocnCategory;

  public static final String SERIALIZED_NAME_NPA = "npa";
  @SerializedName(SERIALIZED_NAME_NPA)
  private String npa;

  public static final String SERIALIZED_NAME_NXX = "nxx";
  @SerializedName(SERIALIZED_NAME_NXX)
  private String nxx;

  public static final String SERIALIZED_NAME_START_RANGE = "startRange";
  @SerializedName(SERIALIZED_NAME_START_RANGE)
  private String startRange;

  public static final String SERIALIZED_NAME_END_RANGE = "endRange";
  @SerializedName(SERIALIZED_NAME_END_RANGE)
  private String endRange;

  public static final String SERIALIZED_NAME_LATA = "lata";
  @SerializedName(SERIALIZED_NAME_LATA)
  private String lata;

  public static final String SERIALIZED_NAME_AREA_NAME4 = "areaName4";
  @SerializedName(SERIALIZED_NAME_AREA_NAME4)
  private String areaName4;

  public AreaCodeInfo() { 
  }

  public AreaCodeInfo companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AreaCodeInfo ocn(String ocn) {
    
    this.ocn = ocn;
    return this;
  }

   /**
   * Get ocn
   * @return ocn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOcn() {
    return ocn;
  }


  public void setOcn(String ocn) {
    this.ocn = ocn;
  }


  public AreaCodeInfo ocnCategory(String ocnCategory) {
    
    this.ocnCategory = ocnCategory;
    return this;
  }

   /**
   * Get ocnCategory
   * @return ocnCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOcnCategory() {
    return ocnCategory;
  }


  public void setOcnCategory(String ocnCategory) {
    this.ocnCategory = ocnCategory;
  }


  public AreaCodeInfo npa(String npa) {
    
    this.npa = npa;
    return this;
  }

   /**
   * Get npa
   * @return npa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNpa() {
    return npa;
  }


  public void setNpa(String npa) {
    this.npa = npa;
  }


  public AreaCodeInfo nxx(String nxx) {
    
    this.nxx = nxx;
    return this;
  }

   /**
   * Get nxx
   * @return nxx
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNxx() {
    return nxx;
  }


  public void setNxx(String nxx) {
    this.nxx = nxx;
  }


  public AreaCodeInfo startRange(String startRange) {
    
    this.startRange = startRange;
    return this;
  }

   /**
   * Get startRange
   * @return startRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartRange() {
    return startRange;
  }


  public void setStartRange(String startRange) {
    this.startRange = startRange;
  }


  public AreaCodeInfo endRange(String endRange) {
    
    this.endRange = endRange;
    return this;
  }

   /**
   * Get endRange
   * @return endRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndRange() {
    return endRange;
  }


  public void setEndRange(String endRange) {
    this.endRange = endRange;
  }


  public AreaCodeInfo lata(String lata) {
    
    this.lata = lata;
    return this;
  }

   /**
   * Get lata
   * @return lata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLata() {
    return lata;
  }


  public void setLata(String lata) {
    this.lata = lata;
  }


  public AreaCodeInfo areaName4(String areaName4) {
    
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName4() {
    return areaName4;
  }


  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaCodeInfo areaCodeInfo = (AreaCodeInfo) o;
    return Objects.equals(this.companyName, areaCodeInfo.companyName) &&
        Objects.equals(this.ocn, areaCodeInfo.ocn) &&
        Objects.equals(this.ocnCategory, areaCodeInfo.ocnCategory) &&
        Objects.equals(this.npa, areaCodeInfo.npa) &&
        Objects.equals(this.nxx, areaCodeInfo.nxx) &&
        Objects.equals(this.startRange, areaCodeInfo.startRange) &&
        Objects.equals(this.endRange, areaCodeInfo.endRange) &&
        Objects.equals(this.lata, areaCodeInfo.lata) &&
        Objects.equals(this.areaName4, areaCodeInfo.areaName4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, ocn, ocnCategory, npa, nxx, startRange, endRange, lata, areaName4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaCodeInfo {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    ocn: ").append(toIndentedString(ocn)).append("\n");
    sb.append("    ocnCategory: ").append(toIndentedString(ocnCategory)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    endRange: ").append(toIndentedString(endRange)).append("\n");
    sb.append("    lata: ").append(toIndentedString(lata)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
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

