package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fh */
/* JADX INFO: loaded from: classes3.dex */
public class C2086fh extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private C2227o9 f7209du;

    /* JADX INFO: renamed from: h4 */
    private C2227o9 f7210h4;

    public C2086fh(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("StartKernData")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("EndKernData\r\n"), AbstractC6747ar.m26650yj().mo26677to("EndKernData\r"), AbstractC6747ar.m26650yj().mo26677to("EndKernData\n")};
        m10978k4(new AbstractC2167ks[]{new C2367xc(c2120hx, this), new C2229od(c2120hx, this)});
    }

    /* JADX INFO: renamed from: k4 */
    public final C2227o9 m10529k4() {
        return this.f7209du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7209du = new C2227o9();
        this.f7210h4 = new C2227o9();
        super.mo10227kk();
    }

    /* JADX INFO: renamed from: to */
    public final C2227o9 m10530to() {
        return this.f7210h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2367xc c2367xc = (C2367xc) C7019kk.m27452k4(obj, C2367xc.class);
        if (c2367xc != null) {
            this.f7209du = c2367xc.m11680k4();
        } else {
            C2229od c2229od = (C2229od) C7019kk.m27452k4(obj, C2229od.class);
            if (c2229od != null) {
                this.f7210h4 = c2229od.m11188k4();
            }
        }
        super.mo10226k4(obj);
    }
}
