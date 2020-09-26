package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingRetrieveOutputModelFinancialDocumentHandlingInstanceAnalysis
 */
public class BQFinancialDocumentHandlingRetrieveOutputModelFinancialDocumentHandlingInstanceAnalysis   {
  private Object financialDocumentHandlingInstanceAnalysisRecord = null;

  private String financialDocumentHandlingInstanceAnalysisReportType = null;

  private String financialDocumentHandlingInstanceAnalysisParameters = null;

  private Object financialDocumentHandlingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialDocumentHandlingInstanceAnalysisRecord
  **/

  public Object getFinancialDocumentHandlingInstanceAnalysisRecord() {
    return financialDocumentHandlingInstanceAnalysisRecord;
  }

  public void setFinancialDocumentHandlingInstanceAnalysisRecord(Object financialDocumentHandlingInstanceAnalysisRecord) {
    this.financialDocumentHandlingInstanceAnalysisRecord = financialDocumentHandlingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialDocumentHandlingInstanceAnalysisReportType
  **/

  public String getFinancialDocumentHandlingInstanceAnalysisReportType() {
    return financialDocumentHandlingInstanceAnalysisReportType;
  }

  public void setFinancialDocumentHandlingInstanceAnalysisReportType(String financialDocumentHandlingInstanceAnalysisReportType) {
    this.financialDocumentHandlingInstanceAnalysisReportType = financialDocumentHandlingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialDocumentHandlingInstanceAnalysisParameters
  **/

  public String getFinancialDocumentHandlingInstanceAnalysisParameters() {
    return financialDocumentHandlingInstanceAnalysisParameters;
  }

  public void setFinancialDocumentHandlingInstanceAnalysisParameters(String financialDocumentHandlingInstanceAnalysisParameters) {
    this.financialDocumentHandlingInstanceAnalysisParameters = financialDocumentHandlingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialDocumentHandlingInstanceAnalysisReport
  **/

  public Object getFinancialDocumentHandlingInstanceAnalysisReport() {
    return financialDocumentHandlingInstanceAnalysisReport;
  }

  public void setFinancialDocumentHandlingInstanceAnalysisReport(Object financialDocumentHandlingInstanceAnalysisReport) {
    this.financialDocumentHandlingInstanceAnalysisReport = financialDocumentHandlingInstanceAnalysisReport;
  }


}

