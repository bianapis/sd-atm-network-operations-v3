package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsActivateInputModel
 */
public class SDATMNetworkOperationsActivateInputModel   {
  private Object atMNetworkOperationsActivationActionTaskRecord = null;

  private String atMNetworkOperationsCenterReference = null;

  private String atMNetworkOperationsServiceReference = null;

  private SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return atMNetworkOperationsCenterReference
  **/

  public String getAtMNetworkOperationsCenterReference() {
    return atMNetworkOperationsCenterReference;
  }

  public void setAtMNetworkOperationsCenterReference(String atMNetworkOperationsCenterReference) {
    this.atMNetworkOperationsCenterReference = atMNetworkOperationsCenterReference;
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

  public SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord getAtMNetworkOperationsServiceConfigurationRecord() {
    return atMNetworkOperationsServiceConfigurationRecord;
  }

  public void setAtMNetworkOperationsServiceConfigurationRecord(SDATMNetworkOperationsActivateInputModelATMNetworkOperationsServiceConfigurationRecord atMNetworkOperationsServiceConfigurationRecord) {
    this.atMNetworkOperationsServiceConfigurationRecord = atMNetworkOperationsServiceConfigurationRecord;
  }


}

