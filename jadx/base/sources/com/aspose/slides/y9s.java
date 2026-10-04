package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8362nn;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class y9s {
    /* JADX INFO: renamed from: k4 */
    public static lv5 m73783k4(C8362nn c8362nn, gnb gnbVar) {
        lv5 lv5Var = new lv5();
        r5t r5tVar = new r5t();
        List.Enumerator<C7394ca> it = c8362nn.m37721du().iterator();
        while (it.hasNext()) {
            try {
                lv5Var.m64607x1().addItem(r5tVar.m70026k4(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c8362nn.m37724kk() != null) {
            lv5Var.m64605k4(new ldn());
            ab7.m3466k4(lv5Var.m64606kk(), c8362nn.m37724kk(), gnbVar);
        }
        if (c8362nn.m37725to() != null) {
            h1b.m6960k4(lv5Var.m64604du(), c8362nn.m37725to(), gnbVar);
        }
        return lv5Var;
    }
}
