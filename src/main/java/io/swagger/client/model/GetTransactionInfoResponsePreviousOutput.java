/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.0
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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTransactionInfoResponsePreviousOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-01T23:18:44.045Z")
public class GetTransactionInfoResponsePreviousOutput {
  @SerializedName("asm")
  private String asm = null;

  @SerializedName("hex")
  private String hex = null;

  @SerializedName("reqSigs")
  private BigDecimal reqSigs = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("addresses")
  private List<String> addresses = null;

  public GetTransactionInfoResponsePreviousOutput asm(String asm) {
    this.asm = asm;
    return this;
  }

   /**
   * Get asm
   * @return asm
  **/
  @ApiModelProperty(value = "")
  public String getAsm() {
    return asm;
  }

  public void setAsm(String asm) {
    this.asm = asm;
  }

  public GetTransactionInfoResponsePreviousOutput hex(String hex) {
    this.hex = hex;
    return this;
  }

   /**
   * Get hex
   * @return hex
  **/
  @ApiModelProperty(value = "")
  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }

  public GetTransactionInfoResponsePreviousOutput reqSigs(BigDecimal reqSigs) {
    this.reqSigs = reqSigs;
    return this;
  }

   /**
   * Get reqSigs
   * @return reqSigs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getReqSigs() {
    return reqSigs;
  }

  public void setReqSigs(BigDecimal reqSigs) {
    this.reqSigs = reqSigs;
  }

  public GetTransactionInfoResponsePreviousOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetTransactionInfoResponsePreviousOutput addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public GetTransactionInfoResponsePreviousOutput addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionInfoResponsePreviousOutput getTransactionInfoResponsePreviousOutput = (GetTransactionInfoResponsePreviousOutput) o;
    return Objects.equals(this.asm, getTransactionInfoResponsePreviousOutput.asm) &&
        Objects.equals(this.hex, getTransactionInfoResponsePreviousOutput.hex) &&
        Objects.equals(this.reqSigs, getTransactionInfoResponsePreviousOutput.reqSigs) &&
        Objects.equals(this.type, getTransactionInfoResponsePreviousOutput.type) &&
        Objects.equals(this.addresses, getTransactionInfoResponsePreviousOutput.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asm, hex, reqSigs, type, addresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionInfoResponsePreviousOutput {\n");
    
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    reqSigs: ").append(toIndentedString(reqSigs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

