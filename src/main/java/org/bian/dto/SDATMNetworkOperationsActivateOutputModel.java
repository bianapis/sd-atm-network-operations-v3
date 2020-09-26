package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateOutputModel
 */
public class SDATMNetworkOperationsActivateOutputModel   {
  private String atMNetworkOperationsActivationActionTaskReference = null;

  private Object atMNetworkOperationsActivationActionTaskRecord = null;

  private String atMNetworkOperationsServicingSessionReference = null;

  private Object atMNetworkOperationsServicingSessionRecord = null;

  private SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord = null;

  private String atMNetworkOperationsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return atMNetworkOperationsActivationActionTaskReference
  **/

  public String getAtMNetworkOperationsActivationActionTaskReference() {
    return atMNetworkOperationsActivationActionTaskReference;
  }

  public void setAtMNetworkOperationsActivationActionTaskReference(String atMNetworkOperationsActivationActionTaskReference) {
    this.atMNetworkOperationsActivationActionTaskReference = atMNetworkOperationsActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return atMNetworkOperationsActivationActionTaskRecord
  **/

  public Object getAtMNetworkOperationsActivationActionTaskRecord() {
    return atMNetworkOperationsActivationActionTaskRecord;
  }

  public void setAtMNetworkOperationsActivationActionTaskRecord(Object atMNetworkOperationsActivationActionTaskRecord) {
    this.atMNetworkOperationsActivationActionTaskRecord = atMNetworkOperationsActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return atMNetworkOperationsServicingSessionReference
  **/

  public String getAtMNetworkOperationsServicingSessionReference() {
    return atMNetworkOperationsServicingSessionReference;
  }

  public void setAtMNetworkOperationsServicingSessionReference(String atMNetworkOperationsServicingSessionReference) {
    this.atMNetworkOperationsServicingSessionReference = atMNetworkOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return atMNetworkOperationsServicingSessionRecord
  **/

  public Object getAtMNetworkOperationsServicingSessionRecord() {
    return atMNetworkOperationsServicingSessionRecord;
  }

  public void setAtMNetworkOperationsServicingSessionRecord(Object atMNetworkOperationsServicingSessionRecord) {
    this.atMNetworkOperationsServicingSessionRecord = atMNetworkOperationsServicingSessionRecord;
  }


  /**
   * Get atMNetworkOperationsServiceConfigurationRecord
   * @return atMNetworkOperationsServiceConfigurationRecord
  **/

  public SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord getAtMNetworkOperationsServiceConfigurationRecord() {
    return atMNetworkOperationsServiceConfigurationRecord;
  }

  public void setAtMNetworkOperationsServiceConfigurationRecord(SDATMNetworkOperationsActivateOutputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord) {
    this.atMNetworkOperationsServiceConfigurationRecord = atMNetworkOperationsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return atMNetworkOperationsServicingSessionStatus
  **/

  public String getAtMNetworkOperationsServicingSessionStatus() {
    return atMNetworkOperationsServicingSessionStatus;
  }

  public void setAtMNetworkOperationsServicingSessionStatus(String atMNetworkOperationsServicingSessionStatus) {
    this.atMNetworkOperationsServicingSessionStatus = atMNetworkOperationsServicingSessionStatus;
  }


}

