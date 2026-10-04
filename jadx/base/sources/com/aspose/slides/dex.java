package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class dex extends AbstractC7020m9<dex> {

    /* JADX INFO: renamed from: du */
    public float f4579du;

    /* JADX INFO: renamed from: kk */
    public float f4581kk;

    /* JADX INFO: renamed from: x1 */
    public C12013m9 f4583x1;

    /* JADX INFO: renamed from: k4 */
    public oju f4580k4 = new oju();

    /* JADX INFO: renamed from: to */
    public oju f4582to = new oju();

    /* JADX INFO: renamed from: x1 */
    private boolean m5073x1(dex dexVar) {
        return C14067j2.m66728k4(dexVar.f4580k4, this.f4580k4) && C14067j2.m66728k4(dexVar.f4583x1, this.f4583x1) && dexVar.f4581kk == this.f4581kk && C14067j2.m66728k4(dexVar.f4582to, this.f4582to) && dexVar.f4579du == this.f4579du;
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
        if (obj instanceof dex) {
            return m5073x1((dex) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f4580k4, this.f4583x1, Float.valueOf(this.f4581kk), this.f4582to, Float.valueOf(this.f4579du));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public dex Clone() {
        dex dexVar = new dex();
        CloneTo(dexVar);
        return dexVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(dex dexVar) {
        this.f4580k4.CloneTo(dexVar.f4580k4);
        dexVar.f4583x1 = this.f4583x1;
        dexVar.f4581kk = this.f4581kk;
        this.f4582to.CloneTo(dexVar.f4582to);
        dexVar.f4579du = this.f4579du;
    }
}
