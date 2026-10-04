package com.huawei.agconnect.remoteconfig.internal;

import com.huawei.agconnect.common.api.HaBridge;
import java.util.Map;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17677b {

    /* JADX INFO: renamed from: a */
    private static final C17677b f52276a = new C17677b();

    /* JADX INFO: renamed from: b */
    private HaBridge f52277b;

    private C17677b() {
        if (this.f52277b == null) {
            this.f52277b = new HaBridge(HaBridge.HA_SERVICE_TAG_CONFIG);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17677b m75662a() {
        return f52276a;
    }

    /* JADX INFO: renamed from: b */
    public void m75664b() {
        this.f52277b = new HaBridge(HaBridge.HA_SERVICE_TAG_CONFIG);
    }

    /* JADX INFO: renamed from: a */
    public OooO0o<Map<String, String>> m75663a(boolean z) {
        return this.f52277b.getUserProfiles(z);
    }
}
