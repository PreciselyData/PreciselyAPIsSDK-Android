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
import com.precisely.apis.model.CommonState;
import com.precisely.apis.model.FireShed;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FireRiskLocationResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class FireRiskLocationResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("state")
  private CommonState state = null;

  @SerializedName("fireShed")
  private FireShed fireShed = null;

  public FireRiskLocationResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public FireRiskLocationResponse state(CommonState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonState getState() {
    return state;
  }

  public void setState(CommonState state) {
    this.state = state;
  }

  public FireRiskLocationResponse fireShed(FireShed fireShed) {
    this.fireShed = fireShed;
    return this;
  }

   /**
   * Get fireShed
   * @return fireShed
  **/
  @ApiModelProperty(example = "null", value = "")
  public FireShed getFireShed() {
    return fireShed;
  }

  public void setFireShed(FireShed fireShed) {
    this.fireShed = fireShed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireRiskLocationResponse fireRiskLocationResponse = (FireRiskLocationResponse) o;
    return Objects.equals(this.objectId, fireRiskLocationResponse.objectId) &&
        Objects.equals(this.state, fireRiskLocationResponse.state) &&
        Objects.equals(this.fireShed, fireRiskLocationResponse.fireShed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, state, fireShed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireRiskLocationResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fireShed: ").append(toIndentedString(fireShed)).append("\n");
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

