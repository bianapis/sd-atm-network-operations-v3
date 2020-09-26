package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis;
import org.bian.dto.CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveOutputModel
 */
public class CRATMNetworkOperatingSessionRetrieveOutputModel   {
  private String atMNetworkOperatingSessionSchedule = null;

  private String atMNetworkOperatingSessionStatus = null;

  private String atMNetworkOperatingSessionUsageLog = null;

  private String atMNetworkOperatingSessionReference = null;

  private String atMNetworkOperatingSessionServiceProviderReference = null;

  private String atMNetworkOperatingSessionType = null;

  private String atMNetworkOperatingSessionServiceProviderSchedule = null;

  private String atMNetworkOperatingSessionServiceType = null;

  private String atMNetworkOperatingSessionServiceConfiguration = null;

  private String atMNetworkOperatingSessionRetrieveActionTaskReference = null;

  private Object atMNetworkOperatingSessionRetrieveActionTaskRecord = null;

  private String atMNetworkOperatingSessionRetrieveActionResponse = null;

  private CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord atMNetworkOperatingSessionInstanceReportRecord = null;

  private CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis atMNetworkOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ATM Network Operating Session instance retrieve service call 
   * @return atMNetworkOperatingSessionRetrieveActionTaskReference
  **/

  public String getAtMNetworkOperatingSessionRetrieveActionTaskReference() {
    return atMNetworkOperatingSessionRetrieveActionTaskReference;
  }

  public void setAtMNetworkOperatingSessionRetrieveActionTaskReference(String atMNetworkOperatingSessionRetrieveActionTaskReference) {
    this.atMNetworkOperatingSessionRetrieveActionTaskReference = atMNetworkOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return atMNetworkOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getAtMNetworkOperatingSessionRetrieveActionTaskRecord() {
    return atMNetworkOperatingSessionRetrieveActionTaskRecord;
  }

  public void setAtMNetworkOperatingSessionRetrieveActionTaskRecord(Object atMNetworkOperatingSessionRetrieveActionTaskRecord) {
    this.atMNetworkOperatingSessionRetrieveActionTaskRecord = atMNetworkOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return atMNetworkOperatingSessionRetrieveActionResponse
  **/

  public String getAtMNetworkOperatingSessionRetrieveActionResponse() {
    return atMNetworkOperatingSessionRetrieveActionResponse;
  }

  public void setAtMNetworkOperatingSessionRetrieveActionResponse(String atMNetworkOperatingSessionRetrieveActionResponse) {
    this.atMNetworkOperatingSessionRetrieveActionResponse = atMNetworkOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get atMNetworkOperatingSessionInstanceReportRecord
   * @return atMNetworkOperatingSessionInstanceReportRecord
  **/

  public CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord getAtMNetworkOperatingSessionInstanceReportRecord() {
    return atMNetworkOperatingSessionInstanceReportRecord;
  }

  public void setAtMNetworkOperatingSessionInstanceReportRecord(CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceReportRecord atMNetworkOperatingSessionInstanceReportRecord) {
    this.atMNetworkOperatingSessionInstanceReportRecord = atMNetworkOperatingSessionInstanceReportRecord;
  }


  /**
   * Get atMNetworkOperatingSessionInstanceAnalysis
   * @return atMNetworkOperatingSessionInstanceAnalysis
  **/

  public CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis getAtMNetworkOperatingSessionInstanceAnalysis() {
    return atMNetworkOperatingSessionInstanceAnalysis;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysis(CRATMNetworkOperatingSessionRetrieveOutputModelATMNetworkOperatingSessionInstanceAnalysis atMNetworkOperatingSessionInstanceAnalysis) {
    this.atMNetworkOperatingSessionInstanceAnalysis = atMNetworkOperatingSessionInstanceAnalysis;
  }


}

