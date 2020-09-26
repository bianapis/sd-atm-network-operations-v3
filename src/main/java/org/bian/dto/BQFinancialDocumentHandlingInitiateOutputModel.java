package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingInitiateOutputModel
 */
public class BQFinancialDocumentHandlingInitiateOutputModel   {
  private String financialDocumentHandlingInstanceReference = null;

  private String financialDocumentHandlingInitiateActionReference = null;

  private Object financialDocumentHandlingInitiateActionRecord = null;

  private String financialDocumentHandlingInstanceStatus = null;

  private String financialDocumentHandlingPreconditions = null;

  private String financialDocumentHandlingFunctionSchedule = null;

  private String documentGenerationandHandling = null;

  private String documentGenerationandHandlingServiceType = null;

  private String documentGenerationandHandlingServiceDescription = null;

  private String documentGenerationandHandlingServiceInputsandOuputs = null;

  private String documentGenerationandHandlingServiceWorkProduct = null;

  private String documentGenerationandHandlingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Document Handling instance 
   * @return financialDocumentHandlingInstanceReference
  **/

  public String getFinancialDocumentHandlingInstanceReference() {
    return financialDocumentHandlingInstanceReference;
  }

  public void setFinancialDocumentHandlingInstanceReference(String financialDocumentHandlingInstanceReference) {
    this.financialDocumentHandlingInstanceReference = financialDocumentHandlingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialDocumentHandlingInitiateActionReference
  **/

  public String getFinancialDocumentHandlingInitiateActionReference() {
    return financialDocumentHandlingInitiateActionReference;
  }

  public void setFinancialDocumentHandlingInitiateActionReference(String financialDocumentHandlingInitiateActionReference) {
    this.financialDocumentHandlingInitiateActionReference = financialDocumentHandlingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialDocumentHandlingInitiateActionRecord
  **/

  public Object getFinancialDocumentHandlingInitiateActionRecord() {
    return financialDocumentHandlingInitiateActionRecord;
  }

  public void setFinancialDocumentHandlingInitiateActionRecord(Object financialDocumentHandlingInitiateActionRecord) {
    this.financialDocumentHandlingInitiateActionRecord = financialDocumentHandlingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Document Handling instance (e.g. initialised, pending, active) 
   * @return financialDocumentHandlingInstanceStatus
  **/

  public String getFinancialDocumentHandlingInstanceStatus() {
    return financialDocumentHandlingInstanceStatus;
  }

  public void setFinancialDocumentHandlingInstanceStatus(String financialDocumentHandlingInstanceStatus) {
    this.financialDocumentHandlingInstanceStatus = financialDocumentHandlingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return financialDocumentHandlingPreconditions
  **/

  public String getFinancialDocumentHandlingPreconditions() {
    return financialDocumentHandlingPreconditions;
  }

  public void setFinancialDocumentHandlingPreconditions(String financialDocumentHandlingPreconditions) {
    this.financialDocumentHandlingPreconditions = financialDocumentHandlingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return financialDocumentHandlingFunctionSchedule
  **/

  public String getFinancialDocumentHandlingFunctionSchedule() {
    return financialDocumentHandlingFunctionSchedule;
  }

  public void setFinancialDocumentHandlingFunctionSchedule(String financialDocumentHandlingFunctionSchedule) {
    this.financialDocumentHandlingFunctionSchedule = financialDocumentHandlingFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ATMNetwork Operating Session specific Business Service 
   * @return documentGenerationandHandling
  **/

  public String getDocumentGenerationandHandling() {
    return documentGenerationandHandling;
  }

  public void setDocumentGenerationandHandling(String documentGenerationandHandling) {
    this.documentGenerationandHandling = documentGenerationandHandling;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return documentGenerationandHandlingServiceType
  **/

  public String getDocumentGenerationandHandlingServiceType() {
    return documentGenerationandHandlingServiceType;
  }

  public void setDocumentGenerationandHandlingServiceType(String documentGenerationandHandlingServiceType) {
    this.documentGenerationandHandlingServiceType = documentGenerationandHandlingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return documentGenerationandHandlingServiceDescription
  **/

  public String getDocumentGenerationandHandlingServiceDescription() {
    return documentGenerationandHandlingServiceDescription;
  }

  public void setDocumentGenerationandHandlingServiceDescription(String documentGenerationandHandlingServiceDescription) {
    this.documentGenerationandHandlingServiceDescription = documentGenerationandHandlingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return documentGenerationandHandlingServiceInputsandOuputs
  **/

  public String getDocumentGenerationandHandlingServiceInputsandOuputs() {
    return documentGenerationandHandlingServiceInputsandOuputs;
  }

  public void setDocumentGenerationandHandlingServiceInputsandOuputs(String documentGenerationandHandlingServiceInputsandOuputs) {
    this.documentGenerationandHandlingServiceInputsandOuputs = documentGenerationandHandlingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return documentGenerationandHandlingServiceWorkProduct
  **/

  public String getDocumentGenerationandHandlingServiceWorkProduct() {
    return documentGenerationandHandlingServiceWorkProduct;
  }

  public void setDocumentGenerationandHandlingServiceWorkProduct(String documentGenerationandHandlingServiceWorkProduct) {
    this.documentGenerationandHandlingServiceWorkProduct = documentGenerationandHandlingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return documentGenerationandHandlingServiceName
  **/

  public String getDocumentGenerationandHandlingServiceName() {
    return documentGenerationandHandlingServiceName;
  }

  public void setDocumentGenerationandHandlingServiceName(String documentGenerationandHandlingServiceName) {
    this.documentGenerationandHandlingServiceName = documentGenerationandHandlingServiceName;
  }


}

