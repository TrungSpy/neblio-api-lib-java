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
import io.swagger.client.model.SendTokenRequestTo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SendTokenRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class SendTokenRequest {
  @SerializedName("fee")
  private BigDecimal fee = null;

  @SerializedName("from")
  private List<String> from = null;

  @SerializedName("to")
  private List<SendTokenRequestTo> to = new ArrayList<SendTokenRequestTo>();

  @SerializedName("metadata")
  private IssueTokenRequestMetadata metadata = null;

  public SendTokenRequest fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee in satoshi to include in the issuance transaction min 10000 (0.0001 NEBL)
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fee in satoshi to include in the issuance transaction min 10000 (0.0001 NEBL)")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public SendTokenRequest from(List<String> from) {
    this.from = from;
    return this;
  }

  public SendTokenRequest addFromItem(String fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<String>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * Array of addresses to send the token from
   * @return from
  **/
  @ApiModelProperty(value = "Array of addresses to send the token from")
  public List<String> getFrom() {
    return from;
  }

  public void setFrom(List<String> from) {
    this.from = from;
  }

  public SendTokenRequest to(List<SendTokenRequestTo> to) {
    this.to = to;
    return this;
  }

  public SendTokenRequest addToItem(SendTokenRequestTo toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SendTokenRequestTo> getTo() {
    return to;
  }

  public void setTo(List<SendTokenRequestTo> to) {
    this.to = to;
  }

  public SendTokenRequest metadata(IssueTokenRequestMetadata metadata) {
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
    SendTokenRequest sendTokenRequest = (SendTokenRequest) o;
    return Objects.equals(this.fee, sendTokenRequest.fee) &&
        Objects.equals(this.from, sendTokenRequest.from) &&
        Objects.equals(this.to, sendTokenRequest.to) &&
        Objects.equals(this.metadata, sendTokenRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, from, to, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTokenRequest {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
