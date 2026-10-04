package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.f5 */
/* JADX INFO: loaded from: classes3.dex */
class C0977f5 extends AbstractC7020m9<C0977f5> {

    /* JADX INFO: renamed from: k4 */
    public oju f4963k4 = new oju();

    /* JADX INFO: renamed from: x1 */
    public oju f4966x1 = new oju();

    /* JADX INFO: renamed from: kk */
    public oju f4964kk = new oju();

    /* JADX INFO: renamed from: to */
    public oju f4965to = new oju();

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
        if (obj instanceof C0977f5) {
            return m5821x1((C0977f5) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f4963k4, this.f4966x1, this.f4964kk, this.f4965to);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m5822k4() {
        return oju.m68622x1(this.f4965to, this.f4963k4).m68627kk();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C0977f5 Clone() {
        C0977f5 c0977f5 = new C0977f5();
        CloneTo(c0977f5);
        return c0977f5;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5821x1(C0977f5 c0977f5) {
        return C14067j2.m66728k4(c0977f5.f4963k4, this.f4963k4) && C14067j2.m66728k4(c0977f5.f4966x1, this.f4966x1) && C14067j2.m66728k4(c0977f5.f4964kk, this.f4964kk) && C14067j2.m66728k4(c0977f5.f4965to, this.f4965to);
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m5823k4(float f) {
        oju ojuVarClone = ev2.m5734k4(this.f4963k4.Clone(), this.f4966x1.Clone(), f).Clone();
        oju ojuVarClone2 = ev2.m5734k4(this.f4966x1.Clone(), this.f4964kk.Clone(), f).Clone();
        oju ojuVarClone3 = ev2.m5734k4(this.f4964kk.Clone(), this.f4965to.Clone(), f).Clone();
        return ev2.m5734k4(ev2.m5734k4(ojuVarClone.Clone(), ojuVarClone2.Clone(), f).Clone().Clone(), ev2.m5734k4(ojuVarClone2.Clone(), ojuVarClone3.Clone(), f).Clone().Clone(), f);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0977f5 c0977f5) {
        this.f4963k4.CloneTo(c0977f5.f4963k4);
        this.f4966x1.CloneTo(c0977f5.f4966x1);
        this.f4964kk.CloneTo(c0977f5.f4964kk);
        this.f4965to.CloneTo(c0977f5.f4965to);
    }
}
