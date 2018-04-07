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
import io.swagger.client.model.IssueTokenRequestMetadata;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * IssueTokenRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class IssueTokenRequest {
  @SerializedName("issueAddress")
  private String issueAddress = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("divisibility")
  private BigDecimal divisibility = null;

  @SerializedName("fee")
  private BigDecimal fee = null;

  @SerializedName("reissuable")
  private Boolean reissuable = null;

  @SerializedName("metadata")
  private IssueTokenRequestMetadata metadata = null;

  public IssueTokenRequest issueAddress(String issueAddress) {
    this.issueAddress = issueAddress;
    return this;
  }

   /**
   * Address issuing the token
   * @return issueAddress
  **/
  @ApiModelProperty(required = true, value = "Address issuing the token")
  public String getIssueAddress() {
    return issueAddress;
  }

  public void setIssueAddress(String issueAddress) {
    this.issueAddress = issueAddress;
  }

  public IssueTokenRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Number of tokens to issue
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Number of tokens to issue")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public IssueTokenRequest divisibility(BigDecimal divisibility) {
    this.divisibility = divisibility;
    return this;
  }

   /**
   * Number of decimal places the token should be divisble by (0-7)
   * @return divisibility
  **/
  @ApiModelProperty(required = true, value = "Number of decimal places the token should be divisble by (0-7)")
  public BigDecimal getDivisibility() {
    return divisibility;
  }

  public void setDivisibility(BigDecimal divisibility) {
    this.divisibility = divisibility;
  }

  public IssueTokenRequest fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee in satoshi to include in the issuance transaction min 1000000000 (10 NEBL)
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fee in satoshi to include in the issuance transaction min 1000000000 (10 NEBL)")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public IssueTokenRequest reissuable(Boolean reissuable) {
    this.reissuable = reissuable;
    return this;
  }

   /**
   * whether the token should be reissuable
   * @return reissuable
  **/
  @ApiModelProperty(required = true, value = "whether the token should be reissuable")
  public Boolean isReissuable() {
    return reissuable;
  }

  public void setReissuable(Boolean reissuable) {
    this.reissuable = reissuable;
  }

  public IssueTokenRequest metadata(IssueTokenRequestMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IssueTokenRequestMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequest issueTokenRequest = (IssueTokenRequest) o;
    return Objects.equals(this.issueAddress, issueTokenRequest.issueAddress) &&
        Objects.equals(this.amount, issueTokenRequest.amount) &&
        Objects.equals(this.divisibility, issueTokenRequest.divisibility) &&
        Objects.equals(this.fee, issueTokenRequest.fee) &&
        Objects.equals(this.reissuable, issueTokenRequest.reissuable) &&
        Objects.equals(this.metadata, issueTokenRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueAddress, amount, divisibility, fee, reissuable, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequest {\n");
    
    sb.append("    issueAddress: ").append(toIndentedString(issueAddress)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    reissuable: ").append(toIndentedString(reissuable)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
