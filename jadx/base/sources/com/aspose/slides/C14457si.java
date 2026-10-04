package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.si */
/* JADX INFO: loaded from: classes3.dex */
class C14457si implements InterfaceC0782az {

    /* JADX INFO: renamed from: k4 */
    private static final IGenericDictionary<Integer, String> f48852k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC0782az f48853kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC0782az f48854to;

    /* JADX INFO: renamed from: x1 */
    private final int f48855x1;

    static {
        Dictionary dictionary = new Dictionary();
        f48852k4 = dictionary;
        dictionary.addItem(0, "=");
        dictionary.addItem(1, "<>");
        dictionary.addItem(2, "<");
        dictionary.addItem(3, "<=");
        dictionary.addItem(4, ">");
        dictionary.addItem(5, ">=");
    }

    public C14457si(int i, InterfaceC0782az interfaceC0782az, InterfaceC0782az interfaceC0782az2) {
        this.f48855x1 = i;
        this.f48853kk = interfaceC0782az;
        this.f48854to = interfaceC0782az2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m70637k4() {
        return this.f48855x1;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC0782az m70638kk() {
        return this.f48854to;
    }

    public String toString() {
        return C14113y2.m67402k4("{0} {1} {2}", m70639x1(), f48852k4.get_Item(Integer.valueOf(m70637k4())), m70638kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC0782az m70639x1() {
        return this.f48853kk;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mtk mo3871k4(C1095fc c1095fc) {
        mtk mtkVarClone = m70639x1().mo3871k4(c1095fc).Clone();
        mtk mtkVarClone2 = m70638kk().mo3871k4(c1095fc).Clone();
        mtk mtkVarClone3 = new mj1(c1095fc).m64913k4(mtkVarClone.Clone(), mtkVarClone2.Clone()).Clone();
        boolean z = true;
        if (mtkVarClone3.m67728x1() != 1) {
            throw new InvalidOperationException(C14113y2.m67402k4("A comparison operation is failed for operands: '{0}', '{1}'.", mtkVarClone.m67722k4().toString(), mtkVarClone2.m67722k4().toString()));
        }
        double dDoubleValue = ((Double) C7019kk.m27464to(mtkVarClone3.m67722k4(), Double.TYPE)).doubleValue();
        int iM70637k4 = m70637k4();
        if (iM70637k4 != 0) {
            if (iM70637k4 != 1) {
                if (iM70637k4 != 2) {
                    if (iM70637k4 != 3) {
                        if (iM70637k4 != 4) {
                            if (iM70637k4 != 5) {
                                throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown comparison operator '{0}' is encountered.", C14042ak.m66410k4(C14619u8.class, m70637k4())));
                            }
                            if (dDoubleValue <= -1.0d) {
                                z = false;
                            }
                        } else if (dDoubleValue <= 0.0d) {
                        }
                    } else if (dDoubleValue >= 1.0d) {
                    }
                } else if (dDoubleValue >= 0.0d) {
                }
            } else if (dDoubleValue == 0.0d) {
            }
        } else if (dDoubleValue != 0.0d) {
        }
        return new mtk(z);
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final String mo3872k4(C0909dp c0909dp) {
        return C14113y2.m67402k4("{0} {1} {2}", m70639x1().mo3872k4(c0909dp), f48852k4.get_Item(Integer.valueOf(m70637k4())), m70638kk().mo3872k4(c0909dp));
    }
}
