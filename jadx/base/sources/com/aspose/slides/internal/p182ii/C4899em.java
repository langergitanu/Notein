package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.em */
/* JADX INFO: loaded from: classes.dex */
public class C4899em extends C1569kk {
    public C4899em(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: ai */
    public final String m20332ai() {
        return m59490c5("valign", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: ar */
    public final void m20333ar(String str) {
        mo22708k4("char", str);
    }

    /* JADX INFO: renamed from: bv */
    public final void m20334bv(String str) {
        mo22708k4("valign", str);
    }

    /* JADX INFO: renamed from: em */
    public final String m20335em() {
        return m59490c5("char", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: j2 */
    public final C4922qw m20336j2() {
        return new C4922qw(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12804k4 m20337k4(int i) {
        C4922qw c4922qwM20336j2 = m20336j2();
        if (i < -1 || i > c4922qwM20336j2.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        C12804k4 c12804k4 = (C12804k4) C7019kk.m27452k4((Object) mo22660v4().mo22775du("TD"), C12804k4.class);
        return (C12804k4) C7019kk.m27452k4((Object) ((i == -1 || i == c4922qwM20336j2.mo20312k4()) ? m22641kk((AbstractC5535bv) c12804k4) : m22636k4((AbstractC5535bv) c12804k4, (AbstractC5535bv) c4922qwM20336j2.mo20314k4(i))), C12804k4.class);
    }

    /* JADX INFO: renamed from: os */
    public final String m20338os() {
        return m59490c5("bgcolor", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: qq */
    public final void m20339qq(String str) {
        mo22708k4("bgcolor", str);
    }

    /* JADX INFO: renamed from: qw */
    public final int m20340qw() {
        C4939w6 c4939w6 = (C4939w6) m8440k4(C4939w6.class);
        if (c4939w6 != null) {
            return m8448x1(c4939w6.m20706w6());
        }
        return -1;
    }

    /* JADX INFO: renamed from: tq */
    public final int m20341tq() {
        C4884ai c4884ai = (C4884ai) m8440k4(C4884ai.class);
        if (c4884ai != null) {
            return m8448x1(c4884ai.m20202os());
        }
        return -1;
    }

    /* JADX INFO: renamed from: um */
    public final void m20342um(String str) {
        mo22708k4("charoff", str);
    }

    /* JADX INFO: renamed from: w6 */
    public final String m20343w6() {
        return m59490c5("align", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20344wl(String str) {
        mo22708k4("align", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20345x1(int i) {
        C4922qw c4922qwM20336j2 = m20336j2();
        if (i < -1 || i >= c4922qwM20336j2.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        if (i == -1) {
            i = c4922qwM20336j2.mo20312k4() - 1;
        }
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) c4922qwM20336j2.mo20314k4(i), C1569kk.class);
        c1569kk.m8452xw().m22663x1((AbstractC5535bv) c1569kk);
    }

    /* JADX INFO: renamed from: zj */
    public final String m20346zj() {
        return m59490c5("charoff", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8361ck(this);
        m8451x1(interfaceC1566du);
        interfaceC1566du.mo8365fa(this);
    }
}
