/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class AtmNetworkOperationsApiController {

	@Autowired
	AtmNetworkOperationsApiService service;
	
	@Operate.Activate
	public BianResponse<SDATMNetworkOperationsActivateOutputModel> activate(@RequestBody BianRequest<SDATMNetworkOperationsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDATMNetworkOperationsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDATMNetworkOperationsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("networkoperation")
	@Operate.Control
	public BianResponse<BQNetworkOperationControlOutputModel> controlNetworkoperation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNetworkOperationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlNetworkoperation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRATMNetworkOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashdistribution")
	@Operate.Exchange
	public BianResponse<BQCashDistributionExchangeOutputModel> exchangeCashdistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashDistributionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCashdistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("devicetracking")
	@Operate.Exchange
	public BianResponse<BQDeviceTrackingExchangeOutputModel> exchangeDevicetracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceTrackingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDevicetracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialdocumenthandling")
	@Operate.Exchange
	public BianResponse<BQFinancialDocumentHandlingExchangeOutputModel> exchangeFinancialdocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialDocumentHandlingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFinancialdocumenthandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialtransactioncapture")
	@Operate.Exchange
	public BianResponse<BQFinancialTransactionCaptureExchangeOutputModel> exchangeFinancialtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialTransactionCaptureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFinancialtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Exchange
	public BianResponse<CRATMNetworkOperatingSessionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("devicetracking")
	@Operate.Execute
	public BianResponse<BQDeviceTrackingExecuteOutputModel> executeDevicetracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceTrackingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDevicetracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialdocumenthandling")
	@Operate.Execute
	public BianResponse<BQFinancialDocumentHandlingExecuteOutputModel> executeFinancialdocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialDocumentHandlingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeFinancialdocumenthandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialtransactioncapture")
	@Operate.Execute
	public BianResponse<BQFinancialTransactionCaptureExecuteOutputModel> executeFinancialtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialTransactionCaptureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeFinancialtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Execute
	public BianResponse<CRATMNetworkOperatingSessionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDATMNetworkOperationsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDATMNetworkOperationsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRATMNetworkOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialdocumenthandling")
	@Operate.Initiate
	public BianResponse<BQFinancialDocumentHandlingInitiateOutputModel> initiateFinancialdocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFinancialDocumentHandlingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFinancialdocumenthandling(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialtransactioncapture")
	@Operate.Initiate
	public BianResponse<BQFinancialTransactionCaptureInitiateOutputModel> initiateFinancialtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFinancialTransactionCaptureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFinancialtransactioncapture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("networkoperation")
	@Operate.Initiate
	public BianResponse<BQNetworkOperationInitiateOutputModel> initiateNetworkoperation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQNetworkOperationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateNetworkoperation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashdistribution")
	@Operate.Request
	public BianResponse<BQCashDistributionRequestOutputModel> requestCashdistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashDistributionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCashdistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRATMNetworkOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashdistribution")
	@Operate.Retrieve
	public BianResponse<BQCashDistributionRetrieveOutputModel> retrieveCashdistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCashdistribution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("devicetracking")
	@Operate.Retrieve
	public BianResponse<BQDeviceTrackingRetrieveOutputModel> retrieveDevicetracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevicetracking(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("financialdocumenthandling")
	@Operate.Retrieve
	public BianResponse<BQFinancialDocumentHandlingRetrieveOutputModel> retrieveFinancialdocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialdocumenthandling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("financialtransactioncapture")
	@Operate.Retrieve
	public BianResponse<BQFinancialTransactionCaptureRetrieveOutputModel> retrieveFinancialtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("networkoperation")
	@Operate.Retrieve
	public BianResponse<BQNetworkOperationRetrieveOutputModel> retrieveNetworkoperation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveNetworkoperation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.Retrieve
	public BianResponse<CRATMNetworkOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDATMNetworkOperationsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRATMNetworkOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRATMNetworkOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("devicetracking")
	@Operate.Update
	public BianResponse<BQDeviceTrackingUpdateOutputModel> updateDevicetracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceTrackingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDevicetracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialdocumenthandling")
	@Operate.Update
	public BianResponse<BQFinancialDocumentHandlingUpdateOutputModel> updateFinancialdocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialDocumentHandlingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialdocumenthandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialtransactioncapture")
	@Operate.Update
	public BianResponse<BQFinancialTransactionCaptureUpdateOutputModel> updateFinancialtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialTransactionCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("networkoperation")
	@Operate.Update
	public BianResponse<BQNetworkOperationUpdateOutputModel> updateNetworkoperation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNetworkOperationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateNetworkoperation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
