package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C4262b3 implements InterfaceC4268dq {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14305k4(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        List.Enumerator<AbstractC4282kp> it = abstractC4282kp.mo17208t_().iterator();
        AbstractC4282kp abstractC4282kpM17213k4 = null;
        while (it.hasNext() && (abstractC4282kpM17213k4 = abstractC4275gi.m17213k4(abstractC3533um, it.next(), (AbstractC3524ks) null)) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return abstractC4282kpM17213k4;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        String strMo9926j_;
        return (abstractC4282kp.mo17208t_().size() == 1 && (strMo9926j_ = m17122k4(abstractC4282kp, 0).mo9926j_()) != null && C14113y2.m67363du(strMo9926j_, "inherit")) ? abstractC3533um.m14400m9(i) : mo14305k4(i, abstractC4282kp, abstractC4275gi, abstractC3533um);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp m17122k4(AbstractC4282kp abstractC4282kp, int i) {
        if (abstractC4282kp.mo17208t_().size() > i) {
            return abstractC4282kp.mo17208t_().get_Item(i);
        }
        return null;
    }
}
