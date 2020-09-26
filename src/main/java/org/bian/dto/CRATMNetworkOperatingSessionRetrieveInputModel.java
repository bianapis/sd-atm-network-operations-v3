package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis;
import org.bian.dto.CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRATMNetworkOperatingSessionRetrieveInputModel
 */
public class CRATMNetworkOperatingSessionRetrieveInputModel   {
  private Object atMNetworkOperatingSessionRetrieveActionTaskRecord = null;

  private String atMNetworkOperatingSessionRetrieveActionRequest = null;

  private CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord atMNetworkOperatingSessionInstanceReportRecord = null;

  private CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis atMNetworkOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return atMNetworkOperatingSessionRetrieveActionRequest
  **/

  public String getAtMNetworkOperatingSessionRetrieveActionRequest() {
    return atMNetworkOperatingSessionRetrieveActionRequest;
  }

  public void setAtMNetworkOperatingSessionRetrieveActionRequest(String atMNetworkOperatingSessionRetrieveActionRequest) {
    this.atMNetworkOperatingSessionRetrieveActionRequest = atMNetworkOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get atMNetworkOperatingSessionInstanceReportRecord
   * @return atMNetworkOperatingSessionInstanceReportRecord
  **/

  public CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord getAtMNetworkOperatingSessionInstanceReportRecord() {
    return atMNetworkOperatingSessionInstanceReportRecord;
  }

  public void setAtMNetworkOperatingSessionInstanceReportRecord(CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceReportRecord atMNetworkOperatingSessionInstanceReportRecord) {
    this.atMNetworkOperatingSessionInstanceReportRecord = atMNetworkOperatingSessionInstanceReportRecord;
  }


  /**
   * Get atMNetworkOperatingSessionInstanceAnalysis
   * @return atMNetworkOperatingSessionInstanceAnalysis
  **/

  public CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis getAtMNetworkOperatingSessionInstanceAnalysis() {
    return atMNetworkOperatingSessionInstanceAnalysis;
  }

  public void setAtMNetworkOperatingSessionInstanceAnalysis(CRATMNetworkOperatingSessionRetrieveInputModelATMNetworkOperatingSessionInstanceAnalysis atMNetworkOperatingSessionInstanceAnalysis) {
    this.atMNetworkOperatingSessionInstanceAnalysis = atMNetworkOperatingSessionInstanceAnalysis;
  }


}

