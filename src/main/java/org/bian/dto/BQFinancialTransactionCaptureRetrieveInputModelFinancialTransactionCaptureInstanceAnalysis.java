package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis
 */
public class BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis   {
  private String financialTransactionCaptureInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialTransactionCaptureInstanceAnalysisReference
  **/

  public String getFinancialTransactionCaptureInstanceAnalysisReference() {
    return financialTransactionCaptureInstanceAnalysisReference;
  }

  public void setFinancialTransactionCaptureInstanceAnalysisReference(String financialTransactionCaptureInstanceAnalysisReference) {
    this.financialTransactionCaptureInstanceAnalysisReference = financialTransactionCaptureInstanceAnalysisReference;
  }


}

