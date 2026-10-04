package com.aspose.slides.internal.p357qc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.qc.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9830c5 extends C10894bv {

    /* JADX INFO: renamed from: du */
    private final C9832dy f35614du;

    /* JADX INFO: renamed from: k4 */
    private final C9836m9 f35615k4;

    /* JADX INFO: renamed from: kk */
    private final C9833h4 f35616kk;

    /* JADX INFO: renamed from: to */
    private final List<C9832dy> f35617to;

    public C9830c5(C10898dy c10898dy) {
        super(c10898dy);
        this.f35615k4 = new C9836m9(c10898dy);
        this.f35616kk = new C9833h4(c10898dy);
        List<C9832dy> list = new List<>();
        this.f35617to = list;
        C9832dy c9832dy = new C9832dy(c10898dy, "/Presentation", m52565c5(), (String) null);
        this.f35614du = c9832dy;
        list.addItem(c9832dy);
    }

    /* JADX INFO: renamed from: kk */
    private void m48476kk(C10922yj c10922yj) {
        c10922yj.m52650k4("/K");
        c10922yj.m52650k4("[");
        for (int i = 0; i < this.f35617to.size(); i++) {
            c10922yj.m52650k4(this.f35617to.get_Item(i).m52565c5());
            c10922yj.m52644h4();
        }
        c10922yj.m52650k4("]");
    }

    /* JADX INFO: renamed from: du */
    public final C9832dy m48477du(String str) {
        return this.f35614du.m48483c5(str);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m48479h4(String str) {
        return this.f35616kk.m48502du(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48481k4(int i, String str) {
        return this.f35616kk.m48505k4(i, str);
    }

    /* JADX INFO: renamed from: ks */
    public final int m48482ks() {
        return this.f35616kk.m48503h4();
    }

    /* JADX INFO: renamed from: du */
    public final C9833h4 m48478du() {
        return this.f35616kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9832dy m48480h4() {
        return this.f35614du;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/StructTreeRoot");
        c10922yj.m52666kk("/RoleMap", this.f35615k4.m52565c5());
        c10922yj.m52666kk("/ParentTree", this.f35616kk.m52565c5());
        c10922yj.m52652k4("/ParentTreeNextKey", this.f35616kk.m48501du());
        m48476kk(c10922yj);
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        this.f35615k4.mo9082k4(c10922yj);
        this.f35616kk.mo9082k4(c10922yj);
        for (int i = 0; i < this.f35617to.size(); i++) {
            this.f35617to.get_Item(i).mo9082k4(c10922yj);
        }
    }
}
