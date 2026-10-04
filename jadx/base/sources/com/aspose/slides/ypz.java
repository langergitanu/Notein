package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class ypz extends AbstractC7020m9<ypz> {

    /* JADX INFO: renamed from: k4 */
    public int f50390k4;

    /* JADX INFO: renamed from: x1 */
    private boolean m74057x1(ypz ypzVar) {
        return ypzVar.f50390k4 == this.f50390k4;
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
        if (obj instanceof ypz) {
            return m74057x1((ypz) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f50390k4));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public ypz Clone() {
        ypz ypzVar = new ypz();
        CloneTo(ypzVar);
        return ypzVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(ypz ypzVar) {
        ypzVar.f50390k4 = this.f50390k4;
    }
}
