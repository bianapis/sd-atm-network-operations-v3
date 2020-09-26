package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup;
import org.bian.dto.SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement;
import org.bian.dto.SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord
 */
public class SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord   {
  private String atMNetworkOperationsServiceConfigurationSettingReference = null;

  private String atMNetworkOperationsServiceConfigurationSettingDescription = null;

  private SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup = null;

  private SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription atMNetworkOperationsServiceSubscription = null;

  private SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement atMNetworkOperationsServiceAgreement = null;

  private String atMNetworkOperationsServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return atMNetworkOperationsServiceConfigurationSettingDescription
  **/

  public String getAtMNetworkOperationsServiceConfigurationSettingDescription() {
    return atMNetworkOperationsServiceConfigurationSettingDescription;
  }

  public void setAtMNetworkOperationsServiceConfigurationSettingDescription(String atMNetworkOperationsServiceConfigurationSettingDescription) {
    this.atMNetworkOperationsServiceConfigurationSettingDescription = atMNetworkOperationsServiceConfigurationSettingDescription;
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


  /**
   * Get atMNetworkOperationsServiceSubscription
   * @return atMNetworkOperationsServiceSubscription
  **/

  public SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription getAtMNetworkOperationsServiceSubscription() {
    return atMNetworkOperationsServiceSubscription;
  }

  public void setAtMNetworkOperationsServiceSubscription(SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription atMNetworkOperationsServiceSubscription) {
    this.atMNetworkOperationsServiceSubscription = atMNetworkOperationsServiceSubscription;
  }


  /**
   * Get atMNetworkOperationsServiceAgreement
   * @return atMNetworkOperationsServiceAgreement
  **/

  public SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement getAtMNetworkOperationsServiceAgreement() {
    return atMNetworkOperationsServiceAgreement;
  }

  public void setAtMNetworkOperationsServiceAgreement(SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement atMNetworkOperationsServiceAgreement) {
    this.atMNetworkOperationsServiceAgreement = atMNetworkOperationsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return atMNetworkOperationsServiceStatus
  **/

  public String getAtMNetworkOperationsServiceStatus() {
    return atMNetworkOperationsServiceStatus;
  }

  public void setAtMNetworkOperationsServiceStatus(String atMNetworkOperationsServiceStatus) {
    this.atMNetworkOperationsServiceStatus = atMNetworkOperationsServiceStatus;
  }


}

