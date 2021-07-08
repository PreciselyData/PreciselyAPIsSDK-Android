/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.PhoneVerification;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneVerificationServiceApi
 */
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
        // PhoneVerification response = api.phoneVerification(phoneNumber, includeNetworkInfo);

        // TODO: test validations
    }
    
}
