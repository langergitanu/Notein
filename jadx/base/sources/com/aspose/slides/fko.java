package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class fko extends AbstractC7020m9<fko> {

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14631uf f5052k4;

    /* JADX INFO: renamed from: x1 */
    public float f5053x1;

    public fko() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m6188x1(fko fkoVar) {
        return C14067j2.m66728k4(fkoVar.f5052k4, this.f5052k4) && fkoVar.f5053x1 == this.f5053x1;
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
        if (obj instanceof fko) {
            return m6188x1((fko) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f5052k4, Float.valueOf(this.f5053x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public fko Clone() {
        fko fkoVar = new fko();
        CloneTo(fkoVar);
        return fkoVar;
    }

    public fko(InterfaceC14631uf interfaceC14631uf, float f) {
        this.f5052k4 = interfaceC14631uf;
        this.f5053x1 = f;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(fko fkoVar) {
        fkoVar.f5052k4 = this.f5052k4;
        fkoVar.f5053x1 = this.f5053x1;
    }
}
