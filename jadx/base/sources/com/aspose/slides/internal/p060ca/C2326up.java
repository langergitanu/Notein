package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.up */
/* JADX INFO: loaded from: classes3.dex */
public class C2326up extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private C2036cu f8047du;

    public C2326up(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        m10982to(true);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("array")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("def"), AbstractC6747ar.m26650yj().mo26677to("readonly def"), AbstractC6747ar.m26650yj().mo26677to("ND\r"), AbstractC6747ar.m26650yj().mo26677to("ND\n"), AbstractC6747ar.m26650yj().mo26677to("|-\r"), AbstractC6747ar.m26650yj().mo26677to("|-\n")};
        m10978k4(new AbstractC2167ks[]{new C2059dy(c2120hx, this), new C2082fa(c2120hx, this)});
    }

    /* JADX INFO: renamed from: k4 */
    public final C2036cu m11516k4() {
        return this.f8047du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f8047du = new C2036cu();
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
        C2034ck c2034ckM10338k4;
        C2142jd c2142jdM10442k4;
        C2082fa c2082fa = (C2082fa) C7019kk.m27452k4(obj, C2082fa.class);
        if (c2082fa == null) {
            C2059dy c2059dy = (C2059dy) C7019kk.m27452k4(obj, C2059dy.class);
            if (c2059dy != null) {
                c2034ckM10338k4 = this.f8047du.m10338k4();
                c2142jdM10442k4 = c2059dy.m10442k4();
            }
            super.mo10226k4(obj);
        }
        ((C2059dy) m10972dy()[0]).m10977k4(false);
        c2034ckM10338k4 = this.f8047du.m10338k4();
        c2142jdM10442k4 = c2082fa.m10516k4();
        c2034ckM10338k4.m10336k4(c2142jdM10442k4);
        super.mo10226k4(obj);
    }
}
