package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis
 */
public class CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis   {
  private String atMNetworkOperatingSessionInstanceAnalysisReference = null;

  private String atMNetworkOperatingSessionInstanceAnalysisReportType = null;

  private String atMNetworkOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return atMNetworkOperatingSessionInstanceAnalysisReference
  **/

  public String getAtMNetworkOperatingSessionInstanceAnalysisReference() {
    return atMNetworkOperatingSessionInstanceAnalysisReference;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysisReference(String atMNetworkOperatingSessionInstanceAnalysisReference) {
    this.atMNetworkOperatingSessionInstanceAnalysisReference = atMNetworkOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return atMNetworkOperatingSessionInstanceAnalysisParameters
  **/

  public String getAtMNetworkOperatingSessionInstanceAnalysisParameters() {
    return atMNetworkOperatingSessionInstanceAnalysisParameters;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysisParameters(String atMNetworkOperatingSessionInstanceAnalysisParameters) {
    this.atMNetworkOperatingSessionInstanceAnalysisParameters = atMNetworkOperatingSessionInstanceAnalysisParameters;
  }


}

