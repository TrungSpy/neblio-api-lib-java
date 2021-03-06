# Ntp1Api

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcastTx**](Ntp1Api.md#broadcastTx) | **POST** /ntp1/broadcast | Broadcasts a signed raw transaction to the network
[**burnToken**](Ntp1Api.md#burnToken) | **POST** /ntp1/burntoken | Builds a transaction that burns an NTP1 Token
[**getAddressInfo**](Ntp1Api.md#getAddressInfo) | **GET** /ntp1/addressinfo/{address} | Information On a Neblio Address
[**getTokenHolders**](Ntp1Api.md#getTokenHolders) | **GET** /ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
[**getTokenId**](Ntp1Api.md#getTokenId) | **GET** /ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
[**getTokenMetadataOfIssuance**](Ntp1Api.md#getTokenMetadataOfIssuance) | **GET** /ntp1/tokenmetadata/{tokenid} | Get Issuance Metadata of Token
[**getTokenMetadataOfUtxo**](Ntp1Api.md#getTokenMetadataOfUtxo) | **GET** /ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
[**getTransactionInfo**](Ntp1Api.md#getTransactionInfo) | **GET** /ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
[**issueToken**](Ntp1Api.md#issueToken) | **POST** /ntp1/issue | Builds a transaction that issues a new NTP1 Token
[**sendToken**](Ntp1Api.md#sendToken) | **POST** /ntp1/sendtoken | Builds a transaction that sends an NTP1 Token


<a name="broadcastTx"></a>
# **broadcastTx**
> BroadcastTxResponse broadcastTx(body)

Broadcasts a signed raw transaction to the network

Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
BroadcastTxRequest body = new BroadcastTxRequest(); // BroadcastTxRequest | Object representing a transaction to broadcast
try {
    BroadcastTxResponse result = apiInstance.broadcastTx(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#broadcastTx");
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

<a name="burnToken"></a>
# **burnToken**
> BurnTokenResponse burnToken(body)

Builds a transaction that burns an NTP1 Token

Builds an unsigned raw transaction that burns an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
BurnTokenRequest body = new BurnTokenRequest(); // BurnTokenRequest | Object representing the token to be burned
try {
    BurnTokenResponse result = apiInstance.burnToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#burnToken");
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

<a name="getAddressInfo"></a>
# **getAddressInfo**
> GetAddressInfoResponse getAddressInfo(address)

Information On a Neblio Address

Returns both NEBL and NTP1 token UTXOs held at the given address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String address = "address_example"; // String | Neblio Address to get information on.
try {
    GetAddressInfoResponse result = apiInstance.getAddressInfo(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getAddressInfo");
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

<a name="getTokenHolders"></a>
# **getTokenHolders**
> GetTokenHoldersResponse getTokenHolders(tokenid)

Get Addresses Holding a Token

Returns the the the addresses holding a token and how many tokens are held 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
try {
    GetTokenHoldersResponse result = apiInstance.getTokenHolders(tokenid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenHolders");
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

<a name="getTokenId"></a>
# **getTokenId**
> GetTokenIdResponse getTokenId(tokensymbol)

Returns the tokenId representing a token

Translates a token symbol to a tokenId if a token exists with that symbol on the network 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokensymbol = "tokensymbol_example"; // String | Token symbol
try {
    GetTokenIdResponse result = apiInstance.getTokenId(tokensymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenId");
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

<a name="getTokenMetadataOfIssuance"></a>
# **getTokenMetadataOfIssuance**
> GetTokenMetadataResponse getTokenMetadataOfIssuance(tokenid)

Get Issuance Metadata of Token

Returns the metadata associated with a token at time of issuance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
try {
    GetTokenMetadataResponse result = apiInstance.getTokenMetadataOfIssuance(tokenid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenMetadataOfIssuance");
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

<a name="getTokenMetadataOfUtxo"></a>
# **getTokenMetadataOfUtxo**
> GetTokenMetadataResponse getTokenMetadataOfUtxo(tokenid, utxo)

Get UTXO Metadata of Token

Returns the metadata associated with a token for that specific utxo instead of the issuance transaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
String utxo = "utxo_example"; // String | Specific UTXO to request metadata for
try {
    GetTokenMetadataResponse result = apiInstance.getTokenMetadataOfUtxo(tokenid, utxo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenMetadataOfUtxo");
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

<a name="getTransactionInfo"></a>
# **getTransactionInfo**
> GetTransactionInfoResponse getTransactionInfo(txid)

Information On an NTP1 Transaction

Returns detailed information regarding an NTP1 transaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String txid = "txid_example"; // String | Neblio txid to get information on.
try {
    GetTransactionInfoResponse result = apiInstance.getTransactionInfo(txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTransactionInfo");
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

<a name="issueToken"></a>
# **issueToken**
> IssueTokenResponse issueToken(body)

Builds a transaction that issues a new NTP1 Token

Builds an unsigned raw transaction that issues a new NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
IssueTokenRequest body = new IssueTokenRequest(); // IssueTokenRequest | Object representing the token to be created
try {
    IssueTokenResponse result = apiInstance.issueToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#issueToken");
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

<a name="sendToken"></a>
# **sendToken**
> SendTokenResponse sendToken(body)

Builds a transaction that sends an NTP1 Token

Builds an unsigned raw transaction that sends an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
SendTokenRequest body = new SendTokenRequest(); // SendTokenRequest | Object representing the token to be sent
try {
    SendTokenResponse result = apiInstance.sendToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#sendToken");
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

