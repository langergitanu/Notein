package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yl */
/* JADX INFO: loaded from: classes3.dex */
public class C2391yl extends AbstractC2281rv implements InterfaceC2074ev {

    /* JADX INFO: renamed from: c5 */
    private int f8307c5;

    /* JADX INFO: renamed from: du */
    private byte[] f8308du;

    /* JADX INFO: renamed from: dy */
    private int f8309dy;

    /* JADX INFO: renamed from: h4 */
    private C2331uz f8310h4;

    /* JADX INFO: renamed from: m9 */
    private C2255q6 f8311m9;

    public C2391yl(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        m10982to(true);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("RD "), AbstractC6747ar.m26650yj().mo26677to("-| "), AbstractC6747ar.m26650yj().mo26677to("RD"), AbstractC6747ar.m26650yj().mo26677to("-|")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(" NP\n"), AbstractC6747ar.m26650yj().mo26677to(" NP\r"), AbstractC6747ar.m26650yj().mo26677to(" |\n"), AbstractC6747ar.m26650yj().mo26677to(" |\r"), AbstractC6747ar.m26650yj().mo26677to("NP\n"), AbstractC6747ar.m26650yj().mo26677to("NP\r"), AbstractC6747ar.m26650yj().mo26677to("|\n"), AbstractC6747ar.m26650yj().mo26677to("|\r"), AbstractC6747ar.m26650yj().mo26677to(" noaccess put"), AbstractC6747ar.m26650yj().mo26677to("noaccess put")};
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2074ev
    /* JADX INFO: renamed from: k4 */
    public final int mo10498k4() {
        return this.f8309dy;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f8308du = null;
        this.f8310h4 = null;
        this.f8311m9 = new C2255q6(1);
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: ks */
    public void mo10980ks() {
        super.mo10980ks();
        this.f8310h4 = new C2331uz(mo10498k4());
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2074ev
    /* JADX INFO: renamed from: to */
    public final int mo10500to() {
        return this.f8307c5;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2074ev
    /* JADX INFO: renamed from: x1 */
    public final void mo10501x1(int i) {
        this.f8309dy = i;
    }

    /* JADX INFO: renamed from: x6 */
    public final byte[] m11774x6() {
        return this.f8308du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f8308du = new byte[this.f8310h4.m11554x1() - m11351rv().m10703x1()];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f8310h4.m11553k4()), m11351rv().m10703x1(), AbstractC14092to.m67208k4((Object) this.f8308du), 0, this.f8310h4.m11554x1() - m11351rv().m10703x1());
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f8310h4.m11552k4(this.f8311m9.m11274k4(this.f7514to[i]));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2074ev
    /* JADX INFO: renamed from: kk */
    public final void mo10499kk(int i) {
        this.f8307c5 = i;
    }
}
