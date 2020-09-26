package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationRetrieveInputModelNetworkOperationInstanceReport
 */
public class BQNetworkOperationRetrieveInputModelNetworkOperationInstanceReport   {
  private String networkOperationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return networkOperationInstanceReportReference
  **/

  public String getNetworkOperationInstanceReportReference() {
    return networkOperationInstanceReportReference;
  }

  public void setNetworkOperationInstanceReportReference(String networkOperationInstanceReportReference) {
    this.networkOperationInstanceReportReference = networkOperationInstanceReportReference;
  }


}

