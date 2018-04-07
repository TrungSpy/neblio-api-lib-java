/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetTokenMetadataResponseMetadataOfIssuanceDataUserData;
import io.swagger.client.model.IssueTokenRequestMetadataEncryptions;
import io.swagger.client.model.IssueTokenRequestMetadataRules;
import io.swagger.client.model.IssueTokenRequestMetadataUrls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object representing all metadata at token issuance
 */
@ApiModel(description = "Object representing all metadata at token issuance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class IssueTokenRequestMetadata {
  @SerializedName("tokenName")
  private String tokenName = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("urls")
  private IssueTokenRequestMetadataUrls urls = null;

  @SerializedName("userData")
  private GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData = null;

  @SerializedName("encryptions")
  private List<IssueTokenRequestMetadataEncryptions> encryptions = null;

  @SerializedName("rules")
  private IssueTokenRequestMetadataRules rules = null;

  public IssueTokenRequestMetadata tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Token Symbol it will be identified by (ex. NIBBL)
   * @return tokenName
  **/
  @ApiModelProperty(value = "Token Symbol it will be identified by (ex. NIBBL)")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public IssueTokenRequestMetadata issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Name of token issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "Name of token issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public IssueTokenRequestMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Long name or description of token (ex. Nibble)
   * @return description
  **/
  @ApiModelProperty(value = "Long name or description of token (ex. Nibble)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTokenRequestMetadata urls(IssueTokenRequestMetadataUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadataUrls getUrls() {
    return urls;
  }

  public void setUrls(IssueTokenRequestMetadataUrls urls) {
    this.urls = urls;
  }

  public IssueTokenRequestMetadata userData(GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(value = "")
  public GetTokenMetadataResponseMetadataOfIssuanceDataUserData getUserData() {
    return userData;
  }

  public void setUserData(GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData) {
    this.userData = userData;
  }

  public IssueTokenRequestMetadata encryptions(List<IssueTokenRequestMetadataEncryptions> encryptions) {
    this.encryptions = encryptions;
    return this;
  }

  public IssueTokenRequestMetadata addEncryptionsItem(IssueTokenRequestMetadataEncryptions encryptionsItem) {
    if (this.encryptions == null) {
      this.encryptions = new ArrayList<IssueTokenRequestMetadataEncryptions>();
    }
    this.encryptions.add(encryptionsItem);
    return this;
  }

   /**
   * Array of encryption instruction objects for encrypting userData
   * @return encryptions
  **/
  @ApiModelProperty(value = "Array of encryption instruction objects for encrypting userData")
  public List<IssueTokenRequestMetadataEncryptions> getEncryptions() {
    return encryptions;
  }

  public void setEncryptions(List<IssueTokenRequestMetadataEncryptions> encryptions) {
    this.encryptions = encryptions;
  }

  public IssueTokenRequestMetadata rules(IssueTokenRequestMetadataRules rules) {
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadataRules getRules() {
    return rules;
  }

  public void setRules(IssueTokenRequestMetadataRules rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadata issueTokenRequestMetadata = (IssueTokenRequestMetadata) o;
    return Objects.equals(this.tokenName, issueTokenRequestMetadata.tokenName) &&
        Objects.equals(this.issuer, issueTokenRequestMetadata.issuer) &&
        Objects.equals(this.description, issueTokenRequestMetadata.description) &&
        Objects.equals(this.urls, issueTokenRequestMetadata.urls) &&
        Objects.equals(this.userData, issueTokenRequestMetadata.userData) &&
        Objects.equals(this.encryptions, issueTokenRequestMetadata.encryptions) &&
        Objects.equals(this.rules, issueTokenRequestMetadata.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenName, issuer, description, urls, userData, encryptions, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadata {\n");
    
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    encryptions: ").append(toIndentedString(encryptions)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
