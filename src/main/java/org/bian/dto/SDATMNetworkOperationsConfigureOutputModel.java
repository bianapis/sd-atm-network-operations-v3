package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsConfigureOutputModel
 */
public class SDATMNetworkOperationsConfigureOutputModel   {
  private String atMNetworkOperationsConfigurationActionTaskReference = null;

  private Object atMNetworkOperationsConfigurationActionTaskRecord = null;

  private SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord = null;

  private String atMNetworkOperationsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return atMNetworkOperationsConfigurationActionTaskReference
  **/

  public String getAtMNetworkOperationsConfigurationActionTaskReference() {
    return atMNetworkOperationsConfigurationActionTaskReference;
  }

  public void setAtMNetworkOperationsConfigurationActionTaskReference(String atMNetworkOperationsConfigurationActionTaskReference) {
    this.atMNetworkOperationsConfigurationActionTaskReference = atMNetworkOperationsConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return atMNetworkOperationsConfigurationActionTaskRecord
  **/

  public Object getAtMNetworkOperationsConfigurationActionTaskRecord() {
    return atMNetworkOperationsConfigurationActionTaskRecord;
  }

  public void setAtMNetworkOperationsConfigurationActionTaskRecord(Object atMNetworkOperationsConfigurationActionTaskRecord) {
    this.atMNetworkOperationsConfigurationActionTaskRecord = atMNetworkOperationsConfigurationActionTaskRecord;
  }


  /**
   * Get atMNetworkOperationsServiceConfigurationRecord
   * @return atMNetworkOperationsServiceConfigurationRecord
  **/

  public SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord getAtMNetworkOperationsServiceConfigurationRecord() {
    return atMNetworkOperationsServiceConfigurationRecord;
  }

  public void setAtMNetworkOperationsServiceConfigurationRecord(SDATMNetworkOperationsConfigureOutputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord) {
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

