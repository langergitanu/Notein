package com.google.firebase.inappmessaging.internal;

import OooOoO.C20509OooO0oo;
import OooooOo.C21385OooOOOO;
import OooooOo.C21387OooOOo;
import OooooOo.C21392OooOo00;
import OoooooO.C21445Oooo;
import android.text.TextUtils;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.C22352OooO0Oo;
import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import o0Oo0oOo.o00Oo0;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO00o0O.C32334OooO0O0;
import oO00o0O.C32337OooO0o;
import oO00o0O.C32339OooO0oO;
import oO00o0O0.C32344OooO0o0;
import oO00o0OO.C32348OooO0OO;
import oO00o0OO.C32349OooO0Oo;
import oO00o0OO.C32350OooO0o;
import oO00o0OO.C32351OooO0o0;
import oO00o0OO.C32353OooO0oo;
import oO00o0OO.C32357OooOOO;
import oO00o0OO.C32359OooOOOO;
import oO00o0OO.C32360OooOOOo;
import oO00o0OO.C32362OooOOo0;
import oO00o0OO.C32363OooOOoo;
import oO00o0OO.C32365OooOo00;
import oO00o0OO.C32366OooOo0O;
import oO00o0Oo.C32367OooO00o;
import oO00o0Oo.C32368OooO0O0;
import oO00o0Oo.C32369OooO0OO;
import oO00o0Oo.C32370OooO0Oo;
import oO0OOOOo.C32971OooO0Oo;
import oO0OOOOo.C32973OooO0oO;
import oO0OOOOo.C32974OooO0oo;
import oO0OOOOo.C32975OooOO0o;
import oO0OOOOo.C32976OooOOOo;
import oO0OOOOo.C32978OooOOo0;
import oO0OOOOo.C32981OooOo0O;
import oO0OOOOo.OooOo00;
import oO0OOOoo.InterfaceC33024OooO0O0;
import oO0OOOoo.InterfaceCallableC33030OooO0oo;
import oO0OOoOO.AbstractC33127OooO00o;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.AbstractC33500OooOOOo;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33489OooO0Oo;
import oO0OooOO.InterfaceC33494OooOO0;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33496OooOO0o;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
public class InAppMessageStreamManager {
    public static final String ON_FOREGROUND = "ON_FOREGROUND";
    private final AbtIntegrationHelper abtIntegrationHelper;
    private final AnalyticsEventsManager analyticsEventsManager;
    private final ApiClient apiClient;
    private final AbstractC33127OooO00o<String> appForegroundEventFlowable;
    private final RateLimit appForegroundRateLimit;
    private final Executor blockingExecutor;
    private final CampaignCacheClient campaignCacheClient;
    private final Clock clock;
    private final DataCollectionHelper dataCollectionHelper;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ImpressionStorageClient impressionStorageClient;
    private final AbstractC33127OooO00o<String> programmaticTriggerEventFlowable;
    private final RateLimiterClient rateLimiterClient;
    private final Schedulers schedulers;
    private final TestDeviceHelper testDeviceHelper;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$1 */
    public static /* synthetic */ class C171441 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase */
        static final /* synthetic */ int[] f51825x95e22605;

        static {
            int[] iArr = new int[MessagesProto.Content.MessageDetailsCase.values().length];
            f51825x95e22605 = iArr;
            try {
                iArr[MessagesProto.Content.MessageDetailsCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51825x95e22605[MessagesProto.Content.MessageDetailsCase.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51825x95e22605[MessagesProto.Content.MessageDetailsCase.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51825x95e22605[MessagesProto.Content.MessageDetailsCase.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public InAppMessageStreamManager(@AppForeground AbstractC33127OooO00o<String> abstractC33127OooO00o, @ProgrammaticTrigger AbstractC33127OooO00o<String> abstractC33127OooO00o2, CampaignCacheClient campaignCacheClient, Clock clock, ApiClient apiClient, AnalyticsEventsManager analyticsEventsManager, Schedulers schedulers, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, @AppForeground RateLimit rateLimit, TestDeviceHelper testDeviceHelper, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionHelper dataCollectionHelper, AbtIntegrationHelper abtIntegrationHelper, Executor executor) {
        this.appForegroundEventFlowable = abstractC33127OooO00o;
        this.programmaticTriggerEventFlowable = abstractC33127OooO00o2;
        this.campaignCacheClient = campaignCacheClient;
        this.clock = clock;
        this.apiClient = apiClient;
        this.analyticsEventsManager = analyticsEventsManager;
        this.schedulers = schedulers;
        this.impressionStorageClient = impressionStorageClient;
        this.rateLimiterClient = rateLimiterClient;
        this.appForegroundRateLimit = rateLimit;
        this.testDeviceHelper = testDeviceHelper;
        this.dataCollectionHelper = dataCollectionHelper;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.abtIntegrationHelper = abtIntegrationHelper;
        this.blockingExecutor = executor;
    }

    public static FetchEligibleCampaignsResponse cacheExpiringResponse() {
        return FetchEligibleCampaignsResponse.newBuilder().setExpirationEpochTimestampMillis(1L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByPriority(CampaignProto.ThickContent thickContent, CampaignProto.ThickContent thickContent2) {
        if (thickContent.getIsTestCampaign() && !thickContent2.getIsTestCampaign()) {
            return -1;
        }
        if (!thickContent2.getIsTestCampaign() || thickContent.getIsTestCampaign()) {
            return Integer.compare(thickContent.getPriority().getValue(), thickContent2.getPriority().getValue());
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsTriggeringCondition(String str, CampaignProto.ThickContent thickContent) {
        if (isAppForegroundEvent(str) && thickContent.getIsTestCampaign()) {
            return true;
        }
        for (CommonTypesProto.TriggeringCondition triggeringCondition : thickContent.getTriggeringConditionsList()) {
            if (hasFiamTrigger(triggeringCondition, str) || hasAnalyticsTrigger(triggeringCondition, str)) {
                Logging.logd("The event " + str + " is contained in the list of triggers");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getContentIfNotRateLimited, reason: merged with bridge method [inline-methods] */
    public AbstractC33485OooO<CampaignProto.ThickContent> lambda$createFirebaseInAppMessageStream$12(String str, CampaignProto.ThickContent thickContent) {
        if (thickContent.getIsTestCampaign() || !isAppForegroundEvent(str)) {
            return AbstractC33485OooO.OooO0O0(thickContent);
        }
        AbstractC33502OooOOo0<Boolean> abstractC33502OooOOo0IsRateLimited = this.rateLimiterClient.isRateLimited(this.appForegroundRateLimit);
        C20509OooO0oo c20509OooO0oo = new C20509OooO0oo();
        abstractC33502OooOOo0IsRateLimited.getClass();
        return new C32357OooOOO(new C32350OooO0o(new C32370OooO0Oo(new C32368OooO0O0(abstractC33502OooOOo0IsRateLimited, c20509OooO0oo), new OooO00o.CallableC32324OooO0oO(new C32369OooO0OO())), new com.aspose.slides.internal.p284mx.OooO00o()), new C22743OooOooO(thickContent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getTriggeredInAppMessageMaybe, reason: merged with bridge method [inline-methods] */
    public AbstractC33485OooO<TriggeredInAppMessage> lambda$createFirebaseInAppMessageStream$14(final String str, InterfaceC32331OooO0OO<CampaignProto.ThickContent, AbstractC33485OooO<CampaignProto.ThickContent>> interfaceC32331OooO0OO, InterfaceC32331OooO0OO<CampaignProto.ThickContent, AbstractC33485OooO<CampaignProto.ThickContent>> interfaceC32331OooO0OO2, InterfaceC32331OooO0OO<CampaignProto.ThickContent, AbstractC33485OooO<CampaignProto.ThickContent>> interfaceC32331OooO0OO3, FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        List<CampaignProto.ThickContent> messagesList = fetchEligibleCampaignsResponse.getMessagesList();
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO00o(messagesList, "source is null");
        C32976OooOOOo c32976OooOOOo = new C32976OooOOOo(new C32981OooOo0O(new C32974OooO0oo(new C32974OooO0oo(new oO0OOOOo.OooOOO0(messagesList), new Oooo000(this)), new InterfaceC32332OooO0Oo() { // from class: com.google.firebase.inappmessaging.internal.Oooo00O
            @Override // oO00o00o.InterfaceC32332OooO0Oo
            public final boolean test(Object obj) {
                return InAppMessageStreamManager.containsTriggeringCondition(str, (CampaignProto.ThickContent) obj);
            }
        }).OooO00o(interfaceC32331OooO0OO).OooO00o(interfaceC32331OooO0OO2).OooO00o(interfaceC32331OooO0OO3)).OooO0Oo(), new OooO00o.C32325OooO0oo(new C22747Oooo00o()));
        int i2 = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO0O0(i2, "bufferSize");
        return new C32353OooO0oo(new oO0OOOOo.OooO0o(new oO0OOOOo.OooOO0O(c32976OooOOOo, i2)), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.Oooo0
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68524OooOo0o.lambda$getTriggeredInAppMessageMaybe$27(str, (CampaignProto.ThickContent) obj);
            }
        });
    }

    private static boolean hasAnalyticsTrigger(CommonTypesProto.TriggeringCondition triggeringCondition, String str) {
        return triggeringCondition.getEvent().getName().equals(str);
    }

    private static boolean hasFiamTrigger(CommonTypesProto.TriggeringCondition triggeringCondition, String str) {
        return triggeringCondition.getFiamTrigger().toString().equals(str);
    }

    private static boolean isActive(Clock clock, CampaignProto.ThickContent thickContent) {
        long campaignStartTimeMillis;
        long campaignEndTimeMillis;
        if (!thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            if (thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                campaignStartTimeMillis = thickContent.getExperimentalPayload().getCampaignStartTimeMillis();
                campaignEndTimeMillis = thickContent.getExperimentalPayload().getCampaignEndTimeMillis();
            }
        }
        campaignStartTimeMillis = thickContent.getVanillaPayload().getCampaignStartTimeMillis();
        campaignEndTimeMillis = thickContent.getVanillaPayload().getCampaignEndTimeMillis();
        long jNow = clock.now();
        return jNow > campaignStartTimeMillis && jNow < campaignEndTimeMillis;
    }

    public static boolean isAppForegroundEvent(CommonTypesProto.TriggeringCondition triggeringCondition) {
        return triggeringCondition.getFiamTrigger().toString().equals(ON_FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$0(String str) throws Exception {
        Logging.logd("Event Triggered: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CampaignProto.ThickContent lambda$createFirebaseInAppMessageStream$10(CampaignProto.ThickContent thickContent, Boolean bool) throws Exception {
        return thickContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC33485OooO lambda$createFirebaseInAppMessageStream$11(final CampaignProto.ThickContent thickContent) throws Exception {
        if (thickContent.getIsTestCampaign()) {
            return AbstractC33485OooO.OooO0O0(thickContent);
        }
        AbstractC33502OooOOo0<Boolean> abstractC33502OooOOo0IsImpressed = this.impressionStorageClient.isImpressed(thickContent);
        com.aspose.slides.internal.p332p7.OooO0o oooO0o = new com.aspose.slides.internal.p332p7.OooO0o();
        abstractC33502OooOOo0IsImpressed.getClass();
        return new C32357OooOOO(new C32350OooO0o(new C32368OooO0O0(new C32370OooO0Oo(new C32367OooO00o(abstractC33502OooOOo0IsImpressed, oooO0o), new OooO00o.CallableC32324OooO0oO(new C32369OooO0OO())), new C22741OooOoo(thickContent, 0)), new C21445Oooo()), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OooOooo
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$10(thickContent, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC33485OooO lambda$createFirebaseInAppMessageStream$13(CampaignProto.ThickContent thickContent) throws Exception {
        int i = C171441.f51825x95e22605[thickContent.getContent().getMessageDetailsCase().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return AbstractC33485OooO.OooO0O0(thickContent);
        }
        Logging.logd("Filtering non-displayable message");
        return C32349OooO0Oo.f116296OooOo0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$15(Throwable th) throws Exception {
        Logging.logw("Impressions store read fail: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FetchEligibleCampaignsResponse lambda$createFirebaseInAppMessageStream$16(CampaignImpressionList campaignImpressionList, InstallationIdResult installationIdResult) throws Exception {
        return this.apiClient.getFiams(installationIdResult, campaignImpressionList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$17(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) throws Exception {
        Locale locale = Locale.US;
        Logging.logi("Successfully fetched " + fetchEligibleCampaignsResponse.getMessagesList().size() + " messages from backend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createFirebaseInAppMessageStream$18(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) throws Exception {
        AbstractC33487OooO0O0 abstractC33487OooO0O0ClearImpressions = this.impressionStorageClient.clearImpressions(fetchEligibleCampaignsResponse);
        abstractC33487OooO0O0ClearImpressions.getClass();
        abstractC33487OooO0O0ClearImpressions.OooO00o(new C32344OooO0o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$19(Throwable th) throws Exception {
        Logging.logw("Service fetch error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$2(Throwable th) throws Exception {
        Logging.logw("Cache read error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC33485OooO lambda$createFirebaseInAppMessageStream$20(AbstractC33485OooO abstractC33485OooO, final CampaignImpressionList campaignImpressionList) throws Exception {
        if (!this.dataCollectionHelper.isAutomaticDataCollectionEnabled()) {
            Logging.logi("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return AbstractC33485OooO.OooO0O0(cacheExpiringResponse());
        }
        com.aspose.slides.internal.p097e0.OooO0O0 oooO0O0 = new com.aspose.slides.internal.p097e0.OooO0O0();
        abstractC33485OooO.getClass();
        C32363OooOOoo c32363OooOOoo = new C32363OooOOoo(new C32357OooOOO(new C32351OooO0o0(abstractC33485OooO, oooO0O0), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OooOo
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68503OooOo0o.lambda$createFirebaseInAppMessageStream$16(campaignImpressionList, (InstallationIdResult) obj);
            }
        }), AbstractC33485OooO.OooO0O0(cacheExpiringResponse()));
        C21385OooOOOO c21385OooOOOO = new C21385OooOOOO();
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        C32362OooOOo0 c32362OooOOo0 = new C32362OooOOo0(new C32362OooOOo0(c32363OooOOoo, c21385OooOOOO, oooO0OO), new C22352OooO0Oo(this), oooO0OO);
        AnalyticsEventsManager analyticsEventsManager = this.analyticsEventsManager;
        Objects.requireNonNull(analyticsEventsManager);
        C32362OooOOo0 c32362OooOOo02 = new C32362OooOOo0(c32362OooOOo0, new C22739OooOoO0(analyticsEventsManager, 0), oooO0OO);
        TestDeviceHelper testDeviceHelper = this.testDeviceHelper;
        Objects.requireNonNull(testDeviceHelper);
        C32362OooOOo0 c32362OooOOo03 = new C32362OooOOo0(new C32362OooOOo0(c32362OooOOo02, new C21387OooOOo(testDeviceHelper), oooO0OO), oooO0OO, new C21392OooOo00());
        C32349OooO0Oo c32349OooO0Oo = C32349OooO0Oo.f116296OooOo0o;
        o00Oo0.OooO00o(c32349OooO0Oo, "next is null");
        return new C32360OooOOOo(c32362OooOOo03, new OooO00o.CallableC32324OooO0oO(c32349OooO0Oo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.inappmessaging.internal.Oooo0o0] */
    public oOO00OOO.OooO00o lambda$createFirebaseInAppMessageStream$21(final String str) throws Exception {
        AbstractC33485OooO<FetchEligibleCampaignsResponse> abstractC33485OooO = this.campaignCacheClient.get();
        com.aspose.slides.internal.p332p7.OooOOO0 oooOOO0 = new com.aspose.slides.internal.p332p7.OooOOO0();
        abstractC33485OooO.getClass();
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        C32362OooOOo0 c32362OooOOo0 = new C32362OooOOo0(new C32362OooOOo0(abstractC33485OooO, oooOOO0, oooO0OO), oooO0OO, new android.support.v4.media.session.OooO00o());
        C32349OooO0Oo c32349OooO0Oo = C32349OooO0Oo.f116296OooOo0o;
        o00Oo0.OooO00o(c32349OooO0Oo, "next is null");
        C32360OooOOOo c32360OooOOOo = new C32360OooOOOo(c32362OooOOo0, new OooO00o.CallableC32324OooO0oO(c32349OooO0Oo));
        InterfaceC32330OooO0O0 interfaceC32330OooO0O0 = new InterfaceC32330OooO0O0() { // from class: com.google.firebase.inappmessaging.internal.Oooo0O0
            @Override // oO00o00o.InterfaceC32330OooO0O0
            public final void accept(Object obj) throws Exception {
                this.f68527OooOo0o.lambda$createFirebaseInAppMessageStream$6((FetchEligibleCampaignsResponse) obj);
            }
        };
        final C22749Oooo0OO c22749Oooo0OO = new C22749Oooo0OO(this);
        final ?? r9 = new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.Oooo0o0
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68535OooOo0o.lambda$createFirebaseInAppMessageStream$12(str, (CampaignProto.ThickContent) obj);
            }
        };
        final androidx.appcompat.app.OooOOO oooOOO = new androidx.appcompat.app.OooOOO();
        InterfaceC32331OooO0OO interfaceC32331OooO0OO = new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.Oooo0o
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                InAppMessageStreamManager inAppMessageStreamManager = this.f68530OooOo0o;
                C22749Oooo0OO c22749Oooo0OO2 = c22749Oooo0OO;
                C22751Oooo0o0 c22751Oooo0o0 = r9;
                return inAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$14(str, c22749Oooo0OO2, c22751Oooo0o0, oooOOO, (FetchEligibleCampaignsResponse) obj);
            }
        };
        AbstractC33485OooO<CampaignImpressionList> allImpressions = this.impressionStorageClient.getAllImpressions();
        Oooo00o.OooO0OO oooO0OO2 = new Oooo00o.OooO0OO();
        allImpressions.getClass();
        C32362OooOOo0 c32362OooOOo02 = new C32362OooOOo0(allImpressions, oooO0OO, oooO0OO2);
        CampaignImpressionList defaultInstance = CampaignImpressionList.getDefaultInstance();
        o00Oo0.OooO00o(defaultInstance, "item is null");
        C32360OooOOOo c32360OooOOOo2 = new C32360OooOOOo(new C32363OooOOoo(c32362OooOOo02, AbstractC33485OooO.OooO0O0(defaultInstance)), new OooO00o.CallableC32324OooO0oO(AbstractC33485OooO.OooO0O0(CampaignImpressionList.getDefaultInstance())));
        AbstractC33485OooO abstractC33485OooOTaskToMaybe = taskToMaybe(this.firebaseInstallations.getId(), this.blockingExecutor);
        AbstractC33485OooO abstractC33485OooOTaskToMaybe2 = taskToMaybe(this.firebaseInstallations.getToken(false), this.blockingExecutor);
        o00Oo0.OooO00o(abstractC33485OooOTaskToMaybe, "source1 is null");
        o00Oo0.OooO00o(abstractC33485OooOTaskToMaybe2, "source2 is null");
        C32366OooOo0O c32366OooOo0O = new C32366OooOo0O(new InterfaceC33496OooOO0o[]{abstractC33485OooOTaskToMaybe, abstractC33485OooOTaskToMaybe2}, new OooO00o.C20215OooO00o());
        AbstractC33500OooOOOo abstractC33500OooOOOoM75290io = this.schedulers.m75290io();
        o00Oo0.OooO00o(abstractC33500OooOOOoM75290io, "scheduler is null");
        final C32359OooOOOO c32359OooOOOO = new C32359OooOOOO(c32366OooOo0O, abstractC33500OooOOOoM75290io);
        InterfaceC32331OooO0OO interfaceC32331OooO0OO2 = new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OooOo0O
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68509OooOo0o.lambda$createFirebaseInAppMessageStream$20(c32359OooOOOO, (CampaignImpressionList) obj);
            }
        };
        if (!shouldIgnoreCache(str)) {
            Logging.logd("Attempting to fetch campaigns using cache");
            C32353OooO0oo c32353OooO0oo = new C32353OooO0oo(new C32363OooOOoo(c32360OooOOOo, new C32362OooOOo0(new C32353OooO0oo(c32360OooOOOo2, interfaceC32331OooO0OO2), interfaceC32330OooO0O0, oooO0OO)), interfaceC32331OooO0OO);
            return c32353OooO0oo instanceof InterfaceC33024OooO0O0 ? ((InterfaceC33024OooO0O0) c32353OooO0oo).OooO0Oo() : new C32365OooOo00(c32353OooO0oo);
        }
        Logging.logi("Forcing fetch from service rather than cache. Test Device: " + this.testDeviceHelper.isDeviceInTestMode() + " | App Fresh Install: " + this.testDeviceHelper.isAppInstallFresh());
        C32353OooO0oo c32353OooO0oo2 = new C32353OooO0oo(new C32353OooO0oo(c32360OooOOOo2, interfaceC32331OooO0OO2), interfaceC32331OooO0OO);
        return c32353OooO0oo2 instanceof InterfaceC33024OooO0O0 ? ((InterfaceC33024OooO0O0) c32353OooO0oo2).OooO0Oo() : new C32365OooOo00(c32353OooO0oo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$4(Throwable th) throws Exception {
        Logging.logw("Cache write error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC33489OooO0Oo lambda$createFirebaseInAppMessageStream$5(Throwable th) throws Exception {
        return C32334OooO0O0.f116260OooOo0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createFirebaseInAppMessageStream$6(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) throws Exception {
        new C32339OooO0oO(new C32337OooO0o(this.campaignCacheClient.put(fetchEligibleCampaignsResponse).OooO0Oo(new com.aspose.slides.internal.p332p7.OooO0O0()), new com.aspose.slides.internal.p332p7.OooO0OO(), oO00o0.OooO00o.f116237OooO0OO), new C22236OooO0Oo()).OooO00o(new C32344OooO0o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFirebaseInAppMessageStream$7(Throwable th) throws Exception {
        Logging.logw("Impression store read fail: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createFirebaseInAppMessageStream$9(Boolean bool) throws Exception {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getContentIfNotRateLimited$22(Boolean bool) throws Exception {
        Logging.logi("App foreground rate limited ? : " + bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getContentIfNotRateLimited$23(Boolean bool) throws Exception {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CampaignProto.ThickContent lambda$getContentIfNotRateLimited$24(CampaignProto.ThickContent thickContent, Boolean bool) throws Exception {
        return thickContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$getTriggeredInAppMessageMaybe$25(CampaignProto.ThickContent thickContent) throws Exception {
        return this.testDeviceHelper.isDeviceInTestMode() || isActive(this.clock, thickContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void lambda$taskToMaybe$28(InterfaceC33494OooOO0 interfaceC33494OooOO0, Object obj) {
        oO0OOO00.OooO0O0 andSet;
        C32348OooO0OO.OooO00o oooO00o = (C32348OooO0OO.OooO00o) interfaceC33494OooOO0;
        oO0OOO00.OooO0O0 oooO0O0 = oooO00o.get();
        EnumC35109OooO0O0 enumC35109OooO0O0 = EnumC35109OooO0O0.f126092OooOo0o;
        if (oooO0O0 != enumC35109OooO0O0 && (andSet = oooO00o.getAndSet(enumC35109OooO0O0)) != enumC35109OooO0O0) {
            InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O = oooO00o.f116295OooOo0o;
            try {
                if (obj == null) {
                    interfaceC33495OooOO0O.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    interfaceC33495OooOO0O.onSuccess((Object) obj);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }
        oooO00o.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$taskToMaybe$29(InterfaceC33494OooOO0 interfaceC33494OooOO0, Exception exc) {
        C32348OooO0OO.OooO00o oooO00o = (C32348OooO0OO.OooO00o) interfaceC33494OooOO0;
        oooO00o.OooO0O0(exc);
        oooO00o.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$taskToMaybe$30(Task task, Executor executor, final InterfaceC33494OooOO0 interfaceC33494OooOO0) throws Exception {
        task.addOnSuccessListener(executor, new OnSuccessListener() { // from class: com.google.firebase.inappmessaging.internal.OooOoOO
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                InAppMessageStreamManager.lambda$taskToMaybe$28(interfaceC33494OooOO0, obj);
            }
        });
        task.addOnFailureListener(executor, new OnFailureListener() { // from class: com.google.firebase.inappmessaging.internal.OooOoo0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                InAppMessageStreamManager.lambda$taskToMaybe$29(interfaceC33494OooOO0, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logImpressionStatus(CampaignProto.ThickContent thickContent, Boolean bool) {
        if (thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            Logging.logi("Already impressed campaign " + thickContent.getVanillaPayload().getCampaignName() + " ? : " + bool);
            return;
        }
        if (thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
            Logging.logi("Already impressed experiment " + thickContent.getExperimentalPayload().getCampaignName() + " ? : " + bool);
        }
    }

    private boolean shouldIgnoreCache(String str) {
        return this.testDeviceHelper.isAppInstallFresh() ? isAppForegroundEvent(str) : this.testDeviceHelper.isDeviceInTestMode();
    }

    private static <T> AbstractC33485OooO<T> taskToMaybe(Task<T> task, Executor executor) {
        return new C32348OooO0OO(new C22737OooOo0o(task, executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: triggeredInAppMessage, reason: merged with bridge method [inline-methods] */
    public AbstractC33485OooO<TriggeredInAppMessage> lambda$getTriggeredInAppMessageMaybe$27(CampaignProto.ThickContent thickContent, String str) {
        String campaignId;
        String campaignName;
        if (thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            campaignId = thickContent.getVanillaPayload().getCampaignId();
            campaignName = thickContent.getVanillaPayload().getCampaignName();
        } else {
            if (!thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                return C32349OooO0Oo.f116296OooOo0o;
            }
            campaignId = thickContent.getExperimentalPayload().getCampaignId();
            campaignName = thickContent.getExperimentalPayload().getCampaignName();
            if (!thickContent.getIsTestCampaign()) {
                this.abtIntegrationHelper.setExperimentActive(thickContent.getExperimentalPayload().getExperimentPayload());
            }
        }
        InAppMessage inAppMessageDecode = ProtoMarshallerClient.decode(thickContent.getContent(), campaignId, campaignName, thickContent.getIsTestCampaign(), thickContent.getDataBundleMap());
        return inAppMessageDecode.getMessageType().equals(MessageType.UNSUPPORTED) ? C32349OooO0Oo.f116296OooOo0o : AbstractC33485OooO.OooO0O0(new TriggeredInAppMessage(inAppMessageDecode, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validIID(InstallationIdResult installationIdResult) {
        return (TextUtils.isEmpty(installationIdResult.installationId()) || TextUtils.isEmpty(installationIdResult.installationTokenResult().getToken())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC33491OooO0o0<TriggeredInAppMessage> createFirebaseInAppMessageStream() throws Exception {
        AbstractC33491OooO0o0 oooO;
        AbstractC33491OooO0o0 oooO0O0;
        AbstractC33127OooO00o<String> abstractC33127OooO00o = this.appForegroundEventFlowable;
        AbstractC33127OooO00o<String> analyticsEventsFlowable = this.analyticsEventsManager.getAnalyticsEventsFlowable();
        AbstractC33127OooO00o<String> abstractC33127OooO00o2 = this.programmaticTriggerEventFlowable;
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO00o(abstractC33127OooO00o, "source1 is null");
        o00Oo0.OooO00o(analyticsEventsFlowable, "source2 is null");
        o00Oo0.OooO00o(abstractC33127OooO00o2, "source3 is null");
        C32975OooOO0o c32975OooOO0o = new C32975OooOO0o(new oOO00OOO.OooO00o[]{abstractC33127OooO00o, analyticsEventsFlowable, abstractC33127OooO00o2});
        OooO00o.OooO0o oooO0o = oO00o0.OooO00o.f116235OooO00o;
        o00Oo0.OooO0O0(3, "maxConcurrency");
        int i2 = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO0O0(i2, "bufferSize");
        if (c32975OooOO0o instanceof InterfaceCallableC33030OooO0oo) {
            T tCall = ((InterfaceCallableC33030OooO0oo) c32975OooOO0o).call();
            oooO = tCall == 0 ? C32973OooO0oO.f119243OooOo : new OooOo00.OooO00o(tCall, oooO0o);
        } else {
            oooO = new oO0OOOOo.OooO(c32975OooOO0o, i2);
        }
        com.aspose.slides.internal.p284mx.OooO0O0 oooO0O02 = new com.aspose.slides.internal.p284mx.OooO0O0();
        oooO.getClass();
        C32971OooO0Oo c32971OooO0Oo = new C32971OooO0Oo(oooO, oooO0O02);
        AbstractC33500OooOOOo abstractC33500OooOOOoM75290io = this.schedulers.m75290io();
        o00Oo0.OooO00o(abstractC33500OooOOOoM75290io, "scheduler is null");
        o00Oo0.OooO0O0(i2, "bufferSize");
        C32978OooOOo0 c32978OooOOo0 = new C32978OooOOo0(c32971OooO0Oo, abstractC33500OooOOOoM75290io, i2);
        C22738OooOoO c22738OooOoO = new C22738OooOoO(this);
        o00Oo0.OooO0O0(2, "prefetch");
        if (c32978OooOOo0 instanceof InterfaceCallableC33030OooO0oo) {
            T tCall2 = ((InterfaceCallableC33030OooO0oo) c32978OooOOo0).call();
            oooO0O0 = tCall2 == 0 ? C32973OooO0oO.f119243OooOo : new OooOo00.OooO00o(tCall2, c22738OooOoO);
        } else {
            oooO0O0 = new oO0OOOOo.OooO0O0(c32978OooOOo0, c22738OooOoO);
        }
        AbstractC33500OooOOOo abstractC33500OooOOOoMainThread = this.schedulers.mainThread();
        oooO0O0.getClass();
        o00Oo0.OooO00o(abstractC33500OooOOOoMainThread, "scheduler is null");
        o00Oo0.OooO0O0(i2, "bufferSize");
        return new C32978OooOOo0(oooO0O0, abstractC33500OooOOOoMainThread, i2);
    }

    public static boolean isAppForegroundEvent(String str) {
        return str.equals(ON_FOREGROUND);
    }
}
