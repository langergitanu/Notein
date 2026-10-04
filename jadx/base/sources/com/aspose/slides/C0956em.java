package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.em */
/* JADX INFO: loaded from: classes3.dex */
class C0956em extends AbstractC7020m9<C0956em> {

    /* JADX INFO: renamed from: du */
    private double f4829du;

    /* JADX INFO: renamed from: h4 */
    private boolean f4830h4;

    /* JADX INFO: renamed from: k4 */
    private double f4831k4;

    /* JADX INFO: renamed from: kk */
    private double f4832kk;

    /* JADX INFO: renamed from: to */
    private double f4833to;

    /* JADX INFO: renamed from: x1 */
    private double f4834x1;

    public C0956em() {
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final double m5589du() {
        return this.f4833to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: dy, reason: merged with bridge method [inline-methods] */
    public C0956em Clone() {
        C0956em c0956em = new C0956em();
        CloneTo(c0956em);
        return c0956em;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C0956em) {
            return m5588x1((C0956em) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m5591h4() {
        return this.f4829du;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f4831k4), Double.valueOf(this.f4834x1), Double.valueOf(this.f4832kk), Double.valueOf(this.f4833to), Double.valueOf(this.f4829du), Boolean.valueOf(this.f4830h4));
    }

    /* JADX INFO: renamed from: k4 */
    public final double m5592k4() {
        return this.f4831k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m5595kk() {
        return this.f4832kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m5596m9() {
        return this.f4830h4;
    }

    /* JADX INFO: renamed from: to */
    public final double m5597to() {
        return this.f4832kk * 2.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m5598x1() {
        return this.f4834x1;
    }

    public C0956em(double d, double d2, double d3, double d4, double d5, boolean z) {
        this.f4831k4 = d;
        this.f4834x1 = d2;
        this.f4832kk = d3;
        this.f4833to = d4;
        this.f4829du = d5;
        this.f4830h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m5586k4(double d, double d2) {
        return (d * 180.0d) / (d2 * 3.141592653589793d);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m5599x1(double d) {
        return m5586k4(d, this.f4832kk);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x010f A[PHI: r2 r10
      0x010f: PHI (r2v14 double) = (r2v6 double), (r2v15 double) binds: [B:36:0x013f, B:24:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r10v17 double) = (r10v11 double), (r10v19 double) binds: [B:36:0x013f, B:24:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111 A[PHI: r2 r10
      0x0111: PHI (r2v11 double) = (r2v6 double), (r2v15 double) binds: [B:36:0x013f, B:24:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r10v15 double) = (r10v11 double), (r10v19 double) binds: [B:36:0x013f, B:24:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0956em(double d, jof jofVar, double d2, double d3, boolean z, tbp tbpVar) {
        double d4;
        double d5;
        tbp tbpVarClone = jofVar.m63477yj().m71064k4().Clone();
        double dM63457fa = C14116yg.m67475k4(d) < jofVar.m63457fa() ? jofVar.m63457fa() : d;
        double dM67475k4 = C14116yg.m67475k4(dM63457fa / 2.0d);
        double dM67496rv = C14116yg.m67496rv(C14116yg.m67469du(dM67475k4, 2.0d) - C14116yg.m67469du(jofVar.m63457fa() / 2.0d, 2.0d));
        tbp tbpVar2 = new tbp(jofVar.m63454ck().f49090k4 - (tbpVarClone.f49090k4 * dM67496rv), jofVar.m63454ck().f49091x1 - (tbpVarClone.f49091x1 * dM67496rv));
        tbp tbpVar3 = new tbp((tbpVarClone.f49090k4 * dM67496rv) + jofVar.m63454ck().f49090k4, (tbpVarClone.f49091x1 * dM67496rv) + jofVar.m63454ck().f49091x1);
        tbp tbpVarClone2 = (yz6.m74157k4(tbpVar2.Clone(), tbpVar.Clone()) >= yz6.m74157k4(tbpVar3.Clone(), tbpVar.Clone()) ? tbpVar3 : tbpVar2).Clone();
        double dM5586k4 = m5586k4(d2, dM67475k4);
        double dM5586k42 = m5586k4(d3, dM67475k4);
        double dM63472up = new jof(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1, jofVar.m63455du(), jofVar.m63458h4()).m63472up();
        double d6 = dM63457fa;
        double dM63472up2 = new jof(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1, jofVar.m63468m9(), jofVar.m63456dy()).m63472up();
        this.f4830h4 = d6 < 0.0d;
        double dM5587x1 = m5587x1(dM63472up, dM63472up2);
        if (z) {
            if (dM5587x1 < 180.0d) {
                Double[] dArr = {Double.valueOf(dM63472up)};
                Double[] dArr2 = {Double.valueOf(dM63472up2)};
                C3085sv.m13108x1(dArr, dArr2);
                dM63472up = dArr[0].doubleValue();
                dM63472up2 = dArr2[0].doubleValue();
            }
            boolean z2 = this.f4830h4;
            d4 = dM63472up + (z2 ? dM5586k4 : dM5586k42);
            d5 = z2 ? -dM5586k42 : -dM5586k4;
        } else {
            if (dM5587x1 > 180.0d) {
                Double[] dArr3 = {Double.valueOf(dM63472up)};
                Double[] dArr4 = {Double.valueOf(dM63472up2)};
                C3085sv.m13108x1(dArr3, dArr4);
                dM63472up = dArr3[0].doubleValue();
                dM63472up2 = dArr4[0].doubleValue();
            }
            boolean z3 = this.f4830h4;
            d4 = dM63472up + (z3 ? dM5586k42 : dM5586k4);
            if (z3) {
            }
        }
        double d7 = dM63472up2 + d5;
        this.f4830h4 ^= z;
        this.f4831k4 = tbpVarClone2.f49090k4;
        this.f4834x1 = tbpVarClone2.f49091x1;
        this.f4832kk = dM67475k4;
        this.f4833to = yz6.m74170kk(d4);
        this.f4829du = yz6.m74170kk(d7);
    }

    /* JADX INFO: renamed from: x1 */
    private static double m5587x1(double d, double d2) {
        if (d > d2) {
            d2 += 360.0d;
        }
        return d2 - d;
    }

    /* JADX INFO: renamed from: k4 */
    public final C0956em m5593k4(double d) {
        return new C0956em(this.f4831k4, this.f4834x1, d, this.f4833to, this.f4829du, this.f4830h4);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5588x1(C0956em c0956em) {
        return c0956em.f4831k4 == this.f4831k4 && c0956em.f4834x1 == this.f4834x1 && c0956em.f4832kk == this.f4832kk && c0956em.f4833to == this.f4833to && c0956em.f4829du == this.f4829du && c0956em.f4830h4 == this.f4830h4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0956em c0956em) {
        c0956em.f4831k4 = this.f4831k4;
        c0956em.f4834x1 = this.f4834x1;
        c0956em.f4832kk = this.f4832kk;
        c0956em.f4833to = this.f4833to;
        c0956em.f4829du = this.f4829du;
        c0956em.f4830h4 = this.f4830h4;
    }
}
