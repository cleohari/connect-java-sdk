/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides information about the application used to generate an inventory change.
 */
@ApiModel(description = "Provides information about the application used to generate an inventory change.")

public class SourceApplication {
  @JsonProperty("product")
  private String product = null;

  @JsonProperty("application_id")
  private String applicationId = null;

  @JsonProperty("name")
  private String name = null;

  public SourceApplication product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Read-only `Product` type for the application. See [Product](#type-product) for possible values
   * @return product
  **/
  @ApiModelProperty(value = "Read-only `Product` type for the application. See [Product](#type-product) for possible values")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public SourceApplication applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Read-only Square ID assigned to the application. Only used for `Product` type `EXTERNAL_API`.
   * @return applicationId
  **/
  @ApiModelProperty(value = "Read-only Square ID assigned to the application. Only used for `Product` type `EXTERNAL_API`.")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SourceApplication name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Read-only display name assigned to the application (e.g. `\"Custom Application\"`, `\"Square POS 4.74 for Android\"`).
   * @return name
  **/
  @ApiModelProperty(value = "Read-only display name assigned to the application (e.g. `\"Custom Application\"`, `\"Square POS 4.74 for Android\"`).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceApplication sourceApplication = (SourceApplication) o;
    return Objects.equals(this.product, sourceApplication.product) &&
        Objects.equals(this.applicationId, sourceApplication.applicationId) &&
        Objects.equals(this.name, sourceApplication.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, applicationId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceApplication {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

