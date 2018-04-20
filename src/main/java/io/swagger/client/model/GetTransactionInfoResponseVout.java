/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.1.1
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
import io.swagger.client.model.GetTransactionInfoResponsePreviousOutput;
import io.swagger.client.model.GetTransactionInfoResponseTokens;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTransactionInfoResponseVout
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-20T00:20:46.329Z")
public class GetTransactionInfoResponseVout {
  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("n")
  private BigDecimal n = null;

  @SerializedName("scriptPubKey")
  private GetTransactionInfoResponsePreviousOutput scriptPubKey = null;

  @SerializedName("tokens")
  private List<GetTransactionInfoResponseTokens> tokens = null;

  @SerializedName("used")
  private Boolean used = null;

  @SerializedName("blockheight")
  private BigDecimal blockheight = null;

  @SerializedName("usedBlockheight")
  private BigDecimal usedBlockheight = null;

  @SerializedName("usedTxid")
  private String usedTxid = null;

  public GetTransactionInfoResponseVout value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the output in NEBL satoshi
   * @return value
  **/
  @ApiModelProperty(value = "Value of the output in NEBL satoshi")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetTransactionInfoResponseVout n(BigDecimal n) {
    this.n = n;
    return this;
  }

   /**
   * Output index
   * @return n
  **/
  @ApiModelProperty(value = "Output index")
  public BigDecimal getN() {
    return n;
  }

  public void setN(BigDecimal n) {
    this.n = n;
  }

  public GetTransactionInfoResponseVout scriptPubKey(GetTransactionInfoResponsePreviousOutput scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Get scriptPubKey
   * @return scriptPubKey
  **/
  @ApiModelProperty(value = "")
  public GetTransactionInfoResponsePreviousOutput getScriptPubKey() {
    return scriptPubKey;
  }

  public void setScriptPubKey(GetTransactionInfoResponsePreviousOutput scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }

  public GetTransactionInfoResponseVout tokens(List<GetTransactionInfoResponseTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public GetTransactionInfoResponseVout addTokensItem(GetTransactionInfoResponseTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<GetTransactionInfoResponseTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "")
  public List<GetTransactionInfoResponseTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<GetTransactionInfoResponseTokens> tokens) {
    this.tokens = tokens;
  }

  public GetTransactionInfoResponseVout used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * Whether this output has now been used
   * @return used
  **/
  @ApiModelProperty(value = "Whether this output has now been used")
  public Boolean isUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
  }

  public GetTransactionInfoResponseVout blockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
    return this;
  }

   /**
   * Blockheight of this transaction
   * @return blockheight
  **/
  @ApiModelProperty(value = "Blockheight of this transaction")
  public BigDecimal getBlockheight() {
    return blockheight;
  }

  public void setBlockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
  }

  public GetTransactionInfoResponseVout usedBlockheight(BigDecimal usedBlockheight) {
    this.usedBlockheight = usedBlockheight;
    return this;
  }

   /**
   * Blockheight this output was used in
   * @return usedBlockheight
  **/
  @ApiModelProperty(value = "Blockheight this output was used in")
  public BigDecimal getUsedBlockheight() {
    return usedBlockheight;
  }

  public void setUsedBlockheight(BigDecimal usedBlockheight) {
    this.usedBlockheight = usedBlockheight;
  }

  public GetTransactionInfoResponseVout usedTxid(String usedTxid) {
    this.usedTxid = usedTxid;
    return this;
  }

   /**
   * TXID this output was used in
   * @return usedTxid
  **/
  @ApiModelProperty(value = "TXID this output was used in")
  public String getUsedTxid() {
    return usedTxid;
  }

  public void setUsedTxid(String usedTxid) {
    this.usedTxid = usedTxid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionInfoResponseVout getTransactionInfoResponseVout = (GetTransactionInfoResponseVout) o;
    return Objects.equals(this.value, getTransactionInfoResponseVout.value) &&
        Objects.equals(this.n, getTransactionInfoResponseVout.n) &&
        Objects.equals(this.scriptPubKey, getTransactionInfoResponseVout.scriptPubKey) &&
        Objects.equals(this.tokens, getTransactionInfoResponseVout.tokens) &&
        Objects.equals(this.used, getTransactionInfoResponseVout.used) &&
        Objects.equals(this.blockheight, getTransactionInfoResponseVout.blockheight) &&
        Objects.equals(this.usedBlockheight, getTransactionInfoResponseVout.usedBlockheight) &&
        Objects.equals(this.usedTxid, getTransactionInfoResponseVout.usedTxid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, n, scriptPubKey, tokens, used, blockheight, usedBlockheight, usedTxid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionInfoResponseVout {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    scriptPubKey: ").append(toIndentedString(scriptPubKey)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    blockheight: ").append(toIndentedString(blockheight)).append("\n");
    sb.append("    usedBlockheight: ").append(toIndentedString(usedBlockheight)).append("\n");
    sb.append("    usedTxid: ").append(toIndentedString(usedTxid)).append("\n");
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
