package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class stb extends AbstractC7020m9<stb> {

    /* JADX INFO: renamed from: k4 */
    public hhv f48916k4 = new hhv();

    /* JADX INFO: renamed from: x1 */
    public oss f48917x1 = new oss();

    /* JADX INFO: renamed from: x1 */
    private boolean m70769x1(stb stbVar) {
        return C14067j2.m66728k4(stbVar.f48916k4, this.f48916k4) && C14067j2.m66728k4(stbVar.f48917x1, this.f48917x1);
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
        if (obj instanceof stb) {
            return m70769x1((stb) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f48916k4, this.f48917x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public stb Clone() {
        stb stbVar = new stb();
        CloneTo(stbVar);
        return stbVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(stb stbVar) {
        this.f48916k4.CloneTo(stbVar.f48916k4);
        this.f48917x1.CloneTo(stbVar.f48917x1);
    }
}
