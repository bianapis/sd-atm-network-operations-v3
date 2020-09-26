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
 * SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord
 */
public class SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord   {
  private String atMNetworkOperationsServiceConfigurationSettingReference = null;

  private String atMNetworkOperationsServiceConfigurationSettingType = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceConfigurationSetup atMNetworkOperationsServiceConfigurationSetup = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceSubscription atMNetworkOperationsServiceSubscription = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement atMNetworkOperationsServiceAgreement = null;


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


}

