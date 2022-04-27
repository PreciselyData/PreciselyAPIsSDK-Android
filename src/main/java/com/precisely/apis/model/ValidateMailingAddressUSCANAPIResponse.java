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
import com.precisely.apis.model.ValidateMailingAddressUSCANAPIOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidateMailingAddressUSCANAPIResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class ValidateMailingAddressUSCANAPIResponse {
  public static final String SERIALIZED_NAME_OUTPUT = "Output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private List<ValidateMailingAddressUSCANAPIOutput> output = null;

  public ValidateMailingAddressUSCANAPIResponse() { 
  }

  public ValidateMailingAddressUSCANAPIResponse output(List<ValidateMailingAddressUSCANAPIOutput> output) {
    
    this.output = output;
    return this;
  }

  public ValidateMailingAddressUSCANAPIResponse addOutputItem(ValidateMailingAddressUSCANAPIOutput outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<ValidateMailingAddressUSCANAPIOutput>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ValidateMailingAddressUSCANAPIOutput> getOutput() {
    return output;
  }


  public void setOutput(List<ValidateMailingAddressUSCANAPIOutput> output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressUSCANAPIResponse validateMailingAddressUSCANAPIResponse = (ValidateMailingAddressUSCANAPIResponse) o;
    return Objects.equals(this.output, validateMailingAddressUSCANAPIResponse.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressUSCANAPIResponse {\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

