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
import com.squareup.connect.models.CatalogQueryExact;
import com.squareup.connect.models.CatalogQueryItemVariationsForItemOptionValues;
import com.squareup.connect.models.CatalogQueryItemsForItemOptions;
import com.squareup.connect.models.CatalogQueryItemsForModifierList;
import com.squareup.connect.models.CatalogQueryItemsForTax;
import com.squareup.connect.models.CatalogQueryPrefix;
import com.squareup.connect.models.CatalogQueryRange;
import com.squareup.connect.models.CatalogQuerySortedAttribute;
import com.squareup.connect.models.CatalogQueryText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A query to be applied to a [SearchCatalogObjectsRequest](#type-searchcatalogobjectsrequest). Only one query field may be present.  Where an attribute name is required, it should be specified as the name of any field marked \&quot;searchable\&quot; from the structured data types for the desired result object type(s) ([CatalogItem](#type-catalogitem), [CatalogItemVariation](#type-catalogitemvariation), [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax), [CatalogDiscount](#type-catalogdiscount), [CatalogModifierList](#type-catalogmodifierlist), [CatalogModifier](#type-catalogmodifier)).  For example, a query that should return Items may specify attribute names from any of the searchable fields of the [CatalogItem](#type-catalogitem) data type, namely &#x60;\&quot;name\&quot;&#x60;, &#x60;\&quot;description\&quot;&#x60;, and &#x60;\&quot;abbreviation\&quot;&#x60;.
 */
@ApiModel(description = "A query to be applied to a [SearchCatalogObjectsRequest](#type-searchcatalogobjectsrequest). Only one query field may be present.  Where an attribute name is required, it should be specified as the name of any field marked \"searchable\" from the structured data types for the desired result object type(s) ([CatalogItem](#type-catalogitem), [CatalogItemVariation](#type-catalogitemvariation), [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax), [CatalogDiscount](#type-catalogdiscount), [CatalogModifierList](#type-catalogmodifierlist), [CatalogModifier](#type-catalogmodifier)).  For example, a query that should return Items may specify attribute names from any of the searchable fields of the [CatalogItem](#type-catalogitem) data type, namely `\"name\"`, `\"description\"`, and `\"abbreviation\"`.")

public class CatalogQuery {
  @JsonProperty("sorted_attribute_query")
  private CatalogQuerySortedAttribute sortedAttributeQuery = null;

  @JsonProperty("exact_query")
  private CatalogQueryExact exactQuery = null;

  @JsonProperty("prefix_query")
  private CatalogQueryPrefix prefixQuery = null;

  @JsonProperty("range_query")
  private CatalogQueryRange rangeQuery = null;

  @JsonProperty("text_query")
  private CatalogQueryText textQuery = null;

  @JsonProperty("items_for_tax_query")
  private CatalogQueryItemsForTax itemsForTaxQuery = null;

  @JsonProperty("items_for_modifier_list_query")
  private CatalogQueryItemsForModifierList itemsForModifierListQuery = null;

  @JsonProperty("items_for_item_options_query")
  private CatalogQueryItemsForItemOptions itemsForItemOptionsQuery = null;

  @JsonProperty("item_variations_for_item_option_values_query")
  private CatalogQueryItemVariationsForItemOptionValues itemVariationsForItemOptionValuesQuery = null;

  public CatalogQuery sortedAttributeQuery(CatalogQuerySortedAttribute sortedAttributeQuery) {
    this.sortedAttributeQuery = sortedAttributeQuery;
    return this;
  }

   /**
   * A query that returns all objects, sorted by the given attribute.
   * @return sortedAttributeQuery
  **/
  @ApiModelProperty(value = "A query that returns all objects, sorted by the given attribute.")
  public CatalogQuerySortedAttribute getSortedAttributeQuery() {
    return sortedAttributeQuery;
  }

  public void setSortedAttributeQuery(CatalogQuerySortedAttribute sortedAttributeQuery) {
    this.sortedAttributeQuery = sortedAttributeQuery;
  }

  public CatalogQuery exactQuery(CatalogQueryExact exactQuery) {
    this.exactQuery = exactQuery;
    return this;
  }

   /**
   * A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive value.
   * @return exactQuery
  **/
  @ApiModelProperty(value = "A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive value.")
  public CatalogQueryExact getExactQuery() {
    return exactQuery;
  }

  public void setExactQuery(CatalogQueryExact exactQuery) {
    this.exactQuery = exactQuery;
  }

  public CatalogQuery prefixQuery(CatalogQueryPrefix prefixQuery) {
    this.prefixQuery = prefixQuery;
    return this;
  }

   /**
   * A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive prefix.
   * @return prefixQuery
  **/
  @ApiModelProperty(value = "A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive prefix.")
  public CatalogQueryPrefix getPrefixQuery() {
    return prefixQuery;
  }

  public void setPrefixQuery(CatalogQueryPrefix prefixQuery) {
    this.prefixQuery = prefixQuery;
  }

  public CatalogQuery rangeQuery(CatalogQueryRange rangeQuery) {
    this.rangeQuery = rangeQuery;
    return this;
  }

   /**
   * A query that returns only objects for which the given (integer-valued) attribute lies in the given range.
   * @return rangeQuery
  **/
  @ApiModelProperty(value = "A query that returns only objects for which the given (integer-valued) attribute lies in the given range.")
  public CatalogQueryRange getRangeQuery() {
    return rangeQuery;
  }

  public void setRangeQuery(CatalogQueryRange rangeQuery) {
    this.rangeQuery = rangeQuery;
  }

  public CatalogQuery textQuery(CatalogQueryText textQuery) {
    this.textQuery = textQuery;
    return this;
  }

   /**
   * A query that returns only objects whose searchable attributes contain all of the given keywords as prefixes. For example, if a `CatalogItem` contains attributes `{\"name\": \"t-shirt\"}` and `{\"description\": \"Small, Purple\"}`, it will be matched by the query `{\"keywords\": [\"shirt\", \"sma\", \"purp\"]}`.
   * @return textQuery
  **/
  @ApiModelProperty(value = "A query that returns only objects whose searchable attributes contain all of the given keywords as prefixes. For example, if a `CatalogItem` contains attributes `{\"name\": \"t-shirt\"}` and `{\"description\": \"Small, Purple\"}`, it will be matched by the query `{\"keywords\": [\"shirt\", \"sma\", \"purp\"]}`.")
  public CatalogQueryText getTextQuery() {
    return textQuery;
  }

  public void setTextQuery(CatalogQueryText textQuery) {
    this.textQuery = textQuery;
  }

  public CatalogQuery itemsForTaxQuery(CatalogQueryItemsForTax itemsForTaxQuery) {
    this.itemsForTaxQuery = itemsForTaxQuery;
    return this;
  }

   /**
   * A query that returns all `CatalogItem](#type-catalogitem)s that have any of the given [CatalogTax`es enabled.
   * @return itemsForTaxQuery
  **/
  @ApiModelProperty(value = "A query that returns all `CatalogItem](#type-catalogitem)s that have any of the given [CatalogTax`es enabled.")
  public CatalogQueryItemsForTax getItemsForTaxQuery() {
    return itemsForTaxQuery;
  }

  public void setItemsForTaxQuery(CatalogQueryItemsForTax itemsForTaxQuery) {
    this.itemsForTaxQuery = itemsForTaxQuery;
  }

  public CatalogQuery itemsForModifierListQuery(CatalogQueryItemsForModifierList itemsForModifierListQuery) {
    this.itemsForModifierListQuery = itemsForModifierListQuery;
    return this;
  }

   /**
   * A query that returns all `CatalogItem](#type-catalogitem)s that have any of the given [CatalogModifierList`s enabled.
   * @return itemsForModifierListQuery
  **/
  @ApiModelProperty(value = "A query that returns all `CatalogItem](#type-catalogitem)s that have any of the given [CatalogModifierList`s enabled.")
  public CatalogQueryItemsForModifierList getItemsForModifierListQuery() {
    return itemsForModifierListQuery;
  }

  public void setItemsForModifierListQuery(CatalogQueryItemsForModifierList itemsForModifierListQuery) {
    this.itemsForModifierListQuery = itemsForModifierListQuery;
  }

  public CatalogQuery itemsForItemOptionsQuery(CatalogQueryItemsForItemOptions itemsForItemOptionsQuery) {
    this.itemsForItemOptionsQuery = itemsForItemOptionsQuery;
    return this;
  }

   /**
   * A query that returns all `CatalogItem](#type-catalogitem)s that have all of the given [CatalogItemOption`s.
   * @return itemsForItemOptionsQuery
  **/
  @ApiModelProperty(value = "A query that returns all `CatalogItem](#type-catalogitem)s that have all of the given [CatalogItemOption`s.")
  public CatalogQueryItemsForItemOptions getItemsForItemOptionsQuery() {
    return itemsForItemOptionsQuery;
  }

  public void setItemsForItemOptionsQuery(CatalogQueryItemsForItemOptions itemsForItemOptionsQuery) {
    this.itemsForItemOptionsQuery = itemsForItemOptionsQuery;
  }

  public CatalogQuery itemVariationsForItemOptionValuesQuery(CatalogQueryItemVariationsForItemOptionValues itemVariationsForItemOptionValuesQuery) {
    this.itemVariationsForItemOptionValuesQuery = itemVariationsForItemOptionValuesQuery;
    return this;
  }

   /**
   * A query that returns all `CatalogItemVariation](#type-catalogitemvariations)s that have all of the given [CatalogItemOption` values.
   * @return itemVariationsForItemOptionValuesQuery
  **/
  @ApiModelProperty(value = "A query that returns all `CatalogItemVariation](#type-catalogitemvariations)s that have all of the given [CatalogItemOption` values.")
  public CatalogQueryItemVariationsForItemOptionValues getItemVariationsForItemOptionValuesQuery() {
    return itemVariationsForItemOptionValuesQuery;
  }

  public void setItemVariationsForItemOptionValuesQuery(CatalogQueryItemVariationsForItemOptionValues itemVariationsForItemOptionValuesQuery) {
    this.itemVariationsForItemOptionValuesQuery = itemVariationsForItemOptionValuesQuery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogQuery catalogQuery = (CatalogQuery) o;
    return Objects.equals(this.sortedAttributeQuery, catalogQuery.sortedAttributeQuery) &&
        Objects.equals(this.exactQuery, catalogQuery.exactQuery) &&
        Objects.equals(this.prefixQuery, catalogQuery.prefixQuery) &&
        Objects.equals(this.rangeQuery, catalogQuery.rangeQuery) &&
        Objects.equals(this.textQuery, catalogQuery.textQuery) &&
        Objects.equals(this.itemsForTaxQuery, catalogQuery.itemsForTaxQuery) &&
        Objects.equals(this.itemsForModifierListQuery, catalogQuery.itemsForModifierListQuery) &&
        Objects.equals(this.itemsForItemOptionsQuery, catalogQuery.itemsForItemOptionsQuery) &&
        Objects.equals(this.itemVariationsForItemOptionValuesQuery, catalogQuery.itemVariationsForItemOptionValuesQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedAttributeQuery, exactQuery, prefixQuery, rangeQuery, textQuery, itemsForTaxQuery, itemsForModifierListQuery, itemsForItemOptionsQuery, itemVariationsForItemOptionValuesQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogQuery {\n");
    
    sb.append("    sortedAttributeQuery: ").append(toIndentedString(sortedAttributeQuery)).append("\n");
    sb.append("    exactQuery: ").append(toIndentedString(exactQuery)).append("\n");
    sb.append("    prefixQuery: ").append(toIndentedString(prefixQuery)).append("\n");
    sb.append("    rangeQuery: ").append(toIndentedString(rangeQuery)).append("\n");
    sb.append("    textQuery: ").append(toIndentedString(textQuery)).append("\n");
    sb.append("    itemsForTaxQuery: ").append(toIndentedString(itemsForTaxQuery)).append("\n");
    sb.append("    itemsForModifierListQuery: ").append(toIndentedString(itemsForModifierListQuery)).append("\n");
    sb.append("    itemsForItemOptionsQuery: ").append(toIndentedString(itemsForItemOptionsQuery)).append("\n");
    sb.append("    itemVariationsForItemOptionValuesQuery: ").append(toIndentedString(itemVariationsForItemOptionValuesQuery)).append("\n");
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

