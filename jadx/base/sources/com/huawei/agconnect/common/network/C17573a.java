package com.huawei.agconnect.common.network;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.common.api.HaConnector;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.credential.obs.C17607ai;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.huawei.agconnect.common.network.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17573a extends AccessNetworkManager {

    /* JADX INFO: renamed from: a */
    private static final String f51974a = "com.huawei.agconnect.AccessNetwork";

    /* JADX INFO: renamed from: b */
    private final List<AccessNetworkManager.AccessNetworkCallback> f51975b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private Context f51976c = C17607ai.m75467a().m75471b();

    /* JADX INFO: renamed from: a */
    private void m75332a() {
        Iterator<AccessNetworkManager.AccessNetworkCallback> it = this.f51975b.iterator();
        while (it.hasNext()) {
            it.next().onNetWorkReady();
        }
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void addCallback(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (accessNetworkCallback != null) {
            this.f51975b.add(accessNetworkCallback);
            m75333a(accessNetworkCallback);
        }
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public boolean canAccessNetwork() {
        Bundle bundle = SafeAppInfo.safeGetApplicationInfo(this.f51976c.getPackageManager(), this.f51976c.getPackageName(), 128).metaData;
        return bundle == null || !TelemetryEventStrings.Value.FALSE.equalsIgnoreCase(String.valueOf(bundle.get(f51974a))) || C17574b.m75335a().m75337b();
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void setAccessNetwork(boolean z) {
        m75334a(z);
        HaConnector.getInstance().setAnalyticsEnabled(z);
        if (z) {
            m75332a();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75333a(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (canAccessNetwork()) {
            accessNetworkCallback.onNetWorkReady();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75334a(boolean z) {
        C17574b.m75335a().m75336a(z);
    }
}
