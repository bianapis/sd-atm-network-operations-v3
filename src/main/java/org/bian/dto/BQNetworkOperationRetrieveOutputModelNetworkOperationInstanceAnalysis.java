package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis
 */
public class BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceAnalysis   {
  private Object networkOperationInstanceAnalysisRecord = null;

  private String networkOperationInstanceAnalysisReportType = null;

  private String networkOperationInstanceAnalysisParameters = null;

  private Object networkOperationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return networkOperationInstanceAnalysisRecord
  **/

  public Object getNetworkOperationInstanceAnalysisRecord() {
    return networkOperationInstanceAnalysisRecord;
  }

  public void setNetworkOperationInstanceAnalysisRecord(Object networkOperationInstanceAnalysisRecord) {
    this.networkOperationInstanceAnalysisRecord = networkOperationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return networkOperationInstanceAnalysisReportType
  **/

  public String getNetworkOperationInstanceAnalysisReportType() {
    return networkOperationInstanceAnalysisReportType;
  }

  public void setNetworkOperationInstanceAnalysisReportType(String networkOperationInstanceAnalysisReportType) {
    this.networkOperationInstanceAnalysisReportType = networkOperationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return networkOperationInstanceAnalysisParameters
  **/

  public String getNetworkOperationInstanceAnalysisParameters() {
    return networkOperationInstanceAnalysisParameters;
  }

  public void setNetworkOperationInstanceAnalysisParameters(String networkOperationInstanceAnalysisParameters) {
    this.networkOperationInstanceAnalysisParameters = networkOperationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return networkOperationInstanceAnalysisReport
  **/

  public Object getNetworkOperationInstanceAnalysisReport() {
    return networkOperationInstanceAnalysisReport;
  }

  public void setNetworkOperationInstanceAnalysisReport(Object networkOperationInstanceAnalysisReport) {
    this.networkOperationInstanceAnalysisReport = networkOperationInstanceAnalysisReport;
  }


}

