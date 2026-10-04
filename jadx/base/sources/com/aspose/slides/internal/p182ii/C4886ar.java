package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.ar */
/* JADX INFO: loaded from: classes.dex */
public class C4886ar extends C1569kk {
    public C4886ar(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8379k4(this);
        C4913ks c4913ks = (C4913ks) mo22660v4();
        IGenericEnumerator<InterfaceC12777qq> it = m59505uz("BASE").iterator();
        while (it.hasNext()) {
            try {
                ((C4904h4) it.next()).mo8441k4(interfaceC1566du);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c4913ks.m20450xw() != null) {
            c4913ks.m20450xw().mo8441k4(interfaceC1566du);
        } else if (c4913ks.m20445vj() != null) {
            c4913ks.m20445vj().mo8441k4(interfaceC1566du);
        }
        interfaceC1566du.mo8416x1(this);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20228qw() {
        return m59490c5("version", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20229wl(String str) {
        mo22708k4("version", str);
    }
}
