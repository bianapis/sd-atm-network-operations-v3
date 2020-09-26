package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup
 */
public class SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup   {
  private String atMNetworkOperationsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return atMNetworkOperationsServiceConfigurationParameter
  **/

  public String getAtMNetworkOperationsServiceConfigurationParameter() {
    return atMNetworkOperationsServiceConfigurationParameter;
  }

  public void setAtMNetworkOperationsServiceConfigurationParameter(String atMNetworkOperationsServiceConfigurationParameter) {
    this.atMNetworkOperationsServiceConfigurationParameter = atMNetworkOperationsServiceConfigurationParameter;
  }


}

