package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceAnalysis;
import org.bian.dto.BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingRetrieveInputModel
 */
public class BQFinancialDocumentHandlingRetrieveInputModel   {
  private Object financialDocumentHandlingRetrieveActionTaskRecord = null;

  private String financialDocumentHandlingRetrieveActionRequest = null;

  private BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport financialDocumentHandlingInstanceReport = null;

  private BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceAnalysis financialDocumentHandlingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialDocumentHandlingRetrieveActionTaskRecord
  **/

  public Object getFinancialDocumentHandlingRetrieveActionTaskRecord() {
    return financialDocumentHandlingRetrieveActionTaskRecord;
  }

  public void setFinancialDocumentHandlingRetrieveActionTaskRecord(Object financialDocumentHandlingRetrieveActionTaskRecord) {
    this.financialDocumentHandlingRetrieveActionTaskRecord = financialDocumentHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialDocumentHandlingRetrieveActionRequest
  **/

  public String getFinancialDocumentHandlingRetrieveActionRequest() {
    return financialDocumentHandlingRetrieveActionRequest;
  }

  public void setFinancialDocumentHandlingRetrieveActionRequest(String financialDocumentHandlingRetrieveActionRequest) {
    this.financialDocumentHandlingRetrieveActionRequest = financialDocumentHandlingRetrieveActionRequest;
  }


  /**
   * Get financialDocumentHandlingInstanceReport
   * @return financialDocumentHandlingInstanceReport
  **/

  public BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport getFinancialDocumentHandlingInstanceReport() {
    return financialDocumentHandlingInstanceReport;
  }

  public void setFinancialDocumentHandlingInstanceReport(BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceReport financialDocumentHandlingInstanceReport) {
    this.financialDocumentHandlingInstanceReport = financialDocumentHandlingInstanceReport;
  }


  /**
   * Get financialDocumentHandlingInstanceAnalysis
   * @return financialDocumentHandlingInstanceAnalysis
  **/

  public BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceAnalysis getFinancialDocumentHandlingInstanceAnalysis() {
    return financialDocumentHandlingInstanceAnalysis;
  }

  public void setFinancialDocumentHandlingInstanceAnalysis(BQFinancialDocumentHandlingRetrieveInputModelFinancialDocumentHandlingInstanceAnalysis financialDocumentHandlingInstanceAnalysis) {
    this.financialDocumentHandlingInstanceAnalysis = financialDocumentHandlingInstanceAnalysis;
  }


}

