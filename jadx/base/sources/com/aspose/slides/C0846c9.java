package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.c9 */
/* JADX INFO: loaded from: classes3.dex */
class C0846c9 extends AbstractC7020m9<C0846c9> {

    /* JADX INFO: renamed from: k4 */
    long f4292k4;

    /* JADX INFO: renamed from: x1 */
    long f4293x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m4514x1(C0846c9 c0846c9) {
        return c0846c9.f4292k4 == this.f4292k4 && c0846c9.f4293x1 == this.f4293x1;
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
        if (obj instanceof C0846c9) {
            return m4514x1((C0846c9) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Long.valueOf(this.f4292k4), Long.valueOf(this.f4293x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C0846c9 Clone() {
        C0846c9 c0846c9 = new C0846c9();
        CloneTo(c0846c9);
        return c0846c9;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0846c9 c0846c9) {
        c0846c9.f4292k4 = this.f4292k4;
        c0846c9.f4293x1 = this.f4293x1;
    }
}
