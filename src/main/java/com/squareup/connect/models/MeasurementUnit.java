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
import com.squareup.connect.models.MeasurementUnitCustom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a unit of measurement to use with a quantity, such as ounces or inches. Exactly one of the following fields are required: &#x60;custom_unit&#x60;, &#x60;area_unit&#x60;, &#x60;length_unit&#x60;, &#x60;volume_unit&#x60;, and &#x60;weight_unit&#x60;.
 */
@ApiModel(description = "Represents a unit of measurement to use with a quantity, such as ounces or inches. Exactly one of the following fields are required: `custom_unit`, `area_unit`, `length_unit`, `volume_unit`, and `weight_unit`.")

public class MeasurementUnit {
  @JsonProperty("custom_unit")
  private MeasurementUnitCustom customUnit = null;

  @JsonProperty("area_unit")
  private String areaUnit = null;

  @JsonProperty("length_unit")
  private String lengthUnit = null;

  @JsonProperty("volume_unit")
  private String volumeUnit = null;

  @JsonProperty("weight_unit")
  private String weightUnit = null;

  @JsonProperty("generic_unit")
  private String genericUnit = null;

  @JsonProperty("time_unit")
  private String timeUnit = null;

  @JsonProperty("type")
  private String type = null;

  public MeasurementUnit customUnit(MeasurementUnitCustom customUnit) {
    this.customUnit = customUnit;
    return this;
  }

   /**
   * A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.
   * @return customUnit
  **/
  @ApiModelProperty(value = "A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.")
  public MeasurementUnitCustom getCustomUnit() {
    return customUnit;
  }

  public void setCustomUnit(MeasurementUnitCustom customUnit) {
    this.customUnit = customUnit;
  }

  public MeasurementUnit areaUnit(String areaUnit) {
    this.areaUnit = areaUnit;
    return this;
  }

   /**
   * Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values
   * @return areaUnit
  **/
  @ApiModelProperty(value = "Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values")
  public String getAreaUnit() {
    return areaUnit;
  }

  public void setAreaUnit(String areaUnit) {
    this.areaUnit = areaUnit;
  }

  public MeasurementUnit lengthUnit(String lengthUnit) {
    this.lengthUnit = lengthUnit;
    return this;
  }

   /**
   * Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values
   * @return lengthUnit
  **/
  @ApiModelProperty(value = "Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values")
  public String getLengthUnit() {
    return lengthUnit;
  }

  public void setLengthUnit(String lengthUnit) {
    this.lengthUnit = lengthUnit;
  }

  public MeasurementUnit volumeUnit(String volumeUnit) {
    this.volumeUnit = volumeUnit;
    return this;
  }

   /**
   * Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values
   * @return volumeUnit
  **/
  @ApiModelProperty(value = "Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values")
  public String getVolumeUnit() {
    return volumeUnit;
  }

  public void setVolumeUnit(String volumeUnit) {
    this.volumeUnit = volumeUnit;
  }

  public MeasurementUnit weightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values
   * @return weightUnit
  **/
  @ApiModelProperty(value = "Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values")
  public String getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

  public MeasurementUnit genericUnit(String genericUnit) {
    this.genericUnit = genericUnit;
    return this;
  }

   /**
   * Reserved for API integrations that lack the ability to specify a real measurement unit See [MeasurementUnitGeneric](#type-measurementunitgeneric) for possible values
   * @return genericUnit
  **/
  @ApiModelProperty(value = "Reserved for API integrations that lack the ability to specify a real measurement unit See [MeasurementUnitGeneric](#type-measurementunitgeneric) for possible values")
  public String getGenericUnit() {
    return genericUnit;
  }

  public void setGenericUnit(String genericUnit) {
    this.genericUnit = genericUnit;
  }

  public MeasurementUnit timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Represents a standard unit of time. See [MeasurementUnitTime](#type-measurementunittime) for possible values
   * @return timeUnit
  **/
  @ApiModelProperty(value = "Represents a standard unit of time. See [MeasurementUnitTime](#type-measurementunittime) for possible values")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public MeasurementUnit type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Represents the type of the measurement unit. See [MeasurementUnitUnitType](#type-measurementunitunittype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "Represents the type of the measurement unit. See [MeasurementUnitUnitType](#type-measurementunitunittype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementUnit measurementUnit = (MeasurementUnit) o;
    return Objects.equals(this.customUnit, measurementUnit.customUnit) &&
        Objects.equals(this.areaUnit, measurementUnit.areaUnit) &&
        Objects.equals(this.lengthUnit, measurementUnit.lengthUnit) &&
        Objects.equals(this.volumeUnit, measurementUnit.volumeUnit) &&
        Objects.equals(this.weightUnit, measurementUnit.weightUnit) &&
        Objects.equals(this.genericUnit, measurementUnit.genericUnit) &&
        Objects.equals(this.timeUnit, measurementUnit.timeUnit) &&
        Objects.equals(this.type, measurementUnit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customUnit, areaUnit, lengthUnit, volumeUnit, weightUnit, genericUnit, timeUnit, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementUnit {\n");
    
    sb.append("    customUnit: ").append(toIndentedString(customUnit)).append("\n");
    sb.append("    areaUnit: ").append(toIndentedString(areaUnit)).append("\n");
    sb.append("    lengthUnit: ").append(toIndentedString(lengthUnit)).append("\n");
    sb.append("    volumeUnit: ").append(toIndentedString(volumeUnit)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    genericUnit: ").append(toIndentedString(genericUnit)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

