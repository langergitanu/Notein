package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractRunnableC18294o2;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18359t2 extends AbstractRunnableC18294o2 {

    /* JADX INFO: renamed from: h */
    public static final String f56194h = "LocalDNSResolver";

    public C18359t2(String str, String str2, AbstractRunnableC18294o2.a aVar) {
        super(str, 2, str2, aVar);
    }

    @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2
    /* JADX INFO: renamed from: c */
    public C18385v2 mo79227c() {
        StringBuilder sb;
        C18385v2 c18385v2 = new C18385v2();
        try {
            c18385v2 = C18196h2.m78667a(InetAddress.getAllByName(this.f55809a));
        } catch (IllegalArgumentException e) {
            e = e;
            sb = new StringBuilder("LocalDNSResolver query failed, IllegalArgumentException Exception: ");
            sb.append(this.f55809a);
            Logger.m76968w(f56194h, sb.toString(), e);
        } catch (NullPointerException e2) {
            e = e2;
            sb = new StringBuilder("LocalDNSResolver query failed, NullPointerException Exception: ");
            sb.append(this.f55809a);
            Logger.m76968w(f56194h, sb.toString(), e);
        } catch (UnknownHostException unused) {
            Logger.m76967w(f56194h, "LocalDNSResolver query failed,UnknownHostException:" + this.f55809a);
        }
        c18385v2.m79680b(2);
        c18385v2.m79674a(0);
        return c18385v2;
    }
}
