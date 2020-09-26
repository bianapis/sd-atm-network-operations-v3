package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionControlInputModel
 */
public class CRATMNetworkOperatingSessionControlInputModel   {
  private String atMNetworkOperationsServicingSessionReference = null;

  private String atMNetworkOperatingSessionInstanceReference = null;

  private String atMNetworkOperatingSessionSchedule = null;

  private String atMNetworkOperatingSessionStatus = null;

  private String atMNetworkOperatingSessionUsageLog = null;

  private String atMNetworkOperatingSessionReference = null;

  private String atMNetworkOperatingSessionServiceProviderReference = null;

  private String atMNetworkOperatingSessionType = null;

  private String atMNetworkOperatingSessionServiceProviderSchedule = null;

  private String atMNetworkOperatingSessionServiceType = null;

  private String atMNetworkOperatingSessionServiceConfiguration = null;

  private Object atMNetworkOperatingSessionControlActionTaskRecord = null;

  private CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest atMNetworkOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return atMNetworkOperationsServicingSessionReference
  **/

  public String getAtMNetworkOperationsServicingSessionReference() {
    return atMNetworkOperationsServicingSessionReference;
  }

  public void setAtMNetworkOperationsServicingSessionReference(String atMNetworkOperationsServicingSessionReference) {
    this.atMNetworkOperationsServicingSessionReference = atMNetworkOperationsServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timetable of ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionSchedule
  **/

  public String getAtMNetworkOperatingSessionSchedule() {
    return atMNetworkOperatingSessionSchedule;
  }

  public void setAtMNetworkOperatingSessionSchedule(String atMNetworkOperatingSessionSchedule) {
    this.atMNetworkOperatingSessionSchedule = atMNetworkOperatingSessionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionStatus
  **/

  public String getAtMNetworkOperatingSessionStatus() {
    return atMNetworkOperatingSessionStatus;
  }

  public void setAtMNetworkOperatingSessionStatus(String atMNetworkOperatingSessionStatus) {
    this.atMNetworkOperatingSessionStatus = atMNetworkOperatingSessionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionUsageLog
  **/

  public String getAtMNetworkOperatingSessionUsageLog() {
    return atMNetworkOperatingSessionUsageLog;
  }

  public void setAtMNetworkOperatingSessionUsageLog(String atMNetworkOperatingSessionUsageLog) {
    this.atMNetworkOperatingSessionUsageLog = atMNetworkOperatingSessionUsageLog;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration of ATMNetwork Operating Session 
   * @return atMNetworkOperatingSessionServiceConfiguration
  **/

  public String getAtMNetworkOperatingSessionServiceConfiguration() {
    return atMNetworkOperatingSessionServiceConfiguration;
  }

  public void setAtMNetworkOperatingSessionServiceConfiguration(String atMNetworkOperatingSessionServiceConfiguration) {
    this.atMNetworkOperatingSessionServiceConfiguration = atMNetworkOperatingSessionServiceConfiguration;
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
   * Get atMNetworkOperatingSessionControlActionRequest
   * @return atMNetworkOperatingSessionControlActionRequest
  **/

  public CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest getAtMNetworkOperatingSessionControlActionRequest() {
    return atMNetworkOperatingSessionControlActionRequest;
  }

  public void setAtMNetworkOperatingSessionControlActionRequest(CRATMNetworkOperatingSessionControlInputModelATMNetworkOperatingSessionControlActionRequest atMNetworkOperatingSessionControlActionRequest) {
    this.atMNetworkOperatingSessionControlActionRequest = atMNetworkOperatingSessionControlActionRequest;
  }


}

