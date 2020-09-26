package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashDistributionRetrieveOutputModelCashDistributionInstanceAnalysis
 */
public class BQCashDistributionRetrieveOutputModelCashDistributionInstanceAnalysis   {
  private Object cashDistributionInstanceAnalysisRecord = null;

  private String cashDistributionInstanceAnalysisReportType = null;

  private String cashDistributionInstanceAnalysisParameters = null;

  private Object cashDistributionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashDistributionInstanceAnalysisRecord
  **/

  public Object getCashDistributionInstanceAnalysisRecord() {
    return cashDistributionInstanceAnalysisRecord;
  }

  public void setCashDistributionInstanceAnalysisRecord(Object cashDistributionInstanceAnalysisRecord) {
    this.cashDistributionInstanceAnalysisRecord = cashDistributionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashDistributionInstanceAnalysisReportType
  **/

  public String getCashDistributionInstanceAnalysisReportType() {
    return cashDistributionInstanceAnalysisReportType;
  }

  public void setCashDistributionInstanceAnalysisReportType(String cashDistributionInstanceAnalysisReportType) {
    this.cashDistributionInstanceAnalysisReportType = cashDistributionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashDistributionInstanceAnalysisParameters
  **/

  public String getCashDistributionInstanceAnalysisParameters() {
    return cashDistributionInstanceAnalysisParameters;
  }

  public void setCashDistributionInstanceAnalysisParameters(String cashDistributionInstanceAnalysisParameters) {
    this.cashDistributionInstanceAnalysisParameters = cashDistributionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cashDistributionInstanceAnalysisReport
  **/

  public Object getCashDistributionInstanceAnalysisReport() {
    return cashDistributionInstanceAnalysisReport;
  }

  public void setCashDistributionInstanceAnalysisReport(Object cashDistributionInstanceAnalysisReport) {
    this.cashDistributionInstanceAnalysisReport = cashDistributionInstanceAnalysisReport;
  }


}

