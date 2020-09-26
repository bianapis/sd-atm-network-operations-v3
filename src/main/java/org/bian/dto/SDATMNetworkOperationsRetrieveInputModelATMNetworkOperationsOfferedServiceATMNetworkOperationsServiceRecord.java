package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord
 */
public class SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsOfferedServiceATMNetworkOperationsServiceRecord   {
  private String atMNetworkOperationsServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return atMNetworkOperationsServiceVersion
  **/

  public String getAtMNetworkOperationsServiceVersion() {
    return atMNetworkOperationsServiceVersion;
  }

  public void setAtMNetworkOperationsServiceVersion(String atMNetworkOperationsServiceVersion) {
    this.atMNetworkOperationsServiceVersion = atMNetworkOperationsServiceVersion;
  }


}

