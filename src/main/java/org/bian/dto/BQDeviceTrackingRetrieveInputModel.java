package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceAnalysis;
import org.bian.dto.BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeviceTrackingRetrieveInputModel
 */
public class BQDeviceTrackingRetrieveInputModel   {
  private String deviceTrackingPreconditions = null;

  private String deviceTrackingFunctionSchedule = null;

  private String deviceTrackingServiceType = null;

  private String deviceTrackingServiceDescription = null;

  private String deviceTrackingServiceInputsandOuputs = null;

  private String deviceTrackingServiceWorkProduct = null;

  private String deviceTrackingServiceName = null;

  private Object deviceTrackingRetrieveActionTaskRecord = null;

  private String deviceTrackingRetrieveActionRequest = null;

  private BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceReport deviceTrackingInstanceReport = null;

  private BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceAnalysis deviceTrackingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return deviceTrackingPreconditions
  **/

  public String getDeviceTrackingPreconditions() {
    return deviceTrackingPreconditions;
  }

  public void setDeviceTrackingPreconditions(String deviceTrackingPreconditions) {
    this.deviceTrackingPreconditions = deviceTrackingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return deviceTrackingFunctionSchedule
  **/

  public String getDeviceTrackingFunctionSchedule() {
    return deviceTrackingFunctionSchedule;
  }

  public void setDeviceTrackingFunctionSchedule(String deviceTrackingFunctionSchedule) {
    this.deviceTrackingFunctionSchedule = deviceTrackingFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return deviceTrackingServiceType
  **/

  public String getDeviceTrackingServiceType() {
    return deviceTrackingServiceType;
  }

  public void setDeviceTrackingServiceType(String deviceTrackingServiceType) {
    this.deviceTrackingServiceType = deviceTrackingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return deviceTrackingServiceDescription
  **/

  public String getDeviceTrackingServiceDescription() {
    return deviceTrackingServiceDescription;
  }

  public void setDeviceTrackingServiceDescription(String deviceTrackingServiceDescription) {
    this.deviceTrackingServiceDescription = deviceTrackingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return deviceTrackingServiceInputsandOuputs
  **/

  public String getDeviceTrackingServiceInputsandOuputs() {
    return deviceTrackingServiceInputsandOuputs;
  }

  public void setDeviceTrackingServiceInputsandOuputs(String deviceTrackingServiceInputsandOuputs) {
    this.deviceTrackingServiceInputsandOuputs = deviceTrackingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return deviceTrackingServiceWorkProduct
  **/

  public String getDeviceTrackingServiceWorkProduct() {
    return deviceTrackingServiceWorkProduct;
  }

  public void setDeviceTrackingServiceWorkProduct(String deviceTrackingServiceWorkProduct) {
    this.deviceTrackingServiceWorkProduct = deviceTrackingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return deviceTrackingServiceName
  **/

  public String getDeviceTrackingServiceName() {
    return deviceTrackingServiceName;
  }

  public void setDeviceTrackingServiceName(String deviceTrackingServiceName) {
    this.deviceTrackingServiceName = deviceTrackingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceTrackingRetrieveActionTaskRecord
  **/

  public Object getDeviceTrackingRetrieveActionTaskRecord() {
    return deviceTrackingRetrieveActionTaskRecord;
  }

  public void setDeviceTrackingRetrieveActionTaskRecord(Object deviceTrackingRetrieveActionTaskRecord) {
    this.deviceTrackingRetrieveActionTaskRecord = deviceTrackingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return deviceTrackingRetrieveActionRequest
  **/

  public String getDeviceTrackingRetrieveActionRequest() {
    return deviceTrackingRetrieveActionRequest;
  }

  public void setDeviceTrackingRetrieveActionRequest(String deviceTrackingRetrieveActionRequest) {
    this.deviceTrackingRetrieveActionRequest = deviceTrackingRetrieveActionRequest;
  }


  /**
   * Get deviceTrackingInstanceReport
   * @return deviceTrackingInstanceReport
  **/

  public BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceReport getDeviceTrackingInstanceReport() {
    return deviceTrackingInstanceReport;
  }

  public void setDeviceTrackingInstanceReport(BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceReport deviceTrackingInstanceReport) {
    this.deviceTrackingInstanceReport = deviceTrackingInstanceReport;
  }


  /**
   * Get deviceTrackingInstanceAnalysis
   * @return deviceTrackingInstanceAnalysis
  **/

  public BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceAnalysis getDeviceTrackingInstanceAnalysis() {
    return deviceTrackingInstanceAnalysis;
  }

  public void setDeviceTrackingInstanceAnalysis(BQDeviceTrackingRetrieveInputModelDeviceTrackingInstanceAnalysis deviceTrackingInstanceAnalysis) {
    this.deviceTrackingInstanceAnalysis = deviceTrackingInstanceAnalysis;
  }


}

