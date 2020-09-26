package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord
 */
public class CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord   {
  private String atMNetworkOperatingSessionInstanceReportData = null;

  private String atMNetworkOperatingSessionInstanceReportType = null;

  private Object atMNetworkOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return atMNetworkOperatingSessionInstanceReportData
  **/

  public String getAtMNetworkOperatingSessionInstanceReportData() {
    return atMNetworkOperatingSessionInstanceReportData;
  }

  public void setAtMNetworkOperatingSessionInstanceReportData(String atMNetworkOperatingSessionInstanceReportData) {
    this.atMNetworkOperatingSessionInstanceReportData = atMNetworkOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return atMNetworkOperatingSessionInstanceReportType
  **/

  public String getAtMNetworkOperatingSessionInstanceReportType() {
    return atMNetworkOperatingSessionInstanceReportType;
  }

  public void setAtMNetworkOperatingSessionInstanceReportType(String atMNetworkOperatingSessionInstanceReportType) {
    this.atMNetworkOperatingSessionInstanceReportType = atMNetworkOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return atMNetworkOperatingSessionInstanceReport
  **/

  public Object getAtMNetworkOperatingSessionInstanceReport() {
    return atMNetworkOperatingSessionInstanceReport;
  }

  public void setAtMNetworkOperatingSessionInstanceReport(Object atMNetworkOperatingSessionInstanceReport) {
    this.atMNetworkOperatingSessionInstanceReport = atMNetworkOperatingSessionInstanceReport;
  }


}

