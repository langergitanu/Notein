package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18199h5 {

    /* JADX INFO: renamed from: c */
    public static final String f55028c = "ConnectionInfo";

    /* JADX INFO: renamed from: a */
    public String f55029a;

    /* JADX INFO: renamed from: b */
    public WeakReference<C18217i9> f55030b;

    public C18199h5(String str, C18217i9 c18217i9) {
        this.f55029a = str;
        this.f55030b = new WeakReference<>(c18217i9);
    }

    public String getHost() {
        return this.f55029a;
    }

    public boolean isHealthy(boolean z) {
        C18217i9 c18217i9;
        WeakReference<C18217i9> weakReference = this.f55030b;
        if (weakReference == null || (c18217i9 = weakReference.get()) == null) {
            return false;
        }
        if (c18217i9.m78788a(z)) {
            Logger.m76966v(f55028c, "the host is : %s,and the connection is healthy!", this.f55029a);
            return true;
        }
        Logger.m76966v(f55028c, "the host is : %s,but the connection is unhealthy!", this.f55029a);
        return false;
    }
}
