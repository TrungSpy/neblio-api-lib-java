# TestnetNtp1Api

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testnetBroadcastTx**](TestnetNtp1Api.md#testnetBroadcastTx) | **POST** /testnet/ntp1/broadcast | Broadcasts a signed raw transaction to the network
[**testnetBurnToken**](TestnetNtp1Api.md#testnetBurnToken) | **POST** /testnet/ntp1/burntoken | Builds a transaction that burns an NTP1 Token
[**testnetGetAddressInfo**](TestnetNtp1Api.md#testnetGetAddressInfo) | **GET** /testnet/ntp1/addressinfo/{address} | Information On a Neblio Address
[**testnetGetTokenHolders**](TestnetNtp1Api.md#testnetGetTokenHolders) | **GET** /testnet/ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
[**testnetGetTokenId**](TestnetNtp1Api.md#testnetGetTokenId) | **GET** /testnet/ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
[**testnetGetTokenMetadataOfIssuance**](TestnetNtp1Api.md#testnetGetTokenMetadataOfIssuance) | **GET** /testnet/ntp1/tokenmetadata/{tokenid} | Get Issuance Metadata of Token
[**testnetGetTokenMetadataOfUtxo**](TestnetNtp1Api.md#testnetGetTokenMetadataOfUtxo) | **GET** /testnet/ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
[**testnetGetTransactionInfo**](TestnetNtp1Api.md#testnetGetTransactionInfo) | **GET** /testnet/ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
[**testnetIssueToken**](TestnetNtp1Api.md#testnetIssueToken) | **POST** /testnet/ntp1/issue | Builds a transaction that issues a new NTP1 Token
[**testnetSendToken**](TestnetNtp1Api.md#testnetSendToken) | **POST** /testnet/ntp1/sendtoken | Builds a transaction that sends an NTP1 Token


<a name="testnetBroadcastTx"></a>
# **testnetBroadcastTx**
> BroadcastTxResponse testnetBroadcastTx(body)

Broadcasts a signed raw transaction to the network

Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
BroadcastTxRequest body = new BroadcastTxRequest(); // BroadcastTxRequest | Object representing a transaction to broadcast
try {
    BroadcastTxResponse result = apiInstance.testnetBroadcastTx(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetBroadcastTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BroadcastTxRequest**](BroadcastTxRequest.md)| Object representing a transaction to broadcast |

### Return type

[**BroadcastTxResponse**](BroadcastTxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetBurnToken"></a>
# **testnetBurnToken**
> BurnTokenResponse testnetBurnToken(body)

Builds a transaction that burns an NTP1 Token

Builds an unsigned raw transaction that burns an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
BurnTokenRequest body = new BurnTokenRequest(); // BurnTokenRequest | Object representing the token to be burned
try {
    BurnTokenResponse result = apiInstance.testnetBurnToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetBurnToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BurnTokenRequest**](BurnTokenRequest.md)| Object representing the token to be burned |

### Return type

[**BurnTokenResponse**](BurnTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetAddressInfo"></a>
# **testnetGetAddressInfo**
> GetAddressInfoResponse testnetGetAddressInfo(address)

Information On a Neblio Address

Returns both NEBL and NTP1 token UTXOs held at the given address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String address = "address_example"; // String | Neblio Address to get information on.
try {
    GetAddressInfoResponse result = apiInstance.testnetGetAddressInfo(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetAddressInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Neblio Address to get information on. |

### Return type

[**GetAddressInfoResponse**](GetAddressInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetTokenHolders"></a>
# **testnetGetTokenHolders**
> GetTokenHoldersResponse testnetGetTokenHolders(tokenid)

Get Addresses Holding a Token

Returns the the the addresses holding a token and how many tokens are held 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
try {
    GetTokenHoldersResponse result = apiInstance.testnetGetTokenHolders(tokenid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetTokenHolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |

### Return type

[**GetTokenHoldersResponse**](GetTokenHoldersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetTokenId"></a>
# **testnetGetTokenId**
> GetTokenIdResponse testnetGetTokenId(tokensymbol)

Returns the tokenId representing a token

Translates a token symbol to a tokenId if a token exists with that symbol on the network 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String tokensymbol = "tokensymbol_example"; // String | Token symbol
try {
    GetTokenIdResponse result = apiInstance.testnetGetTokenId(tokensymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetTokenId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokensymbol** | **String**| Token symbol |

### Return type

[**GetTokenIdResponse**](GetTokenIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetTokenMetadataOfIssuance"></a>
# **testnetGetTokenMetadataOfIssuance**
> GetTokenMetadataResponse testnetGetTokenMetadataOfIssuance(tokenid)

Get Issuance Metadata of Token

Returns the metadata associated with a token at time of issuance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
try {
    GetTokenMetadataResponse result = apiInstance.testnetGetTokenMetadataOfIssuance(tokenid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetTokenMetadataOfIssuance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |

### Return type

[**GetTokenMetadataResponse**](GetTokenMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetTokenMetadataOfUtxo"></a>
# **testnetGetTokenMetadataOfUtxo**
> GetTokenMetadataResponse testnetGetTokenMetadataOfUtxo(tokenid, utxo)

Get UTXO Metadata of Token

Returns the metadata associated with a token for that specific utxo instead of the issuance transaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
String utxo = "utxo_example"; // String | Specific UTXO to request metadata for
try {
    GetTokenMetadataResponse result = apiInstance.testnetGetTokenMetadataOfUtxo(tokenid, utxo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetTokenMetadataOfUtxo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |
 **utxo** | **String**| Specific UTXO to request metadata for |

### Return type

[**GetTokenMetadataResponse**](GetTokenMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetGetTransactionInfo"></a>
# **testnetGetTransactionInfo**
> GetTransactionInfoResponse testnetGetTransactionInfo(txid)

Information On an NTP1 Transaction

Returns detailed information regarding an NTP1 transaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
String txid = "txid_example"; // String | Neblio txid to get information on.
try {
    GetTransactionInfoResponse result = apiInstance.testnetGetTransactionInfo(txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetGetTransactionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Neblio txid to get information on. |

### Return type

[**GetTransactionInfoResponse**](GetTransactionInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetIssueToken"></a>
# **testnetIssueToken**
> IssueTokenResponse testnetIssueToken(body)

Builds a transaction that issues a new NTP1 Token

Builds an unsigned raw transaction that issues a new NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
IssueTokenRequest body = new IssueTokenRequest(); // IssueTokenRequest | Object representing the token to be created
try {
    IssueTokenResponse result = apiInstance.testnetIssueToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetIssueToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueTokenRequest**](IssueTokenRequest.md)| Object representing the token to be created |

### Return type

[**IssueTokenResponse**](IssueTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testnetSendToken"></a>
# **testnetSendToken**
> SendTokenResponse testnetSendToken(body)

Builds a transaction that sends an NTP1 Token

Builds an unsigned raw transaction that sends an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetNtp1Api;


TestnetNtp1Api apiInstance = new TestnetNtp1Api();
SendTokenRequest body = new SendTokenRequest(); // SendTokenRequest | Object representing the token to be sent
try {
    SendTokenResponse result = apiInstance.testnetSendToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetNtp1Api#testnetSendToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendTokenRequest**](SendTokenRequest.md)| Object representing the token to be sent |

### Return type

[**SendTokenResponse**](SendTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

