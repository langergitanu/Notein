package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.bs */
/* JADX INFO: loaded from: classes.dex */
public class C4888bs extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: du */
    private String f13482du;

    /* JADX INFO: renamed from: kk */
    private C4918ne f13483kk;

    /* JADX INFO: renamed from: to */
    private boolean f13484to;

    public C4888bs(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: he */
    private void m20236he() {
        if (this.f13484to) {
            return;
        }
        this.f13482du = m20249qw();
        this.f13484to = true;
    }

    /* JADX INFO: renamed from: ai */
    public final int m20237ai() {
        return ((Integer) m59497k4("rows", 2, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: ar */
    public final void m20238ar(String str) {
        mo22708k4("name", str);
    }

    /* JADX INFO: renamed from: bs */
    public final String m20239bs() {
        m20236he();
        return this.f13482du;
    }

    /* JADX INFO: renamed from: ca */
    public final String m20240ca() {
        return "textarea";
    }

    /* JADX INFO: renamed from: em */
    public final String m20241em() {
        return m59490c5("name", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20242j2() {
        return m59490c5("accesskey", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20243k4(int i) {
        m59500k4("cols", i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m20245kk(int i) {
        m59500k4("tabindex", i);
    }

    /* JADX INFO: renamed from: os */
    public final boolean m20247os() {
        return mo22698c5("disabled");
    }

    /* JADX INFO: renamed from: qq */
    public final void m20248qq(String str) {
        mo22708k4("accesskey", str);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20249qw() {
        return mo22607e0();
    }

    /* JADX INFO: renamed from: ri */
    public final int m20250ri() {
        return ((Integer) m59497k4("tabindex", 0, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: tq */
    public final C4918ne m20251tq() {
        if (this.f13483kk == null) {
            this.f13483kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13483kk;
    }

    /* JADX INFO: renamed from: um */
    public final void m20252um(String str) {
        this.f13482du = str;
        this.f13484to = true;
    }

    /* JADX INFO: renamed from: w6 */
    public final int m20253w6() {
        return ((Integer) m59497k4("cols", 20, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: wl */
    public final void m20254wl(String str) {
        m20236he();
        mo22611ks(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20255x1(int i) {
        m59500k4("rows", i);
    }

    /* JADX INFO: renamed from: zj */
    public final boolean m20256zj() {
        return mo22698c5("readonly");
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8380k4(this, interfaceC1566du.mo8371k4(this));
    }

    /* JADX INFO: renamed from: kk */
    public final void m20246kk(boolean z) {
        m8444kk("readonly", z);
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13483kk = c4918ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20244k4(boolean z) {
        m8444kk("disabled", z);
    }
}
