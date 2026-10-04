package com.aspose.slides;

import com.aspose.slides.exceptions.DivideByZeroException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class tbp extends AbstractC7020m9<tbp> {

    /* JADX INFO: renamed from: kk */
    public static final tbp f49088kk = new tbp(0.0d, 0.0d);

    /* JADX INFO: renamed from: to */
    public static final tbp f49089to = new tbp(1.0d, 1.0d);

    /* JADX INFO: renamed from: k4 */
    public double f49090k4;

    /* JADX INFO: renamed from: x1 */
    public double f49091x1;

    public tbp() {
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final oju m71061du() {
        return new oju((float) this.f49090k4, (float) this.f49091x1);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof tbp) {
            return m71055kk((tbp) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public tbp Clone() {
        tbp tbpVar = new tbp();
        CloneTo(tbpVar);
        return tbpVar;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f49090k4), Double.valueOf(this.f49091x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final double m71063k4(tbp tbpVar) {
        return (this.f49091x1 * tbpVar.f49091x1) + (this.f49090k4 * tbpVar.f49090k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m71065kk() {
        double d = this.f49090k4;
        this.f49090k4 = this.f49091x1;
        this.f49091x1 = d;
    }

    /* JADX INFO: renamed from: to */
    public final tbp m71066to() {
        if (m71067x1() >= 1.0E-6d) {
            return m71052k4(this, m71067x1());
        }
        throw new DivideByZeroException();
    }

    public String toString() {
        return C14113y2.m67402k4("X:{0}, Y:{1}", Double.valueOf(this.f49090k4), Double.valueOf(this.f49091x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final double m71067x1() {
        double d = this.f49090k4;
        double d2 = this.f49091x1;
        return C14116yg.m67496rv((d2 * d2) + (d * d));
    }

    public tbp(double d, double d2) {
        this.f49090k4 = d;
        this.f49091x1 = d2;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m71055kk(tbp tbpVar) {
        return tbpVar.f49090k4 == this.f49090k4 && tbpVar.f49091x1 == this.f49091x1;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m71057to(tbp tbpVar, tbp tbpVar2) {
        return !m71056kk(tbpVar, tbpVar2);
    }

    /* JADX INFO: renamed from: x1 */
    public static tbp m71058x1(tbp tbpVar, double d) {
        return new tbp(tbpVar.f49090k4 * d, tbpVar.f49091x1 * d);
    }

    /* JADX INFO: renamed from: k4 */
    public final tbp m71064k4() {
        return new tbp(-this.f49091x1, this.f49090k4);
    }

    public tbp(C12025x6 c12025x6) {
        this.f49090k4 = c12025x6.m56897x1();
        this.f49091x1 = c12025x6.m56895kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m71052k4(tbp tbpVar, double d) {
        return new tbp(tbpVar.f49090k4 / d, tbpVar.f49091x1 / d);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m71056kk(tbp tbpVar, tbp tbpVar2) {
        return tbpVar.f49090k4 == tbpVar2.f49090k4 && tbpVar.f49091x1 == tbpVar2.f49091x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static tbp m71059x1(tbp tbpVar, int i) {
        double d = i;
        return new tbp(tbpVar.f49090k4 * d, tbpVar.f49091x1 * d);
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m71053k4(tbp tbpVar, int i) {
        double d = i;
        return new tbp(tbpVar.f49090k4 / d, tbpVar.f49091x1 / d);
    }

    /* JADX INFO: renamed from: x1 */
    public static tbp m71060x1(tbp tbpVar, tbp tbpVar2) {
        return new tbp(tbpVar.f49090k4 - tbpVar2.f49090k4, tbpVar.f49091x1 - tbpVar2.f49091x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m71054k4(tbp tbpVar, tbp tbpVar2) {
        return new tbp(tbpVar.f49090k4 + tbpVar2.f49090k4, tbpVar.f49091x1 + tbpVar2.f49091x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(tbp tbpVar) {
        tbpVar.f49090k4 = this.f49090k4;
        tbpVar.f49091x1 = this.f49091x1;
    }
}
