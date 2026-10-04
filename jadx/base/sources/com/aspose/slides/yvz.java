package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class yvz extends AbstractC7020m9<yvz> {

    /* JADX INFO: renamed from: k4 */
    public AbstractC14897zn f50411k4;

    /* JADX INFO: renamed from: x1 */
    public AbstractC12024x1 f50412x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m74111x1(yvz yvzVar) {
        return C14067j2.m66728k4(yvzVar.f50411k4, this.f50411k4) && C14067j2.m66728k4(yvzVar.f50412x1, this.f50412x1);
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
        if (obj instanceof yvz) {
            return m74111x1((yvz) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f50411k4, this.f50412x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public yvz Clone() {
        yvz yvzVar = new yvz();
        CloneTo(yvzVar);
        return yvzVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(yvz yvzVar) {
        yvzVar.f50411k4 = this.f50411k4;
        yvzVar.f50412x1 = this.f50412x1;
    }
}
