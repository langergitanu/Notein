package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractRunnableC18294o2;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18346s2 extends AbstractRunnableC18294o2 {

    /* JADX INFO: renamed from: h */
    public static final String f56092h = "HttpDnsResolver";

    public C18346s2(String str, String str2, AbstractRunnableC18294o2.a aVar) {
        super(str, 3, str2, aVar);
    }

    @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2
    /* JADX INFO: renamed from: c */
    public C18385v2 mo79227c() {
        C18385v2 c18385v2 = new C18385v2();
        C18398w2 c18398w2M78069d = C18126c2.m78048j().m78069d();
        if (c18398w2M78069d != null) {
            c18385v2 = c18398w2M78069d.m79820a(this.f55809a);
        }
        if (C18196h2.m78675b(c18385v2)) {
            Logger.m76969w(f56092h, "Resolve from HttpDns is null, host: %s", this.f55809a);
        }
        return c18385v2;
    }
}
