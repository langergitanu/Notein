package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.gk */
/* JADX INFO: loaded from: classes3.dex */
class C1149gk extends AbstractC7020m9<C1149gk> {

    /* JADX INFO: renamed from: kk */
    public static final C1149gk f5265kk;

    /* JADX INFO: renamed from: k4 */
    public float f5266k4;

    /* JADX INFO: renamed from: x1 */
    public float f5267x1;

    static {
        C1149gk c1149gk = new C1149gk();
        f5265kk = c1149gk;
        c1149gk.f5266k4 = 0.0f;
        c1149gk.f5267x1 = 0.0f;
    }

    public C1149gk() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m6744x1(C1149gk c1149gk) {
        return c1149gk.f5266k4 == this.f5266k4 && c1149gk.f5267x1 == this.f5267x1;
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
        if (obj instanceof C1149gk) {
            return m6744x1((C1149gk) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f5266k4), Float.valueOf(this.f5267x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C1149gk Clone() {
        C1149gk c1149gk = new C1149gk();
        CloneTo(c1149gk);
        return c1149gk;
    }

    public C1149gk(float f, float f2) {
        this.f5266k4 = f;
        this.f5267x1 = f2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C1149gk c1149gk) {
        c1149gk.f5266k4 = this.f5266k4;
        c1149gk.f5267x1 = this.f5267x1;
    }
}
