package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureInitiateInputModel
 */
public class BQFinancialTransactionCaptureInitiateInputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private Object financialTransactionCaptureInitiateActionRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialTransactionCaptureInitiateActionRecord
  **/

  public Object getFinancialTransactionCaptureInitiateActionRecord() {
    return financialTransactionCaptureInitiateActionRecord;
  }

  public void setFinancialTransactionCaptureInitiateActionRecord(Object financialTransactionCaptureInitiateActionRecord) {
    this.financialTransactionCaptureInitiateActionRecord = financialTransactionCaptureInitiateActionRecord;
  }


}

