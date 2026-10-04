package com.aspose.slides.internal.p414t6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.t6.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10842k4 extends List<Object> {
    /* JADX INFO: renamed from: k4 */
    public static C10842k4 m52407k4(String str) {
        Object objValueOf;
        C10842k4 c10842k4 = new C10842k4();
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ',');
        if (strArrM67414k4.length > 1) {
            for (String str2 : strArrM67414k4) {
                c10842k4.addRange(m52407k4(str2));
            }
        } else {
            String strM67440x1 = C14113y2.m67440x1(strArrM67414k4[0]);
            try {
                objValueOf = Integer.valueOf(C14057f9.m66582k4(strM67440x1));
            } catch (RuntimeException e) {
                if (C7019kk.m27469x1(e, FormatException.class)) {
                    C10841du c10841duM52404k4 = C10841du.m52404k4(strM67440x1);
                    objValueOf = strM67440x1;
                    if (c10841duM52404k4 != null) {
                        objValueOf = c10841duM52404k4;
                    }
                } else {
                    objValueOf = null;
                }
            }
            if (objValueOf != null) {
                c10842k4.addItem(objValueOf);
            }
        }
        return c10842k4;
    }
}
