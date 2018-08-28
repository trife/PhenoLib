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

import io.swagger.client.model.VendorSpecificationPlatform;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class VendorSpecification implements Serializable {
  
  @SerializedName("additionalInfo")
  private Map<String, String> additionalInfo = null;
  @SerializedName("contactName")
  private String contactName = null;
  @SerializedName("platforms")
  private List<VendorSpecificationPlatform> platforms = null;
  @SerializedName("vendorAddress")
  private String vendorAddress = null;
  @SerializedName("vendorCity")
  private String vendorCity = null;
  @SerializedName("vendorCountry")
  private String vendorCountry = null;
  @SerializedName("vendorDescription")
  private String vendorDescription = null;
  @SerializedName("vendorEmail")
  private String vendorEmail = null;
  @SerializedName("vendorName")
  private String vendorName = null;
  @SerializedName("vendorPhone")
  private String vendorPhone = null;
  @SerializedName("vendorURL")
  private String vendorURL = null;

  /**
   * Additional arbitrary info
   **/
  @ApiModelProperty(value = "Additional arbitrary info")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * The name or identifier of the primary vendor contact
   **/
  @ApiModelProperty(value = "The name or identifier of the primary vendor contact")
  public String getContactName() {
    return contactName;
  }
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  /**
   * List of platform specifications available at the vendor
   **/
  @ApiModelProperty(value = "List of platform specifications available at the vendor")
  public List<VendorSpecificationPlatform> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<VendorSpecificationPlatform> platforms) {
    this.platforms = platforms;
  }

  /**
   * The street address of the vendor
   **/
  @ApiModelProperty(value = "The street address of the vendor")
  public String getVendorAddress() {
    return vendorAddress;
  }
  public void setVendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
  }

  /**
   * The name of the city where the vendor is located
   **/
  @ApiModelProperty(value = "The name of the city where the vendor is located")
  public String getVendorCity() {
    return vendorCity;
  }
  public void setVendorCity(String vendorCity) {
    this.vendorCity = vendorCity;
  }

  /**
   * The name of the country where the vendor is located
   **/
  @ApiModelProperty(value = "The name of the country where the vendor is located")
  public String getVendorCountry() {
    return vendorCountry;
  }
  public void setVendorCountry(String vendorCountry) {
    this.vendorCountry = vendorCountry;
  }

  /**
   * A description of the vendor
   **/
  @ApiModelProperty(value = "A description of the vendor")
  public String getVendorDescription() {
    return vendorDescription;
  }
  public void setVendorDescription(String vendorDescription) {
    this.vendorDescription = vendorDescription;
  }

  /**
   * The primary email address used to contact the vendor
   **/
  @ApiModelProperty(value = "The primary email address used to contact the vendor")
  public String getVendorEmail() {
    return vendorEmail;
  }
  public void setVendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
  }

  /**
   * The human readable name of the vendor
   **/
  @ApiModelProperty(value = "The human readable name of the vendor")
  public String getVendorName() {
    return vendorName;
  }
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  /**
   * The primary phone number used to contact the vendor
   **/
  @ApiModelProperty(value = "The primary phone number used to contact the vendor")
  public String getVendorPhone() {
    return vendorPhone;
  }
  public void setVendorPhone(String vendorPhone) {
    this.vendorPhone = vendorPhone;
  }

  /**
   * The primary URL for the vendor
   **/
  @ApiModelProperty(value = "The primary URL for the vendor")
  public String getVendorURL() {
    return vendorURL;
  }
  public void setVendorURL(String vendorURL) {
    this.vendorURL = vendorURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorSpecification vendorSpecification = (VendorSpecification) o;
    return (this.additionalInfo == null ? vendorSpecification.additionalInfo == null : this.additionalInfo.equals(vendorSpecification.additionalInfo)) &&
        (this.contactName == null ? vendorSpecification.contactName == null : this.contactName.equals(vendorSpecification.contactName)) &&
        (this.platforms == null ? vendorSpecification.platforms == null : this.platforms.equals(vendorSpecification.platforms)) &&
        (this.vendorAddress == null ? vendorSpecification.vendorAddress == null : this.vendorAddress.equals(vendorSpecification.vendorAddress)) &&
        (this.vendorCity == null ? vendorSpecification.vendorCity == null : this.vendorCity.equals(vendorSpecification.vendorCity)) &&
        (this.vendorCountry == null ? vendorSpecification.vendorCountry == null : this.vendorCountry.equals(vendorSpecification.vendorCountry)) &&
        (this.vendorDescription == null ? vendorSpecification.vendorDescription == null : this.vendorDescription.equals(vendorSpecification.vendorDescription)) &&
        (this.vendorEmail == null ? vendorSpecification.vendorEmail == null : this.vendorEmail.equals(vendorSpecification.vendorEmail)) &&
        (this.vendorName == null ? vendorSpecification.vendorName == null : this.vendorName.equals(vendorSpecification.vendorName)) &&
        (this.vendorPhone == null ? vendorSpecification.vendorPhone == null : this.vendorPhone.equals(vendorSpecification.vendorPhone)) &&
        (this.vendorURL == null ? vendorSpecification.vendorURL == null : this.vendorURL.equals(vendorSpecification.vendorURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalInfo == null ? 0: this.additionalInfo.hashCode());
    result = 31 * result + (this.contactName == null ? 0: this.contactName.hashCode());
    result = 31 * result + (this.platforms == null ? 0: this.platforms.hashCode());
    result = 31 * result + (this.vendorAddress == null ? 0: this.vendorAddress.hashCode());
    result = 31 * result + (this.vendorCity == null ? 0: this.vendorCity.hashCode());
    result = 31 * result + (this.vendorCountry == null ? 0: this.vendorCountry.hashCode());
    result = 31 * result + (this.vendorDescription == null ? 0: this.vendorDescription.hashCode());
    result = 31 * result + (this.vendorEmail == null ? 0: this.vendorEmail.hashCode());
    result = 31 * result + (this.vendorName == null ? 0: this.vendorName.hashCode());
    result = 31 * result + (this.vendorPhone == null ? 0: this.vendorPhone.hashCode());
    result = 31 * result + (this.vendorURL == null ? 0: this.vendorURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecification {\n");
    
    sb.append("  additionalInfo: ").append(additionalInfo).append("\n");
    sb.append("  contactName: ").append(contactName).append("\n");
    sb.append("  platforms: ").append(platforms).append("\n");
    sb.append("  vendorAddress: ").append(vendorAddress).append("\n");
    sb.append("  vendorCity: ").append(vendorCity).append("\n");
    sb.append("  vendorCountry: ").append(vendorCountry).append("\n");
    sb.append("  vendorDescription: ").append(vendorDescription).append("\n");
    sb.append("  vendorEmail: ").append(vendorEmail).append("\n");
    sb.append("  vendorName: ").append(vendorName).append("\n");
    sb.append("  vendorPhone: ").append(vendorPhone).append("\n");
    sb.append("  vendorURL: ").append(vendorURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}