/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.IntersectionResponse;
import com.precisely.apis.model.SpeedLimit;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreetsServiceApi
 */
@Ignore
public class StreetsServiceApiTest {

    private final StreetsServiceApi api = new StreetsServiceApi();

    
    /**
     * Nearest Intesection By Address.
     *
     * This service accepts an address as input and returns the Nearest Intersection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIntersectionByAddressTest() throws ApiException {
        String address = null;
        String roadClass = null;
        String driveTime = null;
        String driveTimeUnit = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String historicSpeed = null;
        String maxCandidates = null;
                IntersectionResponse response = api.getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
        // TODO: test validations
    }
    
    /**
     * Nearest Intesection By Location.
     *
     * This service accepts latitude/longitude as input and returns the Nearest Intersection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIntersectionByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String roadClass = null;
        String driveTime = null;
        String driveTimeUnit = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String historicSpeed = null;
        String maxCandidates = null;
                IntersectionResponse response = api.getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
        // TODO: test validations
    }
    
    /**
     * Nearest Speedlimit.
     *
     * This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNearestSpeedLimitTest() throws ApiException {
        String path = null;
                SpeedLimit response = api.getNearestSpeedLimit(path);
        // TODO: test validations
    }
    
}
