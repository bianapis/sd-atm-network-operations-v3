package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis;
import org.bian.dto.SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord
 */
public class SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecord   {
  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis atMNetworkOperationsActivityAnalysis = null;

  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis atMNetworkOperationsPerformanceAnalysis = null;

  private SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get atMNetworkOperationsActivityAnalysis
   * @return atMNetworkOperationsActivityAnalysis
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis getAtMNetworkOperationsActivityAnalysis() {
    return atMNetworkOperationsActivityAnalysis;
  }

  public void setAtMNetworkOperationsActivityAnalysis(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsActivityAnalysis atMNetworkOperationsActivityAnalysis) {
    this.atMNetworkOperationsActivityAnalysis = atMNetworkOperationsActivityAnalysis;
  }


  /**
   * Get atMNetworkOperationsPerformanceAnalysis
   * @return atMNetworkOperationsPerformanceAnalysis
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis getAtMNetworkOperationsPerformanceAnalysis() {
    return atMNetworkOperationsPerformanceAnalysis;
  }

  public void setAtMNetworkOperationsPerformanceAnalysis(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordATMNetworkOperationsPerformanceAnalysis atMNetworkOperationsPerformanceAnalysis) {
    this.atMNetworkOperationsPerformanceAnalysis = atMNetworkOperationsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDATMNetworkOperationsRetrieveInputModelATMNetworkOperationsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

