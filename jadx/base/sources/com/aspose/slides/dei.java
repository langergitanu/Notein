package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7565ef;
import com.aspose.slides.internal.p332p7.C8273ml;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dei {
    /* JADX INFO: renamed from: k4 */
    public static void m5071k4(oyy oyyVar, C8273ml c8273ml, gnb gnbVar) {
        for (C7565ef c7565ef : c8273ml.m36996kk()) {
            lrc.m64526k4(oyyVar.m68913k4(c7565ef.m31001ks().Clone(), c7565ef.m31006rv()), c7565ef, gnbVar);
        }
        oyyVar.m68910k4().m6438k4(c8273ml.m36997x1().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5072k4(oyy oyyVar, C8273ml c8273ml, u8s u8sVar) {
        c8273ml.m36995k4(oyyVar.m68910k4().m6439x1().Clone());
        IGenericEnumerator<x5o> it = oyyVar.iterator();
        while (it.hasNext()) {
            try {
                lrc.m64527k4(it.next(), c8273ml.m36994k4(), u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
