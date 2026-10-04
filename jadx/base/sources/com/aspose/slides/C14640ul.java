package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ul */
/* JADX INFO: loaded from: classes3.dex */
class C14640ul {
    /* JADX INFO: renamed from: k4 */
    public static void m71728k4(zt8 zt8Var, com.aspose.slides.internal.p332p7.vbz vbzVar) {
        if (vbzVar == null) {
            return;
        }
        for (com.aspose.slides.internal.p332p7.zoh zohVar : vbzVar.m42917x1()) {
            xry xryVar = new xry();
            C0814be.m4160k4(xryVar, zohVar);
            zt8Var.m74813k4(xryVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71729x1(zt8 zt8Var, com.aspose.slides.internal.p332p7.vbz vbzVar) {
        if (zt8Var == null) {
            return;
        }
        vbzVar.m42916k4(((long) zt8Var.m74812k4()) & 4294967295L);
        IGenericEnumerator<xry> it = zt8Var.iterator();
        while (it.hasNext()) {
            try {
                C0814be.m4161x1(it.next(), vbzVar.m42915k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
