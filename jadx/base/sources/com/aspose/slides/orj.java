package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class orj extends AbstractC7020m9<orj> {

    /* JADX INFO: renamed from: k4 */
    public l4h f47894k4 = new l4h();

    /* JADX INFO: renamed from: x1 */
    public float f47895x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m68757x1(orj orjVar) {
        return C14067j2.m66728k4(orjVar.f47894k4, this.f47894k4) && orjVar.f47895x1 == this.f47895x1;
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
        if (obj instanceof orj) {
            return m68757x1((orj) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f47894k4, Float.valueOf(this.f47895x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public orj Clone() {
        orj orjVar = new orj();
        CloneTo(orjVar);
        return orjVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(orj orjVar) {
        this.f47894k4.CloneTo(orjVar.f47894k4);
        orjVar.f47895x1 = this.f47895x1;
    }
}
