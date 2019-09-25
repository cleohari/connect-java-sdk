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
 * 
 */
@ApiModel(description = "")

public class RetrieveCatalogObjectRequest {
  @JsonProperty("include_related_objects")
  private Boolean includeRelatedObjects = null;

  public RetrieveCatalogObjectRequest includeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
    return this;
  }

   /**
   * If `true`, the response will include additional objects that are related to the requested object, as follows:  If the `object` field of the response contains a `CatalogItem`, its associated `CatalogCategory](#type-catalogcategory), [CatalogTax`es, `CatalogImage](#type-catalogimage)s and [CatalogModifierList`s will be returned in the `related_objects` field of the response. If the `object` field of the response contains a `CatalogItemVariation`, its parent `CatalogItem` will be returned in the `related_objects` field of  the response.  Default value: `false`
   * @return includeRelatedObjects
  **/
  @ApiModelProperty(value = "If `true`, the response will include additional objects that are related to the requested object, as follows:  If the `object` field of the response contains a `CatalogItem`, its associated `CatalogCategory](#type-catalogcategory), [CatalogTax`es, `CatalogImage](#type-catalogimage)s and [CatalogModifierList`s will be returned in the `related_objects` field of the response. If the `object` field of the response contains a `CatalogItemVariation`, its parent `CatalogItem` will be returned in the `related_objects` field of  the response.  Default value: `false`")
  public Boolean getIncludeRelatedObjects() {
    return includeRelatedObjects;
  }

  public void setIncludeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCatalogObjectRequest retrieveCatalogObjectRequest = (RetrieveCatalogObjectRequest) o;
    return Objects.equals(this.includeRelatedObjects, retrieveCatalogObjectRequest.includeRelatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeRelatedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCatalogObjectRequest {\n");
    
    sb.append("    includeRelatedObjects: ").append(toIndentedString(includeRelatedObjects)).append("\n");
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

