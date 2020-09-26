package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement
 */
public class SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecordATMNetworkOperationsServiceAgreement   {
  private String atMNetworkOperationsServiceAgreementReference = null;

  private String atMNetworkOperationsServiceUserReference = null;

  private String atMNetworkOperationsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return atMNetworkOperationsServiceAgreementReference
  **/

  public String getAtMNetworkOperationsServiceAgreementReference() {
    return atMNetworkOperationsServiceAgreementReference;
  }

  public void setAtMNetworkOperationsServiceAgreementReference(String atMNetworkOperationsServiceAgreementReference) {
    this.atMNetworkOperationsServiceAgreementReference = atMNetworkOperationsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return atMNetworkOperationsServiceUserReference
  **/

  public String getAtMNetworkOperationsServiceUserReference() {
    return atMNetworkOperationsServiceUserReference;
  }

  public void setAtMNetworkOperationsServiceUserReference(String atMNetworkOperationsServiceUserReference) {
    this.atMNetworkOperationsServiceUserReference = atMNetworkOperationsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return atMNetworkOperationsServiceAgreementTermsandConditions
  **/

  public String getAtMNetworkOperationsServiceAgreementTermsandConditions() {
    return atMNetworkOperationsServiceAgreementTermsandConditions;
  }

  public void setAtMNetworkOperationsServiceAgreementTermsandConditions(String atMNetworkOperationsServiceAgreementTermsandConditions) {
    this.atMNetworkOperationsServiceAgreementTermsandConditions = atMNetworkOperationsServiceAgreementTermsandConditions;
  }


}

