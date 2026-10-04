package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18203h9 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: a */
    public final C18118b8 f55048a;

    public C18203h9(C18118b8 c18118b8) {
        this.f55048a = c18118b8;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        C18379u9 c18379u9 = (C18379u9) aVar;
        C18160e8 c18160e8Request = c18379u9.request();
        c18379u9.m79653f().prepareToConnect(c18160e8Request);
        c18379u9.m79653f().getExchangeFinder().m78617a(this.f55048a, c18160e8Request);
        return new C18188g8.a().m78597a(EnumC18132c8.HTTP_2).m78603a("").m78600a(new C18392v9("", 1L, null)).m78595a(200).m78598a(c18160e8Request).m78605a();
    }
}
