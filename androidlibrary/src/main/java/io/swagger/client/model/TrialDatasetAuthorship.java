/**
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * License and citation information for the data in this trial
 **/
@ApiModel(description = "License and citation information for the data in this trial")
public class TrialDatasetAuthorship implements Serializable {
  
  @SerializedName("datasetPUI")
  private String datasetPUI = null;
  @SerializedName("license")
  private String license = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDatasetPUI() {
    return datasetPUI;
  }
  public void setDatasetPUI(String datasetPUI) {
    this.datasetPUI = datasetPUI;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }
  public void setLicense(String license) {
    this.license = license;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialDatasetAuthorship trialDatasetAuthorship = (TrialDatasetAuthorship) o;
    return (this.datasetPUI == null ? trialDatasetAuthorship.datasetPUI == null : this.datasetPUI.equals(trialDatasetAuthorship.datasetPUI)) &&
        (this.license == null ? trialDatasetAuthorship.license == null : this.license.equals(trialDatasetAuthorship.license));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.datasetPUI == null ? 0: this.datasetPUI.hashCode());
    result = 31 * result + (this.license == null ? 0: this.license.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialDatasetAuthorship {\n");
    
    sb.append("  datasetPUI: ").append(datasetPUI).append("\n");
    sb.append("  license: ").append(license).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}