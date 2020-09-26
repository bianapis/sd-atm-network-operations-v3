package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashDistributionRetrieveInputModelCashDistributionInstanceAnalysis;
import org.bian.dto.BQCashDistributionRetrieveInputModelCashDistributionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashDistributionRetrieveInputModel
 */
public class BQCashDistributionRetrieveInputModel   {
  private Object cashDistributionRetrieveActionTaskRecord = null;

  private String cashDistributionRetrieveActionRequest = null;

  private BQCashDistributionRetrieveInputModelCashDistributionInstanceReport cashDistributionInstanceReport = null;

  private BQCashDistributionRetrieveInputModelCashDistributionInstanceAnalysis cashDistributionInstanceAnalysis = null;

  private String financialTransactionCapturePreconditions = null;

  private String financialTransactionCaptureFunctionSchedule = null;

  private String businessService = null;

  private String serviceType = null;

  private String serviceDescription = null;

  private String serviceInputsandOuputs = null;

  private String serviceWorkProduct = null;

  private String serviceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashDistributionRetrieveActionTaskRecord
  **/

  public Object getCashDistributionRetrieveActionTaskRecord() {
    return cashDistributionRetrieveActionTaskRecord;
  }

  public void setCashDistributionRetrieveActionTaskRecord(Object cashDistributionRetrieveActionTaskRecord) {
    this.cashDistributionRetrieveActionTaskRecord = cashDistributionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashDistributionRetrieveActionRequest
  **/

  public String getCashDistributionRetrieveActionRequest() {
    return cashDistributionRetrieveActionRequest;
  }

  public void setCashDistributionRetrieveActionRequest(String cashDistributionRetrieveActionRequest) {
    this.cashDistributionRetrieveActionRequest = cashDistributionRetrieveActionRequest;
  }


  /**
   * Get cashDistributionInstanceReport
   * @return cashDistributionInstanceReport
  **/

  public BQCashDistributionRetrieveInputModelCashDistributionInstanceReport getCashDistributionInstanceReport() {
    return cashDistributionInstanceReport;
  }

  public void setCashDistributionInstanceReport(BQCashDistributionRetrieveInputModelCashDistributionInstanceReport cashDistributionInstanceReport) {
    this.cashDistributionInstanceReport = cashDistributionInstanceReport;
  }


  /**
   * Get cashDistributionInstanceAnalysis
   * @return cashDistributionInstanceAnalysis
  **/

  public BQCashDistributionRetrieveInputModelCashDistributionInstanceAnalysis getCashDistributionInstanceAnalysis() {
    return cashDistributionInstanceAnalysis;
  }

  public void setCashDistributionInstanceAnalysis(BQCashDistributionRetrieveInputModelCashDistributionInstanceAnalysis cashDistributionInstanceAnalysis) {
    this.cashDistributionInstanceAnalysis = cashDistributionInstanceAnalysis;
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

