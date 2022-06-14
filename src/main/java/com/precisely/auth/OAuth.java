/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.auth;

import com.precisely.Pair;
import com.precisely.ApiException;
import okhttp3.*;
import com.google.gson.Gson;
import java.net.URI;
import java.util.Map;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class OAuth implements Authentication {
private String accessToken;
private String apiKey;
private String secret;

public String getAccessToken() {
return accessToken;
}

public void setAccessToken(String accessToken) {
this.accessToken = accessToken;
}


public String getApiKey() {
return apiKey;
}

public void setApiKey(String apiKey) {
this.apiKey = apiKey;
}

public String getSecret() {
return secret;
}

public void setSecret(String secret) {
this.secret = secret;
}

@Override
public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri)throws ApiException {
        if (accessToken != null) {
        headerParams.put("Authorization", "Bearer " + accessToken);
        }
        else if(apiKey!=null && secret!=null )
        {
            try {
            generateAndSetAccessToken(apiKey,secret);
                } catch (ApiException e) {
                throw e;
                }
        }
    }





    public void generateAndSetAccessToken(String apiKey,String secret) throws ApiException {
    RequestBody body= RequestBody.create(MediaType.parse("application/json"),"grant_type=client_credentials");
    Request authRequest=null;

    String authenticationHeader =DatatypeConverter.printBase64Binary((apiKey +":" + secret).getBytes());
    authRequest= new Request.Builder().url("https://api.precisely.com/oauth/token").post(body).addHeader("Authorization", "Basic " + authenticationHeader).build();
    OkHttpClient client= new OkHttpClient();

    try {
    Response response = client.newCall(authRequest).execute();
    Gson gson = new Gson();
    OAuthServiceResponce fromJson = gson.fromJson(response.body().string(),OAuthServiceResponce.class );
    setApiKey(apiKey);
    setSecret(secret);
    setAccessToken(fromJson.access_token);
    }
    catch (IOException e)
    {
    throw new ApiException(e);
    }

    }


    class  OAuthServiceResponce
    {
    private String access_token;
    private String token_type;
    private String issuedAt;
    private String expiresIn;
    private String clientID;
    private String org;

    public String getAccess_token() {
    return access_token;
    }

    public void setAccess_token(String access_token) {
    this.access_token = access_token;
    }

    public String getToken_type() {
    return token_type;
    }

    public void setToken_type(String token_type) {
    this.token_type = token_type;
    }

    public String getIssuedAt() {
    return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    }

    public String getExpiresIn() {
    return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    }

    public String getClientID() {
    return clientID;
    }

    public void setClientID(String clientID) {
    this.clientID = clientID;
    }

    public String getOrg() {
    return org;
    }

    public void setOrg(String org) {
    this.org = org;
    }

    }

    }
