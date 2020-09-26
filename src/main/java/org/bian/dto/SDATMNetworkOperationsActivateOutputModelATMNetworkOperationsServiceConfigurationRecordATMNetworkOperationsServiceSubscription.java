package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription
 */
public class SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription   {
  private String atMNetworkOperationsServiceSubscriberReference = null;

  private String atMNetworkOperationsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return atMNetworkOperationsServiceSubscriberReference
  **/

  public String getAtMNetworkOperationsServiceSubscriberReference() {
    return atMNetworkOperationsServiceSubscriberReference;
  }

  public void setAtMNetworkOperationsServiceSubscriberReference(String atMNetworkOperationsServiceSubscriberReference) {
    this.atMNetworkOperationsServiceSubscriberReference = atMNetworkOperationsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return atMNetworkOperationsServiceSubscriberAccessProfile
  **/

  public String getAtMNetworkOperationsServiceSubscriberAccessProfile() {
    return atMNetworkOperationsServiceSubscriberAccessProfile;
  }

  public void setAtMNetworkOperationsServiceSubscriberAccessProfile(String atMNetworkOperationsServiceSubscriberAccessProfile) {
    this.atMNetworkOperationsServiceSubscriberAccessProfile = atMNetworkOperationsServiceSubscriberAccessProfile;
  }


}

