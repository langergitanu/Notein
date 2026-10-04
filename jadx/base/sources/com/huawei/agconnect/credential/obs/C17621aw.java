package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.analytics.connector.ConnectorManager;
import com.huawei.hms.analytics.instance.CallBack;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.aw */
/* JADX INFO: loaded from: classes8.dex */
public final class C17621aw implements InterfaceC17620av {

    /* JADX INFO: renamed from: a */
    C17623ay f52143a;

    /* JADX INFO: renamed from: b */
    private ConnectorManager f52144b;

    public C17621aw(Context context, C17623ay c17623ay) {
        m75513a(context, c17623ay);
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: a */
    public final Map<String, String[]> mo75507a(String str) {
        if (this.f52144b == null) {
            return new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            Log.w("BridgeInstance", "Invalid parameter.");
            return new HashMap();
        }
        try {
            return this.f52144b.getDataUploadSiteInfo(str);
        } catch (Throwable th) {
            Log.w("BridgeInstance", "getDataUploadSiteInfo error. " + th.getMessage());
            return new HashMap();
        }
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: b */
    public final Map<String, String> mo75511b(boolean z) {
        ConnectorManager connectorManager = this.f52144b;
        return connectorManager != null ? connectorManager.getUserProfiles(z) : new HashMap();
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: c */
    public final void mo75512c(boolean z) {
        ConnectorManager connectorManager = this.f52144b;
        if (connectorManager != null) {
            try {
                connectorManager.setAnalyticsEnabled(z);
            } catch (Throwable th) {
                Log.w("BridgeInstance", "setAnalyticsEnabled: " + th.getMessage());
            }
        }
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    public final void syncOaid(final InterfaceC17618at interfaceC17618at) {
        if (interfaceC17618at == null) {
            return;
        }
        ConnectorManager connectorManager = this.f52144b;
        if (connectorManager == null) {
            interfaceC17618at.result(BackupEvent.ERROR_INVALID_TOKEN, "Ha sdk init failed");
            return;
        }
        try {
            connectorManager.syncOaid(new CallBack() { // from class: com.huawei.agconnect.credential.obs.aw.1
                public final void onResult(int i, String str) {
                    interfaceC17618at.result(i, str);
                }
            });
        } catch (Throwable th) {
            Log.w("BridgeInstance", "syncOaid error, " + th.getMessage());
        }
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: a */
    public final void mo75508a() {
        ConnectorManager connectorManager = this.f52144b;
        if (connectorManager != null) {
            connectorManager.onReport();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75513a(Context context, C17623ay c17623ay) {
        this.f52143a = c17623ay;
        try {
            this.f52144b = TextUtils.isEmpty(c17623ay.f52150c) ? new ConnectorManager(context, c17623ay.f52148a, c17623ay.f52149b) : new ConnectorManager(context, c17623ay.f52148a, c17623ay.f52149b, c17623ay.f52150c);
        } catch (Exception | NoClassDefFoundError unused) {
            Log.e("BridgeInstance", "createInstance error");
            this.f52144b = null;
        }
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: a */
    public final void mo75509a(String str, Bundle bundle) {
        ConnectorManager connectorManager = this.f52144b;
        if (connectorManager != null) {
            connectorManager.onEvent(str, bundle);
        }
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17620av
    /* JADX INFO: renamed from: a */
    public final void mo75510a(boolean z) {
        ConnectorManager connectorManager = this.f52144b;
        if (connectorManager != null) {
            connectorManager.setEnableAndroidID(Boolean.valueOf(z));
        }
    }
}
