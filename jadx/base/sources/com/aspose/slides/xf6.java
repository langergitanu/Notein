package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class xf6 extends AbstractC7020m9<xf6> {

    /* JADX INFO: renamed from: k4 */
    public float f50072k4;

    /* JADX INFO: renamed from: kk */
    public float f50073kk;

    /* JADX INFO: renamed from: x1 */
    public float f50074x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m73346x1(xf6 xf6Var) {
        return xf6Var.f50072k4 == this.f50072k4 && xf6Var.f50074x1 == this.f50074x1 && xf6Var.f50073kk == this.f50073kk;
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
        if (obj instanceof xf6) {
            return m73346x1((xf6) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f50072k4), Float.valueOf(this.f50074x1), Float.valueOf(this.f50073kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public xf6 Clone() {
        xf6 xf6Var = new xf6();
        CloneTo(xf6Var);
        return xf6Var;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(xf6 xf6Var) {
        xf6Var.f50072k4 = this.f50072k4;
        xf6Var.f50074x1 = this.f50074x1;
        xf6Var.f50073kk = this.f50073kk;
    }
}
