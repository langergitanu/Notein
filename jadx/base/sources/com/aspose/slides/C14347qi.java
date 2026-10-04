package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.qi */
/* JADX INFO: loaded from: classes3.dex */
class C14347qi extends AbstractC7020m9<C14347qi> {

    /* JADX INFO: renamed from: k4 */
    public float f48325k4;

    /* JADX INFO: renamed from: x1 */
    public float f48326x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m69612x1(C14347qi c14347qi) {
        return c14347qi.f48325k4 == this.f48325k4 && c14347qi.f48326x1 == this.f48326x1;
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
        if (obj instanceof C14347qi) {
            return m69612x1((C14347qi) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f48325k4), Float.valueOf(this.f48326x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14347qi Clone() {
        C14347qi c14347qi = new C14347qi();
        CloneTo(c14347qi);
        return c14347qi;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14347qi c14347qi) {
        c14347qi.f48325k4 = this.f48325k4;
        c14347qi.f48326x1 = this.f48326x1;
    }
}
