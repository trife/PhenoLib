/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * GermplasmAttributeList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class GermplasmAttributeList {

  @SerializedName("data")
  private List<GermplasmAttribute> data = null;

  @SerializedName("germplasmDbId")
  private String germplasmDbId = null;
  public GermplasmAttributeList data(List<GermplasmAttribute> data) {
    this.data = data;
    return this;
  }

  public GermplasmAttributeList addDataItem(GermplasmAttribute dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<GermplasmAttribute>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
  * List of attributes associated with the given germplasm
  * @return data
  **/
  @Schema(description = "List of attributes associated with the given germplasm")
  public List<GermplasmAttribute> getData() {
    return data;
  }
  public void setData(List<GermplasmAttribute> data) {
    this.data = data;
  }
  public GermplasmAttributeList germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies a germplasm within the given database server
  * @return germplasmDbId
  **/
  @Schema(description = "The ID which uniquely identifies a germplasm within the given database server")
  public String getGermplasmDbId() {
    return germplasmDbId;
  }
  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmAttributeList germplasmAttributeList = (GermplasmAttributeList) o;
    return Objects.equals(this.data, germplasmAttributeList.data) &&
        Objects.equals(this.germplasmDbId, germplasmAttributeList.germplasmDbId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, germplasmDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeList {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
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
