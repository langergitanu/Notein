package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C4932u4 extends C1569kk {
    public C4932u4(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: j2 */
    public final IGenericList<C4906ix> m20597j2() {
        List list = new List();
        IGenericEnumerator<InterfaceC12777qq> it = m22716m9("FRAME").iterator();
        while (it.hasNext()) {
            try {
                list.addItem((C4906ix) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8390k4(this);
        m8451x1(interfaceC1566du);
        interfaceC1566du.mo8425x1(this);
    }

    /* JADX INFO: renamed from: qq */
    public final void m20598qq(String str) {
        mo22708k4("rows", str);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20599qw() {
        return m59490c5("cols", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: tq */
    public final String m20600tq() {
        return m59490c5("rows", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20601wl(String str) {
        mo22708k4("cols", str);
    }
}
