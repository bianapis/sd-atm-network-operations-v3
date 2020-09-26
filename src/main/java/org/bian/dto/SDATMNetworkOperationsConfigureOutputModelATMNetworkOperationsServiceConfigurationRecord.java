package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement;
import org.bian.dto.SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup;
import org.bian.dto.SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord
 */
public class SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord   {
  private String atMNetworkOperationsServiceConfigurationSettingDescription = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription atMNetworkOperationsServiceSubscription = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement atMNetworkOperationsServiceAgreement = null;

  private String atMNetworkOperationsServiceStatus = null;


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

  public SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup getAtMNetworkOperationsServiceConfigurationSetup() {
    return atMNetworkOperationsServiceConfigurationSetup;
  }

  public void setAtMNetworkOperationsServiceConfigurationSetup(SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup) {
    this.atMNetworkOperationsServiceConfigurationSetup = atMNetworkOperationsServiceConfigurationSetup;
  }


  /**
   * Get atMNetworkOperationsServiceSubscription
   * @return atMNetworkOperationsServiceSubscription
  **/

  public SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription getAtMNetworkOperationsServiceSubscription() {
    return atMNetworkOperationsServiceSubscription;
  }

  public void setAtMNetworkOperationsServiceSubscription(SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription atMNetworkOperationsServiceSubscription) {
    this.atMNetworkOperationsServiceSubscription = atMNetworkOperationsServiceSubscription;
  }


  /**
   * Get atMNetworkOperationsServiceAgreement
   * @return atMNetworkOperationsServiceAgreement
  **/

  public SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement getAtMNetworkOperationsServiceAgreement() {
    return atMNetworkOperationsServiceAgreement;
  }

  public void setAtMNetworkOperationsServiceAgreement(SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement atMNetworkOperationsServiceAgreement) {
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

