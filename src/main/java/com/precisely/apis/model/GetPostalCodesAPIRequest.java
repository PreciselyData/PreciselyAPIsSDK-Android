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
import com.precisely.apis.model.GetPostalCodesAPIInput;
import com.precisely.apis.model.GetPostalCodesAPIOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GetPostalCodesAPIRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class GetPostalCodesAPIRequest   {
  @SerializedName("options")
  private GetPostalCodesAPIOptions options = null;

  @SerializedName("Input")
  private GetPostalCodesAPIInput input = null;

  public GetPostalCodesAPIRequest options(GetPostalCodesAPIOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetPostalCodesAPIOptions getOptions() {
    return options;
  }

  public void setOptions(GetPostalCodesAPIOptions options) {
    this.options = options;
  }

  public GetPostalCodesAPIRequest input(GetPostalCodesAPIInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetPostalCodesAPIInput getInput() {
    return input;
  }

  public void setInput(GetPostalCodesAPIInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPostalCodesAPIRequest getPostalCodesAPIRequest = (GetPostalCodesAPIRequest) o;
    return Objects.equals(this.options, getPostalCodesAPIRequest.options) &&
        Objects.equals(this.input, getPostalCodesAPIRequest.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPostalCodesAPIRequest {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

