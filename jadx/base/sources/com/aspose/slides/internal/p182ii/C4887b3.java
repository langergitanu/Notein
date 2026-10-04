package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C4887b3 extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: kk */
    private C4918ne f13481kk;

    public C4887b3(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20230j2() {
        return m59490c5("htmlfor", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo4658kk(this);
        m8451x1(interfaceC1566du);
        interfaceC1566du.mo8407to(this);
    }

    /* JADX INFO: renamed from: qq */
    public final void m20232qq(String str) {
        mo22708k4("htmlfor", str);
    }

    /* JADX INFO: renamed from: qw */
    public final C4918ne m20233qw() {
        if (this.f13481kk == null) {
            this.f13481kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13481kk;
    }

    /* JADX INFO: renamed from: tq */
    public final String m20234tq() {
        return m59490c5("accesskey", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20235wl(String str) {
        mo22708k4("accesskey", str);
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13481kk = c4918ne;
    }
}
