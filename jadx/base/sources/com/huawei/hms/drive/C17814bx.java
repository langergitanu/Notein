package com.huawei.hms.drive;

import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.bx */
/* JADX INFO: loaded from: classes6.dex */
public final class C17814bx implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    public final C17795be f53035a;

    public C17814bx(C17795be c17795be) {
        this.f53035a = c17795be;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public C17800bj mo76180a(InterfaceC17793bc.a aVar) throws IOException {
        C17829cl c17829cl = (C17829cl) aVar;
        C17798bh c17798bhMo76181a = c17829cl.mo76181a();
        C17822ce c17822ceM76497f = c17829cl.m76497f();
        InterfaceC17825ch interfaceC17825chM76459a = c17822ceM76497f.m76459a(this.f53035a, aVar, !c17798bhMo76181a.m76263b().equals("GET"));
        C17818ca c17818caM76466c = c17822ceM76497f.m76466c();
        C17800bj c17800bjM76495a = c17829cl.m76495a(c17798bhMo76181a, c17822ceM76497f, interfaceC17825chM76459a, c17818caM76466c);
        if (c17818caM76466c.m76426f() && c17818caM76466c.f53053b == 0) {
            C17792bb c17792bbM76261a = c17798bhMo76181a.m76261a();
            this.f53035a.m76194a(c17792bbM76261a.m76151f(), c17792bbM76261a.m76152g(), c17792bbM76261a.m76145b());
        }
        return c17800bjM76495a;
    }
}
