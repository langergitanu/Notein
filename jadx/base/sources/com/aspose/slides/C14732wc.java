package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.wc */
/* JADX INFO: loaded from: classes3.dex */
class C14732wc extends AbstractC7020m9<C14732wc> {

    /* JADX INFO: renamed from: k4 */
    public String f49784k4;

    /* JADX INFO: renamed from: x1 */
    public int f49785x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m72676x1(C14732wc c14732wc) {
        return C14067j2.m66728k4(c14732wc.f49784k4, this.f49784k4) && c14732wc.f49785x1 == this.f49785x1;
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
        if (obj instanceof C14732wc) {
            return m72676x1((C14732wc) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f49784k4, Integer.valueOf(this.f49785x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14732wc Clone() {
        C14732wc c14732wc = new C14732wc();
        CloneTo(c14732wc);
        return c14732wc;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14732wc c14732wc) {
        c14732wc.f49784k4 = this.f49784k4;
        c14732wc.f49785x1 = this.f49785x1;
    }
}
