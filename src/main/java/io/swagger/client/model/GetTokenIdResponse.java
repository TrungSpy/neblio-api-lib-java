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

/**
 * GetTokenIdResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-01T23:18:44.045Z")
public class GetTokenIdResponse {
  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("tokenName")
  private String tokenName = null;

  public GetTokenIdResponse tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Unique ID of the token
   * @return tokenId
  **/
  @ApiModelProperty(value = "Unique ID of the token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public GetTokenIdResponse tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * String representing the token Symbol
   * @return tokenName
  **/
  @ApiModelProperty(value = "String representing the token Symbol")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenIdResponse getTokenIdResponse = (GetTokenIdResponse) o;
    return Objects.equals(this.tokenId, getTokenIdResponse.tokenId) &&
        Objects.equals(this.tokenName, getTokenIdResponse.tokenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, tokenName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenIdResponse {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
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

