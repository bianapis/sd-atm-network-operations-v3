package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureRetrieveInputModel
 */
public class BQFinancialTransactionCaptureRetrieveInputModel   {
  private Object financialTransactionCaptureRetrieveActionTaskRecord = null;

  private String financialTransactionCaptureRetrieveActionRequest = null;

  private BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceReport financialTransactionCaptureInstanceReport = null;

  private BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis financialTransactionCaptureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialTransactionCaptureRetrieveActionRequest
  **/

  public String getFinancialTransactionCaptureRetrieveActionRequest() {
    return financialTransactionCaptureRetrieveActionRequest;
  }

  public void setFinancialTransactionCaptureRetrieveActionRequest(String financialTransactionCaptureRetrieveActionRequest) {
    this.financialTransactionCaptureRetrieveActionRequest = financialTransactionCaptureRetrieveActionRequest;
  }


  /**
   * Get financialTransactionCaptureInstanceReport
   * @return financialTransactionCaptureInstanceReport
  **/

  public BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceReport getFinancialTransactionCaptureInstanceReport() {
    return financialTransactionCaptureInstanceReport;
  }

  public void setFinancialTransactionCaptureInstanceReport(BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceReport financialTransactionCaptureInstanceReport) {
    this.financialTransactionCaptureInstanceReport = financialTransactionCaptureInstanceReport;
  }


  /**
   * Get financialTransactionCaptureInstanceAnalysis
   * @return financialTransactionCaptureInstanceAnalysis
  **/

  public BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis getFinancialTransactionCaptureInstanceAnalysis() {
    return financialTransactionCaptureInstanceAnalysis;
  }

  public void setFinancialTransactionCaptureInstanceAnalysis(BQFinancialTransactionCaptureRetrieveInputModelFinancialTransactionCaptureInstanceAnalysis financialTransactionCaptureInstanceAnalysis) {
    this.financialTransactionCaptureInstanceAnalysis = financialTransactionCaptureInstanceAnalysis;
  }


}

