package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18147d9 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: a */
    public final C18118b8 f54564a;

    public C18147d9(C18118b8 c18118b8) {
        this.f54564a = c18118b8;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        C18379u9 c18379u9 = (C18379u9) aVar;
        C18160e8 c18160e8Request = c18379u9.request();
        C18287n9 c18287n9M79653f = c18379u9.m79653f();
        return c18379u9.m79644a(c18160e8Request, c18287n9M79653f, c18287n9M79653f.newExchange(aVar, !c18160e8Request.m78307h().equals("GET")));
    }
}
