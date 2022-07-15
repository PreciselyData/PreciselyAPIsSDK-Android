/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.PhoneVerification;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneVerificationServiceApi
 */
@Ignore
public class PhoneVerificationServiceApiTest {

    private final PhoneVerificationServiceApi api = new PhoneVerificationServiceApi();

    
    /**
     * Phone verification.
     *
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneVerificationTest() throws ApiException {
        String phoneNumber = null;
        String includeNetworkInfo = null;
                PhoneVerification response = api.phoneVerification(phoneNumber, includeNetworkInfo);
        // TODO: test validations
    }
    
}
