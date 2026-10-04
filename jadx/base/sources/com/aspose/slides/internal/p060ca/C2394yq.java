package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yq */
/* JADX INFO: loaded from: classes3.dex */
class C2394yq implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2158k9 f8314k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f8315x1;

    public C2394yq(C2158k9 c2158k9, AbstractC2320ug abstractC2320ug) {
        this.f8314k4 = c2158k9;
        this.f8315x1 = abstractC2320ug;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m11776k4(C2379xz c2379xz, int i, int i2, int[] iArr, int i3) {
        C2065ee c2065eeM10283k4 = this.f8314k4.m10924to().m10283k4(i);
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        C2143je.m10826k4(c2065eeM10283k4.m10459x1(), c2379xz, iArr2, iArr3);
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        int[] iArr4 = {0};
        int[] iArr5 = {0};
        C2143je.m10826k4(this.f8314k4.m10921du().m10789k4(i2).m11276k4(c2065eeM10283k4.m10458k4()), c2379xz, iArr4, iArr5);
        int i6 = iArr4[0];
        int i7 = iArr5[0];
        c2379xz.m11712k4(iArr[0]).m10723x1().m11539to((i6 - i4) - C7019kk.m27462to(Double.valueOf(c2379xz.m11710h4().mo10258c5().mo10318x1(c2379xz.m11712k4(i3).m10719k4())), 14));
        c2379xz.m11712k4(iArr[0]).m10723x1().m11531du(i7 - i5);
        c2379xz.m11712k4(iArr[0]).m10723x1().m11532h4(0);
        c2379xz.m11712k4(iArr[0]).m10723x1().m11537m9(0);
        iArr[0] = iArr[0] + 1;
        return true;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        int i;
        int iM11550kk;
        int iM11550kk2 = this.f8314k4.m10925x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4());
        if (iM11550kk2 == -1 || iArr[0] - 1 < 0 || (iM11550kk = this.f8314k4.m10923kk().m11550kk(c2379xz.m11712k4(i).m10719k4())) == -1) {
            return false;
        }
        return m11776k4(c2379xz, iM11550kk2, iM11550kk, iArr, i);
    }
}
