package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.s1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2283s1 implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2230of f7846k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f7847x1;

    public C2283s1(C2230of c2230of, AbstractC2320ug abstractC2320ug) {
        this.f7846k4 = c2230of;
        this.f7847x1 = abstractC2320ug;
    }

    /* JADX INFO: renamed from: k4 */
    private C2010bb m11356k4(C2379xz c2379xz, int i, int i2) {
        C2159ke c2159keM11189k4 = this.f7846k4.m11189k4(i2);
        boolean zM11707c5 = c2379xz.m11707c5();
        for (C2010bb c2010bb : c2159keM11189k4.m10926x1()) {
            if (C2143je.m10832k4(c2379xz, i, c2010bb.m10238kk(), !zM11707c5)) {
                return c2010bb;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        C2010bb c2010bbM11356k4;
        int iM11550kk = this.f7846k4.m11190x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4());
        if (iM11550kk == -1 || (c2010bbM11356k4 = m11356k4(c2379xz, iArr[0], iM11550kk)) == null) {
            return false;
        }
        List<C2130il> listM11711k4 = c2379xz.m11711k4();
        listM11711k4.set_Item(iArr[0], new C2130il(c2010bbM11356k4.m10239to()));
        listM11711k4.removeRange(c2379xz.m11707c5() ? iArr[0] - 1 : iArr[0] + 1, c2010bbM11356k4.m10240x1() - 1);
        c2379xz.m11715k4(iArr);
        return true;
    }
}
