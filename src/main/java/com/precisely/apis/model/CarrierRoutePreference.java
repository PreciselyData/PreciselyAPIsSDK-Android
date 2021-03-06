/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CarrierRoutePreference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class CarrierRoutePreference   {
  @SerializedName("includeGeometry")
  private String includeGeometry = null;

  @SerializedName("postCode")
  private String postCode = null;

  public CarrierRoutePreference includeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
    return this;
  }

   /**
   * Get includeGeometry
   * @return includeGeometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludeGeometry() {
    return includeGeometry;
  }

  public void setIncludeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
  }

  public CarrierRoutePreference postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierRoutePreference carrierRoutePreference = (CarrierRoutePreference) o;
    return Objects.equals(this.includeGeometry, carrierRoutePreference.includeGeometry) &&
        Objects.equals(this.postCode, carrierRoutePreference.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeGeometry, postCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierRoutePreference {\n");
    
    sb.append("    includeGeometry: ").append(toIndentedString(includeGeometry)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

