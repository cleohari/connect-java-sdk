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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tax in the Catalog object model.
 */
@ApiModel(description = "A tax in the Catalog object model.")

public class CatalogTax {
  @JsonProperty("name")
  private String name = null;

  /**
   * Whether the tax is calculated based on a payment's subtotal or total. See [TaxCalculationPhase](#type-taxcalculationphase) for all possible values.
   */
  public enum CalculationPhaseEnum {
    SUBTOTAL_PHASE("TAX_SUBTOTAL_PHASE"),
    
    TOTAL_PHASE("TAX_TOTAL_PHASE");

    private String value;

    CalculationPhaseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationPhaseEnum fromValue(String text) {
      for (CalculationPhaseEnum b : CalculationPhaseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("calculation_phase")
  private CalculationPhaseEnum calculationPhase = null;

  /**
   * Whether the tax is `ADDITIVE` or `INCLUSIVE`. See [TaxInclusionType](#type-taxinclusiontype) for all possible values.
   */
  public enum InclusionTypeEnum {
    ADDITIVE("ADDITIVE"),
    
    INCLUSIVE("INCLUSIVE");

    private String value;

    InclusionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InclusionTypeEnum fromValue(String text) {
      for (InclusionTypeEnum b : InclusionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inclusion_type")
  private InclusionTypeEnum inclusionType = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("applies_to_custom_amounts")
  private Boolean appliesToCustomAmounts = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  public CatalogTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tax's name. Searchable.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The tax's name. Searchable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogTax calculationPhase(CalculationPhaseEnum calculationPhase) {
    this.calculationPhase = calculationPhase;
    return this;
  }

   /**
   * Whether the tax is calculated based on a payment's subtotal or total. See [TaxCalculationPhase](#type-taxcalculationphase) for all possible values.
   * @return calculationPhase
  **/
  @ApiModelProperty(value = "Whether the tax is calculated based on a payment's subtotal or total. See [TaxCalculationPhase](#type-taxcalculationphase) for all possible values.")
  public CalculationPhaseEnum getCalculationPhase() {
    return calculationPhase;
  }

  public void setCalculationPhase(CalculationPhaseEnum calculationPhase) {
    this.calculationPhase = calculationPhase;
  }

  public CatalogTax inclusionType(InclusionTypeEnum inclusionType) {
    this.inclusionType = inclusionType;
    return this;
  }

   /**
   * Whether the tax is `ADDITIVE` or `INCLUSIVE`. See [TaxInclusionType](#type-taxinclusiontype) for all possible values.
   * @return inclusionType
  **/
  @ApiModelProperty(value = "Whether the tax is `ADDITIVE` or `INCLUSIVE`. See [TaxInclusionType](#type-taxinclusiontype) for all possible values.")
  public InclusionTypeEnum getInclusionType() {
    return inclusionType;
  }

  public void setInclusionType(InclusionTypeEnum inclusionType) {
    this.inclusionType = inclusionType;
  }

  public CatalogTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax in decimal form, using a '.' as the decimal separator and without a '%' sign. A value of `7.5` corresponds to 7.5%.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax in decimal form, using a '.' as the decimal separator and without a '%' sign. A value of `7.5` corresponds to 7.5%.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public CatalogTax appliesToCustomAmounts(Boolean appliesToCustomAmounts) {
    this.appliesToCustomAmounts = appliesToCustomAmounts;
    return this;
  }

   /**
   * If `true`, the fee applies to custom amounts entered into the Square Point of Sale app that are not associated with a particular [CatalogItem](#type-catalogitem).
   * @return appliesToCustomAmounts
  **/
  @ApiModelProperty(value = "If `true`, the fee applies to custom amounts entered into the Square Point of Sale app that are not associated with a particular [CatalogItem](#type-catalogitem).")
  public Boolean getAppliesToCustomAmounts() {
    return appliesToCustomAmounts;
  }

  public void setAppliesToCustomAmounts(Boolean appliesToCustomAmounts) {
    this.appliesToCustomAmounts = appliesToCustomAmounts;
  }

  public CatalogTax enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If `true`, the tax will be shown as enabled in the Square Point of Sale app.
   * @return enabled
  **/
  @ApiModelProperty(value = "If `true`, the tax will be shown as enabled in the Square Point of Sale app.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogTax catalogTax = (CatalogTax) o;
    return Objects.equals(this.name, catalogTax.name) &&
        Objects.equals(this.calculationPhase, catalogTax.calculationPhase) &&
        Objects.equals(this.inclusionType, catalogTax.inclusionType) &&
        Objects.equals(this.percentage, catalogTax.percentage) &&
        Objects.equals(this.appliesToCustomAmounts, catalogTax.appliesToCustomAmounts) &&
        Objects.equals(this.enabled, catalogTax.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, calculationPhase, inclusionType, percentage, appliesToCustomAmounts, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogTax {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calculationPhase: ").append(toIndentedString(calculationPhase)).append("\n");
    sb.append("    inclusionType: ").append(toIndentedString(inclusionType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    appliesToCustomAmounts: ").append(toIndentedString(appliesToCustomAmounts)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

