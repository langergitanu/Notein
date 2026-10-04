package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4271e0 extends AbstractC4282kp implements InterfaceC1984kk {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.e0$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4288qq.class)) {
                return new C4301uz(abstractC4282kp);
            }
            if (C7019kk.m27469x1(abstractC4282kp, AbstractC4271e0.class)) {
                return abstractC4282kp;
            }
            if (C7019kk.m27469x1(abstractC4282kp, C4293sv.class)) {
                return C4261ar.m17120k4(abstractC4282kp.mo9878h4().mo9879k4(), "px", 72.0f / abstractC3533um.m14393k4().m14111q_().m59581up());
            }
            Object objMo9877dy = abstractC4282kp.mo9877dy();
            return objMo9877dy != null ? (AbstractC4282kp) objMo9877dy : mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: dy */
    public InterfaceC1984kk mo9877dy() {
        return this;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: h4 */
    public InterfaceC1986to mo9878h4() {
        return this;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final void mo9881k4(int i) {
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9885x1() {
        return 1;
    }
}
