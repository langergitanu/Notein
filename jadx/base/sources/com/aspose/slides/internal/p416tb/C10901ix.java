package com.aspose.slides.internal.p416tb;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C10901ix extends AbstractC10914up {

    /* JADX INFO: renamed from: c5 */
    public C10901ix f37896c5;

    /* JADX INFO: renamed from: du */
    public C10901ix f37897du;

    /* JADX INFO: renamed from: dy */
    public C10901ix f37898dy;

    /* JADX INFO: renamed from: h4 */
    public C10901ix f37899h4;

    /* JADX INFO: renamed from: k4 */
    public String f37900k4;

    /* JADX INFO: renamed from: kk */
    public int f37901kk;

    /* JADX INFO: renamed from: m9 */
    public C10901ix f37902m9;

    /* JADX INFO: renamed from: to */
    public C10895c5 f37903to;

    public C10901ix(C10898dy c10898dy, String str, int i, C10895c5 c10895c5) {
        super(c10898dy);
        this.f37900k4 = str;
        this.f37901kk = i;
        this.f37903to = c10895c5;
    }

    /* JADX INFO: renamed from: k4 */
    private int m52474k4() {
        int i = 0;
        for (C10901ix c10901ix = this.f37898dy; c10901ix != null; c10901ix = c10901ix.f37902m9) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52475k4(C10901ix c10901ix) {
        if (this.f37898dy == null) {
            this.f37898dy = c10901ix;
        } else {
            C10901ix c10901ix2 = this.f37896c5;
            c10901ix2.f37902m9 = c10901ix;
            c10901ix.f37899h4 = c10901ix2;
        }
        this.f37896c5 = c10901ix;
        c10901ix.f37897du = this;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52649k4(m52570yj());
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52670to("/Title", this.f37900k4);
        c10922yj.m52666kk("/Parent", this.f37897du.m52565c5());
        C10901ix c10901ix = this.f37899h4;
        if (c10901ix != null) {
            c10922yj.m52666kk("/Prev", c10901ix.m52565c5());
        }
        C10901ix c10901ix2 = this.f37902m9;
        if (c10901ix2 != null) {
            c10922yj.m52666kk("/Next", c10901ix2.m52565c5());
        }
        C10901ix c10901ix3 = this.f37898dy;
        if (c10901ix3 != null) {
            c10922yj.m52666kk("/First", c10901ix3.m52565c5());
        }
        C10901ix c10901ix4 = this.f37896c5;
        if (c10901ix4 != null) {
            c10922yj.m52666kk("/Last", c10901ix4.m52565c5());
        }
        if (this.f37898dy != null) {
            int iM52474k4 = m52474k4();
            if (this.f37901kk >= this.f37962x1.m52464x1().m52625to()) {
                iM52474k4 = -iM52474k4;
            }
            c10922yj.m52652k4("/Count", iM52474k4);
        }
        c10922yj.m52650k4("/Dest");
        this.f37903to.m52437k4(c10922yj);
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        for (C10901ix c10901ix5 = this.f37898dy; c10901ix5 != null; c10901ix5 = c10901ix5.f37902m9) {
            c10901ix5.mo9082k4(c10922yj);
        }
    }
}
