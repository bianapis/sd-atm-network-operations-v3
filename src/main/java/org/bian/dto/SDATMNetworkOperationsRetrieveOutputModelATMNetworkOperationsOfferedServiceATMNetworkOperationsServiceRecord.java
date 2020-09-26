package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord
 */
public class SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord   {
  private String atMNetworkOperationsServiceType = null;

  private String atMNetworkOperationsServiceVersion = null;

  private String atMNetworkOperationsServiceDescription = null;

  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines atMNetworkOperationsServicePoliciesandGuidelines = null;

  private String atMNetworkOperationsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return atMNetworkOperationsServiceType
  **/

  public String getAtMNetworkOperationsServiceType() {
    return atMNetworkOperationsServiceType;
  }

  public void setAtMNetworkOperationsServiceType(String atMNetworkOperationsServiceType) {
    this.atMNetworkOperationsServiceType = atMNetworkOperationsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return atMNetworkOperationsServiceVersion
  **/

  public String getAtMNetworkOperationsServiceVersion() {
    return atMNetworkOperationsServiceVersion;
  }

  public void setAtMNetworkOperationsServiceVersion(String atMNetworkOperationsServiceVersion) {
    this.atMNetworkOperationsServiceVersion = atMNetworkOperationsServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return atMNetworkOperationsServiceDescription
  **/

  public String getAtMNetworkOperationsServiceDescription() {
    return atMNetworkOperationsServiceDescription;
  }

  public void setAtMNetworkOperationsServiceDescription(String atMNetworkOperationsServiceDescription) {
    this.atMNetworkOperationsServiceDescription = atMNetworkOperationsServiceDescription;
  }


  /**
   * Get atMNetworkOperationsServicePoliciesandGuidelines
   * @return atMNetworkOperationsServicePoliciesandGuidelines
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines getAtMNetworkOperationsServicePoliciesandGuidelines() {
    return atMNetworkOperationsServicePoliciesandGuidelines;
  }

  public void setAtMNetworkOperationsServicePoliciesandGuidelines(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecordATMNetworkOperationsServicePoliciesandGuidelines atMNetworkOperationsServicePoliciesandGuidelines) {
    this.atMNetworkOperationsServicePoliciesandGuidelines = atMNetworkOperationsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return atMNetworkOperationsServiceSchedule
  **/

  public String getAtMNetworkOperationsServiceSchedule() {
    return atMNetworkOperationsServiceSchedule;
  }

  public void setAtMNetworkOperationsServiceSchedule(String atMNetworkOperationsServiceSchedule) {
    this.atMNetworkOperationsServiceSchedule = atMNetworkOperationsServiceSchedule;
  }


}

