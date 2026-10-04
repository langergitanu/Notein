package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import oO0OooOO.InterfaceC33490OooO0o;

/* JADX INFO: loaded from: classes8.dex */
final class FiamAnalyticsConnectorListener implements AnalyticsConnector.AnalyticsConnectorListener {
    private InterfaceC33490OooO0o<String> emitter;

    public FiamAnalyticsConnectorListener(InterfaceC33490OooO0o<String> interfaceC33490OooO0o) {
        this.emitter = interfaceC33490OooO0o;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        if (i == 2) {
            this.emitter.onNext(bundle.getString("events"));
        }
    }
}
