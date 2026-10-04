package com.huawei.hms.network.embedded;

import com.huawei.hms.network.inner.api.ProtocolStackManager;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18211i3 extends ProtocolStackManager {

    /* JADX INFO: renamed from: a */
    public C18255l5 f55104a;

    @Override // com.huawei.hms.network.inner.api.ProtocolStackManager
    public List<String> getHostsInConnectionPool() {
        if (this.f55104a == null) {
            this.f55104a = C18255l5.getInstance();
        }
        return this.f55104a.getHostsInConnectionPool();
    }
}
