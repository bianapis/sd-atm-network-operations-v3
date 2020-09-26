package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis
 */
public class CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis   {
  private String atMNetworkOperatingSessionInstanceAnalysisData = null;

  private String atMNetworkOperatingSessionInstanceAnalysisReportType = null;

  private Object atMNetworkOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return atMNetworkOperatingSessionInstanceAnalysisData
  **/

  public String getAtMNetworkOperatingSessionInstanceAnalysisData() {
    return atMNetworkOperatingSessionInstanceAnalysisData;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysisData(String atMNetworkOperatingSessionInstanceAnalysisData) {
    this.atMNetworkOperatingSessionInstanceAnalysisData = atMNetworkOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return atMNetworkOperatingSessionInstanceAnalysisReportType
  **/

  public String getAtMNetworkOperatingSessionInstanceAnalysisReportType() {
    return atMNetworkOperatingSessionInstanceAnalysisReportType;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysisReportType(String atMNetworkOperatingSessionInstanceAnalysisReportType) {
    this.atMNetworkOperatingSessionInstanceAnalysisReportType = atMNetworkOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return atMNetworkOperatingSessionInstanceAnalysisReport
  **/

  public Object getAtMNetworkOperatingSessionInstanceAnalysisReport() {
    return atMNetworkOperatingSessionInstanceAnalysisReport;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysisReport(Object atMNetworkOperatingSessionInstanceAnalysisReport) {
    this.atMNetworkOperatingSessionInstanceAnalysisReport = atMNetworkOperatingSessionInstanceAnalysisReport;
  }


}

