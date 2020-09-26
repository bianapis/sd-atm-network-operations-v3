package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceTrackingUpdateInputModel
 */
public class BQDeviceTrackingUpdateInputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private String deviceTrackingInstanceReference = null;

  private Object deviceTrackingUpdateActionTaskRecord = null;

  private String deviceTrackingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ATM Network Operating Session instance 
   * @return atMNetworkOperatingSessionInstanceReference
  **/

  public String getAtMNetworkOperatingSessionInstanceReference() {
    return atMNetworkOperatingSessionInstanceReference;
  }

  public void setAtMNetworkOperatingSessionInstanceReference(String atMNetworkOperatingSessionInstanceReference) {
    this.atMNetworkOperatingSessionInstanceReference = atMNetworkOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Tracking instance 
   * @return deviceTrackingInstanceReference
  **/

  public String getDeviceTrackingInstanceReference() {
    return deviceTrackingInstanceReference;
  }

  public void setDeviceTrackingInstanceReference(String deviceTrackingInstanceReference) {
    this.deviceTrackingInstanceReference = deviceTrackingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return deviceTrackingUpdateActionTaskRecord
  **/

  public Object getDeviceTrackingUpdateActionTaskRecord() {
    return deviceTrackingUpdateActionTaskRecord;
  }

  public void setDeviceTrackingUpdateActionTaskRecord(Object deviceTrackingUpdateActionTaskRecord) {
    this.deviceTrackingUpdateActionTaskRecord = deviceTrackingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return deviceTrackingUpdateActionRequest
  **/

  public String getDeviceTrackingUpdateActionRequest() {
    return deviceTrackingUpdateActionRequest;
  }

  public void setDeviceTrackingUpdateActionRequest(String deviceTrackingUpdateActionRequest) {
    this.deviceTrackingUpdateActionRequest = deviceTrackingUpdateActionRequest;
  }


}

