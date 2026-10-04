package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class oss extends AbstractC7020m9<oss> {

    /* JADX INFO: renamed from: k4 */
    public float f47912k4;

    /* JADX INFO: renamed from: kk */
    public float f47913kk;

    /* JADX INFO: renamed from: x1 */
    public float f47914x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m68803x1(oss ossVar) {
        return ossVar.f47912k4 == this.f47912k4 && ossVar.f47914x1 == this.f47914x1 && ossVar.f47913kk == this.f47913kk;
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
        if (obj instanceof oss) {
            return m68803x1((oss) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f47912k4), Float.valueOf(this.f47914x1), Float.valueOf(this.f47913kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public oss Clone() {
        oss ossVar = new oss();
        CloneTo(ossVar);
        return ossVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(oss ossVar) {
        ossVar.f47912k4 = this.f47912k4;
        ossVar.f47914x1 = this.f47914x1;
        ossVar.f47913kk = this.f47913kk;
    }
}
