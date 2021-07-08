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
 * PoiCount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class PoiCount   {
  @SerializedName("totalPoisFound")
  private Integer totalPoisFound = null;

  public PoiCount totalPoisFound(Integer totalPoisFound) {
    this.totalPoisFound = totalPoisFound;
    return this;
  }

   /**
   * Get totalPoisFound
   * @return totalPoisFound
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalPoisFound() {
    return totalPoisFound;
  }

  public void setTotalPoisFound(Integer totalPoisFound) {
    this.totalPoisFound = totalPoisFound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiCount poiCount = (PoiCount) o;
    return Objects.equals(this.totalPoisFound, poiCount.totalPoisFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPoisFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiCount {\n");
    
    sb.append("    totalPoisFound: ").append(toIndentedString(totalPoisFound)).append("\n");
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

