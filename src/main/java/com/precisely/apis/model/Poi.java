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


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.BusinessId;
import com.precisely.apis.model.ContactDetails;
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.DomesticUltimateBusiness;
import com.precisely.apis.model.EmployeeCount;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.GlobalUltimateBusiness;
import com.precisely.apis.model.ParentBusiness;
import com.precisely.apis.model.PoiClassification;
import com.precisely.apis.model.SalesVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Poi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class Poi {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_POI_ID = "poiId";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private String poiId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PBKEY = "pbkey";
  @SerializedName(SERIALIZED_NAME_PBKEY)
  private String pbkey;

  public static final String SERIALIZED_NAME_PARENT_PBKEY = "parentPbkey";
  @SerializedName(SERIALIZED_NAME_PARENT_PBKEY)
  private String parentPbkey;

  public static final String SERIALIZED_NAME_GEOCODE_CONFIDENCE = "geocodeConfidence";
  @SerializedName(SERIALIZED_NAME_GEOCODE_CONFIDENCE)
  private String geocodeConfidence;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_TRADE_NAME = "tradeName";
  @SerializedName(SERIALIZED_NAME_TRADE_NAME)
  private String tradeName;

  public static final String SERIALIZED_NAME_FRANCHISE_NAME = "franchiseName";
  @SerializedName(SERIALIZED_NAME_FRANCHISE_NAME)
  private String franchiseName;

  public static final String SERIALIZED_NAME_OPEN24_HOURS = "open24Hours";
  @SerializedName(SERIALIZED_NAME_OPEN24_HOURS)
  private String open24Hours;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Distance distance;

  public static final String SERIALIZED_NAME_BUSINESS_ID = "businessId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private BusinessId businessId;

  public static final String SERIALIZED_NAME_RELEVANCE_SCORE = "relevanceScore";
  @SerializedName(SERIALIZED_NAME_RELEVANCE_SCORE)
  private String relevanceScore;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contactDetails";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private ContactDetails contactDetails;

  public static final String SERIALIZED_NAME_POI_CLASSIFICATION = "poiClassification";
  @SerializedName(SERIALIZED_NAME_POI_CLASSIFICATION)
  private PoiClassification poiClassification;

  public static final String SERIALIZED_NAME_SALES_VOLUME = "salesVolume";
  @SerializedName(SERIALIZED_NAME_SALES_VOLUME)
  private List<SalesVolume> salesVolume = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_COUNT = "employeeCount";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_COUNT)
  private EmployeeCount employeeCount;

  public static final String SERIALIZED_NAME_YEAR_START = "yearStart";
  @SerializedName(SERIALIZED_NAME_YEAR_START)
  private String yearStart;

  public static final String SERIALIZED_NAME_GOODS_AGENT_CODE = "goodsAgentCode";
  @SerializedName(SERIALIZED_NAME_GOODS_AGENT_CODE)
  private String goodsAgentCode;

  public static final String SERIALIZED_NAME_GOODS_AGENT_CODE_DESCRIPTION = "goodsAgentCodeDescription";
  @SerializedName(SERIALIZED_NAME_GOODS_AGENT_CODE_DESCRIPTION)
  private String goodsAgentCodeDescription;

  public static final String SERIALIZED_NAME_LEGAL_STATUS_CODE = "legalStatusCode";
  @SerializedName(SERIALIZED_NAME_LEGAL_STATUS_CODE)
  private String legalStatusCode;

  public static final String SERIALIZED_NAME_ORGANIZATION_STATUS_CODE = "organizationStatusCode";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_STATUS_CODE)
  private String organizationStatusCode;

  public static final String SERIALIZED_NAME_ORGANIZATION_STATUS_CODE_DESCRIPTION = "organizationStatusCodeDescription";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_STATUS_CODE_DESCRIPTION)
  private String organizationStatusCodeDescription;

  public static final String SERIALIZED_NAME_SUBSIDARY_INDICATOR = "subsidaryIndicator";
  @SerializedName(SERIALIZED_NAME_SUBSIDARY_INDICATOR)
  private String subsidaryIndicator;

  public static final String SERIALIZED_NAME_SUBSIDARY_INDICATOR_DESCRIPTION = "subsidaryIndicatorDescription";
  @SerializedName(SERIALIZED_NAME_SUBSIDARY_INDICATOR_DESCRIPTION)
  private String subsidaryIndicatorDescription;

  public static final String SERIALIZED_NAME_PARENT_BUSINESS = "parentBusiness";
  @SerializedName(SERIALIZED_NAME_PARENT_BUSINESS)
  private ParentBusiness parentBusiness;

  public static final String SERIALIZED_NAME_DOMESTIC_ULTIMATE_BUSINESS = "domesticUltimateBusiness";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_ULTIMATE_BUSINESS)
  private DomesticUltimateBusiness domesticUltimateBusiness;

  public static final String SERIALIZED_NAME_GLOBAL_ULTIMATE_INDICATOR = "globalUltimateIndicator";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ULTIMATE_INDICATOR)
  private String globalUltimateIndicator;

  public static final String SERIALIZED_NAME_GLOBAL_ULTIMATE_BUSINESS = "globalUltimateBusiness";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ULTIMATE_BUSINESS)
  private GlobalUltimateBusiness globalUltimateBusiness;

  public static final String SERIALIZED_NAME_FAMILY_MEMBERS = "familyMembers";
  @SerializedName(SERIALIZED_NAME_FAMILY_MEMBERS)
  private String familyMembers;

  public static final String SERIALIZED_NAME_HIERARCHY_CODE = "hierarchyCode";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_CODE)
  private String hierarchyCode;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "tickerSymbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public static final String SERIALIZED_NAME_EXCHANGE_NAME = "exchangeName";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_NAME)
  private String exchangeName;

  public static final String SERIALIZED_NAME_CEO_NAME = "ceoName";
  @SerializedName(SERIALIZED_NAME_CEO_NAME)
  private String ceoName;

  public static final String SERIALIZED_NAME_CEO_TITLE = "ceoTitle";
  @SerializedName(SERIALIZED_NAME_CEO_TITLE)
  private String ceoTitle;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public Poi() { 
  }

  public Poi id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Poi poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * Get poiId
   * @return poiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }


  public Poi name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Poi pbkey(String pbkey) {
    
    this.pbkey = pbkey;
    return this;
  }

   /**
   * Get pbkey
   * @return pbkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPbkey() {
    return pbkey;
  }


  public void setPbkey(String pbkey) {
    this.pbkey = pbkey;
  }


  public Poi parentPbkey(String parentPbkey) {
    
    this.parentPbkey = parentPbkey;
    return this;
  }

   /**
   * Get parentPbkey
   * @return parentPbkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentPbkey() {
    return parentPbkey;
  }


  public void setParentPbkey(String parentPbkey) {
    this.parentPbkey = parentPbkey;
  }


  public Poi geocodeConfidence(String geocodeConfidence) {
    
    this.geocodeConfidence = geocodeConfidence;
    return this;
  }

   /**
   * Get geocodeConfidence
   * @return geocodeConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeocodeConfidence() {
    return geocodeConfidence;
  }


  public void setGeocodeConfidence(String geocodeConfidence) {
    this.geocodeConfidence = geocodeConfidence;
  }


  public Poi brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public Poi tradeName(String tradeName) {
    
    this.tradeName = tradeName;
    return this;
  }

   /**
   * Get tradeName
   * @return tradeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeName() {
    return tradeName;
  }


  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }


  public Poi franchiseName(String franchiseName) {
    
    this.franchiseName = franchiseName;
    return this;
  }

   /**
   * Get franchiseName
   * @return franchiseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFranchiseName() {
    return franchiseName;
  }


  public void setFranchiseName(String franchiseName) {
    this.franchiseName = franchiseName;
  }


  public Poi open24Hours(String open24Hours) {
    
    this.open24Hours = open24Hours;
    return this;
  }

   /**
   * Get open24Hours
   * @return open24Hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOpen24Hours() {
    return open24Hours;
  }


  public void setOpen24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
  }


  public Poi distance(Distance distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distance getDistance() {
    return distance;
  }


  public void setDistance(Distance distance) {
    this.distance = distance;
  }


  public Poi businessId(BusinessId businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessId getBusinessId() {
    return businessId;
  }


  public void setBusinessId(BusinessId businessId) {
    this.businessId = businessId;
  }


  public Poi relevanceScore(String relevanceScore) {
    
    this.relevanceScore = relevanceScore;
    return this;
  }

   /**
   * Get relevanceScore
   * @return relevanceScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRelevanceScore() {
    return relevanceScore;
  }


  public void setRelevanceScore(String relevanceScore) {
    this.relevanceScore = relevanceScore;
  }


  public Poi contactDetails(ContactDetails contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactDetails getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  public Poi poiClassification(PoiClassification poiClassification) {
    
    this.poiClassification = poiClassification;
    return this;
  }

   /**
   * Get poiClassification
   * @return poiClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PoiClassification getPoiClassification() {
    return poiClassification;
  }


  public void setPoiClassification(PoiClassification poiClassification) {
    this.poiClassification = poiClassification;
  }


  public Poi salesVolume(List<SalesVolume> salesVolume) {
    
    this.salesVolume = salesVolume;
    return this;
  }

  public Poi addSalesVolumeItem(SalesVolume salesVolumeItem) {
    if (this.salesVolume == null) {
      this.salesVolume = new ArrayList<SalesVolume>();
    }
    this.salesVolume.add(salesVolumeItem);
    return this;
  }

   /**
   * Get salesVolume
   * @return salesVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SalesVolume> getSalesVolume() {
    return salesVolume;
  }


  public void setSalesVolume(List<SalesVolume> salesVolume) {
    this.salesVolume = salesVolume;
  }


  public Poi employeeCount(EmployeeCount employeeCount) {
    
    this.employeeCount = employeeCount;
    return this;
  }

   /**
   * Get employeeCount
   * @return employeeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeCount getEmployeeCount() {
    return employeeCount;
  }


  public void setEmployeeCount(EmployeeCount employeeCount) {
    this.employeeCount = employeeCount;
  }


  public Poi yearStart(String yearStart) {
    
    this.yearStart = yearStart;
    return this;
  }

   /**
   * Get yearStart
   * @return yearStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYearStart() {
    return yearStart;
  }


  public void setYearStart(String yearStart) {
    this.yearStart = yearStart;
  }


  public Poi goodsAgentCode(String goodsAgentCode) {
    
    this.goodsAgentCode = goodsAgentCode;
    return this;
  }

   /**
   * Get goodsAgentCode
   * @return goodsAgentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGoodsAgentCode() {
    return goodsAgentCode;
  }


  public void setGoodsAgentCode(String goodsAgentCode) {
    this.goodsAgentCode = goodsAgentCode;
  }


  public Poi goodsAgentCodeDescription(String goodsAgentCodeDescription) {
    
    this.goodsAgentCodeDescription = goodsAgentCodeDescription;
    return this;
  }

   /**
   * Get goodsAgentCodeDescription
   * @return goodsAgentCodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGoodsAgentCodeDescription() {
    return goodsAgentCodeDescription;
  }


  public void setGoodsAgentCodeDescription(String goodsAgentCodeDescription) {
    this.goodsAgentCodeDescription = goodsAgentCodeDescription;
  }


  public Poi legalStatusCode(String legalStatusCode) {
    
    this.legalStatusCode = legalStatusCode;
    return this;
  }

   /**
   * Get legalStatusCode
   * @return legalStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegalStatusCode() {
    return legalStatusCode;
  }


  public void setLegalStatusCode(String legalStatusCode) {
    this.legalStatusCode = legalStatusCode;
  }


  public Poi organizationStatusCode(String organizationStatusCode) {
    
    this.organizationStatusCode = organizationStatusCode;
    return this;
  }

   /**
   * Get organizationStatusCode
   * @return organizationStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationStatusCode() {
    return organizationStatusCode;
  }


  public void setOrganizationStatusCode(String organizationStatusCode) {
    this.organizationStatusCode = organizationStatusCode;
  }


  public Poi organizationStatusCodeDescription(String organizationStatusCodeDescription) {
    
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
    return this;
  }

   /**
   * Get organizationStatusCodeDescription
   * @return organizationStatusCodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationStatusCodeDescription() {
    return organizationStatusCodeDescription;
  }


  public void setOrganizationStatusCodeDescription(String organizationStatusCodeDescription) {
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
  }


  public Poi subsidaryIndicator(String subsidaryIndicator) {
    
    this.subsidaryIndicator = subsidaryIndicator;
    return this;
  }

   /**
   * Get subsidaryIndicator
   * @return subsidaryIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubsidaryIndicator() {
    return subsidaryIndicator;
  }


  public void setSubsidaryIndicator(String subsidaryIndicator) {
    this.subsidaryIndicator = subsidaryIndicator;
  }


  public Poi subsidaryIndicatorDescription(String subsidaryIndicatorDescription) {
    
    this.subsidaryIndicatorDescription = subsidaryIndicatorDescription;
    return this;
  }

   /**
   * Get subsidaryIndicatorDescription
   * @return subsidaryIndicatorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubsidaryIndicatorDescription() {
    return subsidaryIndicatorDescription;
  }


  public void setSubsidaryIndicatorDescription(String subsidaryIndicatorDescription) {
    this.subsidaryIndicatorDescription = subsidaryIndicatorDescription;
  }


  public Poi parentBusiness(ParentBusiness parentBusiness) {
    
    this.parentBusiness = parentBusiness;
    return this;
  }

   /**
   * Get parentBusiness
   * @return parentBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParentBusiness getParentBusiness() {
    return parentBusiness;
  }


  public void setParentBusiness(ParentBusiness parentBusiness) {
    this.parentBusiness = parentBusiness;
  }


  public Poi domesticUltimateBusiness(DomesticUltimateBusiness domesticUltimateBusiness) {
    
    this.domesticUltimateBusiness = domesticUltimateBusiness;
    return this;
  }

   /**
   * Get domesticUltimateBusiness
   * @return domesticUltimateBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DomesticUltimateBusiness getDomesticUltimateBusiness() {
    return domesticUltimateBusiness;
  }


  public void setDomesticUltimateBusiness(DomesticUltimateBusiness domesticUltimateBusiness) {
    this.domesticUltimateBusiness = domesticUltimateBusiness;
  }


  public Poi globalUltimateIndicator(String globalUltimateIndicator) {
    
    this.globalUltimateIndicator = globalUltimateIndicator;
    return this;
  }

   /**
   * Get globalUltimateIndicator
   * @return globalUltimateIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlobalUltimateIndicator() {
    return globalUltimateIndicator;
  }


  public void setGlobalUltimateIndicator(String globalUltimateIndicator) {
    this.globalUltimateIndicator = globalUltimateIndicator;
  }


  public Poi globalUltimateBusiness(GlobalUltimateBusiness globalUltimateBusiness) {
    
    this.globalUltimateBusiness = globalUltimateBusiness;
    return this;
  }

   /**
   * Get globalUltimateBusiness
   * @return globalUltimateBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlobalUltimateBusiness getGlobalUltimateBusiness() {
    return globalUltimateBusiness;
  }


  public void setGlobalUltimateBusiness(GlobalUltimateBusiness globalUltimateBusiness) {
    this.globalUltimateBusiness = globalUltimateBusiness;
  }


  public Poi familyMembers(String familyMembers) {
    
    this.familyMembers = familyMembers;
    return this;
  }

   /**
   * Get familyMembers
   * @return familyMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamilyMembers() {
    return familyMembers;
  }


  public void setFamilyMembers(String familyMembers) {
    this.familyMembers = familyMembers;
  }


  public Poi hierarchyCode(String hierarchyCode) {
    
    this.hierarchyCode = hierarchyCode;
    return this;
  }

   /**
   * Get hierarchyCode
   * @return hierarchyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHierarchyCode() {
    return hierarchyCode;
  }


  public void setHierarchyCode(String hierarchyCode) {
    this.hierarchyCode = hierarchyCode;
  }


  public Poi tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * Get tickerSymbol
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }


  public Poi exchangeName(String exchangeName) {
    
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * Get exchangeName
   * @return exchangeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExchangeName() {
    return exchangeName;
  }


  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }


  public Poi ceoName(String ceoName) {
    
    this.ceoName = ceoName;
    return this;
  }

   /**
   * Get ceoName
   * @return ceoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCeoName() {
    return ceoName;
  }


  public void setCeoName(String ceoName) {
    this.ceoName = ceoName;
  }


  public Poi ceoTitle(String ceoTitle) {
    
    this.ceoTitle = ceoTitle;
    return this;
  }

   /**
   * Get ceoTitle
   * @return ceoTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCeoTitle() {
    return ceoTitle;
  }


  public void setCeoTitle(String ceoTitle) {
    this.ceoTitle = ceoTitle;
  }


  public Poi geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poi poi = (Poi) o;
    return Objects.equals(this.id, poi.id) &&
        Objects.equals(this.poiId, poi.poiId) &&
        Objects.equals(this.name, poi.name) &&
        Objects.equals(this.pbkey, poi.pbkey) &&
        Objects.equals(this.parentPbkey, poi.parentPbkey) &&
        Objects.equals(this.geocodeConfidence, poi.geocodeConfidence) &&
        Objects.equals(this.brandName, poi.brandName) &&
        Objects.equals(this.tradeName, poi.tradeName) &&
        Objects.equals(this.franchiseName, poi.franchiseName) &&
        Objects.equals(this.open24Hours, poi.open24Hours) &&
        Objects.equals(this.distance, poi.distance) &&
        Objects.equals(this.businessId, poi.businessId) &&
        Objects.equals(this.relevanceScore, poi.relevanceScore) &&
        Objects.equals(this.contactDetails, poi.contactDetails) &&
        Objects.equals(this.poiClassification, poi.poiClassification) &&
        Objects.equals(this.salesVolume, poi.salesVolume) &&
        Objects.equals(this.employeeCount, poi.employeeCount) &&
        Objects.equals(this.yearStart, poi.yearStart) &&
        Objects.equals(this.goodsAgentCode, poi.goodsAgentCode) &&
        Objects.equals(this.goodsAgentCodeDescription, poi.goodsAgentCodeDescription) &&
        Objects.equals(this.legalStatusCode, poi.legalStatusCode) &&
        Objects.equals(this.organizationStatusCode, poi.organizationStatusCode) &&
        Objects.equals(this.organizationStatusCodeDescription, poi.organizationStatusCodeDescription) &&
        Objects.equals(this.subsidaryIndicator, poi.subsidaryIndicator) &&
        Objects.equals(this.subsidaryIndicatorDescription, poi.subsidaryIndicatorDescription) &&
        Objects.equals(this.parentBusiness, poi.parentBusiness) &&
        Objects.equals(this.domesticUltimateBusiness, poi.domesticUltimateBusiness) &&
        Objects.equals(this.globalUltimateIndicator, poi.globalUltimateIndicator) &&
        Objects.equals(this.globalUltimateBusiness, poi.globalUltimateBusiness) &&
        Objects.equals(this.familyMembers, poi.familyMembers) &&
        Objects.equals(this.hierarchyCode, poi.hierarchyCode) &&
        Objects.equals(this.tickerSymbol, poi.tickerSymbol) &&
        Objects.equals(this.exchangeName, poi.exchangeName) &&
        Objects.equals(this.ceoName, poi.ceoName) &&
        Objects.equals(this.ceoTitle, poi.ceoTitle) &&
        Objects.equals(this.geometry, poi.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, poiId, name, pbkey, parentPbkey, geocodeConfidence, brandName, tradeName, franchiseName, open24Hours, distance, businessId, relevanceScore, contactDetails, poiClassification, salesVolume, employeeCount, yearStart, goodsAgentCode, goodsAgentCodeDescription, legalStatusCode, organizationStatusCode, organizationStatusCodeDescription, subsidaryIndicator, subsidaryIndicatorDescription, parentBusiness, domesticUltimateBusiness, globalUltimateIndicator, globalUltimateBusiness, familyMembers, hierarchyCode, tickerSymbol, exchangeName, ceoName, ceoTitle, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poi {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pbkey: ").append(toIndentedString(pbkey)).append("\n");
    sb.append("    parentPbkey: ").append(toIndentedString(parentPbkey)).append("\n");
    sb.append("    geocodeConfidence: ").append(toIndentedString(geocodeConfidence)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    franchiseName: ").append(toIndentedString(franchiseName)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    relevanceScore: ").append(toIndentedString(relevanceScore)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    poiClassification: ").append(toIndentedString(poiClassification)).append("\n");
    sb.append("    salesVolume: ").append(toIndentedString(salesVolume)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    yearStart: ").append(toIndentedString(yearStart)).append("\n");
    sb.append("    goodsAgentCode: ").append(toIndentedString(goodsAgentCode)).append("\n");
    sb.append("    goodsAgentCodeDescription: ").append(toIndentedString(goodsAgentCodeDescription)).append("\n");
    sb.append("    legalStatusCode: ").append(toIndentedString(legalStatusCode)).append("\n");
    sb.append("    organizationStatusCode: ").append(toIndentedString(organizationStatusCode)).append("\n");
    sb.append("    organizationStatusCodeDescription: ").append(toIndentedString(organizationStatusCodeDescription)).append("\n");
    sb.append("    subsidaryIndicator: ").append(toIndentedString(subsidaryIndicator)).append("\n");
    sb.append("    subsidaryIndicatorDescription: ").append(toIndentedString(subsidaryIndicatorDescription)).append("\n");
    sb.append("    parentBusiness: ").append(toIndentedString(parentBusiness)).append("\n");
    sb.append("    domesticUltimateBusiness: ").append(toIndentedString(domesticUltimateBusiness)).append("\n");
    sb.append("    globalUltimateIndicator: ").append(toIndentedString(globalUltimateIndicator)).append("\n");
    sb.append("    globalUltimateBusiness: ").append(toIndentedString(globalUltimateBusiness)).append("\n");
    sb.append("    familyMembers: ").append(toIndentedString(familyMembers)).append("\n");
    sb.append("    hierarchyCode: ").append(toIndentedString(hierarchyCode)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    ceoName: ").append(toIndentedString(ceoName)).append("\n");
    sb.append("    ceoTitle: ").append(toIndentedString(ceoTitle)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

