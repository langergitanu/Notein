package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.jt */
/* JADX INFO: loaded from: classes3.dex */
class C13701jt extends AbstractC7020m9<C13701jt> {

    /* JADX INFO: renamed from: k4 */
    double f45579k4;

    /* JADX INFO: renamed from: x1 */
    float f45580x1;

    public C13701jt() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m63545x1(C13701jt c13701jt) {
        return c13701jt.f45579k4 == this.f45579k4 && c13701jt.f45580x1 == this.f45580x1;
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
        if (obj instanceof C13701jt) {
            return m63545x1((C13701jt) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f45579k4), Float.valueOf(this.f45580x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13701jt Clone() {
        C13701jt c13701jt = new C13701jt();
        CloneTo(c13701jt);
        return c13701jt;
    }

    public C13701jt(double d, float f) {
        this.f45579k4 = d;
        this.f45580x1 = f;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13701jt c13701jt) {
        c13701jt.f45579k4 = this.f45579k4;
        c13701jt.f45580x1 = this.f45580x1;
    }
}
