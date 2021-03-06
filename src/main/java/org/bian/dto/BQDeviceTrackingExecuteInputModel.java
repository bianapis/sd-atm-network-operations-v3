package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRATMNetworkOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDeviceTrackingExecuteInputModel
 */
public class BQDeviceTrackingExecuteInputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private String deviceTrackingInstanceReference = null;

  private String deviceTrackingPreconditions = null;

  private String deviceTrackingFunctionSchedule = null;

  private String deviceTrackingServiceType = null;

  private String deviceTrackingServiceDescription = null;

  private String deviceTrackingServiceInputsandOuputs = null;

  private String deviceTrackingServiceWorkProduct = null;

  private String deviceTrackingServiceName = null;

  private Object deviceTrackingExecuteActionTaskRecord = null;

  private CRATMNetworkOperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ATM Network Operating Session instance 
   * @return atMNetworkOperatingSessionInstanceReference
  **/

  public String getAtMNetworkOperatingSessionInstanceReference() {
    return atMNetworkOperatingSessionInstanceReference;
  }

  public void setAtMNetworkOperatingSessionInstanceReference(String atMNetworkOperatingSessionInstanceReference) {
    this.atMNetworkOperatingSessionInstanceReference = atMNetworkOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Tracking instance 
   * @return deviceTrackingInstanceReference
  **/

  public String getDeviceTrackingInstanceReference() {
    return deviceTrackingInstanceReference;
  }

  public void setDeviceTrackingInstanceReference(String deviceTrackingInstanceReference) {
    this.deviceTrackingInstanceReference = deviceTrackingInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return deviceTrackingExecuteActionTaskRecord
  **/

  public Object getDeviceTrackingExecuteActionTaskRecord() {
    return deviceTrackingExecuteActionTaskRecord;
  }

  public void setDeviceTrackingExecuteActionTaskRecord(Object deviceTrackingExecuteActionTaskRecord) {
    this.deviceTrackingExecuteActionTaskRecord = deviceTrackingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRATMNetworkOperatingSessionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRATMNetworkOperatingSessionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

