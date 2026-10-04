package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractRunnableC18294o2;
import com.huawei.hms.network.embedded.C18126c2;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18280n2 extends AbstractRunnableC18294o2 {

    /* JADX INFO: renamed from: h */
    public static final String f55746h = "DNKeeperResolver";

    public C18280n2(String str, AbstractRunnableC18294o2.a aVar) {
        super(str, 1, "dns_sync_query", aVar);
    }

    @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2
    /* JADX INFO: renamed from: c */
    public C18385v2 mo79227c() {
        String strM78084b;
        int iM78081a;
        Logger.m76966v(f55746h, "Resolve to DNKeeper, host: %s", this.f55809a);
        C18385v2 c18385v2 = new C18385v2();
        InterfaceC18372u2 interfaceC18372u2M78064b = C18126c2.m78048j().m78064b();
        if (interfaceC18372u2M78064b != null) {
            C18126c2.f fVarM78063b = C18126c2.m78048j().m78063b(this.f55809a);
            if (fVarM78063b != null) {
                strM78084b = fVarM78063b.m78084b();
                iM78081a = fVarM78063b.m78081a();
            } else {
                strM78084b = null;
                iM78081a = 0;
            }
            c18385v2 = interfaceC18372u2M78064b.mo78292a(this.f55809a, strM78084b, iM78081a);
            c18385v2.m79680b(1);
            C18126c2.m78048j().m78057a(this.f55809a);
        }
        if (C18196h2.m78675b(c18385v2)) {
            Logger.m76969w(f55746h, "Resolve from DNKeeper is null, host: %s", this.f55809a);
            return c18385v2;
        }
        List<String> listM79686d = c18385v2.m79686d();
        if (!listM79686d.isEmpty()) {
            c18385v2.m79683b(listM79686d);
        }
        Logger.m76965v(f55746h, this.f55809a + " Resolve to DNKeeper, result: " + c18385v2);
        return c18385v2;
    }
}
