package com.aspose.slides.internal.p405sq;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.sq.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10322to extends AbstractC10321m9 {
    public C10322to(C1569kk c1569kk) {
        super(c1569kk);
    }

    /* JADX INFO: renamed from: k4 */
    public String m50312k4() {
        C6765kp c6765kp = new C6765kp();
        IGenericList<String> iGenericListM26923k4 = m50308kk().m23810bv().m26923k4();
        if (iGenericListM26923k4.size() == 0) {
            return C14113y2.f47374k4;
        }
        String str = iGenericListM26923k4.get_Item(0);
        if (m50311k4(str)) {
            c6765kp.m26780k4('\'').m26792k4(str).m26780k4('\'');
        } else {
            c6765kp.m26792k4(str);
        }
        for (int i = 1; i < iGenericListM26923k4.size(); i++) {
            c6765kp.m26792k4(", ");
            String str2 = iGenericListM26923k4.get_Item(i);
            if (m50311k4(str2)) {
                c6765kp.m26780k4('\'').m26792k4(str2).m26780k4('\'');
            } else {
                c6765kp.m26792k4(str2);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m50311k4(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (C14117yj.m67534ks(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
