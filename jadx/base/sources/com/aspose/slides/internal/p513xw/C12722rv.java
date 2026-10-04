package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12722rv extends AbstractC12704j5 {

    /* JADX INFO: renamed from: du */
    private List<AbstractC12716nv> f42335du;

    /* JADX INFO: renamed from: k4 */
    private int f42336k4;

    /* JADX INFO: renamed from: kk */
    private int f42337kk;

    /* JADX INFO: renamed from: to */
    private List<AbstractC12716nv> f42338to;

    /* JADX INFO: renamed from: x1 */
    private int f42339x1;

    public C12722rv(C12717os c12717os, int i, int i2, int i3, C12724ss c12724ss) {
        super(c12717os);
        this.f42336k4 = i;
        this.f42339x1 = i2;
        this.f42337kk = i3;
        this.f42338to = c12724ss.m59192x6();
        this.f42335du = c12724ss.m59169ks();
    }

    /* JADX INFO: renamed from: kk */
    private static String m59123kk(int i) {
        return AbstractC12741x1.m59361k4(i);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m59124c5() {
        return this.f42337kk;
    }

    /* JADX INFO: renamed from: ck */
    public final List<AbstractC12716nv> m59125ck() {
        return this.f42335du;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12704j5
    /* JADX INFO: renamed from: du */
    public boolean mo58995du() {
        return false;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12723s7
    /* JADX INFO: renamed from: dy */
    public boolean mo59082dy() {
        return this.f42339x1 == -1000;
    }

    /* JADX INFO: renamed from: fa */
    public final void m59126fa() {
        this.f42338to = null;
        this.f42335du = null;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m59127h4() {
        return this.f42336k4;
    }

    /* JADX INFO: renamed from: jd */
    public final List<AbstractC12716nv> m59128jd() {
        return this.f42338to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59129k4(int i) {
        this.f42339x1 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m59130m9() {
        return this.f42339x1;
    }

    public String toString() {
        String str;
        C6765kp c6765kp = new C6765kp(64);
        c6765kp.m26792k4("BreakPossibility[p:");
        c6765kp.m26792k4(C12718qm.m59079k4(this.f42339x1));
        if (!mo59082dy()) {
            str = (this.f42339x1 >= 0 && this.f42337kk != -1) ? " (keep constraint, " : " (forced break, ";
            c6765kp.m26792k4("; w:");
            c6765kp.m26805kk(this.f42336k4);
            c6765kp.m26792k4("]");
            return c6765kp.toString();
        }
        c6765kp.m26792k4(str).m26792k4(m59123kk(this.f42337kk)).m26792k4(")");
        c6765kp.m26792k4("; w:");
        c6765kp.m26805kk(this.f42336k4);
        c6765kp.m26792k4("]");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59131x1(int i) {
        this.f42337kk = i;
    }

    public C12722rv(C12717os c12717os, int i, int i2, C12724ss c12724ss) {
        this(c12717os, 0, i, i2, c12724ss);
    }

    public C12722rv(C12717os c12717os, int i, C12724ss c12724ss) {
        this(c12717os, i, -1, c12724ss);
    }
}
