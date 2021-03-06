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
 * Trait
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class Trait {

  @SerializedName("alternativeAbbreviations")
  private List<String> alternativeAbbreviations = null;

  @SerializedName("attribute")
  private String attribute = null;

  @SerializedName("class")
  private String propertyClass = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("entity")
  private String entity = null;

  @SerializedName("mainAbbreviation")
  private String mainAbbreviation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ontologyRefernce")
  private OntologyRefernce ontologyRefernce = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("synonyms")
  private List<String> synonyms = null;

  @SerializedName("traitDbId")
  private String traitDbId = null;

  @SerializedName("traitName")
  private String traitName = null;

  @SerializedName("xref")
  private String xref = null;
  public Trait alternativeAbbreviations(List<String> alternativeAbbreviations) {
    this.alternativeAbbreviations = alternativeAbbreviations;
    return this;
  }

  public Trait addAlternativeAbbreviationsItem(String alternativeAbbreviationsItem) {
    if (this.alternativeAbbreviations == null) {
      this.alternativeAbbreviations = new ArrayList<String>();
    }
    this.alternativeAbbreviations.add(alternativeAbbreviationsItem);
    return this;
  }

  /**
  * Other frequent abbreviations of the trait, if any. These abbreviations do not have to follow a convention
  * @return alternativeAbbreviations
  **/
  @Schema(description = "Other frequent abbreviations of the trait, if any. These abbreviations do not have to follow a convention")
  public List<String> getAlternativeAbbreviations() {
    return alternativeAbbreviations;
  }
  public void setAlternativeAbbreviations(List<String> alternativeAbbreviations) {
    this.alternativeAbbreviations = alternativeAbbreviations;
  }
  public Trait attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  

  /**
  * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the attribute is the observed feature (or characteristic) of the entity e.g., for \&quot;grain colour\&quot;, attribute &#x3D; \&quot;colour\&quot;
  * @return attribute
  **/
  @Schema(description = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the attribute is the observed feature (or characteristic) of the entity e.g., for \"grain colour\", attribute = \"colour\"")
  public String getAttribute() {
    return attribute;
  }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }
  public Trait propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  

  /**
  * Trait class. (examples: \&quot;morphological trait\&quot;, \&quot;phenological trait\&quot;, \&quot;agronomical trait\&quot;, \&quot;physiological trait\&quot;, \&quot;abiotic stress trait\&quot;, \&quot;biotic stress trait\&quot;, \&quot;biochemical trait\&quot;, \&quot;quality traits trait\&quot;, \&quot;fertility trait\&quot;, etc.)
  * @return propertyClass
  **/
  @Schema(description = "Trait class. (examples: \"morphological trait\", \"phenological trait\", \"agronomical trait\", \"physiological trait\", \"abiotic stress trait\", \"biotic stress trait\", \"biochemical trait\", \"quality traits trait\", \"fertility trait\", etc.)")
  public String getPropertyClass() {
    return propertyClass;
  }
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }
  public Trait description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The description of a trait
  * @return description
  **/
  @Schema(description = "The description of a trait")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Trait entity(String entity) {
    this.entity = entity;
    return this;
  }

  

  /**
  * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the entity is the part of the plant that the trait refers to e.g., for \&quot;grain colour\&quot;, entity &#x3D; \&quot;grain\&quot;
  * @return entity
  **/
  @Schema(description = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the entity is the part of the plant that the trait refers to e.g., for \"grain colour\", entity = \"grain\"")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }
  public Trait mainAbbreviation(String mainAbbreviation) {
    this.mainAbbreviation = mainAbbreviation;
    return this;
  }

  

  /**
  * Main abbreviation for trait name. (examples: \&quot;Carotenoid content\&quot; &#x3D;&gt; \&quot;CC\&quot;)
  * @return mainAbbreviation
  **/
  @Schema(description = "Main abbreviation for trait name. (examples: \"Carotenoid content\" => \"CC\")")
  public String getMainAbbreviation() {
    return mainAbbreviation;
  }
  public void setMainAbbreviation(String mainAbbreviation) {
    this.mainAbbreviation = mainAbbreviation;
  }
  public Trait name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - Use \&quot;traitName\&quot;
  * @return name
  **/
  @Schema(description = "DEPRECATED in v1.3 - Use \"traitName\"")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Trait ontologyRefernce(OntologyRefernce ontologyRefernce) {
    this.ontologyRefernce = ontologyRefernce;
    return this;
  }

  

  /**
  * Get ontologyRefernce
  * @return ontologyRefernce
  **/
  @Schema(description = "")
  public OntologyRefernce getOntologyRefernce() {
    return ontologyRefernce;
  }
  public void setOntologyRefernce(OntologyRefernce ontologyRefernce) {
    this.ontologyRefernce = ontologyRefernce;
  }
  public Trait status(String status) {
    this.status = status;
    return this;
  }

  

  /**
  * Trait status (examples: \&quot;recommended\&quot;, \&quot;obsolete\&quot;, \&quot;legacy\&quot;, etc.)
  * @return status
  **/
  @Schema(description = "Trait status (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public Trait synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Trait addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

  /**
  * Other trait names
  * @return synonyms
  **/
  @Schema(description = "Other trait names")
  public List<String> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }
  public Trait traitDbId(String traitDbId) {
    this.traitDbId = traitDbId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies a trait
  * @return traitDbId
  **/
  @Schema(description = "The ID which uniquely identifies a trait")
  public String getTraitDbId() {
    return traitDbId;
  }
  public void setTraitDbId(String traitDbId) {
    this.traitDbId = traitDbId;
  }
  public Trait traitName(String traitName) {
    this.traitName = traitName;
    return this;
  }

  

  /**
  * The human readable name of a trait
  * @return traitName
  **/
  @Schema(description = "The human readable name of a trait")
  public String getTraitName() {
    return traitName;
  }
  public void setTraitName(String traitName) {
    this.traitName = traitName;
  }
  public Trait xref(String xref) {
    this.xref = xref;
    return this;
  }

  

  /**
  * Cross reference of the trait to an external ontology or database term e.g., Xref to a trait ontology (TO) term
  * @return xref
  **/
  @Schema(description = "Cross reference of the trait to an external ontology or database term e.g., Xref to a trait ontology (TO) term")
  public String getXref() {
    return xref;
  }
  public void setXref(String xref) {
    this.xref = xref;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trait trait = (Trait) o;
    return Objects.equals(this.alternativeAbbreviations, trait.alternativeAbbreviations) &&
        Objects.equals(this.attribute, trait.attribute) &&
        Objects.equals(this.propertyClass, trait.propertyClass) &&
        Objects.equals(this.description, trait.description) &&
        Objects.equals(this.entity, trait.entity) &&
        Objects.equals(this.mainAbbreviation, trait.mainAbbreviation) &&
        Objects.equals(this.name, trait.name) &&
        Objects.equals(this.ontologyRefernce, trait.ontologyRefernce) &&
        Objects.equals(this.status, trait.status) &&
        Objects.equals(this.synonyms, trait.synonyms) &&
        Objects.equals(this.traitDbId, trait.traitDbId) &&
        Objects.equals(this.traitName, trait.traitName) &&
        Objects.equals(this.xref, trait.xref);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(alternativeAbbreviations, attribute, propertyClass, description, entity, mainAbbreviation, name, ontologyRefernce, status, synonyms, traitDbId, traitName, xref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trait {\n");
    
    sb.append("    alternativeAbbreviations: ").append(toIndentedString(alternativeAbbreviations)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    mainAbbreviation: ").append(toIndentedString(mainAbbreviation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ontologyRefernce: ").append(toIndentedString(ontologyRefernce)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    traitDbId: ").append(toIndentedString(traitDbId)).append("\n");
    sb.append("    traitName: ").append(toIndentedString(traitName)).append("\n");
    sb.append("    xref: ").append(toIndentedString(xref)).append("\n");
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
