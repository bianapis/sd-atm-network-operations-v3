package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport
 */
public class BQNetworkOperationRetrieveOutputModelNetworkOperationInstanceReport   {
  private Object networkOperationInstanceReportRecord = null;

  private String networkOperationInstanceReportType = null;

  private String networkOperationInstanceReportParameters = null;

  private Object networkOperationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return networkOperationInstanceReportRecord
  **/

  public Object getNetworkOperationInstanceReportRecord() {
    return networkOperationInstanceReportRecord;
  }

  public void setNetworkOperationInstanceReportRecord(Object networkOperationInstanceReportRecord) {
    this.networkOperationInstanceReportRecord = networkOperationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return networkOperationInstanceReportType
  **/

  public String getNetworkOperationInstanceReportType() {
    return networkOperationInstanceReportType;
  }

  public void setNetworkOperationInstanceReportType(String networkOperationInstanceReportType) {
    this.networkOperationInstanceReportType = networkOperationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return networkOperationInstanceReportParameters
  **/

  public String getNetworkOperationInstanceReportParameters() {
    return networkOperationInstanceReportParameters;
  }

  public void setNetworkOperationInstanceReportParameters(String networkOperationInstanceReportParameters) {
    this.networkOperationInstanceReportParameters = networkOperationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return networkOperationInstanceReport
  **/

  public Object getNetworkOperationInstanceReport() {
    return networkOperationInstanceReport;
  }

  public void setNetworkOperationInstanceReport(Object networkOperationInstanceReport) {
    this.networkOperationInstanceReport = networkOperationInstanceReport;
  }


}

