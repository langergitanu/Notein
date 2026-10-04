package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.o2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2842o2 extends AbstractC7020m9<C2842o2> {

    /* JADX INFO: renamed from: k4 */
    private double f8694k4;

    /* JADX INFO: renamed from: kk */
    private double f8695kk;

    /* JADX INFO: renamed from: to */
    private double f8696to;

    /* JADX INFO: renamed from: x1 */
    private double f8697x1;

    public C2842o2() {
    }

    /* JADX INFO: renamed from: c5 */
    public C2865q1 m12432c5() {
        double d = this.f8694k4;
        double dM67475k4 = (C14116yg.m67475k4(this.f8697x1 - d) / 2.0d) + d;
        double d2 = this.f8695kk;
        return new C2865q1(dM67475k4, (C14116yg.m67475k4(this.f8696to - d2) / 2.0d) + d2);
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public C2865q1 m12433du() {
        return new C2865q1(this.f8694k4, this.f8695kk);
    }

    /* JADX INFO: renamed from: dy */
    public double m12434dy() {
        return C14116yg.m67475k4(this.f8696to - this.f8695kk);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C2842o2) {
            return m12431x1((C2842o2) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public C2865q1 m12435h4() {
        return new C2865q1(this.f8697x1, this.f8696to);
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f8694k4), Double.valueOf(this.f8697x1), Double.valueOf(this.f8695kk), Double.valueOf(this.f8696to));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: jd, reason: merged with bridge method [inline-methods] */
    public C2842o2 Clone() {
        C2842o2 c2842o2 = new C2842o2();
        CloneTo(c2842o2);
        return c2842o2;
    }

    /* JADX INFO: renamed from: k4 */
    public double m12437k4() {
        return this.f8694k4;
    }

    /* JADX INFO: renamed from: kk */
    public double m12440kk() {
        return this.f8697x1;
    }

    /* JADX INFO: renamed from: m9 */
    public double m12441m9() {
        return C14116yg.m67475k4(this.f8697x1 - this.f8694k4);
    }

    /* JADX INFO: renamed from: to */
    public double m12442to() {
        return this.f8696to;
    }

    /* JADX INFO: renamed from: x1 */
    public double m12443x1() {
        return this.f8695kk;
    }

    public C2842o2(double d, double d2, double d3, double d4) {
        this.f8694k4 = d;
        this.f8697x1 = d3;
        this.f8695kk = d2;
        this.f8696to = d4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m12431x1(C2842o2 c2842o2) {
        return c2842o2.f8694k4 == this.f8694k4 && c2842o2.f8697x1 == this.f8697x1 && c2842o2.f8695kk == this.f8695kk && c2842o2.f8696to == this.f8696to;
    }

    /* JADX INFO: renamed from: k4 */
    public C2842o2 m12438k4(C2865q1 c2865q1, double d) {
        return new C2842o2(C2968xo.m12598k4(c2865q1, C2968xo.m12599k4(C2865q1.m12475k4(m12433du(), c2865q1).Clone(), d)).Clone(), C2968xo.m12598k4(c2865q1, C2968xo.m12599k4(C2865q1.m12475k4(m12435h4(), c2865q1).Clone(), d)).Clone());
    }

    public C2842o2(C2865q1 c2865q1, C2865q1 c2865q12) {
        this(c2865q1.m12477k4(), c2865q1.m12481x1(), c2865q12.m12477k4(), c2865q12.m12481x1());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2842o2 c2842o2) {
        c2842o2.f8694k4 = this.f8694k4;
        c2842o2.f8697x1 = this.f8697x1;
        c2842o2.f8695kk = this.f8695kk;
        c2842o2.f8696to = this.f8696to;
    }
}
