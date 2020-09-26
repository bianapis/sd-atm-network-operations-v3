/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AtmNetworkOperationsApiServiceImpl implements AtmNetworkOperationsApiService {

	public SDATMNetworkOperationsActivateOutputModel activate(SDATMNetworkOperationsActivateInputModel request){
		return JsonReader.read("activate-SDATMNetworkOperationsActivateOutputModel.json",new TypeReference<SDATMNetworkOperationsActivateOutputModel>(){});
	}
	
	public SDATMNetworkOperationsConfigureOutputModel configure(String sdReferenceId, SDATMNetworkOperationsConfigureInputModel request){
		return JsonReader.read("configure-SDATMNetworkOperationsConfigureOutputModel.json",new TypeReference<SDATMNetworkOperationsConfigureOutputModel>(){});
	}
	
	public BQNetworkOperationControlOutputModel controlNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNetworkOperationControlInputModel request){
		return JsonReader.read("control-BQNetworkOperationControlOutputModel.json",new TypeReference<BQNetworkOperationControlOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRATMNetworkOperatingSessionControlOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionControlOutputModel>(){});
	}
	
	public BQCashDistributionExchangeOutputModel exchangeCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashDistributionExchangeInputModel request){
		return JsonReader.read("exchange-BQCashDistributionExchangeOutputModel.json",new TypeReference<BQCashDistributionExchangeOutputModel>(){});
	}
	
	public BQDeviceTrackingExchangeOutputModel exchangeDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingExchangeInputModel request){
		return JsonReader.read("exchange-BQDeviceTrackingExchangeOutputModel.json",new TypeReference<BQDeviceTrackingExchangeOutputModel>(){});
	}
	
	public BQFinancialDocumentHandlingExchangeOutputModel exchangeFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingExchangeInputModel request){
		return JsonReader.read("exchange-BQFinancialDocumentHandlingExchangeOutputModel.json",new TypeReference<BQFinancialDocumentHandlingExchangeOutputModel>(){});
	}
	
	public BQFinancialTransactionCaptureExchangeOutputModel exchangeFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureExchangeInputModel request){
		return JsonReader.read("exchange-BQFinancialTransactionCaptureExchangeOutputModel.json",new TypeReference<BQFinancialTransactionCaptureExchangeOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRATMNetworkOperatingSessionExchangeOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionExchangeOutputModel>(){});
	}
	
	public BQDeviceTrackingExecuteOutputModel executeDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQDeviceTrackingExecuteOutputModel.json",new TypeReference<BQDeviceTrackingExecuteOutputModel>(){});
	}
	
	public BQFinancialDocumentHandlingExecuteOutputModel executeFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingExecuteInputModel request){
		return JsonReader.read("execute-BQFinancialDocumentHandlingExecuteOutputModel.json",new TypeReference<BQFinancialDocumentHandlingExecuteOutputModel>(){});
	}
	
	public BQFinancialTransactionCaptureExecuteOutputModel executeFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureExecuteInputModel request){
		return JsonReader.read("execute-BQFinancialTransactionCaptureExecuteOutputModel.json",new TypeReference<BQFinancialTransactionCaptureExecuteOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRATMNetworkOperatingSessionExecuteOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionExecuteOutputModel>(){});
	}
	
	public SDATMNetworkOperationsFeedbackOutputModel feedback(String sdReferenceId, SDATMNetworkOperationsFeedbackInputModel request){
		return JsonReader.read("feedback-SDATMNetworkOperationsFeedbackOutputModel.json",new TypeReference<SDATMNetworkOperationsFeedbackOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRATMNetworkOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRATMNetworkOperatingSessionInitiateOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQFinancialDocumentHandlingInitiateOutputModel initiateFinancialdocumenthandling(String sdReferenceId, String crReferenceId, BQFinancialDocumentHandlingInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialDocumentHandlingInitiateOutputModel.json",new TypeReference<BQFinancialDocumentHandlingInitiateOutputModel>(){});
	}
	
	public BQFinancialTransactionCaptureInitiateOutputModel initiateFinancialtransactioncapture(String sdReferenceId, String crReferenceId, BQFinancialTransactionCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialTransactionCaptureInitiateOutputModel.json",new TypeReference<BQFinancialTransactionCaptureInitiateOutputModel>(){});
	}
	
	public BQNetworkOperationInitiateOutputModel initiateNetworkoperation(String sdReferenceId, String crReferenceId, BQNetworkOperationInitiateInputModel request){
		return JsonReader.read("initiate-BQNetworkOperationInitiateOutputModel.json",new TypeReference<BQNetworkOperationInitiateOutputModel>(){});
	}
	
	public BQCashDistributionRequestOutputModel requestCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashDistributionRequestInputModel request){
		return JsonReader.read("request-BQCashDistributionRequestOutputModel.json",new TypeReference<BQCashDistributionRequestOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRATMNetworkOperatingSessionRequestOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionRequestOutputModel>(){});
	}
	
	public BQCashDistributionRetrieveOutputModel retrieveCashdistribution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCashDistributionRetrieveOutputModel.json",new TypeReference<BQCashDistributionRetrieveOutputModel>(){});
	}
	
	public BQDeviceTrackingRetrieveOutputModel retrieveDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeviceTrackingRetrieveOutputModel.json",new TypeReference<BQDeviceTrackingRetrieveOutputModel>(){});
	}
	
	public BQFinancialDocumentHandlingRetrieveOutputModel retrieveFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialDocumentHandlingRetrieveOutputModel.json",new TypeReference<BQFinancialDocumentHandlingRetrieveOutputModel>(){});
	}
	
	public BQFinancialTransactionCaptureRetrieveOutputModel retrieveFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQFinancialTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public BQNetworkOperationRetrieveOutputModel retrieveNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQNetworkOperationRetrieveOutputModel.json",new TypeReference<BQNetworkOperationRetrieveOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRATMNetworkOperatingSessionRetrieveOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDATMNetworkOperationsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDATMNetworkOperationsRetrieveOutputModel.json",new TypeReference<SDATMNetworkOperationsRetrieveOutputModel>(){});
	}
	
	public CRATMNetworkOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRATMNetworkOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRATMNetworkOperatingSessionUpdateOutputModel.json",new TypeReference<CRATMNetworkOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQDeviceTrackingUpdateOutputModel updateDevicetracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceTrackingUpdateInputModel request){
		return JsonReader.read("update-BQDeviceTrackingUpdateOutputModel.json",new TypeReference<BQDeviceTrackingUpdateOutputModel>(){});
	}
	
	public BQFinancialDocumentHandlingUpdateOutputModel updateFinancialdocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialDocumentHandlingUpdateInputModel request){
		return JsonReader.read("update-BQFinancialDocumentHandlingUpdateOutputModel.json",new TypeReference<BQFinancialDocumentHandlingUpdateOutputModel>(){});
	}
	
	public BQFinancialTransactionCaptureUpdateOutputModel updateFinancialtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionCaptureUpdateInputModel request){
		return JsonReader.read("update-BQFinancialTransactionCaptureUpdateOutputModel.json",new TypeReference<BQFinancialTransactionCaptureUpdateOutputModel>(){});
	}
	
	public BQNetworkOperationUpdateOutputModel updateNetworkoperation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNetworkOperationUpdateInputModel request){
		return JsonReader.read("update-BQNetworkOperationUpdateOutputModel.json",new TypeReference<BQNetworkOperationUpdateOutputModel>(){});
	}
	
}
