
# IssueTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issueAddress** | **String** | Address issuing the token | 
**amount** | [**BigDecimal**](BigDecimal.md) | Number of tokens to issue | 
**divisibility** | [**BigDecimal**](BigDecimal.md) | Number of decimal places the token should be divisble by (0-7) | 
**fee** | [**BigDecimal**](BigDecimal.md) | Fee in satoshi to include in the issuance transaction min 1000000000 (10 NEBL) | 
**reissuable** | **Boolean** | whether the token should be reissuable | 
**flags** | [**IssueTokenRequestFlags**](IssueTokenRequestFlags.md) |  |  [optional]
**metadata** | [**IssueTokenRequestMetadata**](IssueTokenRequestMetadata.md) |  |  [optional]



