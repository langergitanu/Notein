package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6405kk;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.yj */
/* JADX INFO: loaded from: classes.dex */
public class C3974yj implements InterfaceC3941ks {

    /* JADX INFO: renamed from: du */
    private final boolean f10739du;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10740k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f10741kk;

    /* JADX INFO: renamed from: to */
    private final C14093tq<Integer> f10742to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6405kk f10743x1;

    public C3974yj(InterfaceC9477x1 interfaceC9477x1, InterfaceC6405kk interfaceC6405kk, boolean z, C14093tq<Integer> c14093tq, boolean z2) {
        C14093tq<Integer> c14093tq2 = new C14093tq<>();
        this.f10742to = c14093tq2;
        this.f10740k4 = interfaceC9477x1;
        this.f10743x1 = interfaceC6405kk;
        this.f10741kk = z;
        if (c14093tq != null) {
            c14093tq.CloneTo(c14093tq2);
        }
        this.f10739du = z2;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (this.f10739du) {
            this.f10743x1.mo26302to();
        }
        C9470du c9470duMo46638k4 = this.f10740k4.mo46638k4();
        C9470du c9470duMo46642x1 = this.f10740k4.mo46642x1();
        if (C14093tq.m67296x1(this.f10742to, null)) {
            this.f10743x1.mo26297k4(c9470duMo46638k4.m46552b3().Clone(), this.f10742to.m67297k4().intValue(), c9470duMo46638k4.m46605wy(), c9470duMo46638k4.m46550ak(), c9470duMo46638k4.m46557dq(), c9470duMo46638k4.m46565k4(), c9470duMo46642x1);
        }
        if (this.f10741kk) {
            this.f10743x1.mo26296k4(c9470duMo46638k4.m46615xk().Clone(), c9470duMo46638k4.m46564jd(), c9470duMo46638k4.m46556ck(), c9470duMo46638k4.m46561fa(), c9470duMo46638k4.m46592m9(), c9470duMo46638k4.m46601up(), c9470duMo46638k4.m46560dy(), c9470duMo46638k4.m46565k4(), c9470duMo46642x1);
        }
    }
}
