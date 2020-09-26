package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveInputModel
 */
public class SDATMNetworkOperationsRetrieveInputModel   {
  private Object atMNetworkOperationsRetrieveActionTaskRecord = null;

  private String atMNetworkOperationsRetrieveActionRequest = null;

  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord atMNetworkOperationsRetrieveActionRecord = null;

  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService atMNetworkOperationsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return atMNetworkOperationsRetrieveActionTaskRecord
  **/

  public Object getAtMNetworkOperationsRetrieveActionTaskRecord() {
    return atMNetworkOperationsRetrieveActionTaskRecord;
  }

  public void setAtMNetworkOperationsRetrieveActionTaskRecord(Object atMNetworkOperationsRetrieveActionTaskRecord) {
    this.atMNetworkOperationsRetrieveActionTaskRecord = atMNetworkOperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return atMNetworkOperationsRetrieveActionRequest
  **/

  public String getAtMNetworkOperationsRetrieveActionRequest() {
    return atMNetworkOperationsRetrieveActionRequest;
  }

  public void setAtMNetworkOperationsRetrieveActionRequest(String atMNetworkOperationsRetrieveActionRequest) {
    this.atMNetworkOperationsRetrieveActionRequest = atMNetworkOperationsRetrieveActionRequest;
  }


  /**
   * Get atMNetworkOperationsRetrieveActionRecord
   * @return atMNetworkOperationsRetrieveActionRecord
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord getAtMNetworkOperationsRetrieveActionRecord() {
    return atMNetworkOperationsRetrieveActionRecord;
  }

  public void setAtMNetworkOperationsRetrieveActionRecord(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord atMNetworkOperationsRetrieveActionRecord) {
    this.atMNetworkOperationsRetrieveActionRecord = atMNetworkOperationsRetrieveActionRecord;
  }


  /**
   * Get atMNetworkOperationsOfferedService
   * @return atMNetworkOperationsOfferedService
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService getAtMNetworkOperationsOfferedService() {
    return atMNetworkOperationsOfferedService;
  }

  public void setAtMNetworkOperationsOfferedService(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedService atMNetworkOperationsOfferedService) {
    this.atMNetworkOperationsOfferedService = atMNetworkOperationsOfferedService;
  }


}

