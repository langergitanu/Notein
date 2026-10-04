package com.aspose.slides.internal.p052c0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p339pk.C9463yj;
import com.aspose.slides.internal.p460vf.C11639kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.internal.p541z6.C13447k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.c0.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1937to {

    /* JADX INFO: renamed from: k4 */
    public static final C12007ix f6878k4 = new C12007ix(0.0f, 0.0f, 1280.0f, 1024.0f);

    /* JADX INFO: renamed from: c5 */
    private boolean f6879c5;

    /* JADX INFO: renamed from: ck */
    private boolean f6880ck;

    /* JADX INFO: renamed from: du */
    private C1938x1 f6881du;

    /* JADX INFO: renamed from: dy */
    private boolean f6882dy;

    /* JADX INFO: renamed from: fa */
    private boolean f6883fa;

    /* JADX INFO: renamed from: h4 */
    private C1935k4 f6884h4;

    /* JADX INFO: renamed from: jd */
    private C12007ix f6885jd;

    /* JADX INFO: renamed from: kk */
    private final int f6886kk;

    /* JADX INFO: renamed from: m9 */
    private int f6887m9;

    /* JADX INFO: renamed from: to */
    private C1936kk f6888to;

    /* JADX INFO: renamed from: up */
    private int f6889up;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f6890x1;

    /* JADX INFO: renamed from: yj */
    private C12015qq f6891yj;

    public C1937to(AbstractC3150x6 abstractC3150x6) {
        this.f6882dy = false;
        this.f6879c5 = false;
        this.f6885jd = C12007ix.f40519k4.Clone();
        this.f6880ck = false;
        this.f6883fa = false;
        this.f6889up = 0;
        this.f6891yj = new C12015qq(1280.0f, 1024.0f);
        this.f6890x1 = abstractC3150x6;
        this.f6886kk = C12549du.m58490h4(abstractC3150x6);
        m9978ix();
    }

    /* JADX INFO: renamed from: ix */
    private void m9978ix() {
        this.f6890x1.setPosition(0L);
        C3134k4 c3134k4 = new C3134k4(this.f6890x1);
        if (m9982c5()) {
            C1935k4 c1935k4 = new C1935k4();
            this.f6884h4 = c1935k4;
            c1935k4.m9973k4(c3134k4);
        } else {
            if (m9995to()) {
                C1938x1 c1938x1 = new C1938x1();
                this.f6881du = c1938x1;
                c1938x1.m10001k4(c3134k4);
            }
            C1936kk c1936kk = new C1936kk();
            this.f6888to = c1936kk;
            c1936kk.m9977k4(c3134k4);
        }
        this.f6887m9 = (int) this.f6890x1.getPosition();
    }

    /* JADX INFO: renamed from: u4 */
    private float m9979u4() {
        if (m9995to()) {
            return this.f6881du.m10003kk();
        }
        return 96.0f;
    }

    /* JADX INFO: renamed from: uz */
    private C12007ix m9980uz() {
        if (!this.f6882dy) {
            m9981wl();
            this.f6882dy = true;
        }
        return this.f6885jd;
    }

    /* JADX INFO: renamed from: wl */
    private void m9981wl() {
        C9463yj c9463yj = new C9463yj();
        C1934du c1934du = new C1934du(c9463yj);
        c9463yj.m46292k4(this, c1934du, new C11639kk(), new C12007ix(C12025x6.f40591k4.Clone(), m9993ne().Clone()));
        c1934du.m9963x1().CloneTo(this.f6885jd);
        this.f6880ck = c1934du.m9962up();
        this.f6889up = c1934du.m9970yj();
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m9982c5() {
        return m9984du() || m9985dy();
    }

    /* JADX INFO: renamed from: ck */
    public final float m9983ck() {
        int i = this.f6886kk;
        if (i == 1 || i == 2) {
            return m9979u4();
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.f6884h4.m9974kk();
        }
        throw new InvalidOperationException("Unknown metafile type.");
    }

    /* JADX INFO: renamed from: du */
    public final boolean m9984du() {
        return this.f6886kk == 3;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m9985dy() {
        return m9987h4() || m9992m9();
    }

    /* JADX INFO: renamed from: fa */
    public final C12007ix m9986fa() {
        int i = this.f6886kk;
        if (i == 1) {
            return m9980uz();
        }
        if (i == 2) {
            return this.f6881du.m10002k4() ? this.f6881du.m10004x1() : f6878k4;
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.f6884h4.m9972k4();
        }
        throw new InvalidOperationException("Unknown metafile type.");
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m9987h4() {
        return this.f6886kk == 5;
    }

    /* JADX INFO: renamed from: jd */
    public final float m9988jd() {
        int i = this.f6886kk;
        if (i == 1 || i == 2) {
            return m9979u4();
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.f6884h4.m9975x1();
        }
        throw new InvalidOperationException("Unknown metafile type.");
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m9989k4() {
        return this.f6890x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m9990kk() {
        return this.f6887m9;
    }

    /* JADX INFO: renamed from: ks */
    public final C12015qq m9991ks() {
        return new C12015qq((float) C12566m9.m58654x1(m9999yj().m56699x1(), m9988jd()), (float) C12566m9.m58654x1(m9999yj().m56697kk(), m9983ck()));
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m9992m9() {
        return this.f6886kk == 4;
    }

    /* JADX INFO: renamed from: ne */
    public final C12015qq m9993ne() {
        return this.f6891yj;
    }

    /* JADX INFO: renamed from: rv */
    public final int m9994rv() {
        return this.f6886kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m9995to() {
        return this.f6886kk == 2;
    }

    /* JADX INFO: renamed from: up */
    public final C1938x1 m9996up() {
        return this.f6881du;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m9997x1() {
        if (!this.f6890x1.canSeek()) {
            throw new InvalidOperationException();
        }
        long position = this.f6890x1.getPosition();
        this.f6890x1.setPosition(0L);
        byte[] bArrM62559k4 = C13447k4.m62559k4(this.f6890x1);
        this.f6890x1.setPosition(position);
        return bArrM62559k4;
    }

    /* JADX INFO: renamed from: x6 */
    public final int m9998x6() {
        if (m9982c5()) {
            return 0;
        }
        return this.f6888to.m9976k4();
    }

    /* JADX INFO: renamed from: yj */
    public final C12015qq m9999yj() {
        return m9986fa().m56570m9();
    }

    public C1937to(byte[] bArr) {
        this(new C3152yj(bArr));
    }
}
