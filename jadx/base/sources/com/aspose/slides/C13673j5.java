package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8147ky;
import com.aspose.slides.internal.p332p7.C9085w3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.j5 */
/* JADX INFO: loaded from: classes3.dex */
class C13673j5 {
    /* JADX INFO: renamed from: k4 */
    public static MathArray m63213k4(C8147ky c8147ky, gnb gnbVar) {
        wo2 wo2VarM68217k4 = c8147ky.m35777k4() != null ? C14202nv.m68217k4(c8147ky.m35777k4(), gnbVar) : null;
        List list = new List();
        if (c8147ky.m35780x1() != null) {
            for (C9085w3 c9085w3 : c8147ky.m35780x1()) {
                list.addItem(jz7.m63584k4(c9085w3, gnbVar));
            }
        }
        return new MathArray(list, wo2VarM68217k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C8147ky m63214k4(MathArray mathArray, u8s u8sVar) {
        boolean zM27456k4;
        if (mathArray == null) {
            return null;
        }
        C8147ky c8147ky = new C8147ky();
        c8147ky.m35778k4(C14202nv.m68216k4(mathArray, u8sVar));
        if (mathArray.getArguments() != null) {
            IGenericEnumerator<IMathElement> it = mathArray.getArguments().iterator();
            while (it.hasNext()) {
                try {
                    c8147ky.m35779k4(jz7.m63586k4(it.next(), u8sVar));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c8147ky;
            }
        }
        return c8147ky;
    }
}
