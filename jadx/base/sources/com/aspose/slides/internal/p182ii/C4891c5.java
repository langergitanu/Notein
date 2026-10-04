package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4891c5 extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: kk */
    private C4918ne f13487kk;

    public C4891c5(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
        this.f13487kk = null;
    }

    /* JADX INFO: renamed from: ar */
    public final void m20289ar(String str) {
        mo22708k4("value", str);
    }

    /* JADX INFO: renamed from: em */
    public final String m20290em() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: j2 */
    public final boolean m20291j2() {
        return mo22698c5("disabled");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20292k4(int i) {
        m59500k4("tabindex", i);
    }

    /* JADX INFO: renamed from: os */
    public final int m20294os() {
        return ((Integer) m59497k4("tabindex", 0, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: qq */
    public final void m20295qq(String str) {
        mo22708k4("name", str);
    }

    /* JADX INFO: renamed from: qw */
    public final C4918ne m20296qw() {
        if (this.f13487kk == null) {
            this.f13487kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13487kk;
    }

    /* JADX INFO: renamed from: tq */
    public final String m20297tq() {
        return m59490c5("accesskey", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: w6 */
    public final String m20298w6() {
        return m59490c5("name", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20299wl(String str) {
        mo22708k4("accesskey", str);
    }

    /* JADX INFO: renamed from: zj */
    public final String m20300zj() {
        return m59490c5("value", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8381k4(this);
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13487kk = c4918ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20293k4(boolean z) {
        m8444kk("disabled", z);
    }
}
