package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import oO00o0oO.C32389OooO0Oo;
import oO0OOOOo.C32979OooOOoo;
import oO0OOoOO.AbstractC33127OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33490OooO0o;
import oO0OooOO.InterfaceC33492OooO0oO;

/* JADX INFO: loaded from: classes8.dex */
public class AnalyticsEventsManager {
    static final String TOO_MANY_CONTEXTUAL_TRIGGERS_ERROR = "Too many contextual triggers defined - limiting to 50";
    private final AnalyticsConnector analyticsConnector;
    private final AbstractC33127OooO00o<String> flowable;
    private AnalyticsConnector.AnalyticsConnectorHandle handle;

    public class AnalyticsFlowableSubscriber implements InterfaceC33492OooO0oO<String> {
        public AnalyticsFlowableSubscriber() {
        }

        @Override // oO0OooOO.InterfaceC33492OooO0oO
        public void subscribe(InterfaceC33490OooO0o<String> interfaceC33490OooO0o) {
            Logging.logd("Subscribing to analytics events.");
            AnalyticsEventsManager analyticsEventsManager = AnalyticsEventsManager.this;
            analyticsEventsManager.handle = analyticsEventsManager.analyticsConnector.registerAnalyticsConnectorListener("fiam", new FiamAnalyticsConnectorListener(interfaceC33490OooO0o));
        }
    }

    public AnalyticsEventsManager(AnalyticsConnector analyticsConnector) {
        this.analyticsConnector = analyticsConnector;
        AnalyticsFlowableSubscriber analyticsFlowableSubscriber = new AnalyticsFlowableSubscriber();
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        C32979OooOOoo c32979OooOOooOooO0O0 = new oO0OOOOo.OooO0OO(analyticsFlowableSubscriber).OooO0O0();
        this.flowable = c32979OooOOooOooO0O0;
        c32979OooOOooOooO0O0.OooO0o0(new C32389OooO0Oo());
    }

    public static Set<String> extractAnalyticsEventNames(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        HashSet hashSet = new HashSet();
        Iterator<CampaignProto.ThickContent> it = fetchEligibleCampaignsResponse.getMessagesList().iterator();
        while (it.hasNext()) {
            for (CommonTypesProto.TriggeringCondition triggeringCondition : it.next().getTriggeringConditionsList()) {
                if (!TextUtils.isEmpty(triggeringCondition.getEvent().getName())) {
                    hashSet.add(triggeringCondition.getEvent().getName());
                }
            }
        }
        if (hashSet.size() > 50) {
            Logging.logi(TOO_MANY_CONTEXTUAL_TRIGGERS_ERROR);
        }
        return hashSet;
    }

    public AbstractC33127OooO00o<String> getAnalyticsEventsFlowable() {
        return this.flowable;
    }

    public AnalyticsConnector.AnalyticsConnectorHandle getHandle() {
        return this.handle;
    }

    public void updateContextualTriggers(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        Set<String> setExtractAnalyticsEventNames = extractAnalyticsEventNames(fetchEligibleCampaignsResponse);
        Logging.logd("Updating contextual triggers for the following analytics events: " + setExtractAnalyticsEventNames);
        this.handle.registerEventNames(setExtractAnalyticsEventNames);
    }
}
