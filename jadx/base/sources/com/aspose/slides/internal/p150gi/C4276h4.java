package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10015kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p523yd.C12814to;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4276h4 extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    protected C12003du f11670k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.h4$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4276h4.class)) {
                return abstractC4282kp;
            }
            AbstractC3524ks abstractC3524ksM14393k4 = abstractC3524ks == null ? abstractC3533um.m14393k4() : abstractC3524ks;
            C12003du c12003duClone = abstractC4282kp.mo9923k4(abstractC3524ksM14393k4 == null ? null : abstractC3524ksM14393k4.m14111q_()).Clone();
            return !c12003duClone.m56504dy() ? new C4276h4(c12003duClone.Clone()) : mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    private C4276h4(C12003du c12003du) {
        C12003du c12003du2 = new C12003du();
        this.f11670k4 = c12003du2;
        c12003du.CloneTo(c12003du2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4276h4 m17236k4(C12814to c12814to, String str) {
        return new C4276h4(C10015kk.m49154k4(c12814to, str).Clone());
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    public int hashCode() {
        return this.f11670k4.hashCode();
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C10015kk.m49155k4(this.f11670k4.Clone());
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: k4 */
    public C12003du mo9923k4(C12814to c12814to) {
        return this.f11670k4;
    }
}
