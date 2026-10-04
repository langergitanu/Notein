package com.huawei.hms.network.embedded;

import com.huawei.hms.network.inner.api.NetworkReceiver;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18256l6 {

    /* JADX INFO: renamed from: b */
    public static final C18256l6 f55609b = new C18256l6();

    /* JADX INFO: renamed from: a */
    public List<NetworkReceiver> f55610a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public static C18256l6 m79045b() {
        return f55609b;
    }

    /* JADX INFO: renamed from: a */
    public List<NetworkReceiver> m79046a() {
        return this.f55610a;
    }

    /* JADX INFO: renamed from: a */
    public void m79047a(NetworkReceiver networkReceiver) {
        if (networkReceiver != null) {
            this.f55610a.add(networkReceiver);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79048b(NetworkReceiver networkReceiver) {
        if (networkReceiver != null) {
            this.f55610a.remove(networkReceiver);
        }
    }
}
