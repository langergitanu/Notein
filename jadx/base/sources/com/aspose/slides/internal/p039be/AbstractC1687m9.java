package com.aspose.slides.internal.p039be;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p085dk.C3177m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p353q7.C9787sv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.m9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1687m9 extends AbstractC1689x1 {

    /* JADX INFO: renamed from: c5 */
    private C1680c5 f6397c5;

    /* JADX INFO: renamed from: du */
    private boolean[] f6398du;

    /* JADX INFO: renamed from: dy */
    private C1686kk f6399dy;

    /* JADX INFO: renamed from: h4 */
    private char f6400h4;

    /* JADX INFO: renamed from: m9 */
    private char f6401m9;

    /* JADX INFO: renamed from: to */
    protected C9787sv f6402to;

    public AbstractC1687m9(C10898dy c10898dy, int i, C9790ts c9790ts, int i2, int i3) {
        super(c10898dy, i, c9790ts, i2);
        this.f6401m9 = (char) 0;
        m9122k4(C3177m9.m13599k4(i3, 4));
        if (c10898dy.m52454fa() || !m9128u4()) {
            this.f6402to = new C9787sv(c9790ts, false, false);
        }
    }

    /* JADX INFO: renamed from: ar */
    public abstract String mo9086ar();

    /* JADX INFO: renamed from: bv */
    public final char m9103bv() {
        return this.f6400h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9104k4(char c) {
        this.f6400h4 = c;
    }

    /* JADX INFO: renamed from: lr */
    public final C1680c5 m9109lr() {
        return this.f6397c5;
    }

    /* JADX INFO: renamed from: qq */
    public final String m9110qq() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (char c = this.f6400h4; c <= this.f6401m9; c = (char) (c + 1)) {
            if (this.f6398du[c]) {
                c6765kpOooO00o.m26805kk(m9121k4(((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(c).m48285kk()));
            } else {
                c6765kpOooO00o.m26792k4("0");
            }
            if (c < this.f6401m9) {
                c6765kpOooO00o.m26792k4(" ");
            }
        }
        c6765kpOooO00o.m26792k4("]");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: um */
    public final boolean[] m9111um() {
        return this.f6398du;
    }

    /* JADX INFO: renamed from: v4 */
    public final char m9112v4() {
        return this.f6401m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9113x1(char c) {
        this.f6401m9 = c;
    }

    /* JADX INFO: renamed from: yd */
    public final C1686kk m9115yd() {
        return this.f6399dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9105k4(C1680c5 c1680c5) {
        this.f6397c5 = c1680c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9114x1(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Font");
        c10922yj.m52666kk("/Subtype", mo9086ar());
        c10922yj.m52666kk("/BaseFont", C14113y2.m67402k4("/{0}", m9127to()));
        c10922yj.m52652k4("/FirstChar", (int) m9103bv());
        c10922yj.m52652k4("/LastChar", (int) m9112v4());
        m9105k4(new C1680c5(this.f37962x1, m9110qq()));
        c10922yj.m52666kk("/Widths", m9109lr().m52565c5());
        c10922yj.m52666kk("/FontDescriptor", m9115yd().m52565c5());
        c10922yj.m52666kk("/Encoding", "/WinAnsiEncoding");
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9106k4(C1686kk c1686kk) {
        this.f6399dy = c1686kk;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m9114x1(c10922yj);
        this.f6397c5.mo9082k4(c10922yj);
        this.f6399dy.mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo9088k4(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 255) {
                m9111um()[cCharAt] = true;
                if (cCharAt < m9103bv()) {
                    m9104k4(cCharAt);
                }
                if (cCharAt > m9112v4()) {
                    m9113x1(cCharAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9107k4(String str, C10921yd c10921yd) {
        double d;
        C6765kp c6765kp = new C6765kp();
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        double dM48193k4 = 0.0d;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            int iM48287x1 = ((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(cCharAt).m48287x1();
            if (this.f6402to.m48151k4(cCharAt) >= 0) {
                if (i == Integer.MIN_VALUE || ((AbstractC1689x1) this).f6405k4.m48220lr() == null) {
                    d = 0.0d;
                } else {
                    d = 0.0d;
                    dM48193k4 = ((AbstractC1689x1) this).f6405k4.m48193k4(((long) i) & 4294967295L, ((long) iM48287x1) & 4294967295L);
                }
                if (dM48193k4 != d) {
                    c10921yd.m52642du(c6765kp.toString());
                    c10921yd.m52650k4(C14113y2.m67402k4(") {0} (", Integer.valueOf(-com.aspose.slides.Collections.Generic.OooO00o.OooO00o(dM48193k4 / ((double) ((AbstractC1689x1) this).f6405k4.m48175c5()), 1000.0d, 14))));
                    c6765kp.m26801k4(0);
                }
            }
            c6765kp.m26780k4(str.charAt(i2));
            i2++;
            i = iM48287x1;
        }
        if (c6765kp.m26807x1() > 0) {
            c10921yd.m52642du(c6765kp.toString());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9108k4(boolean[] zArr) {
        this.f6398du = zArr;
    }
}
