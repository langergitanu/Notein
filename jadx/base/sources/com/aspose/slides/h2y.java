package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class h2y extends AbstractC7020m9<h2y> {

    /* JADX INFO: renamed from: k4 */
    public float f5389k4;

    /* JADX INFO: renamed from: x1 */
    public wsf f5390x1 = new wsf();

    /* JADX INFO: renamed from: x1 */
    private boolean m6971x1(h2y h2yVar) {
        return h2yVar.f5389k4 == this.f5389k4 && C14067j2.m66728k4(h2yVar.f5390x1, this.f5390x1);
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
        if (obj instanceof h2y) {
            return m6971x1((h2y) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f5389k4), this.f5390x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public h2y Clone() {
        h2y h2yVar = new h2y();
        CloneTo(h2yVar);
        return h2yVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(h2y h2yVar) {
        h2yVar.f5389k4 = this.f5389k4;
        this.f5390x1.CloneTo(h2yVar.f5390x1);
    }
}
