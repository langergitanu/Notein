package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AnalyticsListener;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class AnalyticsEventsModule {
    @Provides
    @AnalyticsListener
    public AbstractC33127OooO00o<String> providesAnalyticsConnectorEvents(AnalyticsEventsManager analyticsEventsManager) {
        return analyticsEventsManager.getAnalyticsEventsFlowable();
    }

    @Provides
    public AnalyticsEventsManager providesAnalyticsEventsManager(AnalyticsConnector analyticsConnector) {
        return new AnalyticsEventsManager(analyticsConnector);
    }
}
