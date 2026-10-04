package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.xf */
/* JADX INFO: loaded from: classes3.dex */
class C14784xf extends AbstractC7020m9<C14784xf> {

    /* JADX INFO: renamed from: k4 */
    public long f50066k4;

    /* JADX INFO: renamed from: kk */
    public C14321pz f50067kk;

    /* JADX INFO: renamed from: x1 */
    public ColorFormat f50068x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m73342x1(C14784xf c14784xf) {
        return c14784xf.f50066k4 == this.f50066k4 && C14067j2.m66728k4(c14784xf.f50068x1, this.f50068x1) && C14067j2.m66728k4(c14784xf.f50067kk, this.f50067kk);
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
        if (obj instanceof C14784xf) {
            return m73342x1((C14784xf) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Long.valueOf(this.f50066k4), this.f50068x1, this.f50067kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14784xf Clone() {
        C14784xf c14784xf = new C14784xf();
        CloneTo(c14784xf);
        return c14784xf;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14784xf c14784xf) {
        c14784xf.f50066k4 = this.f50066k4;
        c14784xf.f50068x1 = this.f50068x1;
        c14784xf.f50067kk = this.f50067kk;
    }
}
