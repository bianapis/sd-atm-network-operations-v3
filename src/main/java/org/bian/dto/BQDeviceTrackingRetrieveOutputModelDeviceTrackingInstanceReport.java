package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceTrackingRetrieveOutputModelDeviceTrackingInstanceReport
 */
public class BQDeviceTrackingRetrieveOutputModelDeviceTrackingInstanceReport   {
  private Object deviceTrackingInstanceReportRecord = null;

  private String deviceTrackingInstanceReportType = null;

  private String deviceTrackingInstanceReportParameters = null;

  private Object deviceTrackingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return deviceTrackingInstanceReportRecord
  **/

  public Object getDeviceTrackingInstanceReportRecord() {
    return deviceTrackingInstanceReportRecord;
  }

  public void setDeviceTrackingInstanceReportRecord(Object deviceTrackingInstanceReportRecord) {
    this.deviceTrackingInstanceReportRecord = deviceTrackingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return deviceTrackingInstanceReportType
  **/

  public String getDeviceTrackingInstanceReportType() {
    return deviceTrackingInstanceReportType;
  }

  public void setDeviceTrackingInstanceReportType(String deviceTrackingInstanceReportType) {
    this.deviceTrackingInstanceReportType = deviceTrackingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return deviceTrackingInstanceReportParameters
  **/

  public String getDeviceTrackingInstanceReportParameters() {
    return deviceTrackingInstanceReportParameters;
  }

  public void setDeviceTrackingInstanceReportParameters(String deviceTrackingInstanceReportParameters) {
    this.deviceTrackingInstanceReportParameters = deviceTrackingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return deviceTrackingInstanceReport
  **/

  public Object getDeviceTrackingInstanceReport() {
    return deviceTrackingInstanceReport;
  }

  public void setDeviceTrackingInstanceReport(Object deviceTrackingInstanceReport) {
    this.deviceTrackingInstanceReport = deviceTrackingInstanceReport;
  }


}

