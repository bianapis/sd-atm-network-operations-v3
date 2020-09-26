package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedService;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveOutputModel
 */
public class SDATMNetworkOperationsRetrieveOutputModel   {
  private String atMNetworkOperationsRetrieveActionTaskReference = null;

  private Object atMNetworkOperationsRetrieveActionTaskRecord = null;

  private String atMNetworkOperationsRetrieveActionResponse = null;

  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord atMNetworkOperationsRetrieveActionRecord = null;

  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedService atMNetworkOperationsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return atMNetworkOperationsRetrieveActionTaskReference
  **/

  public String getAtMNetworkOperationsRetrieveActionTaskReference() {
    return atMNetworkOperationsRetrieveActionTaskReference;
  }

  public void setAtMNetworkOperationsRetrieveActionTaskReference(String atMNetworkOperationsRetrieveActionTaskReference) {
    this.atMNetworkOperationsRetrieveActionTaskReference = atMNetworkOperationsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return atMNetworkOperationsRetrieveActionResponse
  **/

  public String getAtMNetworkOperationsRetrieveActionResponse() {
    return atMNetworkOperationsRetrieveActionResponse;
  }

  public void setAtMNetworkOperationsRetrieveActionResponse(String atMNetworkOperationsRetrieveActionResponse) {
    this.atMNetworkOperationsRetrieveActionResponse = atMNetworkOperationsRetrieveActionResponse;
  }


  /**
   * Get atMNetworkOperationsRetrieveActionRecord
   * @return atMNetworkOperationsRetrieveActionRecord
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord getAtMNetworkOperationsRetrieveActionRecord() {
    return atMNetworkOperationsRetrieveActionRecord;
  }

  public void setAtMNetworkOperationsRetrieveActionRecord(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord atMNetworkOperationsRetrieveActionRecord) {
    this.atMNetworkOperationsRetrieveActionRecord = atMNetworkOperationsRetrieveActionRecord;
  }


  /**
   * Get atMNetworkOperationsOfferedService
   * @return atMNetworkOperationsOfferedService
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedService getAtMNetworkOperationsOfferedService() {
    return atMNetworkOperationsOfferedService;
  }

  public void setAtMNetworkOperationsOfferedService(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsOfferedService atMNetworkOperationsOfferedService) {
    this.atMNetworkOperationsOfferedService = atMNetworkOperationsOfferedService;
  }


}

