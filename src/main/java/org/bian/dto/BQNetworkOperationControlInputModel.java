package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQNetworkOperationControlInputModel
 */
public class BQNetworkOperationControlInputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private String networkOperationInstanceReference = null;

  private Object networkOperationControlActionTaskRecord = null;

  private CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest networkOperationControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Network Operation instance 
   * @return networkOperationInstanceReference
  **/

  public String getNetworkOperationInstanceReference() {
    return networkOperationInstanceReference;
  }

  public void setNetworkOperationInstanceReference(String networkOperationInstanceReference) {
    this.networkOperationInstanceReference = networkOperationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return networkOperationControlActionTaskRecord
  **/

  public Object getNetworkOperationControlActionTaskRecord() {
    return networkOperationControlActionTaskRecord;
  }

  public void setNetworkOperationControlActionTaskRecord(Object networkOperationControlActionTaskRecord) {
    this.networkOperationControlActionTaskRecord = networkOperationControlActionTaskRecord;
  }


  /**
   * Get networkOperationControlActionRequest
   * @return networkOperationControlActionRequest
  **/

  public CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest getNetworkOperationControlActionRequest() {
    return networkOperationControlActionRequest;
  }

  public void setNetworkOperationControlActionRequest(CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest networkOperationControlActionRequest) {
    this.networkOperationControlActionRequest = networkOperationControlActionRequest;
  }


}

