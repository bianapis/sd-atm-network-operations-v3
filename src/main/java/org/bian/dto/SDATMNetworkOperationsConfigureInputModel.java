package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsConfigureInputModel
 */
public class SDATMNetworkOperationsConfigureInputModel   {
  private Object atMNetworkOperationsConfigurationActionTaskRecord = null;

  private String atMNetworkOperationsServicingSessionReference = null;

  private String atMNetworkOperationsServiceReference = null;

  private SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return atMNetworkOperationsServiceReference
  **/

  public String getAtMNetworkOperationsServiceReference() {
    return atMNetworkOperationsServiceReference;
  }

  public void setAtMNetworkOperationsServiceReference(String atMNetworkOperationsServiceReference) {
    this.atMNetworkOperationsServiceReference = atMNetworkOperationsServiceReference;
  }


  /**
   * Get atMNetworkOperationsServiceConfigurationRecord
   * @return atMNetworkOperationsServiceConfigurationRecord
  **/

  public SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord getAtMNetworkOperationsServiceConfigurationRecord() {
    return atMNetworkOperationsServiceConfigurationRecord;
  }

  public void setAtMNetworkOperationsServiceConfigurationRecord(SDATMNetworkOperationsConfigureInputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord) {
    this.atMNetworkOperationsServiceConfigurationRecord = atMNetworkOperationsServiceConfigurationRecord;
  }


}

