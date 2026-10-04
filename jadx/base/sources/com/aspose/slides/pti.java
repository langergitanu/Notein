package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class pti extends AbstractC7020m9<pti> {

    /* JADX INFO: renamed from: k4 */
    public float f48158k4;

    /* JADX INFO: renamed from: kk */
    public float f48159kk;

    /* JADX INFO: renamed from: x1 */
    public float f48160x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m69250x1(pti ptiVar) {
        return ptiVar.f48158k4 == this.f48158k4 && ptiVar.f48160x1 == this.f48160x1 && ptiVar.f48159kk == this.f48159kk;
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
        if (obj instanceof pti) {
            return m69250x1((pti) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f48158k4), Float.valueOf(this.f48160x1), Float.valueOf(this.f48159kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public pti Clone() {
        pti ptiVar = new pti();
        CloneTo(ptiVar);
        return ptiVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(pti ptiVar) {
        ptiVar.f48158k4 = this.f48158k4;
        ptiVar.f48160x1 = this.f48160x1;
        ptiVar.f48159kk = this.f48159kk;
    }
}
