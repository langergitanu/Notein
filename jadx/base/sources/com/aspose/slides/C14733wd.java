package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.wd */
/* JADX INFO: loaded from: classes3.dex */
class C14733wd extends AbstractC7020m9<C14733wd> {

    /* JADX INFO: renamed from: k4 */
    public hhv f49786k4 = new hhv();

    /* JADX INFO: renamed from: kk */
    public float f49787kk;

    /* JADX INFO: renamed from: to */
    public float f49788to;

    /* JADX INFO: renamed from: x1 */
    public float f49789x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m72681x1(C14733wd c14733wd) {
        return C14067j2.m66728k4(c14733wd.f49786k4, this.f49786k4) && c14733wd.f49789x1 == this.f49789x1 && c14733wd.f49787kk == this.f49787kk && c14733wd.f49788to == this.f49788to;
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
        if (obj instanceof C14733wd) {
            return m72681x1((C14733wd) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f49786k4, Float.valueOf(this.f49789x1), Float.valueOf(this.f49787kk), Float.valueOf(this.f49788to));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14733wd Clone() {
        C14733wd c14733wd = new C14733wd();
        CloneTo(c14733wd);
        return c14733wd;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72679k4(IGenericList<oju> iGenericList, float f) {
        for (int i = 0; i < iGenericList.size(); i++) {
            oju ojuVarClone = iGenericList.get_Item(i).Clone();
            ojuVarClone.f47836k4 = f - ojuVarClone.f47836k4;
            iGenericList.set_Item(i, ojuVarClone.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72680k4(IGenericList<oju> iGenericList, float f, float f2) {
        for (int i = 0; i < iGenericList.size(); i++) {
            oju ojuVarClone = iGenericList.get_Item(i).Clone();
            ojuVarClone.f47836k4 *= f;
            ojuVarClone.f47837x1 *= f2;
            iGenericList.set_Item(i, ojuVarClone.Clone());
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14733wd c14733wd) {
        this.f49786k4.CloneTo(c14733wd.f49786k4);
        c14733wd.f49789x1 = this.f49789x1;
        c14733wd.f49787kk = this.f49787kk;
        c14733wd.f49788to = this.f49788to;
    }
}
