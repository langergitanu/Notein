package com.huawei.hms.drive;

import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.InterfaceC17793bc;

/* JADX INFO: renamed from: com.huawei.hms.drive.bz */
/* JADX INFO: loaded from: classes6.dex */
public final class C17816bz implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    public final C17795be f53040a;

    public C17816bz(C17795be c17795be) {
        this.f53040a = c17795be;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public C17800bj mo76180a(InterfaceC17793bc.a aVar) throws Throwable {
        C17829cl c17829cl = (C17829cl) aVar;
        C17798bh c17798bhMo76181a = c17829cl.mo76181a();
        c17829cl.m76497f().m76461a(this.f53040a, c17798bhMo76181a);
        return new C17800bj.a().m76299a(EnumC17796bf.HTTP_2).m76295a(200).m76300a(c17798bhMo76181a).m76305a();
    }
}
