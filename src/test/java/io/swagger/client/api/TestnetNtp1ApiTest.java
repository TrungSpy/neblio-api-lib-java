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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BroadcastTxRequest;
import io.swagger.client.model.BroadcastTxResponse;
import io.swagger.client.model.BurnTokenRequest;
import io.swagger.client.model.BurnTokenResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.GetAddressInfoResponse;
import io.swagger.client.model.GetTokenHoldersResponse;
import io.swagger.client.model.GetTokenIdResponse;
import io.swagger.client.model.GetTokenMetadataResponse;
import io.swagger.client.model.GetTransactionInfoResponse;
import io.swagger.client.model.IssueTokenRequest;
import io.swagger.client.model.IssueTokenResponse;
import io.swagger.client.model.SendTokenRequest;
import io.swagger.client.model.SendTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestnetNtp1Api
 */
@Ignore
public class TestnetNtp1ApiTest {

    private final TestnetNtp1Api api = new TestnetNtp1Api();

    
    /**
     * Broadcasts a signed raw transaction to the network
     *
     * Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetBroadcastTxTest() throws ApiException {
        BroadcastTxRequest body = null;
        BroadcastTxResponse response = api.testnetBroadcastTx(body);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that burns an NTP1 Token
     *
     * Builds an unsigned raw transaction that burns an NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetBurnTokenTest() throws ApiException {
        BurnTokenRequest body = null;
        BurnTokenResponse response = api.testnetBurnToken(body);

        // TODO: test validations
    }
    
    /**
     * Information On a Neblio Address
     *
     * Returns both NEBL and NTP1 token UTXOs held at the given address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetAddressInfoTest() throws ApiException {
        String address = null;
        GetAddressInfoResponse response = api.testnetGetAddressInfo(address);

        // TODO: test validations
    }
    
    /**
     * Get Addresses Holding a Token
     *
     * Returns the the the addresses holding a token and how many tokens are held 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetTokenHoldersTest() throws ApiException {
        String tokenid = null;
        GetTokenHoldersResponse response = api.testnetGetTokenHolders(tokenid);

        // TODO: test validations
    }
    
    /**
     * Returns the tokenId representing a token
     *
     * Translates a token symbol to a tokenId if a token exists with that symbol on the network 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetTokenIdTest() throws ApiException {
        String tokensymbol = null;
        GetTokenIdResponse response = api.testnetGetTokenId(tokensymbol);

        // TODO: test validations
    }
    
    /**
     * Get Issuance Metadata of Token
     *
     * Returns the metadata associated with a token at time of issuance. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetTokenMetadataOfIssuanceTest() throws ApiException {
        String tokenid = null;
        GetTokenMetadataResponse response = api.testnetGetTokenMetadataOfIssuance(tokenid);

        // TODO: test validations
    }
    
    /**
     * Get UTXO Metadata of Token
     *
     * Returns the metadata associated with a token for that specific utxo instead of the issuance transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetTokenMetadataOfUtxoTest() throws ApiException {
        String tokenid = null;
        String utxo = null;
        GetTokenMetadataResponse response = api.testnetGetTokenMetadataOfUtxo(tokenid, utxo);

        // TODO: test validations
    }
    
    /**
     * Information On an NTP1 Transaction
     *
     * Returns detailed information regarding an NTP1 transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetGetTransactionInfoTest() throws ApiException {
        String txid = null;
        GetTransactionInfoResponse response = api.testnetGetTransactionInfo(txid);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that issues a new NTP1 Token
     *
     * Builds an unsigned raw transaction that issues a new NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetIssueTokenTest() throws ApiException {
        IssueTokenRequest body = null;
        IssueTokenResponse response = api.testnetIssueToken(body);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that sends an NTP1 Token
     *
     * Builds an unsigned raw transaction that sends an NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testnetSendTokenTest() throws ApiException {
        SendTokenRequest body = null;
        SendTokenResponse response = api.testnetSendToken(body);

        // TODO: test validations
    }
    
}
