package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialDocumentHandlingRetrieveOutputModelFinancialDocumentHandlingInstanceReport
 */
public class BQFinancialDocumentHandlingRetrieveOutputModelFinancialDocumentHandlingInstanceReport   {
  private Object financialDocumentHandlingInstanceReportRecord = null;

  private String financialDocumentHandlingInstanceReportType = null;

  private String financialDocumentHandlingInstanceReportParameters = null;

  private Object financialDocumentHandlingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialDocumentHandlingInstanceReportRecord
  **/

  public Object getFinancialDocumentHandlingInstanceReportRecord() {
    return financialDocumentHandlingInstanceReportRecord;
  }

  public void setFinancialDocumentHandlingInstanceReportRecord(Object financialDocumentHandlingInstanceReportRecord) {
    this.financialDocumentHandlingInstanceReportRecord = financialDocumentHandlingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialDocumentHandlingInstanceReportType
  **/

  public String getFinancialDocumentHandlingInstanceReportType() {
    return financialDocumentHandlingInstanceReportType;
  }

  public void setFinancialDocumentHandlingInstanceReportType(String financialDocumentHandlingInstanceReportType) {
    this.financialDocumentHandlingInstanceReportType = financialDocumentHandlingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialDocumentHandlingInstanceReportParameters
  **/

  public String getFinancialDocumentHandlingInstanceReportParameters() {
    return financialDocumentHandlingInstanceReportParameters;
  }

  public void setFinancialDocumentHandlingInstanceReportParameters(String financialDocumentHandlingInstanceReportParameters) {
    this.financialDocumentHandlingInstanceReportParameters = financialDocumentHandlingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialDocumentHandlingInstanceReport
  **/

  public Object getFinancialDocumentHandlingInstanceReport() {
    return financialDocumentHandlingInstanceReport;
  }

  public void setFinancialDocumentHandlingInstanceReport(Object financialDocumentHandlingInstanceReport) {
    this.financialDocumentHandlingInstanceReport = financialDocumentHandlingInstanceReport;
  }


}

