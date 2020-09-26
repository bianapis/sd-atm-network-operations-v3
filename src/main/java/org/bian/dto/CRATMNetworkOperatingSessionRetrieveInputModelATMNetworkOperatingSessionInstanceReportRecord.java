package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord
 */
public class CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord   {
  private String atMNetworkOperatingSessionInstanceReportReference = null;

  private String atMNetworkOperatingSessionInstanceReportType = null;

  private String atMNetworkOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return atMNetworkOperatingSessionInstanceReportReference
  **/

  public String getAtMNetworkOperatingSessionInstanceReportReference() {
    return atMNetworkOperatingSessionInstanceReportReference;
  }

  public void setAtMNetworkOperatingSessionInstanceReportReference(String atMNetworkOperatingSessionInstanceReportReference) {
    this.atMNetworkOperatingSessionInstanceReportReference = atMNetworkOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return atMNetworkOperatingSessionInstanceReportParameters
  **/

  public String getAtMNetworkOperatingSessionInstanceReportParameters() {
    return atMNetworkOperatingSessionInstanceReportParameters;
  }

  public void setAtMNetworkOperatingSessionInstanceReportParameters(String atMNetworkOperatingSessionInstanceReportParameters) {
    this.atMNetworkOperatingSessionInstanceReportParameters = atMNetworkOperatingSessionInstanceReportParameters;
  }


}

