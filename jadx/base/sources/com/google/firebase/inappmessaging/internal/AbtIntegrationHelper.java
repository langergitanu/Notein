package com.google.firebase.inappmessaging.internal;

import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.AbtExperimentInfo;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.firestore.core.RunnableC22620OooO0oo;
import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class AbtIntegrationHelper {
    private final FirebaseABTesting abTesting;
    Executor executor;

    public AbtIntegrationHelper(FirebaseABTesting firebaseABTesting, Executor executor) {
        this.abTesting = firebaseABTesting;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExperimentActive$1(ExperimentPayloadProto.ExperimentPayload experimentPayload) {
        try {
            Logging.logd("Updating active experiment: " + experimentPayload.toString());
            this.abTesting.reportActiveExperiment(new AbtExperimentInfo(experimentPayload.getExperimentId(), experimentPayload.getVariantId(), experimentPayload.getTriggerEvent(), new Date(experimentPayload.getExperimentStartTimeMillis()), experimentPayload.getTriggerTimeoutMillis(), experimentPayload.getTimeToLiveMillis()));
        } catch (AbtException e) {
            Logging.loge("Unable to set experiment as active with ABT, missing analytics?\n" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateRunningExperiments$0(ArrayList arrayList) {
        try {
            Logging.logd("Updating running experiments with: " + arrayList.size() + " experiments");
            this.abTesting.validateRunningExperiments(arrayList);
        } catch (AbtException e) {
            Logging.loge("Unable to register experiments with ABT, missing analytics?\n" + e.getMessage());
        }
    }

    public void setExperimentActive(ExperimentPayloadProto.ExperimentPayload experimentPayload) {
        this.executor.execute(new RunnableC22620OooO0oo(1, this, experimentPayload));
    }

    public void updateRunningExperiments(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        ArrayList arrayList = new ArrayList();
        for (CampaignProto.ThickContent thickContent : fetchEligibleCampaignsResponse.getMessagesList()) {
            if (!thickContent.getIsTestCampaign() && thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                ExperimentPayloadProto.ExperimentPayload experimentPayload = thickContent.getExperimentalPayload().getExperimentPayload();
                arrayList.add(new AbtExperimentInfo(experimentPayload.getExperimentId(), experimentPayload.getVariantId(), experimentPayload.getTriggerEvent(), new Date(experimentPayload.getExperimentStartTimeMillis()), experimentPayload.getTriggerTimeoutMillis(), experimentPayload.getTimeToLiveMillis()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.executor.execute(new OooOOOo.OooO0O0(1, this, arrayList));
    }
}
