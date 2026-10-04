package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* JADX INFO: renamed from: com.huawei.agconnect.common.network.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17574b {

    /* JADX INFO: renamed from: a */
    private static C17574b f51977a = new C17574b();

    @SharedPreference(fileName = "AGConnectAccessNetwork", key = "enableAccessNetwork")
    boolean enableAccessNetwork = false;

    private C17574b() {
    }

    /* JADX INFO: renamed from: a */
    public static C17574b m75335a() {
        return f51977a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m75337b() {
        C17575c.m75338a().m75344d(f51977a);
        return this.enableAccessNetwork;
    }

    /* JADX INFO: renamed from: a */
    public void m75336a(boolean z) {
        this.enableAccessNetwork = z;
        C17575c.m75338a().m75341b(f51977a);
    }
}
