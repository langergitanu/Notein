package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.zp */
/* JADX INFO: loaded from: classes3.dex */
class C2414zp implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2408zg f8364k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f8365x1;

    public C2414zp(C2408zg c2408zg, AbstractC2320ug abstractC2320ug) {
        this.f8364k4 = c2408zg;
        this.f8365x1 = abstractC2320ug;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        if (!this.f8364k4.m11825x1().m11551x1(c2379xz.m11712k4(iArr[0]).m10719k4()) || C7019kk.m27457kk(Integer.valueOf(this.f8364k4.m11824to()), 8) == 0) {
            return false;
        }
        C2143je.m10827k4(this.f8364k4.m11823kk(), c2379xz.m11712k4(iArr[0]).m10723x1(), c2379xz);
        iArr[0] = iArr[0] + 1;
        return true;
    }
}
