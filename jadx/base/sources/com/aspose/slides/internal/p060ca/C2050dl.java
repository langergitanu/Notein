package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dl */
/* JADX INFO: loaded from: classes3.dex */
public class C2050dl extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private C2227o9 f7077du;

    public C2050dl(C2120hx c2120hx, AbstractC2281rv abstractC2281rv, boolean z) {
        super(c2120hx, abstractC2281rv);
        m10982to(true);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("dict begin"), AbstractC6747ar.m26650yj().mo26677to("dict dup begin")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("end")};
        m10978k4(new AbstractC2167ks[]{new C2005av(c2120hx, this, z, false)});
    }

    /* JADX INFO: renamed from: k4 */
    public final C2227o9 m10374k4() {
        return this.f7077du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7077du = new C2227o9();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2005av c2005av = (C2005av) C7019kk.m27452k4(obj, C2005av.class);
        if (c2005av != null) {
            this.f7077du.m11186k4().m11479k4(c2005av.m10224k4());
        }
        super.mo10226k4(obj);
    }
}
