package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup
 */
public class SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup   {
  private String atMNetworkOperationsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return atMNetworkOperationsServiceConfigurationParameter
  **/

  public String getAtMNetworkOperationsServiceConfigurationParameter() {
    return atMNetworkOperationsServiceConfigurationParameter;
  }

  public void setAtMNetworkOperationsServiceConfigurationParameter(String atMNetworkOperationsServiceConfigurationParameter) {
    this.atMNetworkOperationsServiceConfigurationParameter = atMNetworkOperationsServiceConfigurationParameter;
  }


}

