package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsFeedbackInputModelATMNetworkOperationsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsFeedbackInputModel
 */
public class SDATMNetworkOperationsFeedbackInputModel   {
  private Object atMNetworkOperationsFeedbackActionTaskRecord = null;

  private SDATMNetworkOperationsFeedbackInputModelATMNetworkOperationsFeedbackActionRecord atMNetworkOperationsFeedbackActionRecord = null;


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

  public SDATMNetworkOperationsFeedbackInputModelATMNetworkOperationsFeedbackActionRecord getAtMNetworkOperationsFeedbackActionRecord() {
    return atMNetworkOperationsFeedbackActionRecord;
  }

  public void setAtMNetworkOperationsFeedbackActionRecord(SDATMNetworkOperationsFeedbackInputModelATMNetworkOperationsFeedbackActionRecord atMNetworkOperationsFeedbackActionRecord) {
    this.atMNetworkOperationsFeedbackActionRecord = atMNetworkOperationsFeedbackActionRecord;
  }


}

