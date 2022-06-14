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


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.RouteResponse;
import com.precisely.apis.model.TravelCostMatrixResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingServiceApi
 */
@Ignore
public class RoutingServiceApiTest {

    private final RoutingServiceApi api = new RoutingServiceApi();

    
    /**
     * Gets Route By Address.
     *
     * Accepts addresses as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteByAddressTest() throws ApiException {
        String startAddress = null;
        String endAddress = null;
        String db = null;
        String country = null;
        String intermediateAddresses = null;
        String returnIntermediatePoints = null;
        String oip = null;
        String destinationSrs = null;
        String optimizeBy = null;
        String returnDistance = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String language = null;
        String directionsStyle = null;
        String segmentGeometryStyle = null;
        String primaryNameOnly = null;
        String majorRoads = null;
        String historicTrafficTimeBucket = null;
        String returnDirectionGeometry = null;
        String useCvr = null;
        String looseningBarrierRestrictions = null;
        String vehicleType = null;
        String weight = null;
        String weightUnit = null;
        String height = null;
        String heightUnit = null;
        String length = null;
        String lengthUnit = null;
        String width = null;
        String widthUnit = null;
                RouteResponse response = api.getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
        // TODO: test validations
    }
    
    /**
     * Gets Route By Location.
     *
     * Accepts latitude &amp; longitude as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteByLocationTest() throws ApiException {
        String startPoint = null;
        String endPoint = null;
        String db = null;
        String intermediatePoints = null;
        String returnIntermediatePoints = null;
        String oip = null;
        String destinationSrs = null;
        String optimizeBy = null;
        String returnDistance = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String language = null;
        String directionsStyle = null;
        String segmentGeometryStyle = null;
        String primaryNameOnly = null;
        String majorRoads = null;
        String historicTrafficTimeBucket = null;
        String returnDirectionGeometry = null;
        String useCvr = null;
        String looseningBarrierRestrictions = null;
        String vehicleType = null;
        String weight = null;
        String weightUnit = null;
        String height = null;
        String heightUnit = null;
        String length = null;
        String lengthUnit = null;
        String width = null;
        String widthUnit = null;
                RouteResponse response = api.getRouteByLocation(startPoint, endPoint, db, intermediatePoints, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
        // TODO: test validations
    }
    
    /**
     * Get Cost Matrix By Address.
     *
     * Accepts addresses as input and Returns travel distances and times for multiple origins to multiple destinations by various travel modes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelCostMatrixByAddressTest() throws ApiException {
        String startAddresses = null;
        String endAddresses = null;
        String country = null;
        String db = null;
        String optimizeBy = null;
        String returnDistance = null;
        String destinationSrs = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String majorRoads = null;
        String returnOptimalRoutesOnly = null;
        String historicTrafficTimeBucket = null;
        String useCvr = null;
        String looseningBarrierRestrictions = null;
        String vehicleType = null;
        String weight = null;
        String weightUnit = null;
        String height = null;
        String heightUnit = null;
        String length = null;
        String lengthUnit = null;
        String width = null;
        String widthUnit = null;
                TravelCostMatrixResponse response = api.getTravelCostMatrixByAddress(startAddresses, endAddresses, country, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
        // TODO: test validations
    }
    
    /**
     * Get Cost Matrix By Location.
     *
     * Accepts latitude &amp; longitude as input and Returns travel distances and times for multiple origins to multiple destinations by various travel modes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelCostMatrixByLocationTest() throws ApiException {
        String startPoints = null;
        String endPoints = null;
        String db = null;
        String optimizeBy = null;
        String returnDistance = null;
        String destinationSrs = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String majorRoads = null;
        String returnOptimalRoutesOnly = null;
        String historicTrafficTimeBucket = null;
        String useCvr = null;
        String looseningBarrierRestrictions = null;
        String vehicleType = null;
        String weight = null;
        String weightUnit = null;
        String height = null;
        String heightUnit = null;
        String length = null;
        String lengthUnit = null;
        String width = null;
        String widthUnit = null;
                TravelCostMatrixResponse response = api.getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
        // TODO: test validations
    }
    
}