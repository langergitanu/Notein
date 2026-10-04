package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qy */
/* JADX INFO: loaded from: classes3.dex */
public class C2270qy implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2188m5 f7791k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f7792x1;

    public C2270qy(C2188m5 c2188m5, AbstractC2320ug abstractC2320ug) {
        this.f7791k4 = c2188m5;
        this.f7792x1 = abstractC2320ug;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        int iM11550kk = this.f7791k4.m11108x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4());
        if (iM11550kk == -1) {
            return false;
        }
        return m11314k4(c2379xz, iArr, iM11550kk);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m11314k4(C2379xz c2379xz, int[] iArr, int i) {
        if (i > this.f7791k4.m11106kk() - 1) {
            throw new C2243pd(C14113y2.m67402k4("Incorrect coverage index for lookup {0}", this.f7791k4.m11105du()));
        }
        List<C2130il> listM11711k4 = c2379xz.m11711k4();
        C2130il c2130il = listM11711k4.get_Item(iArr[0]);
        listM11711k4.set_Item(iArr[0], new C2130il(new C2334v6(this.f7791k4.m11107to()[i].intValue() & 65535), c2130il.m10722kk()));
        c2379xz.m11715k4(iArr);
        return true;
    }
}
