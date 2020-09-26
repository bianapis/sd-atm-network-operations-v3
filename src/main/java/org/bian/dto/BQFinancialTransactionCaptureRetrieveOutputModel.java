package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureRetrieveOutputModel
 */
public class BQFinancialTransactionCaptureRetrieveOutputModel   {
  private String networkOperationPreconditions = null;

  private String networkOperationFunctionSchedule = null;

  private String networkOperationServiceType = null;

  private String networkOperationServiceDescription = null;

  private String networkOperationServiceInputsandOuputs = null;

  private String networkOperationServiceWorkProduct = null;

  private String financialTransactionCaptureRetrieveActionTaskReference = null;

  private Object financialTransactionCaptureRetrieveActionTaskRecord = null;

  private String financialTransactionCaptureRetrieveActionResponse = null;

  private BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport financialTransactionCaptureInstanceReport = null;

  private BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis financialTransactionCaptureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Transaction Capture instance retrieve service call 
   * @return financialTransactionCaptureRetrieveActionTaskReference
  **/

  public String getFinancialTransactionCaptureRetrieveActionTaskReference() {
    return financialTransactionCaptureRetrieveActionTaskReference;
  }

  public void setFinancialTransactionCaptureRetrieveActionTaskReference(String financialTransactionCaptureRetrieveActionTaskReference) {
    this.financialTransactionCaptureRetrieveActionTaskReference = financialTransactionCaptureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialTransactionCaptureRetrieveActionTaskRecord
  **/

  public Object getFinancialTransactionCaptureRetrieveActionTaskRecord() {
    return financialTransactionCaptureRetrieveActionTaskRecord;
  }

  public void setFinancialTransactionCaptureRetrieveActionTaskRecord(Object financialTransactionCaptureRetrieveActionTaskRecord) {
    this.financialTransactionCaptureRetrieveActionTaskRecord = financialTransactionCaptureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialTransactionCaptureRetrieveActionResponse
  **/

  public String getFinancialTransactionCaptureRetrieveActionResponse() {
    return financialTransactionCaptureRetrieveActionResponse;
  }

  public void setFinancialTransactionCaptureRetrieveActionResponse(String financialTransactionCaptureRetrieveActionResponse) {
    this.financialTransactionCaptureRetrieveActionResponse = financialTransactionCaptureRetrieveActionResponse;
  }


  /**
   * Get financialTransactionCaptureInstanceReport
   * @return financialTransactionCaptureInstanceReport
  **/

  public BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport getFinancialTransactionCaptureInstanceReport() {
    return financialTransactionCaptureInstanceReport;
  }

  public void setFinancialTransactionCaptureInstanceReport(BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport financialTransactionCaptureInstanceReport) {
    this.financialTransactionCaptureInstanceReport = financialTransactionCaptureInstanceReport;
  }


  /**
   * Get financialTransactionCaptureInstanceAnalysis
   * @return financialTransactionCaptureInstanceAnalysis
  **/

  public BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis getFinancialTransactionCaptureInstanceAnalysis() {
    return financialTransactionCaptureInstanceAnalysis;
  }

  public void setFinancialTransactionCaptureInstanceAnalysis(BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis financialTransactionCaptureInstanceAnalysis) {
    this.financialTransactionCaptureInstanceAnalysis = financialTransactionCaptureInstanceAnalysis;
  }


}

