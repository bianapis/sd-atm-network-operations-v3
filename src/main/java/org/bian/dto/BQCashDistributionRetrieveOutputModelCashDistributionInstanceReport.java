package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashDistributionRetrieveOutputModelCashDistributionInstanceReport
 */
public class BQCashDistributionRetrieveOutputModelCashDistributionInstanceReport   {
  private Object cashDistributionInstanceReportRecord = null;

  private String cashDistributionInstanceReportType = null;

  private String cashDistributionInstanceReportParameters = null;

  private Object cashDistributionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashDistributionInstanceReportRecord
  **/

  public Object getCashDistributionInstanceReportRecord() {
    return cashDistributionInstanceReportRecord;
  }

  public void setCashDistributionInstanceReportRecord(Object cashDistributionInstanceReportRecord) {
    this.cashDistributionInstanceReportRecord = cashDistributionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashDistributionInstanceReportType
  **/

  public String getCashDistributionInstanceReportType() {
    return cashDistributionInstanceReportType;
  }

  public void setCashDistributionInstanceReportType(String cashDistributionInstanceReportType) {
    this.cashDistributionInstanceReportType = cashDistributionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashDistributionInstanceReportParameters
  **/

  public String getCashDistributionInstanceReportParameters() {
    return cashDistributionInstanceReportParameters;
  }

  public void setCashDistributionInstanceReportParameters(String cashDistributionInstanceReportParameters) {
    this.cashDistributionInstanceReportParameters = cashDistributionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashDistributionInstanceReport
  **/

  public Object getCashDistributionInstanceReport() {
    return cashDistributionInstanceReport;
  }

  public void setCashDistributionInstanceReport(Object cashDistributionInstanceReport) {
    this.cashDistributionInstanceReport = cashDistributionInstanceReport;
  }


}

