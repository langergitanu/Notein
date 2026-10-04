package com.google.firebase.inappmessaging;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.Logging;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;
import oO00o0o.C32373OooO0OO;
import oO0OooOO.AbstractC33491OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public class FirebaseInAppMessaging {
    private boolean areMessagesSuppressed = false;
    private final DataCollectionHelper dataCollectionHelper;
    private final DeveloperListenerManager developerListenerManager;
    private final DisplayCallbacksFactory displayCallbacksFactory;
    private FirebaseInAppMessagingDisplay fiamDisplay;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final InAppMessageStreamManager inAppMessageStreamManager;
    private Executor lightWeightExecutor;
    private final ProgramaticContextualTriggers programaticContextualTriggers;

    public FirebaseInAppMessaging(InAppMessageStreamManager inAppMessageStreamManager, @ProgrammaticTrigger ProgramaticContextualTriggers programaticContextualTriggers, DataCollectionHelper dataCollectionHelper, FirebaseInstallationsApi firebaseInstallationsApi, DisplayCallbacksFactory displayCallbacksFactory, DeveloperListenerManager developerListenerManager, Executor executor) throws Exception {
        this.inAppMessageStreamManager = inAppMessageStreamManager;
        this.programaticContextualTriggers = programaticContextualTriggers;
        this.dataCollectionHelper = dataCollectionHelper;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.displayCallbacksFactory = displayCallbacksFactory;
        this.developerListenerManager = developerListenerManager;
        this.lightWeightExecutor = executor;
        firebaseInstallationsApi.getId().addOnSuccessListener(executor, new OooO00o());
        AbstractC33491OooO0o0<TriggeredInAppMessage> abstractC33491OooO0o0CreateFirebaseInAppMessageStream = inAppMessageStreamManager.createFirebaseInAppMessageStream();
        OooO0O0 oooO0O0 = new OooO0O0(this);
        abstractC33491OooO0o0CreateFirebaseInAppMessageStream.getClass();
        abstractC33491OooO0o0CreateFirebaseInAppMessageStream.OooO0OO(new C32373OooO0OO(oooO0O0));
    }

    public static FirebaseInAppMessaging getInstance() {
        return (FirebaseInAppMessaging) FirebaseApp.getInstance().get(FirebaseInAppMessaging.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(String str) {
        Logging.logi("Starting InAppMessaging runtime with Installation ID " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerInAppMessage(TriggeredInAppMessage triggeredInAppMessage) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.fiamDisplay;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(triggeredInAppMessage.getInAppMessage(), this.displayCallbacksFactory.generateDisplayCallback(triggeredInAppMessage.getInAppMessage(), triggeredInAppMessage.getTriggeringEvent()));
        }
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.developerListenerManager.addClickListener(firebaseInAppMessagingClickListener);
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener) {
        this.developerListenerManager.addDismissListener(firebaseInAppMessagingDismissListener);
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.developerListenerManager.addDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener);
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.developerListenerManager.addImpressionListener(firebaseInAppMessagingImpressionListener);
    }

    public boolean areMessagesSuppressed() {
        return this.areMessagesSuppressed;
    }

    public void clearDisplayListener() {
        Logging.logi("Removing display event component");
        this.fiamDisplay = null;
    }

    public boolean isAutomaticDataCollectionEnabled() {
        return this.dataCollectionHelper.isAutomaticDataCollectionEnabled();
    }

    public void removeAllListeners() {
        this.developerListenerManager.removeAllListeners();
    }

    public void removeClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.developerListenerManager.removeClickListener(firebaseInAppMessagingClickListener);
    }

    public void removeDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener) {
        this.developerListenerManager.removeDismissListener(firebaseInAppMessagingDismissListener);
    }

    public void removeDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.developerListenerManager.removeDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener);
    }

    public void removeImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.developerListenerManager.removeImpressionListener(firebaseInAppMessagingImpressionListener);
    }

    public void setAutomaticDataCollectionEnabled(Boolean bool) {
        this.dataCollectionHelper.setAutomaticDataCollectionEnabled(bool);
    }

    public void setMessageDisplayComponent(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        Logging.logi("Setting display event component");
        this.fiamDisplay = firebaseInAppMessagingDisplay;
    }

    public void setMessagesSuppressed(Boolean bool) {
        this.areMessagesSuppressed = bool.booleanValue();
    }

    public void triggerEvent(String str) {
        this.programaticContextualTriggers.triggerEvent(str);
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener, Executor executor) {
        this.developerListenerManager.addClickListener(firebaseInAppMessagingClickListener, executor);
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener, Executor executor) {
        this.developerListenerManager.addDismissListener(firebaseInAppMessagingDismissListener, executor);
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener, Executor executor) {
        this.developerListenerManager.addDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener, executor);
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener, Executor executor) {
        this.developerListenerManager.addImpressionListener(firebaseInAppMessagingImpressionListener, executor);
    }

    public void setAutomaticDataCollectionEnabled(boolean z) {
        this.dataCollectionHelper.setAutomaticDataCollectionEnabled(z);
    }
}
