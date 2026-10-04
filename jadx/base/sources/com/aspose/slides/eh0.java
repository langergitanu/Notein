package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class eh0 extends cdv {

    /* JADX INFO: renamed from: du */
    private ehe f4792du;

    /* JADX INFO: renamed from: k4 */
    private C0886d8 f4793k4;

    /* JADX INFO: renamed from: kk */
    private double f4794kk;

    /* JADX INFO: renamed from: to */
    private boolean f4795to;

    /* JADX INFO: renamed from: x1 */
    private double f4796x1;

    public eh0(C0886d8 c0886d8, double d, double d2, double d3, double d4) {
        super(d3, d4);
        this.f4793k4 = c0886d8;
        double d5 = d - 90.0d;
        this.f4796x1 = d5;
        if (d5 < 0.0d) {
            this.f4796x1 = d5 + 360.0d;
        }
        this.f4794kk = d2;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m5523k4(double d, double d2, double d3) {
        if (d3 <= 0.0d) {
            return d;
        }
        double dM67475k4 = C14116yg.m67475k4(d2);
        return C14116yg.m67491kk((dM67475k4 - d3) * (d / dM67475k4), d);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f4794kk > 0.0d && m4552c5() > 0.0d;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_() && this.f4793k4 != null) {
            this.f4793k4.m4986h4(mo5526dy());
        }
    }

    /* JADX INFO: renamed from: ck */
    public final double m5525ck() {
        return m73225wy() / 2.0f;
    }

    /* JADX INFO: renamed from: dy */
    public C11896dy mo5526dy() {
        C11896dy c11896dy = new C11896dy();
        C12025x6 c12025x6Clone = m73223ts().Clone();
        if (this.f4794kk >= 360.0d) {
            c11896dy.m55542k4(m73209e0().Clone());
            return c11896dy;
        }
        C12025x6 c12025x6Clone2 = C14873z5.m74319k4(this.f4796x1, m5525ck(), c12025x6Clone.Clone()).Clone();
        C12025x6 c12025x6Clone3 = C14873z5.m74319k4(this.f4796x1 + this.f4794kk, m5525ck(), c12025x6Clone.Clone()).Clone();
        c11896dy.m55547k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone());
        c11896dy.m55543k4(m73209e0().Clone(), (float) this.f4796x1, (float) this.f4794kk);
        c11896dy.m55547k4(c12025x6Clone3.Clone(), c12025x6Clone.Clone());
        return c11896dy;
    }

    /* JADX INFO: renamed from: fa */
    public final double m5527fa() {
        return this.f4796x1 % 360.0d;
    }

    /* JADX INFO: renamed from: ks */
    public final int m5533ks() {
        if (this.f4793k4.m4988jd() != null) {
            return this.f4793k4.m4988jd().getExplosion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m5534rv() {
        return this.f4795to;
    }

    /* JADX INFO: renamed from: up */
    public final double m5535up() {
        return this.f4794kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m5536x1(double d) {
        return C14873z5.m74319k4(m5538yj() % 360.0d, d, m73223ts().Clone());
    }

    /* JADX INFO: renamed from: yj */
    public final double m5538yj() {
        return ((this.f4794kk / 2.0d) + this.f4796x1) % 360.0d;
    }

    public eh0(ehe eheVar, double d, double d2, double d3, double d4) {
        super(d3, d4);
        this.f4792du = eheVar;
        double d5 = d - 90.0d;
        this.f4796x1 = d5;
        if (d5 < 0.0d) {
            this.f4796x1 = d5 + 360.0d;
        }
        this.f4794kk = d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m5528k4(double d, mxy mxyVar) {
        if (d <= 0.0d) {
            return new C12025x6();
        }
        C12025x6 c12025x6Clone = C14873z5.m74319k4(m5538yj(), d, C12025x6.f40591k4.Clone()).Clone();
        C12007ix c12007ixClone = m5531k4(1.0d, 1.0d, 5).m63359to().Clone();
        c12007ixClone.m56567kk(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        boolean zM74327k4 = C14873z5.m74327k4(new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone(), c12007ixClone.Clone(), fArr, fArr2);
        float f = fArr[0];
        float f2 = fArr2[0];
        if (zM74327k4) {
            C14873z5.m74319k4(m5538yj(), C14116yg.m67491kk(m5523k4(d, c12025x6Clone.m56897x1(), C14116yg.m67480k4(f)), m5523k4(d, c12025x6Clone.m56895kk(), C14116yg.m67480k4(f2))), C12025x6.f40591k4.Clone()).CloneTo(c12025x6Clone);
        }
        return new C12025x6(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m5537x1(C12015qq c12015qq, double d) {
        double d2;
        double d3;
        C12025x6 c12025x6Clone = m5536x1(d).Clone();
        double dM5538yj = m5538yj() % 180.0d;
        double d4 = 1.0d;
        if (dM5538yj > 45.0d) {
            if (dM5538yj >= 67.5d && dM5538yj <= 90.0d) {
                d3 = 90.0d - dM5538yj;
            } else if (dM5538yj > 90.0d && dM5538yj <= 112.5d) {
                d3 = dM5538yj - 90.0d;
            } else if (dM5538yj >= 135.0d) {
                dM5538yj = 180.0d - dM5538yj;
                d2 = dM5538yj / 45.0d;
            } else {
                d2 = 1.0d;
            }
            d4 = d3 / 22.5d;
            d2 = 1.0d;
        } else {
            d2 = dM5538yj / 45.0d;
        }
        if (m5538yj() > 90.0d && m5538yj() < 270.0d) {
            d4 *= -1.0d;
        }
        if (m5538yj() > 180.0d) {
            d2 *= -1.0d;
        }
        return C14873z5.m74322k4(c12025x6Clone.Clone(), (float) (((double) (c12015qq.m56699x1() / 2.0f)) * d4), (float) (((double) (c12015qq.m56697kk() / 2.0f)) * d2));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m5529k4(C12015qq c12015qq, double d) {
        tbp tbpVarClone = yz6.m74163k4(new jof(new tbp(m5536x1(d).Clone().Clone()), c12015qq.m56699x1(), c12015qq.m56697kk()).Clone(), new tbp(m73223ts().Clone())).Clone();
        return new C12025x6((float) tbpVarClone.f49090k4, (float) tbpVarClone.f49091x1);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C11896dy c11896dyMo5526dy = mo5526dy();
        C0886d8 c0886d8 = this.f4793k4;
        if (c0886d8 != null && !c0886d8.m5019x1(c11896dyMo5526dy)) {
            this.f4793k4.m5000kk(c11896dyMo5526dy);
            this.f4793k4.m4992k4(c11896dyMo5526dy);
        }
        if (this.f4792du != null) {
            im9.m7717kk(C12003du.m56385i5().Clone(), C12003du.f40505to.Clone(), this.f4792du.m5541dy(), c11896dyMo5526dy, (LineFormat) this.f4792du.m5543m9().getFormat().getLine(), (FillFormat) this.f4792du.m5543m9().getFormat().getFill(), this.f4792du.m5543m9().getFormat().getEffect(), 1.0f);
            im9.m7703k4(C12003du.f40505to.Clone(), this.f4792du.m5541dy(), c11896dyMo5526dy, this.f4792du.m5543m9().m651kk(), 1.0f, this.f4792du.m5543m9().m653to());
            im9.m7705k4(C12003du.m56385i5().Clone(), this.f4792du.m5541dy(), c11896dyMo5526dy, (LineFormat) this.f4792du.m5543m9().getFormat().getLine(), this.f4792du.m5543m9().getFormat().getEffect());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final jjy m5530k4(double d, double d2) {
        return m5531k4(d, d2, 20);
    }

    /* JADX INFO: renamed from: k4 */
    public final jjy m5531k4(double d, double d2, int i) {
        double dM5525ck = m5525ck() * d;
        C12025x6 c12025x6Clone = m73223ts().Clone();
        double d3 = 1.0d - d2;
        double d4 = dM5525ck * d3;
        C14873z5.m74319k4(m5538yj(), d4, c12025x6Clone.Clone()).CloneTo(c12025x6Clone);
        double d5 = dM5525ck - d4;
        List list = new List();
        list.addItem(c12025x6Clone.Clone());
        list.addItem(C14873z5.m74319k4((this.f4794kk * d3) + this.f4796x1, d5, c12025x6Clone.Clone()).Clone());
        int i2 = i;
        while (true) {
            double d6 = i2;
            double d7 = this.f4794kk;
            if (d6 >= d7 * d2) {
                list.addItem(C14873z5.m74319k4((d7 * d2) + this.f4796x1, d5, c12025x6Clone.Clone()).Clone());
                list.addItem(c12025x6Clone.Clone());
                return new jjy((C12025x6[]) list.toArray(new C12025x6[0]));
            }
            list.addItem(C14873z5.m74319k4(this.f4796x1 + d6, d5, c12025x6Clone.Clone()).Clone());
            i2 += i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5532k4(boolean z) {
        this.f4795to = z;
    }
}
