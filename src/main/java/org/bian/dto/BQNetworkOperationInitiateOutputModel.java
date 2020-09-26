package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationInitiateOutputModel
 */
public class BQNetworkOperationInitiateOutputModel   {
  private String networkOperationInstanceReference = null;

  private String networkOperationInitiateActionReference = null;

  private Object networkOperationInitiateActionRecord = null;

  private String networkOperationInstanceStatus = null;

  private String cashDistributionPreconditions = null;

  private String cashDistributionFunctionSchedule = null;

  private String cashDistributionServiceType = null;

  private String cashDistributionServiceDescription = null;

  private String cashDistributionServiceInputsandOuputs = null;

  private String cashDistributionServiceWorkProduct = null;

  private String cashDistributionServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Network Operation instance 
   * @return networkOperationInstanceReference
  **/

  public String getNetworkOperationInstanceReference() {
    return networkOperationInstanceReference;
  }

  public void setNetworkOperationInstanceReference(String networkOperationInstanceReference) {
    this.networkOperationInstanceReference = networkOperationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return networkOperationInitiateActionReference
  **/

  public String getNetworkOperationInitiateActionReference() {
    return networkOperationInitiateActionReference;
  }

  public void setNetworkOperationInitiateActionReference(String networkOperationInitiateActionReference) {
    this.networkOperationInitiateActionReference = networkOperationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return networkOperationInitiateActionRecord
  **/

  public Object getNetworkOperationInitiateActionRecord() {
    return networkOperationInitiateActionRecord;
  }

  public void setNetworkOperationInitiateActionRecord(Object networkOperationInitiateActionRecord) {
    this.networkOperationInitiateActionRecord = networkOperationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Network Operation instance (e.g. initialised, pending, active) 
   * @return networkOperationInstanceStatus
  **/

  public String getNetworkOperationInstanceStatus() {
    return networkOperationInstanceStatus;
  }

  public void setNetworkOperationInstanceStatus(String networkOperationInstanceStatus) {
    this.networkOperationInstanceStatus = networkOperationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return cashDistributionPreconditions
  **/

  public String getCashDistributionPreconditions() {
    return cashDistributionPreconditions;
  }

  public void setCashDistributionPreconditions(String cashDistributionPreconditions) {
    this.cashDistributionPreconditions = cashDistributionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return cashDistributionFunctionSchedule
  **/

  public String getCashDistributionFunctionSchedule() {
    return cashDistributionFunctionSchedule;
  }

  public void setCashDistributionFunctionSchedule(String cashDistributionFunctionSchedule) {
    this.cashDistributionFunctionSchedule = cashDistributionFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cashDistributionServiceType
  **/

  public String getCashDistributionServiceType() {
    return cashDistributionServiceType;
  }

  public void setCashDistributionServiceType(String cashDistributionServiceType) {
    this.cashDistributionServiceType = cashDistributionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cashDistributionServiceDescription
  **/

  public String getCashDistributionServiceDescription() {
    return cashDistributionServiceDescription;
  }

  public void setCashDistributionServiceDescription(String cashDistributionServiceDescription) {
    this.cashDistributionServiceDescription = cashDistributionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cashDistributionServiceInputsandOuputs
  **/

  public String getCashDistributionServiceInputsandOuputs() {
    return cashDistributionServiceInputsandOuputs;
  }

  public void setCashDistributionServiceInputsandOuputs(String cashDistributionServiceInputsandOuputs) {
    this.cashDistributionServiceInputsandOuputs = cashDistributionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cashDistributionServiceWorkProduct
  **/

  public String getCashDistributionServiceWorkProduct() {
    return cashDistributionServiceWorkProduct;
  }

  public void setCashDistributionServiceWorkProduct(String cashDistributionServiceWorkProduct) {
    this.cashDistributionServiceWorkProduct = cashDistributionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return cashDistributionServiceName
  **/

  public String getCashDistributionServiceName() {
    return cashDistributionServiceName;
  }

  public void setCashDistributionServiceName(String cashDistributionServiceName) {
    this.cashDistributionServiceName = cashDistributionServiceName;
  }


}

