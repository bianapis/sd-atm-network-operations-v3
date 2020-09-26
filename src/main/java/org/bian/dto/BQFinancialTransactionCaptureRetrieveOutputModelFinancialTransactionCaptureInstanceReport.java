package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport
 */
public class BQFinancialTransactionCaptureRetrieveOutputModelFinancialTransactionCaptureInstanceReport   {
  private Object financialTransactionCaptureInstanceReportRecord = null;

  private String financialTransactionCaptureInstanceReportType = null;

  private String financialTransactionCaptureInstanceReportParameters = null;

  private Object financialTransactionCaptureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialTransactionCaptureInstanceReportRecord
  **/

  public Object getFinancialTransactionCaptureInstanceReportRecord() {
    return financialTransactionCaptureInstanceReportRecord;
  }

  public void setFinancialTransactionCaptureInstanceReportRecord(Object financialTransactionCaptureInstanceReportRecord) {
    this.financialTransactionCaptureInstanceReportRecord = financialTransactionCaptureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialTransactionCaptureInstanceReportType
  **/

  public String getFinancialTransactionCaptureInstanceReportType() {
    return financialTransactionCaptureInstanceReportType;
  }

  public void setFinancialTransactionCaptureInstanceReportType(String financialTransactionCaptureInstanceReportType) {
    this.financialTransactionCaptureInstanceReportType = financialTransactionCaptureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialTransactionCaptureInstanceReportParameters
  **/

  public String getFinancialTransactionCaptureInstanceReportParameters() {
    return financialTransactionCaptureInstanceReportParameters;
  }

  public void setFinancialTransactionCaptureInstanceReportParameters(String financialTransactionCaptureInstanceReportParameters) {
    this.financialTransactionCaptureInstanceReportParameters = financialTransactionCaptureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialTransactionCaptureInstanceReport
  **/

  public Object getFinancialTransactionCaptureInstanceReport() {
    return financialTransactionCaptureInstanceReport;
  }

  public void setFinancialTransactionCaptureInstanceReport(Object financialTransactionCaptureInstanceReport) {
    this.financialTransactionCaptureInstanceReport = financialTransactionCaptureInstanceReport;
  }


}

