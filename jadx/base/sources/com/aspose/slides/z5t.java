package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class z5t extends AbstractC7020m9<z5t> {

    /* JADX INFO: renamed from: k4 */
    public float f50491k4;

    /* JADX INFO: renamed from: kk */
    public float f50492kk;

    /* JADX INFO: renamed from: x1 */
    public float f50493x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m74332x1(z5t z5tVar) {
        return z5tVar.f50491k4 == this.f50491k4 && z5tVar.f50493x1 == this.f50493x1 && z5tVar.f50492kk == this.f50492kk;
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
        if (obj instanceof z5t) {
            return m74332x1((z5t) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f50491k4), Float.valueOf(this.f50493x1), Float.valueOf(this.f50492kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public z5t Clone() {
        z5t z5tVar = new z5t();
        CloneTo(z5tVar);
        return z5tVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(z5t z5tVar) {
        z5tVar.f50491k4 = this.f50491k4;
        z5tVar.f50493x1 = this.f50493x1;
        z5tVar.f50492kk = this.f50492kk;
    }
}
