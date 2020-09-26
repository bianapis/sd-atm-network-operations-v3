package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService
 */
public class SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService   {
  private String atMNetworkOperationsServiceReference = null;

  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord atMNetworkOperationsServiceRecord = null;


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
   * Get atMNetworkOperationsServiceRecord
   * @return atMNetworkOperationsServiceRecord
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord getAtMNetworkOperationsServiceRecord() {
    return atMNetworkOperationsServiceRecord;
  }

  public void setAtMNetworkOperationsServiceRecord(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord atMNetworkOperationsServiceRecord) {
    this.atMNetworkOperationsServiceRecord = atMNetworkOperationsServiceRecord;
  }


}

