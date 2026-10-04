package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kf */
/* JADX INFO: loaded from: classes3.dex */
class C2160kf implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2109h8 f7485k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f7486x1;

    public C2160kf(C2109h8 c2109h8, AbstractC2320ug abstractC2320ug) {
        this.f7485k4 = c2109h8;
        this.f7486x1 = abstractC2320ug;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        if (this.f7485k4.m10673x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4()) == -1) {
            return false;
        }
        int i = iArr[0];
        while (true) {
            int i2 = i + 1;
            if (i2 == c2379xz.m11721x1()) {
                return false;
            }
            if (!C2143je.m10830k4(c2379xz.m11712k4(i2).m10719k4(), c2379xz.m11710h4().m10758x1().m10578u4(), this.f7486x1)) {
                int iM10521x1 = this.f7485k4.m10667du().m10521x1(c2379xz.m11712k4(iArr[0]).m10719k4());
                if (iM10521x1 == -1) {
                    throw new C2243pd(C14113y2.m67402k4(C14113y2.m67408k4("First glyph in pair with ID={0} presents in coverage but doesn't ", "presents in class definition table"), c2379xz.m11712k4(iArr[0]).m10719k4()));
                }
                int iM10521x12 = this.f7485k4.m10669h4().m10521x1(c2379xz.m11712k4(i2).m10719k4());
                if (iM10521x12 != -1 && iM10521x1 < this.f7485k4.m10671m9() && iM10521x12 < this.f7485k4.m10668dy()) {
                    return m10927k4(c2379xz, iArr, iM10521x1, iM10521x12, i2);
                }
                return false;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m10927k4(C2379xz c2379xz, int[] iArr, int i, int i2, int i3) {
        boolean z;
        C2259qe c2259qe = this.f7485k4.m10666c5()[i].m11138k4()[i2];
        if (C7019kk.m27457kk(Integer.valueOf(this.f7485k4.m10670kk()), 8) != 0) {
            C2143je.m10827k4(c2259qe.m11277k4(), c2379xz.m11712k4(iArr[0]).m10723x1(), c2379xz);
            z = true;
        } else {
            z = false;
        }
        if (C7019kk.m27457kk(Integer.valueOf(this.f7485k4.m10672to()), 8) != 0) {
            C2143je.m10827k4(c2259qe.m11278x1(), c2379xz.m11712k4(iArr[0]).m10723x1(), c2379xz);
            i3++;
            z = z ? z : true;
        }
        iArr[0] = i3;
        return z;
    }
}
