package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class pj5 extends AbstractC7020m9<pj5> {

    /* JADX INFO: renamed from: k4 */
    public static final pj5 f48077k4 = new pj5(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: du */
    public float f48078du;

    /* JADX INFO: renamed from: kk */
    public float f48079kk;

    /* JADX INFO: renamed from: to */
    public float f48080to;

    /* JADX INFO: renamed from: x1 */
    public float f48081x1;

    public pj5() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof pj5) {
            return m69112kk((pj5) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f48081x1), Float.valueOf(this.f48079kk), Float.valueOf(this.f48080to), Float.valueOf(this.f48078du));
    }

    /* JADX INFO: renamed from: k4 */
    public final pj5 m69113k4(pj5 pj5Var) {
        return new pj5(C14064he.m66715kk(this.f48081x1) ? pj5Var.f48081x1 : this.f48081x1, C14064he.m66715kk(this.f48079kk) ? pj5Var.f48079kk : this.f48079kk, C14064he.m66715kk(this.f48080to) ? pj5Var.f48080to : this.f48080to, C14064he.m66715kk(this.f48078du) ? pj5Var.f48078du : this.f48078du);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public pj5 Clone() {
        pj5 pj5Var = new pj5();
        CloneTo(pj5Var);
        return pj5Var;
    }

    public String toString() {
        return C14113y2.m67402k4("{0} {1} {2} {3}", Float.valueOf(this.f48081x1), Float.valueOf(this.f48079kk), Float.valueOf(this.f48080to), Float.valueOf(this.f48078du));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(pj5 pj5Var) {
        pj5Var.f48081x1 = this.f48081x1;
        pj5Var.f48079kk = this.f48079kk;
        pj5Var.f48080to = this.f48080to;
        pj5Var.f48078du = this.f48078du;
    }

    public pj5(float f, float f2, float f3, float f4) {
        this.f48081x1 = f;
        this.f48079kk = f2;
        this.f48080to = f3;
        this.f48078du = f4;
    }

    /* JADX INFO: renamed from: k4 */
    public static pj5 m69111k4(pj5 pj5Var, float f) {
        return new pj5(pj5Var.f48081x1 * f, pj5Var.f48079kk * f, pj5Var.f48080to * f, pj5Var.f48078du * f);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m69112kk(pj5 pj5Var) {
        return pj5Var.f48081x1 == this.f48081x1 && pj5Var.f48079kk == this.f48079kk && pj5Var.f48080to == this.f48080to && pj5Var.f48078du == this.f48078du;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69117x1() {
        return !(C14064he.m66715kk(this.f48081x1) | C14064he.m66715kk(this.f48079kk) | C14064he.m66715kk(this.f48080to) | C14064he.m66715kk(this.f48078du));
    }

    public pj5(oju ojuVar, oju ojuVar2) {
        this.f48081x1 = ojuVar.f47836k4;
        this.f48079kk = ojuVar.f47837x1;
        this.f48080to = ojuVar2.f47836k4;
        this.f48078du = ojuVar2.f47837x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final xmh m69114k4() {
        return new xmh(this.f48081x1, this.f48079kk, this.f48080to, this.f48078du);
    }
}
