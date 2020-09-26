package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis;
import org.bian.dto.BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationRetrieveOutputModel
 */
public class BQNetworkOperationRetrieveOutputModel   {
  private String networkOperationRetrieveActionTaskReference = null;

  private Object networkOperationRetrieveActionTaskRecord = null;

  private String networkOperationRetrieveActionResponse = null;

  private BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport networkOperationInstanceReport = null;

  private BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis networkOperationInstanceAnalysis = null;

  private String financialTransactionCapturePreconditions = null;

  private String financialTransactionCaptureFunctionSchedule = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String serviceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Network Operation instance retrieve service call 
   * @return networkOperationRetrieveActionTaskReference
  **/

  public String getNetworkOperationRetrieveActionTaskReference() {
    return networkOperationRetrieveActionTaskReference;
  }

  public void setNetworkOperationRetrieveActionTaskReference(String networkOperationRetrieveActionTaskReference) {
    this.networkOperationRetrieveActionTaskReference = networkOperationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return networkOperationRetrieveActionTaskRecord
  **/

  public Object getNetworkOperationRetrieveActionTaskRecord() {
    return networkOperationRetrieveActionTaskRecord;
  }

  public void setNetworkOperationRetrieveActionTaskRecord(Object networkOperationRetrieveActionTaskRecord) {
    this.networkOperationRetrieveActionTaskRecord = networkOperationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return networkOperationRetrieveActionResponse
  **/

  public String getNetworkOperationRetrieveActionResponse() {
    return networkOperationRetrieveActionResponse;
  }

  public void setNetworkOperationRetrieveActionResponse(String networkOperationRetrieveActionResponse) {
    this.networkOperationRetrieveActionResponse = networkOperationRetrieveActionResponse;
  }


  /**
   * Get networkOperationInstanceReport
   * @return networkOperationInstanceReport
  **/

  public BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport getNetworkOperationInstanceReport() {
    return networkOperationInstanceReport;
  }

  public void setNetworkOperationInstanceReport(BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport networkOperationInstanceReport) {
    this.networkOperationInstanceReport = networkOperationInstanceReport;
  }


  /**
   * Get networkOperationInstanceAnalysis
   * @return networkOperationInstanceAnalysis
  **/

  public BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis getNetworkOperationInstanceAnalysis() {
    return networkOperationInstanceAnalysis;
  }

  public void setNetworkOperationInstanceAnalysis(BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis networkOperationInstanceAnalysis) {
    this.networkOperationInstanceAnalysis = networkOperationInstanceAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return financialTransactionCapturePreconditions
  **/

  public String getFinancialTransactionCapturePreconditions() {
    return financialTransactionCapturePreconditions;
  }

  public void setFinancialTransactionCapturePreconditions(String financialTransactionCapturePreconditions) {
    this.financialTransactionCapturePreconditions = financialTransactionCapturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return financialTransactionCaptureFunctionSchedule
  **/

  public String getFinancialTransactionCaptureFunctionSchedule() {
    return financialTransactionCaptureFunctionSchedule;
  }

  public void setFinancialTransactionCaptureFunctionSchedule(String financialTransactionCaptureFunctionSchedule) {
    this.financialTransactionCaptureFunctionSchedule = financialTransactionCaptureFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ATMNetwork Operating Session specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceType
  **/

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceDescription
  **/

  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceInputsandOuputs
  **/

  public String getServiceInputsandOuputs() {
    return serviceInputsandOuputs;
  }

  public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
    this.serviceInputsandOuputs = serviceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceWorkProduct
  **/

  public String getServiceWorkProduct() {
    return serviceWorkProduct;
  }

  public void setServiceWorkProduct(String serviceWorkProduct) {
    this.serviceWorkProduct = serviceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return serviceName
  **/

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


}

