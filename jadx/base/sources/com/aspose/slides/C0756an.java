package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8099kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.an */
/* JADX INFO: loaded from: classes3.dex */
class C0756an {
    /* JADX INFO: renamed from: k4 */
    public static void m3679k4(IControlCollection iControlCollection, AbstractC4685kk<com.aspose.slides.internal.p332p7.lpe> abstractC4685kk, sdp sdpVar) {
        if (iControlCollection.size() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.lpe lpeVarInvoke = abstractC4685kk.invoke();
        IGenericEnumerator<IControl> it = iControlCollection.iterator();
        while (it.hasNext()) {
            try {
                IControl next = it.next();
                if (!((Control) next).m1253to()) {
                    C14163n1.m67851k4(next, lpeVarInvoke.m36358k4(), sdpVar);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3680k4(IControlCollection iControlCollection, com.aspose.slides.internal.p332p7.lpe lpeVar, bjs bjsVar) {
        if (lpeVar == null) {
            return;
        }
        for (C8099kk c8099kk : lpeVar.m36359x1()) {
            IControl iControlM1256k4 = ((ControlCollection) iControlCollection).m1256k4();
            C14163n1.m67850k4(iControlM1256k4, c8099kk, bjsVar);
            if (C14047bz.m66535k4(((Control) iControlM1256k4).m1252kk(), C14047bz.f47172k4) && iControlM1256k4.getFrame() == null) {
                iControlCollection.remove(iControlM1256k4);
            }
        }
    }
}
