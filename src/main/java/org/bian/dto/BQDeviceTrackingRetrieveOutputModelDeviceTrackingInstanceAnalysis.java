package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceTrackingRetrieveOutputModelDeviceTrackingInstanceAnalysis
 */
public class BQDeviceTrackingRetrieveOutputModelDeviceTrackingInstanceAnalysis   {
  private Object deviceTrackingInstanceAnalysisRecord = null;

  private String deviceTrackingInstanceAnalysisReportType = null;

  private String deviceTrackingInstanceAnalysisParameters = null;

  private Object deviceTrackingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return deviceTrackingInstanceAnalysisRecord
  **/

  public Object getDeviceTrackingInstanceAnalysisRecord() {
    return deviceTrackingInstanceAnalysisRecord;
  }

  public void setDeviceTrackingInstanceAnalysisRecord(Object deviceTrackingInstanceAnalysisRecord) {
    this.deviceTrackingInstanceAnalysisRecord = deviceTrackingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return deviceTrackingInstanceAnalysisReportType
  **/

  public String getDeviceTrackingInstanceAnalysisReportType() {
    return deviceTrackingInstanceAnalysisReportType;
  }

  public void setDeviceTrackingInstanceAnalysisReportType(String deviceTrackingInstanceAnalysisReportType) {
    this.deviceTrackingInstanceAnalysisReportType = deviceTrackingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return deviceTrackingInstanceAnalysisParameters
  **/

  public String getDeviceTrackingInstanceAnalysisParameters() {
    return deviceTrackingInstanceAnalysisParameters;
  }

  public void setDeviceTrackingInstanceAnalysisParameters(String deviceTrackingInstanceAnalysisParameters) {
    this.deviceTrackingInstanceAnalysisParameters = deviceTrackingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return deviceTrackingInstanceAnalysisReport
  **/

  public Object getDeviceTrackingInstanceAnalysisReport() {
    return deviceTrackingInstanceAnalysisReport;
  }

  public void setDeviceTrackingInstanceAnalysisReport(Object deviceTrackingInstanceAnalysisReport) {
    this.deviceTrackingInstanceAnalysisReport = deviceTrackingInstanceAnalysisReport;
  }


}

