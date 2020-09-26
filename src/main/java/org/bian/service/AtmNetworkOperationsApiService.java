/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AtmNetworkOperationsApiService {

	SDATMNetworkOperationsActivateOutputModel activate(SDATMNetworkOperationsActivateInputModel request);
	
	SDATMNetworkOperationsConfigureOutputModel configure(String sdReferenceId, SDATMNetworkOperationsConfigureInputModel request);
	
	BQNetworkOperationControlOutputModel controlNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNetworkOperationControlInputModel request);
	
	CRATMNetworkOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionControlInputModel request);
	
	BQCashDistributionExchangeOutputModel exchangeCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashDistributionExchangeInputModel request);
	
	BQDeviceTrackingExchangeOutputModel exchangeDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingExchangeInputModel request);
	
	BQFinancialDocumentHandlingExchangeOutputModel exchangeFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingExchangeInputModel request);
	
	BQFinancialTransactionCaptureExchangeOutputModel exchangeFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureExchangeInputModel request);
	
	CRATMNetworkOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionExchangeInputModel request);
	
	BQDeviceTrackingExecuteOutputModel executeDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingExecuteInputModel request);
	
	BQFinancialDocumentHandlingExecuteOutputModel executeFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingExecuteInputModel request);
	
	BQFinancialTransactionCaptureExecuteOutputModel executeFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureExecuteInputModel request);
	
	CRATMNetworkOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionExecuteInputModel request);
	
	SDATMNetworkOperationsFeedbackOutputModel feedback(String sdReferenceId, SDATMNetworkOperationsFeedbackInputModel request);
	
	CRATMNetworkOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRATMNetworkOperatingSessionInitiateInputModel request);
	
	BQFinancialDocumentHandlingInitiateOutputModel initiateFinancialdocumenthandling(String sdReferenceId, String crReferenceId, BQFinancialDocumentHandlingInitiateInputModel request);
	
	BQFinancialTransactionCaptureInitiateOutputModel initiateFinancialtransactioncapture(String sdReferenceId, String crReferenceId, BQFinancialTransactionCaptureInitiateInputModel request);
	
	BQNetworkOperationInitiateOutputModel initiateNetworkoperation(String sdReferenceId, String crReferenceId, BQNetworkOperationInitiateInputModel request);
	
	BQCashDistributionRequestOutputModel requestCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashDistributionRequestInputModel request);
	
	CRATMNetworkOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionRequestInputModel request);
	
	BQCashDistributionRetrieveOutputModel retrieveCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeviceTrackingRetrieveOutputModel retrieveDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialDocumentHandlingRetrieveOutputModel retrieveFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialTransactionCaptureRetrieveOutputModel retrieveFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQNetworkOperationRetrieveOutputModel retrieveNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRATMNetworkOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDATMNetworkOperationsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRATMNetworkOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionUpdateInputModel request);
	
	BQDeviceTrackingUpdateOutputModel updateDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingUpdateInputModel request);
	
	BQFinancialDocumentHandlingUpdateOutputModel updateFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingUpdateInputModel request);
	
	BQFinancialTransactionCaptureUpdateOutputModel updateFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureUpdateInputModel request);
	
	BQNetworkOperationUpdateOutputModel updateNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNetworkOperationUpdateInputModel request);
	
}
