package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureExchangeOutputModel
 */
public class BQFinancialTransactionCaptureExchangeOutputModel   {
  private String networkOperationPreconditions = null;

  private String networkOperationFunctionSchedule = null;

  private String networkOperationServiceType = null;

  private String networkOperationServiceDescription = null;

  private String networkOperationServiceInputsandOuputs = null;

  private String networkOperationServiceWorkProduct = null;

  private String financialTransactionCaptureExchangeActionTaskReference = null;

  private Object financialTransactionCaptureExchangeActionTaskRecord = null;

  private String financialTransactionCaptureExchangeActionResponse = null;

  private String financialTransactionCaptureInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return networkOperationPreconditions
  **/

  public String getNetworkOperationPreconditions() {
    return networkOperationPreconditions;
  }

  public void setNetworkOperationPreconditions(String networkOperationPreconditions) {
    this.networkOperationPreconditions = networkOperationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return networkOperationFunctionSchedule
  **/

  public String getNetworkOperationFunctionSchedule() {
    return networkOperationFunctionSchedule;
  }

  public void setNetworkOperationFunctionSchedule(String networkOperationFunctionSchedule) {
    this.networkOperationFunctionSchedule = networkOperationFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return networkOperationServiceType
  **/

  public String getNetworkOperationServiceType() {
    return networkOperationServiceType;
  }

  public void setNetworkOperationServiceType(String networkOperationServiceType) {
    this.networkOperationServiceType = networkOperationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return networkOperationServiceDescription
  **/

  public String getNetworkOperationServiceDescription() {
    return networkOperationServiceDescription;
  }

  public void setNetworkOperationServiceDescription(String networkOperationServiceDescription) {
    this.networkOperationServiceDescription = networkOperationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return networkOperationServiceInputsandOuputs
  **/

  public String getNetworkOperationServiceInputsandOuputs() {
    return networkOperationServiceInputsandOuputs;
  }

  public void setNetworkOperationServiceInputsandOuputs(String networkOperationServiceInputsandOuputs) {
    this.networkOperationServiceInputsandOuputs = networkOperationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return networkOperationServiceWorkProduct
  **/

  public String getNetworkOperationServiceWorkProduct() {
    return networkOperationServiceWorkProduct;
  }

  public void setNetworkOperationServiceWorkProduct(String networkOperationServiceWorkProduct) {
    this.networkOperationServiceWorkProduct = networkOperationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Transaction Capture instance exchange service call 
   * @return financialTransactionCaptureExchangeActionTaskReference
  **/

  public String getFinancialTransactionCaptureExchangeActionTaskReference() {
    return financialTransactionCaptureExchangeActionTaskReference;
  }

  public void setFinancialTransactionCaptureExchangeActionTaskReference(String financialTransactionCaptureExchangeActionTaskReference) {
    this.financialTransactionCaptureExchangeActionTaskReference = financialTransactionCaptureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return financialTransactionCaptureExchangeActionTaskRecord
  **/

  public Object getFinancialTransactionCaptureExchangeActionTaskRecord() {
    return financialTransactionCaptureExchangeActionTaskRecord;
  }

  public void setFinancialTransactionCaptureExchangeActionTaskRecord(Object financialTransactionCaptureExchangeActionTaskRecord) {
    this.financialTransactionCaptureExchangeActionTaskRecord = financialTransactionCaptureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return financialTransactionCaptureExchangeActionResponse
  **/

  public String getFinancialTransactionCaptureExchangeActionResponse() {
    return financialTransactionCaptureExchangeActionResponse;
  }

  public void setFinancialTransactionCaptureExchangeActionResponse(String financialTransactionCaptureExchangeActionResponse) {
    this.financialTransactionCaptureExchangeActionResponse = financialTransactionCaptureExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Transaction Capture instance (e.g. accepted, rejected, verified) 
   * @return financialTransactionCaptureInstanceStatus
  **/

  public String getFinancialTransactionCaptureInstanceStatus() {
    return financialTransactionCaptureInstanceStatus;
  }

  public void setFinancialTransactionCaptureInstanceStatus(String financialTransactionCaptureInstanceStatus) {
    this.financialTransactionCaptureInstanceStatus = financialTransactionCaptureInstanceStatus;
  }


}

