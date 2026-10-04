package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.DivideByZeroException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.xo */
/* JADX INFO: loaded from: classes3.dex */
public class C2968xo extends AbstractC7020m9<C2968xo> {

    /* JADX INFO: renamed from: k4 */
    private double f8803k4;

    /* JADX INFO: renamed from: x1 */
    private double f8804x1;

    public C2968xo() {
        this.f8803k4 = 0.0d;
        this.f8804x1 = 0.0d;
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final C2968xo m12604du() {
        C2968xo c2968xoClone = m12610to().Clone();
        return new C2968xo(-c2968xoClone.m12611x1(), c2968xoClone.m12606k4());
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C2968xo) {
            return m12601to((C2968xo) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public C2968xo Clone() {
        C2968xo c2968xo = new C2968xo();
        CloneTo(c2968xo);
        return c2968xo;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f8803k4), Double.valueOf(this.f8804x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final double m12606k4() {
        return this.f8803k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m12608kk() {
        double d = this.f8803k4;
        double d2 = this.f8804x1;
        return C14116yg.m67496rv((d2 * d2) + (d * d));
    }

    /* JADX INFO: renamed from: to */
    public final C2968xo m12610to() {
        if (m12608kk() >= 1.0E-6d) {
            return m12603x1(this, m12608kk());
        }
        throw new DivideByZeroException();
    }

    /* JADX INFO: renamed from: x1 */
    public final double m12611x1() {
        return this.f8804x1;
    }

    public C2968xo(double d, double d2) {
        if (C14044b3.m66437kk(d)) {
            throw new ArgumentOutOfRangeException("dx");
        }
        if (C14044b3.m66437kk(d2)) {
            throw new ArgumentOutOfRangeException("dy");
        }
        this.f8803k4 = d;
        this.f8804x1 = d2;
    }

    /* JADX INFO: renamed from: to */
    private boolean m12601to(C2968xo c2968xo) {
        return c2968xo.f8803k4 == this.f8803k4 && c2968xo.f8804x1 == this.f8804x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static C2968xo m12602x1(C2968xo c2968xo) {
        return new C2968xo(-c2968xo.f8803k4, -c2968xo.f8804x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m12607k4(C2968xo c2968xo) {
        if (m12608kk() < 1.0E-6d || c2968xo.m12608kk() < 1.0E-6d) {
            throw new DivideByZeroException();
        }
        return C14116yg.m67473jd(C14116yg.m67477k4(((c2968xo.m12611x1() * m12611x1()) + (c2968xo.m12606k4() * m12606k4())) / (c2968xo.m12608kk() * m12608kk()), 3));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2968xo c2968xo) {
        c2968xo.f8803k4 = this.f8803k4;
        c2968xo.f8804x1 = this.f8804x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2865q1 m12598k4(C2865q1 c2865q1, C2968xo c2968xo) {
        return new C2865q1(c2865q1.m12477k4() + c2968xo.f8803k4, c2865q1.m12481x1() + c2968xo.f8804x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static C2968xo m12603x1(C2968xo c2968xo, double d) {
        return new C2968xo(c2968xo.f8803k4 / d, c2968xo.f8804x1 / d);
    }

    /* JADX INFO: renamed from: k4 */
    public static C2968xo m12599k4(C2968xo c2968xo, double d) {
        return new C2968xo(c2968xo.f8803k4 * d, c2968xo.f8804x1 * d);
    }

    /* JADX INFO: renamed from: k4 */
    public static C2968xo m12600k4(C2968xo c2968xo, C2968xo c2968xo2) {
        return new C2968xo(c2968xo.f8803k4 + c2968xo2.f8803k4, c2968xo.f8804x1 + c2968xo2.f8804x1);
    }
}
