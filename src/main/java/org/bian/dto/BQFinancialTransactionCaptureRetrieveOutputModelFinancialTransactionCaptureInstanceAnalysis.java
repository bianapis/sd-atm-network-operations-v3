package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis
 */
public class BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceAnalysis   {
  private Object financialTransactionCaptureInstanceAnalysisRecord = null;

  private String financialTransactionCaptureInstanceAnalysisReportType = null;

  private String financialTransactionCaptureInstanceAnalysisParameters = null;

  private Object financialTransactionCaptureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialTransactionCaptureInstanceAnalysisRecord
  **/

  public Object getFinancialTransactionCaptureInstanceAnalysisRecord() {
    return financialTransactionCaptureInstanceAnalysisRecord;
  }

  public void setFinancialTransactionCaptureInstanceAnalysisRecord(Object financialTransactionCaptureInstanceAnalysisRecord) {
    this.financialTransactionCaptureInstanceAnalysisRecord = financialTransactionCaptureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialTransactionCaptureInstanceAnalysisReportType
  **/

  public String getFinancialTransactionCaptureInstanceAnalysisReportType() {
    return financialTransactionCaptureInstanceAnalysisReportType;
  }

  public void setFinancialTransactionCaptureInstanceAnalysisReportType(String financialTransactionCaptureInstanceAnalysisReportType) {
    this.financialTransactionCaptureInstanceAnalysisReportType = financialTransactionCaptureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialTransactionCaptureInstanceAnalysisParameters
  **/

  public String getFinancialTransactionCaptureInstanceAnalysisParameters() {
    return financialTransactionCaptureInstanceAnalysisParameters;
  }

  public void setFinancialTransactionCaptureInstanceAnalysisParameters(String financialTransactionCaptureInstanceAnalysisParameters) {
    this.financialTransactionCaptureInstanceAnalysisParameters = financialTransactionCaptureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialTransactionCaptureInstanceAnalysisReport
  **/

  public Object getFinancialTransactionCaptureInstanceAnalysisReport() {
    return financialTransactionCaptureInstanceAnalysisReport;
  }

  public void setFinancialTransactionCaptureInstanceAnalysisReport(Object financialTransactionCaptureInstanceAnalysisReport) {
    this.financialTransactionCaptureInstanceAnalysisReport = financialTransactionCaptureInstanceAnalysisReport;
  }


}

