package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingUpdateInputModel
 */
public class BQFinancialDocumentHandlingUpdateInputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private String financialDocumentHandlingInstanceReference = null;

  private String financialDocumentHandlingPreconditions = null;

  private String financialDocumentHandlingFunctionSchedule = null;

  private String documentGenerationandHandling = null;

  private String documentGenerationandHandlingServiceType = null;

  private String documentGenerationandHandlingServiceDescription = null;

  private String documentGenerationandHandlingServiceInputsandOuputs = null;

  private String documentGenerationandHandlingServiceWorkProduct = null;

  private String documentGenerationandHandlingServiceName = null;

  private Object financialDocumentHandlingUpdateActionTaskRecord = null;

  private String financialDocumentHandlingUpdateActionRequest = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialDocumentHandlingUpdateActionTaskRecord
  **/

  public Object getFinancialDocumentHandlingUpdateActionTaskRecord() {
    return financialDocumentHandlingUpdateActionTaskRecord;
  }

  public void setFinancialDocumentHandlingUpdateActionTaskRecord(Object financialDocumentHandlingUpdateActionTaskRecord) {
    this.financialDocumentHandlingUpdateActionTaskRecord = financialDocumentHandlingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return financialDocumentHandlingUpdateActionRequest
  **/

  public String getFinancialDocumentHandlingUpdateActionRequest() {
    return financialDocumentHandlingUpdateActionRequest;
  }

  public void setFinancialDocumentHandlingUpdateActionRequest(String financialDocumentHandlingUpdateActionRequest) {
    this.financialDocumentHandlingUpdateActionRequest = financialDocumentHandlingUpdateActionRequest;
  }


}

