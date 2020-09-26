package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport
 */
public class BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport   {
  private String financialDocumentHandlingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialDocumentHandlingInstanceReportReference
  **/

  public String getFinancialDocumentHandlingInstanceReportReference() {
    return financialDocumentHandlingInstanceReportReference;
  }

  public void setFinancialDocumentHandlingInstanceReportReference(String financialDocumentHandlingInstanceReportReference) {
    this.financialDocumentHandlingInstanceReportReference = financialDocumentHandlingInstanceReportReference;
  }


}

