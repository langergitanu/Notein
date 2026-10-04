package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class txg {
    /* JADX INFO: renamed from: k4 */
    public static void m71424k4(djf djfVar, com.aspose.slides.internal.p332p7.eka ekaVar) {
        if (ekaVar == null) {
            return;
        }
        for (com.aspose.slides.internal.p332p7.ilt iltVar : ekaVar.m31119x1()) {
            wuq wuqVar = new wuq();
            wuqVar.m72937k4(iltVar.m34215x1());
            wuqVar.m72936k4(iltVar.m34212k4());
            djfVar.m5119k4(wuqVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71425x1(djf djfVar, com.aspose.slides.internal.p332p7.eka ekaVar) {
        if (djfVar == null) {
            return;
        }
        ekaVar.m31118k4(((long) djfVar.m5118k4()) & 4294967295L);
        IGenericEnumerator<wuq> it = djfVar.iterator();
        while (it.hasNext()) {
            try {
                wuq next = it.next();
                com.aspose.slides.internal.p332p7.ilt iltVarM31117k4 = ekaVar.m31117k4();
                iltVarM31117k4.m34214k4(next.m72935k4());
                iltVarM31117k4.m34213k4(next.m72938x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
