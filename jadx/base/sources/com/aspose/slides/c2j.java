package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class c2j {

    /* JADX INFO: renamed from: k4 */
    public final String f4274k4;

    /* JADX INFO: renamed from: kk */
    public final byte f4275kk;

    /* JADX INFO: renamed from: to */
    public dex f4276to = new dex();

    /* JADX INFO: renamed from: x1 */
    public boolean f4277x1;

    private c2j(String str, boolean z, byte b) {
        this.f4274k4 = str;
        this.f4277x1 = z;
        this.f4275kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4427k4(String str, int i, int i2, boolean z, byte b, IGenericList<c2j> iGenericList) {
        if (i >= i2) {
            return;
        }
        iGenericList.addItem(new c2j(C14113y2.m67443x1(str, i, i2 - i), z, b));
    }

    public String toString() {
        return this.f4274k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4428k4(String str, IGenericList<c2j> iGenericList) {
        String str2;
        IGenericList<c2j> iGenericList2;
        if (C14113y2.m67411k4(str)) {
            return;
        }
        List list = new List(new C1250ig(str));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        byte bM12881to = C3047dy.m12881to(((jua) list.get_Item(0)).m63550k4());
        boolean z = true;
        while (i < list.size()) {
            jua juaVarClone = ((jua) list.get_Item(i)).Clone();
            boolean z2 = (juaVarClone.f45582kk == 8722 && i != 0 && ((jua) list.get_Item(i + (-1))).f45582kk == '=') ? true : !C3047dy.m12846b3(juaVarClone.f45582kk);
            byte bM12881to2 = C3047dy.m12881to(juaVarClone.m63550k4());
            if (z2 == z && bM12881to2 == bM12881to) {
                str2 = str;
                iGenericList2 = iGenericList;
            } else {
                str2 = str;
                iGenericList2 = iGenericList;
                m4427k4(str2, i2, i3, !z, bM12881to, iGenericList2);
                i2 = i3;
                z = z2;
                bM12881to = bM12881to2;
            }
            i3 += juaVarClone.f45584x1 ? 2 : 1;
            i++;
            str = str2;
            iGenericList = iGenericList2;
        }
        String str3 = str;
        m4427k4(str3, i2, str3.length(), !z, bM12881to, iGenericList);
    }
}
