package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionControlOutputModel
 */
public class CRATMNetworkOperatingSessionControlOutputModel   {
  private String atMNetworkOperatingSessionReference = null;

  private String atMNetworkOperatingSessionServiceProviderReference = null;

  private String atMNetworkOperatingSessionType = null;

  private String atMNetworkOperatingSessionServiceProviderSchedule = null;

  private String atMNetworkOperatingSessionServiceType = null;

  private String atMNetworkOperatingSessionControlActionTaskReference = null;

  private Object atMNetworkOperatingSessionControlActionTaskRecord = null;

  private String atMNetworkOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionReference
  **/

  public String getAtMNetworkOperatingSessionReference() {
    return atMNetworkOperatingSessionReference;
  }

  public void setAtMNetworkOperatingSessionReference(String atMNetworkOperatingSessionReference) {
    this.atMNetworkOperatingSessionReference = atMNetworkOperatingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who provides the services of ATMNetwork Operating Session  
   * @return atMNetworkOperatingSessionServiceProviderReference
  **/

  public String getAtMNetworkOperatingSessionServiceProviderReference() {
    return atMNetworkOperatingSessionServiceProviderReference;
  }

  public void setAtMNetworkOperatingSessionServiceProviderReference(String atMNetworkOperatingSessionServiceProviderReference) {
    this.atMNetworkOperatingSessionServiceProviderReference = atMNetworkOperatingSessionServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of operations within ATMNetwork Operating Session  
   * @return atMNetworkOperatingSessionType
  **/

  public String getAtMNetworkOperatingSessionType() {
    return atMNetworkOperatingSessionType;
  }

  public void setAtMNetworkOperatingSessionType(String atMNetworkOperatingSessionType) {
    this.atMNetworkOperatingSessionType = atMNetworkOperatingSessionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will operate the ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionServiceProviderSchedule
  **/

  public String getAtMNetworkOperatingSessionServiceProviderSchedule() {
    return atMNetworkOperatingSessionServiceProviderSchedule;
  }

  public void setAtMNetworkOperatingSessionServiceProviderSchedule(String atMNetworkOperatingSessionServiceProviderSchedule) {
    this.atMNetworkOperatingSessionServiceProviderSchedule = atMNetworkOperatingSessionServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services within ATMNetwork Operating Session  
   * @return atMNetworkOperatingSessionServiceType
  **/

  public String getAtMNetworkOperatingSessionServiceType() {
    return atMNetworkOperatingSessionServiceType;
  }

  public void setAtMNetworkOperatingSessionServiceType(String atMNetworkOperatingSessionServiceType) {
    this.atMNetworkOperatingSessionServiceType = atMNetworkOperatingSessionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ATM Network Operating Session instance control processing service call 
   * @return atMNetworkOperatingSessionControlActionTaskReference
  **/

  public String getAtMNetworkOperatingSessionControlActionTaskReference() {
    return atMNetworkOperatingSessionControlActionTaskReference;
  }

  public void setAtMNetworkOperatingSessionControlActionTaskReference(String atMNetworkOperatingSessionControlActionTaskReference) {
    this.atMNetworkOperatingSessionControlActionTaskReference = atMNetworkOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return atMNetworkOperatingSessionControlActionTaskRecord
  **/

  public Object getAtMNetworkOperatingSessionControlActionTaskRecord() {
    return atMNetworkOperatingSessionControlActionTaskRecord;
  }

  public void setAtMNetworkOperatingSessionControlActionTaskRecord(Object atMNetworkOperatingSessionControlActionTaskRecord) {
    this.atMNetworkOperatingSessionControlActionTaskRecord = atMNetworkOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return atMNetworkOperatingSessionControlActionResponse
  **/

  public String getAtMNetworkOperatingSessionControlActionResponse() {
    return atMNetworkOperatingSessionControlActionResponse;
  }

  public void setAtMNetworkOperatingSessionControlActionResponse(String atMNetworkOperatingSessionControlActionResponse) {
    this.atMNetworkOperatingSessionControlActionResponse = atMNetworkOperatingSessionControlActionResponse;
  }


}

