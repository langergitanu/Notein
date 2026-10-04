package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class in8 extends AbstractC7020m9<in8> {

    /* JADX INFO: renamed from: du */
    public boolean f5736du;

    /* JADX INFO: renamed from: kk */
    public float f5738kk;

    /* JADX INFO: renamed from: to */
    public float f5739to;

    /* JADX INFO: renamed from: k4 */
    public oju f5737k4 = new oju();

    /* JADX INFO: renamed from: x1 */
    public oju f5740x1 = new oju();

    /* JADX INFO: renamed from: x1 */
    private boolean m7730x1(in8 in8Var) {
        return C14067j2.m66728k4(in8Var.f5737k4, this.f5737k4) && C14067j2.m66728k4(in8Var.f5740x1, this.f5740x1) && in8Var.f5738kk == this.f5738kk && in8Var.f5739to == this.f5739to && in8Var.f5736du == this.f5736du;
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
        if (obj instanceof in8) {
            return m7730x1((in8) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f5737k4, this.f5740x1, Float.valueOf(this.f5738kk), Float.valueOf(this.f5739to), Boolean.valueOf(this.f5736du));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public in8 Clone() {
        in8 in8Var = new in8();
        CloneTo(in8Var);
        return in8Var;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(in8 in8Var) {
        this.f5737k4.CloneTo(in8Var.f5737k4);
        this.f5740x1.CloneTo(in8Var.f5740x1);
        in8Var.f5738kk = this.f5738kk;
        in8Var.f5739to = this.f5739to;
        in8Var.f5736du = this.f5736du;
    }
}
