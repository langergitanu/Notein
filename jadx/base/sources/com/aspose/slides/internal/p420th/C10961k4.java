package com.aspose.slides.internal.p420th;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10961k4 {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f38189k4;

    /* JADX INFO: renamed from: kk */
    private double f38190kk;

    /* JADX INFO: renamed from: to */
    private double f38191to;

    /* JADX INFO: renamed from: x1 */
    private C12015qq f38192x1;

    public C10961k4() {
        this.f38189k4 = C12025x6.f40591k4.Clone();
        this.f38192x1 = C12015qq.f40552k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private C10969to m52949k4(double d, double d2) {
        double dM54223k4 = C11241kk.m54223k4(d);
        double dM54223k42 = C11241kk.m54223k4(d2);
        double dM52951x1 = m52951x1(dM54223k4);
        double d3 = dM54223k42 + dM54223k4;
        double dM52951x12 = m52951x1(d3);
        double d4 = dM52951x12 - dM52951x1;
        double d5 = d4 / 2.0d;
        double dM67496rv = ((C14116yg.m67496rv((C14116yg.m67469du(C14116yg.m67466c5(d5), 2.0d) * 3.0d) + 4.0d) - 1.0d) * C14116yg.m67495m9(d4)) / 3.0d;
        C10969to c10969to = new C10969to();
        c10969to.m53052k4(m52950k4(dM54223k4).Clone());
        c10969to.m53056to(m52950k4(d3).Clone());
        c10969to.m53058x1(new C12025x6((float) (((double) c10969to.m53050k4().m56897x1()) - (C14116yg.m67495m9(dM52951x1) * (((double) m52957m9().m56699x1()) * dM67496rv))), (float) ((C14116yg.m67470dy(dM52951x1) * ((double) m52957m9().m56697kk()) * dM67496rv) + ((double) c10969to.m53050k4().m56895kk()))));
        c10969to.m53054kk(new C12025x6((float) ((C14116yg.m67495m9(dM52951x12) * ((double) m52957m9().m56699x1()) * dM67496rv) + ((double) c10969to.m53055to().m56897x1())), (float) (((double) c10969to.m53055to().m56895kk()) - (C14116yg.m67470dy(dM52951x12) * (dM67496rv * ((double) m52957m9().m56697kk()))))));
        return c10969to;
    }

    /* JADX INFO: renamed from: x1 */
    private double m52951x1(double d) {
        return C14116yg.m67498to(C14116yg.m67495m9(d) * (1.0d / ((double) m52957m9().m56697kk())), C14116yg.m67470dy(d) * (1.0d / ((double) m52957m9().m56699x1())));
    }

    /* JADX INFO: renamed from: du */
    public final double m52952du() {
        return this.f38190kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6 m52953dy() {
        return new C12025x6(m52957m9().m56699x1() + m52956kk().m56897x1(), m52957m9().m56697kk() + m52956kk().m56895kk());
    }

    /* JADX INFO: renamed from: h4 */
    public final double m52954h4() {
        return this.f38191to;
    }

    /* JADX INFO: renamed from: kk */
    public final C12025x6 m52956kk() {
        return this.f38189k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12015qq m52957m9() {
        return new C12015qq(m52958to().m56699x1() / 2.0f, m52958to().m56697kk() / 2.0f);
    }

    /* JADX INFO: renamed from: to */
    public final C12015qq m52958to() {
        return this.f38192x1;
    }

    public C10961k4(C12007ix c12007ix) {
        this(c12007ix.Clone(), 0.0d, 360.0d);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m52955k4() {
        return m52950k4(C11241kk.m54223k4(m52952du()));
    }

    /* JADX INFO: renamed from: x1 */
    public final C10969to[] m52959x1() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67475k4(m52954h4()) / 45.0d), 14);
        if (m52954h4() % 45.0d != 0.0d) {
            iM27462to++;
        }
        int iM67507x1 = C14116yg.m67507x1(iM27462to, C7019kk.m27462to(Double.valueOf(8.0d), 14));
        C10969to[] c10969toArr = (C10969to[]) C22200OooO0o0.OooO00o(C10969to.class, iM67507x1);
        double dM52952du = m52952du();
        double dM67472h4 = C14116yg.m67472h4(m52954h4());
        for (int i = 0; i < iM67507x1; i++) {
            double dM67491kk = C14116yg.m67491kk(45.0d, C14116yg.m67475k4((m52954h4() + m52952du()) - dM52952du)) * dM67472h4;
            m52949k4(dM52952du, dM67491kk).CloneTo(c10969toArr[i]);
            dM52952du += dM67491kk;
        }
        return c10969toArr;
    }

    public C10961k4(C12007ix c12007ix, double d, double d2) {
        this.f38189k4 = C12025x6.f40591k4.Clone();
        this.f38192x1 = C12015qq.f40552k4.Clone();
        c12007ix.m56552du().CloneTo(this.f38189k4);
        c12007ix.m56570m9().CloneTo(this.f38192x1);
        this.f38190kk = d;
        this.f38191to = d2;
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m52950k4(double d) {
        double dM52951x1 = m52951x1(d);
        return new C12025x6((float) ((C14116yg.m67470dy(dM52951x1) * ((double) m52957m9().m56699x1())) + ((double) m52953dy().m56897x1())), (float) ((C14116yg.m67495m9(dM52951x1) * ((double) m52957m9().m56697kk())) + ((double) m52953dy().m56895kk())));
    }
}
