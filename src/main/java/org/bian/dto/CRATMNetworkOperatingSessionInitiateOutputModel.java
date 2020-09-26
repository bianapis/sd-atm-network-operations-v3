package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionInitiateOutputModel
 */
public class CRATMNetworkOperatingSessionInitiateOutputModel   {
  private String atMNetworkOperatingSessionInstanceReference = null;

  private String atMNetworkOperatingSessionInitiateActionReference = null;

  private Object atMNetworkOperatingSessionInitiateActionRecord = null;

  private String atMNetworkOperatingSessionInstanceStatus = null;

  private String atMNetworkOperatingSessionReference = null;

  private String atMNetworkOperatingSessionServiceProviderReference = null;

  private String atMNetworkOperatingSessionType = null;

  private String atMNetworkOperatingSessionServiceProviderSchedule = null;

  private String atMNetworkOperatingSessionServiceType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ATM Network Operating Session instance 
   * @return atMNetworkOperatingSessionInstanceReference
  **/

  public String getAtMNetworkOperatingSessionInstanceReference() {
    return atMNetworkOperatingSessionInstanceReference;
  }

  public void setAtMNetworkOperatingSessionInstanceReference(String atMNetworkOperatingSessionInstanceReference) {
    this.atMNetworkOperatingSessionInstanceReference = atMNetworkOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return atMNetworkOperatingSessionInitiateActionReference
  **/

  public String getAtMNetworkOperatingSessionInitiateActionReference() {
    return atMNetworkOperatingSessionInitiateActionReference;
  }

  public void setAtMNetworkOperatingSessionInitiateActionReference(String atMNetworkOperatingSessionInitiateActionReference) {
    this.atMNetworkOperatingSessionInitiateActionReference = atMNetworkOperatingSessionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return atMNetworkOperatingSessionInitiateActionRecord
  **/

  public Object getAtMNetworkOperatingSessionInitiateActionRecord() {
    return atMNetworkOperatingSessionInitiateActionRecord;
  }

  public void setAtMNetworkOperatingSessionInitiateActionRecord(Object atMNetworkOperatingSessionInitiateActionRecord) {
    this.atMNetworkOperatingSessionInitiateActionRecord = atMNetworkOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ATM Network Operating Session instance (e.g. initialised, pending, active) 
   * @return atMNetworkOperatingSessionInstanceStatus
  **/

  public String getAtMNetworkOperatingSessionInstanceStatus() {
    return atMNetworkOperatingSessionInstanceStatus;
  }

  public void setAtMNetworkOperatingSessionInstanceStatus(String atMNetworkOperatingSessionInstanceStatus) {
    this.atMNetworkOperatingSessionInstanceStatus = atMNetworkOperatingSessionInstanceStatus;
  }


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


}

