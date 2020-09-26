package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis;
import org.bian.dto.SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord
 */
public class SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecord   {
  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis atMNetworkOperationsActivityAnalysis = null;

  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis atMNetworkOperationsPerformanceAnalysis = null;

  private SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get atMNetworkOperationsActivityAnalysis
   * @return atMNetworkOperationsActivityAnalysis
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis getAtMNetworkOperationsActivityAnalysis() {
    return atMNetworkOperationsActivityAnalysis;
  }

  public void setAtMNetworkOperationsActivityAnalysis(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis atMNetworkOperationsActivityAnalysis) {
    this.atMNetworkOperationsActivityAnalysis = atMNetworkOperationsActivityAnalysis;
  }


  /**
   * Get atMNetworkOperationsPerformanceAnalysis
   * @return atMNetworkOperationsPerformanceAnalysis
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis getAtMNetworkOperationsPerformanceAnalysis() {
    return atMNetworkOperationsPerformanceAnalysis;
  }

  public void setAtMNetworkOperationsPerformanceAnalysis(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis atMNetworkOperationsPerformanceAnalysis) {
    this.atMNetworkOperationsPerformanceAnalysis = atMNetworkOperationsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDATMNetworkOperationsRetrieveOutputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

