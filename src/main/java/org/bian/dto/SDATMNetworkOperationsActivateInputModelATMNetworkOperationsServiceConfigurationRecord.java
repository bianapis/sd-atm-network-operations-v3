package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord
 */
public class SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord   {
  private String atMNetworkOperationsServiceConfigurationSettingReference = null;

  private String atMNetworkOperationsServiceConfigurationSettingType = null;

  private SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return atMNetworkOperationsServiceConfigurationSettingReference
  **/

  public String getAtMNetworkOperationsServiceConfigurationSettingReference() {
    return atMNetworkOperationsServiceConfigurationSettingReference;
  }

  public void setAtMNetworkOperationsServiceConfigurationSettingReference(String atMNetworkOperationsServiceConfigurationSettingReference) {
    this.atMNetworkOperationsServiceConfigurationSettingReference = atMNetworkOperationsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return atMNetworkOperationsServiceConfigurationSettingType
  **/

  public String getAtMNetworkOperationsServiceConfigurationSettingType() {
    return atMNetworkOperationsServiceConfigurationSettingType;
  }

  public void setAtMNetworkOperationsServiceConfigurationSettingType(String atMNetworkOperationsServiceConfigurationSettingType) {
    this.atMNetworkOperationsServiceConfigurationSettingType = atMNetworkOperationsServiceConfigurationSettingType;
  }


  /**
   * Get atMNetworkOperationsServiceConfigurationSetup
   * @return atMNetworkOperationsServiceConfigurationSetup
  **/

  public SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup getAtMNetworkOperationsServiceConfigurationSetup() {
    return atMNetworkOperationsServiceConfigurationSetup;
  }

  public void setAtMNetworkOperationsServiceConfigurationSetup(SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup) {
    this.atMNetworkOperationsServiceConfigurationSetup = atMNetworkOperationsServiceConfigurationSetup;
  }


}

