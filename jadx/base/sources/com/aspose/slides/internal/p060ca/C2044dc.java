package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dc */
/* JADX INFO: loaded from: classes3.dex */
public class C2044dc extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private String f7058du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f7059h4;

    public C2044dc(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("CC")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_WINDOWS), AbstractC6747ar.m26650yj().mo26677to("\r"), AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_UNIX)};
        m10978k4(new AbstractC2167ks[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m10359k4() {
        return this.f7058du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7058du = null;
        this.f7059h4 = new C6765kp();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f7058du = this.f7059h4.toString();
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f7059h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        super.mo10226k4(obj);
    }
}
