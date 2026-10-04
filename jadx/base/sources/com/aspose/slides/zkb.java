package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8333ne;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7527e0;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zkb extends ywb {
    public zkb(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74560k4(jrf jrfVar, bjs bjsVar) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "drawing".equals(m55443jd().mo65023fa())) {
                jrfVar.m63504k4(new C7527e0(m55443jd()));
                List list = new List();
                List.Enumerator<C7394ca> it = jrfVar.m63501h4().m30723k4().mo28601kk().iterator();
                while (it.hasNext()) {
                    try {
                        C7394ca next = it.next();
                        if ("sp".equals(next.m29539k4())) {
                            AbstractC8333ne abstractC8333ne = (AbstractC8333ne) next.m29542x1();
                            long jM31579kk = abstractC8333ne.mo30435k4().mo30406k4().m31579kk();
                            if ((4294967295L & jM31579kk) != 0) {
                                if (list.containsItem(Long.valueOf(jM31579kk))) {
                                    abstractC8333ne.mo30435k4().mo30406k4().m31575k4(0L);
                                } else {
                                    list.addItem(Long.valueOf(jM31579kk));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                C14490t8.m70985k4(jrfVar.m63512m9(), jrfVar.m63501h4().m30723k4(), bjsVar);
            }
        }
        mo55330fa();
    }

    public zkb(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74561k4(jrf jrfVar, sdp sdpVar) {
        mo55332up();
        C7527e0 c7527e0 = new C7527e0();
        C14490t8.m70986k4(jrfVar.m63512m9(), c7527e0.m30723k4(), sdpVar, (C14786xh) null);
        c7527e0.mo6846k4(null, m55442ck(), "drawing");
        mo55333yj();
    }
}
