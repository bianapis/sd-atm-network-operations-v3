package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines
 */
public class SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines   {
  private String atMNetworkOperationsServiceEligibility = null;

  private String atMNetworkOperationsServiceIntendedUses = null;

  private String atMNetworkOperationsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return atMNetworkOperationsServiceEligibility
  **/

  public String getAtMNetworkOperationsServiceEligibility() {
    return atMNetworkOperationsServiceEligibility;
  }

  public void setAtMNetworkOperationsServiceEligibility(String atMNetworkOperationsServiceEligibility) {
    this.atMNetworkOperationsServiceEligibility = atMNetworkOperationsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return atMNetworkOperationsServiceIntendedUses
  **/

  public String getAtMNetworkOperationsServiceIntendedUses() {
    return atMNetworkOperationsServiceIntendedUses;
  }

  public void setAtMNetworkOperationsServiceIntendedUses(String atMNetworkOperationsServiceIntendedUses) {
    this.atMNetworkOperationsServiceIntendedUses = atMNetworkOperationsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return atMNetworkOperationsServicePricingandTerms
  **/

  public String getAtMNetworkOperationsServicePricingandTerms() {
    return atMNetworkOperationsServicePricingandTerms;
  }

  public void setAtMNetworkOperationsServicePricingandTerms(String atMNetworkOperationsServicePricingandTerms) {
    this.atMNetworkOperationsServicePricingandTerms = atMNetworkOperationsServicePricingandTerms;
  }


}

