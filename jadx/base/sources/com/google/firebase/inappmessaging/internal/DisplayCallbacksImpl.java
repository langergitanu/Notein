package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.aspose.slides.C22220Oooo00o;
import com.aspose.slides.C22221Oooo0O0;
import com.aspose.slides.C22222Oooo0OO;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.C22629OooOoO;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpression;
import java.util.concurrent.Callable;
import o0Oo0oOo.o00Oo0;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o0O.C32333OooO00o;
import oO00o0O.C32335OooO0OO;
import oO00o0O.C32337OooO0o;
import oO00o0O.C32338OooO0o0;
import oO00o0OO.C32347OooO0O0;
import oO00o0OO.C32349OooO0Oo;
import oO00o0OO.C32354OooOO0;
import oO00o0OO.C32360OooOOOo;
import oO00o0OO.C32361OooOOo;
import oO00o0OO.C32362OooOOo0;
import oO00o0OO.C32363OooOOoo;
import oO00o0OO.CallableC32345OooO;
import oO0OOOoo.InterfaceC33025OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.AbstractC33500OooOOOo;
import oO0OooOO.InterfaceC33496OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
public class DisplayCallbacksImpl implements FirebaseInAppMessagingDisplayCallbacks {
    private static final String MESSAGE_CLICK = "message click to metrics logger";
    private final RateLimit appForegroundRateLimit;
    private final CampaignCacheClient campaignCacheClient;
    private final Clock clock;
    private final DataCollectionHelper dataCollectionHelper;
    private final ImpressionStorageClient impressionStorageClient;
    private final InAppMessage inAppMessage;
    private final MetricsLoggerClient metricsLoggerClient;
    private final RateLimiterClient rateLimiterClient;
    private final Schedulers schedulers;
    private final String triggeringEvent;
    private boolean wasImpressed = false;

    public DisplayCallbacksImpl(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, CampaignCacheClient campaignCacheClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper, InAppMessage inAppMessage, String str) {
        this.impressionStorageClient = impressionStorageClient;
        this.clock = clock;
        this.schedulers = schedulers;
        this.rateLimiterClient = rateLimiterClient;
        this.campaignCacheClient = campaignCacheClient;
        this.appForegroundRateLimit = rateLimit;
        this.metricsLoggerClient = metricsLoggerClient;
        this.dataCollectionHelper = dataCollectionHelper;
        this.inAppMessage = inAppMessage;
        this.triggeringEvent = str;
    }

    private boolean actionMatches(Action action, Action action2) {
        return action == null ? action2 == null || TextUtils.isEmpty(action2.getActionUrl()) : action.getActionUrl().equals(action2.getActionUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayErrorEncountered$4(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) throws Exception {
        this.metricsLoggerClient.logRenderError(this.inAppMessage, inAppMessagingErrorReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$impressionDetected$0() throws Exception {
        this.metricsLoggerClient.logImpression(this.inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logMessageClick$3(Action action) throws Exception {
        this.metricsLoggerClient.logMessageClick(this.inAppMessage, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC33496OooOO0o lambda$maybeToTask$10(TaskCompletionSource taskCompletionSource, Throwable th) throws Exception {
        if (th instanceof Exception) {
            taskCompletionSource.setException((Exception) th);
        } else {
            taskCompletionSource.setException(new RuntimeException(th));
        }
        return C32349OooO0Oo.f116296OooOo0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$maybeToTask$9(TaskCompletionSource taskCompletionSource) throws Exception {
        taskCompletionSource.setResult(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$messageDismissed$2(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) throws Exception {
        this.metricsLoggerClient.logDismiss(this.inAppMessage, inAppMessagingDismissType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWasImpressed$1() throws Exception {
        this.wasImpressed = true;
    }

    private void logActionNotTaken(String str, AbstractC33485OooO<String> abstractC33485OooO) {
        if (abstractC33485OooO != null) {
            Logging.logd(String.format("Not recording: %s. Reason: %s", str, abstractC33485OooO));
            return;
        }
        if (this.inAppMessage.getCampaignMetadata().getIsTestMessage()) {
            Logging.logd("Not recording: " + str + ". Reason: Message is test message");
            return;
        }
        if (this.dataCollectionHelper.isAutomaticDataCollectionEnabled()) {
            Logging.logd("Not recording: " + str);
        } else {
            Logging.logd("Not recording: " + str + ". Reason: Data collection is disabled");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Task<Void> logImpressionIfNeeded(AbstractC33487OooO0O0 abstractC33487OooO0O0) {
        if (!this.wasImpressed) {
            impressionDetected();
        }
        abstractC33487OooO0O0.getClass();
        return maybeToTask(abstractC33487OooO0O0 instanceof InterfaceC33025OooO0OO ? ((InterfaceC33025OooO0OO) abstractC33487OooO0O0).OooO0OO() : new C32354OooOO0(abstractC33487OooO0O0), this.schedulers.m75290io());
    }

    private Task<Void> logMessageClick(final Action action) {
        Logging.logd("Attempting to record: message click to metrics logger");
        return logImpressionIfNeeded(new C32335OooO0OO(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooOO0
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68488OooOo0o.lambda$logMessageClick$3(action);
            }
        }));
    }

    private AbstractC33487OooO0O0 logToImpressionStore() {
        String campaignId = this.inAppMessage.getCampaignMetadata().getCampaignId();
        Logging.logd("Attempting to record message impression in impression store for id: " + campaignId);
        AbstractC33487OooO0O0 abstractC33487OooO0O0StoreImpression = this.impressionStorageClient.storeImpression(CampaignImpression.newBuilder().setImpressionTimestampMillis(this.clock.now()).setCampaignId(campaignId).build());
        C22220Oooo00o c22220Oooo00o = new C22220Oooo00o();
        abstractC33487OooO0O0StoreImpression.getClass();
        OooO00o.OooO0O0 oooO0O0 = oO00o0.OooO00o.f116237OooO0OO;
        C32337OooO0o c32337OooO0oOooO0Oo = new C32337OooO0o(abstractC33487OooO0O0StoreImpression, c22220Oooo00o, oooO0O0).OooO0Oo(new com.aspose.slides.Oooo0());
        if (!InAppMessageStreamManager.isAppForegroundEvent(this.triggeringEvent)) {
            return c32337OooO0oOooO0Oo;
        }
        AbstractC33487OooO0O0 abstractC33487OooO0O0Increment = this.rateLimiterClient.increment(this.appForegroundRateLimit);
        C22221Oooo0O0 c22221Oooo0O0 = new C22221Oooo0O0();
        abstractC33487OooO0O0Increment.getClass();
        return new C32338OooO0o0(new C32337OooO0o(abstractC33487OooO0O0Increment, c22221Oooo0O0, oooO0O0).OooO0Oo(new C22222Oooo0OO())).OooO0OO(c32337OooO0oOooO0Oo);
    }

    private static <T> Task<T> maybeToTask(AbstractC33485OooO<T> abstractC33485OooO, AbstractC33500OooOOOo abstractC33500OooOOOo) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C22730OooOO0o c22730OooOO0o = new C22730OooOO0o(taskCompletionSource);
        abstractC33485OooO.getClass();
        C32360OooOOOo c32360OooOOOo = new C32360OooOOOo(new C32363OooOOoo(new C32362OooOOo0(abstractC33485OooO, c22730OooOO0o, oO00o0.OooO00o.f116238OooO0Oo), new CallableC32345OooO(new Callable() { // from class: com.google.firebase.inappmessaging.internal.OooOOO0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DisplayCallbacksImpl.lambda$maybeToTask$9(taskCompletionSource);
            }
        })), new C22629OooOoO(taskCompletionSource));
        o00Oo0.OooO00o(abstractC33500OooOOOo, "scheduler is null");
        new C32361OooOOo(c32360OooOOOo, abstractC33500OooOOOo).OooO00o(new C32347OooO0O0());
        return taskCompletionSource.getTask();
    }

    private boolean shouldLog() {
        return this.dataCollectionHelper.isAutomaticDataCollectionEnabled();
    }

    private AbstractC33487OooO0O0 updateWasImpressed() {
        return new C32335OooO0OO(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooO0oo
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68486OooOo0o.lambda$updateWasImpressed$1();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> displayErrorEncountered(final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        if (!shouldLog()) {
            logActionNotTaken("render error to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        Logging.logd("Attempting to record: render error to metrics logger");
        C32333OooO00o c32333OooO00oOooO0OO = logToImpressionStore().OooO0OO(new C32335OooO0OO(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooOO0O
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68490OooOo0o.lambda$displayErrorEncountered$4(inAppMessagingErrorReason);
            }
        })).OooO0OO(updateWasImpressed());
        return maybeToTask(c32333OooO00oOooO0OO instanceof InterfaceC33025OooO0OO ? ((InterfaceC33025OooO0OO) c32333OooO00oOooO0OO).OooO0OO() : new C32354OooOO0(c32333OooO00oOooO0OO), this.schedulers.m75290io());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> impressionDetected() {
        if (!shouldLog() || this.wasImpressed) {
            logActionNotTaken("message impression to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        Logging.logd("Attempting to record: message impression to metrics logger");
        C32333OooO00o c32333OooO00oOooO0OO = logToImpressionStore().OooO0OO(new C32335OooO0OO(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooOOO
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68492OooOo0o.lambda$impressionDetected$0();
            }
        })).OooO0OO(updateWasImpressed());
        return maybeToTask(c32333OooO00oOooO0OO instanceof InterfaceC33025OooO0OO ? ((InterfaceC33025OooO0OO) c32333OooO00oOooO0OO).OooO0OO() : new C32354OooOO0(c32333OooO00oOooO0OO), this.schedulers.m75290io());
    }

    @Deprecated
    public Task<Void> messageClicked() {
        return messageClicked(this.inAppMessage.getAction());
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> messageDismissed(final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        if (shouldLog()) {
            Logging.logd("Attempting to record: message dismissal to metrics logger");
            return logImpressionIfNeeded(new C32335OooO0OO(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooO
                @Override // oO00o00o.InterfaceC32329OooO00o
                public final void run() throws Exception {
                    this.f68471OooOo0o.lambda$messageDismissed$2(inAppMessagingDismissType);
                }
            }));
        }
        logActionNotTaken("message dismissal to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    public boolean wasImpressed() {
        return this.wasImpressed;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> messageClicked(Action action) {
        if (shouldLog()) {
            return action.getActionUrl() == null ? messageDismissed(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK) : logMessageClick(action);
        }
        logActionNotTaken(MESSAGE_CLICK);
        return new TaskCompletionSource().getTask();
    }

    private void logActionNotTaken(String str) {
        logActionNotTaken(str, null);
    }
}
