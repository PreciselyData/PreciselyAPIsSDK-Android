/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.5.0
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
import com.precisely.apis.model.IndividualValueVariableV2;
import com.precisely.apis.model.RangeVariableV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * HousingTheme
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-23T11:56:04.654+05:30")
public class HousingTheme   {
  @SerializedName("boundaryRef")
  private String boundaryRef = null;

  @SerializedName("individualValueVariable")
  private List<IndividualValueVariableV2> individualValueVariable = new ArrayList<IndividualValueVariableV2>();

  @SerializedName("rangeVariable")
  private List<RangeVariableV2> rangeVariable = new ArrayList<RangeVariableV2>();

  public HousingTheme boundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryRef() {
    return boundaryRef;
  }

  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }

  public HousingTheme individualValueVariable(List<IndividualValueVariableV2> individualValueVariable) {
    this.individualValueVariable = individualValueVariable;
    return this;
  }

   /**
   * Get individualValueVariable
   * @return individualValueVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IndividualValueVariableV2> getIndividualValueVariable() {
    return individualValueVariable;
  }

  public void setIndividualValueVariable(List<IndividualValueVariableV2> individualValueVariable) {
    this.individualValueVariable = individualValueVariable;
  }

  public HousingTheme rangeVariable(List<RangeVariableV2> rangeVariable) {
    this.rangeVariable = rangeVariable;
    return this;
  }

   /**
   * Get rangeVariable
   * @return rangeVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RangeVariableV2> getRangeVariable() {
    return rangeVariable;
  }

  public void setRangeVariable(List<RangeVariableV2> rangeVariable) {
    this.rangeVariable = rangeVariable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HousingTheme housingTheme = (HousingTheme) o;
    return Objects.equals(this.boundaryRef, housingTheme.boundaryRef) &&
        Objects.equals(this.individualValueVariable, housingTheme.individualValueVariable) &&
        Objects.equals(this.rangeVariable, housingTheme.rangeVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryRef, individualValueVariable, rangeVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HousingTheme {\n");
    
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
    sb.append("    individualValueVariable: ").append(toIndentedString(individualValueVariable)).append("\n");
    sb.append("    rangeVariable: ").append(toIndentedString(rangeVariable)).append("\n");
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

