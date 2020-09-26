package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsFeedbackOutputModelATMNetworkOperationsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsFeedbackOutputModel
 */
public class SDATMNetworkOperationsFeedbackOutputModel   {
  private String atMNetworkOperationsFeedbackActionTaskReference = null;

  private Object atMNetworkOperationsFeedbackActionTaskRecord = null;

  private SDATMNetworkOperationsFeedbackOutputModelATMNetworkOperationsFeedbackActionRecord atMNetworkOperationsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return atMNetworkOperationsFeedbackActionTaskReference
  **/

  public String getAtMNetworkOperationsFeedbackActionTaskReference() {
    return atMNetworkOperationsFeedbackActionTaskReference;
  }

  public void setAtMNetworkOperationsFeedbackActionTaskReference(String atMNetworkOperationsFeedbackActionTaskReference) {
    this.atMNetworkOperationsFeedbackActionTaskReference = atMNetworkOperationsFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return atMNetworkOperationsFeedbackActionTaskRecord
  **/

  public Object getAtMNetworkOperationsFeedbackActionTaskRecord() {
    return atMNetworkOperationsFeedbackActionTaskRecord;
  }

  public void setAtMNetworkOperationsFeedbackActionTaskRecord(Object atMNetworkOperationsFeedbackActionTaskRecord) {
    this.atMNetworkOperationsFeedbackActionTaskRecord = atMNetworkOperationsFeedbackActionTaskRecord;
  }


  /**
   * Get atMNetworkOperationsFeedbackActionRecord
   * @return atMNetworkOperationsFeedbackActionRecord
  **/

  public SDATMNetworkOperationsFeedbackOutputModelATMNetworkOperationsFeedbackActionRecord getAtMNetworkOperationsFeedbackActionRecord() {
    return atMNetworkOperationsFeedbackActionRecord;
  }

  public void setAtMNetworkOperationsFeedbackActionRecord(SDATMNetworkOperationsFeedbackOutputModelATMNetworkOperationsFeedbackActionRecord atMNetworkOperationsFeedbackActionRecord) {
    this.atMNetworkOperationsFeedbackActionRecord = atMNetworkOperationsFeedbackActionRecord;
  }


}

