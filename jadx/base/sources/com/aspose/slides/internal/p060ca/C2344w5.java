package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.w5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2344w5 extends C2236ov {

    /* JADX INFO: renamed from: c5 */
    private short f8136c5;

    /* JADX INFO: renamed from: ck */
    private short f8137ck;

    /* JADX INFO: renamed from: du */
    private short f8138du;

    /* JADX INFO: renamed from: dy */
    private short f8139dy;

    /* JADX INFO: renamed from: fa */
    private short f8140fa;

    /* JADX INFO: renamed from: h4 */
    private short f8141h4;

    /* JADX INFO: renamed from: jd */
    private short f8142jd;

    /* JADX INFO: renamed from: k4 */
    private float f8143k4;

    /* JADX INFO: renamed from: kk */
    private int f8144kk;

    /* JADX INFO: renamed from: m9 */
    private short f8145m9;

    /* JADX INFO: renamed from: to */
    private short f8146to;

    /* JADX INFO: renamed from: up */
    private short f8147up;

    /* JADX INFO: renamed from: x1 */
    private int f8148x1;

    public C2344w5(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f8143k4 = 1.0f;
    }

    /* JADX INFO: renamed from: m9 */
    private void m11586m9() {
        this.f8144kk = 0;
        this.f8142jd = (short) 0;
        this.f8146to = Short.MAX_VALUE;
        this.f8136c5 = Short.MAX_VALUE;
        try {
            if (m11221lr().m10552jd() != null) {
                if (m11221lr().m10552jd().m10846k4().m10855k4() == 1) {
                    this.f8144kk = m11221lr().m10552jd().m10846k4().m10856k4(0).m10851k4();
                    if (m11221lr().m10552jd().m10847x1().length > 0) {
                        if (m11221lr().m10552jd().m10847x1()[0] < this.f8146to) {
                            this.f8146to = m11221lr().m10552jd().m10847x1()[0];
                        }
                        this.f8136c5 = (short) ((this.f8144kk & 65535) - this.f8146to);
                    }
                } else {
                    for (int i = 0; i < (m11221lr().m10547du().m11521k4() & 65535); i++) {
                        C2068ei c2068eiM10741k4 = m11223yd().m11703kk().m10741k4(i);
                        if (i <= m11221lr().m10552jd().m10846k4().m10855k4() - 1) {
                            int iM10851k4 = m11221lr().m10552jd().m10846k4().m10856k4(i).m10851k4();
                            short sM10854x1 = m11221lr().m10552jd().m10846k4().m10856k4(i).m10854x1();
                            if ((m11221lr().m10552jd().m10846k4().m10856k4(i).m10851k4() & 65535) > (this.f8144kk & 65535)) {
                                this.f8144kk = iM10851k4;
                            }
                            if (sM10854x1 < this.f8146to) {
                                this.f8146to = sM10854x1;
                            }
                            double dM10420kk = ((double) ((iM10851k4 & 65535) - sM10854x1)) - (c2068eiM10741k4.m10467fa().m10420kk() - c2068eiM10741k4.m10467fa().m10418k4());
                            if (dM10420kk < this.f8136c5) {
                                this.f8136c5 = C7019kk.m27468x1(Double.valueOf(dM10420kk), 14);
                            }
                            double dM10420kk2 = (c2068eiM10741k4.m10467fa().m10420kk() - c2068eiM10741k4.m10467fa().m10418k4()) + ((double) sM10854x1);
                            if (dM10420kk2 > this.f8142jd) {
                                this.f8142jd = C7019kk.m27468x1(Double.valueOf(dM10420kk2), 14);
                            }
                        } else {
                            int iM10855k4 = i - m11221lr().m10552jd().m10846k4().m10855k4();
                            if (iM10855k4 >= 0 && iM10855k4 < m11221lr().m10552jd().m10847x1().length && m11221lr().m10552jd().m10847x1()[iM10855k4] < this.f8146to) {
                                this.f8146to = m11221lr().m10552jd().m10847x1()[iM10855k4];
                            }
                        }
                    }
                }
            }
            if (this.f8146to == Short.MAX_VALUE) {
                this.f8146to = (short) 0;
            }
            if (this.f8136c5 == Short.MAX_VALUE) {
                this.f8136c5 = (short) 0;
            }
        } catch (Throwable th) {
            if (this.f8146to == Short.MAX_VALUE) {
                this.f8146to = (short) 0;
            }
            if (this.f8136c5 == Short.MAX_VALUE) {
                this.f8136c5 = (short) 0;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: du */
    public final short m11587du() {
        return this.f8145m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m11588h4() {
        return this.f8137ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11589k4() {
        return this.f8148x1;
    }

    /* JADX INFO: renamed from: kk */
    public final short m11592kk() {
        return this.f8138du;
    }

    /* JADX INFO: renamed from: to */
    public final short m11594to() {
        return this.f8141h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11596x1() {
        return this.f8144kk;
    }

    public C2344w5(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11590k4(int i) {
        this.f8148x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11593kk(short s) {
        this.f8145m9 = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m11595to(short s) {
        this.f8137ck = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11597x1(short s) {
        this.f8141h4 = s;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f8143k4 = c2212n9.m11163to();
        this.f8138du = c2212n9.m11152h4();
        this.f8141h4 = c2212n9.m11152h4();
        this.f8145m9 = c2212n9.m11152h4();
        this.f8144kk = c2212n9.m11149du();
        this.f8146to = c2212n9.m11152h4();
        this.f8136c5 = c2212n9.m11152h4();
        this.f8142jd = c2212n9.m11152h4();
        this.f8137ck = c2212n9.m11147c5();
        this.f8140fa = c2212n9.m11147c5();
        this.f8147up = c2212n9.m11147c5();
        c2212n9.m11147c5();
        c2212n9.m11147c5();
        c2212n9.m11147c5();
        c2212n9.m11147c5();
        this.f8139dy = c2212n9.m11147c5();
        this.f8148x1 = c2212n9.m11151fa();
        super.mo10299k4(c2212n9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11591k4(short s) {
        this.f8138du = s;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                m11586m9();
                c2362x4.m11646k4(this.f8143k4);
                c2362x4.m11664x1(this.f8138du);
                c2362x4.m11664x1(this.f8141h4);
                c2362x4.m11664x1(this.f8145m9);
                c2362x4.m11659kk(this.f8144kk);
                c2362x4.m11664x1(this.f8146to);
                c2362x4.m11664x1(this.f8136c5);
                c2362x4.m11664x1(this.f8142jd);
                c2362x4.m11651k4(this.f8137ck);
                c2362x4.m11651k4(this.f8140fa);
                c2362x4.m11651k4(this.f8147up);
                c2362x4.m11651k4((short) 0);
                c2362x4.m11651k4((short) 0);
                c2362x4.m11651k4((short) 0);
                c2362x4.m11651k4((short) 0);
                c2362x4.m11651k4(this.f8139dy);
                c2362x4.m11647k4(this.f8148x1);
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
