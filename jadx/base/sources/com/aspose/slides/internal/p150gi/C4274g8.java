package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.g8 */
/* JADX INFO: loaded from: classes.dex */
public class C4274g8 extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    public List<AbstractC4282kp> f11657k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.g8$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4274g8.class) ? abstractC4282kp : new C4274g8(abstractC4282kp);
        }
    }

    public C4274g8() {
        this.f11657k4 = new List<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4274g8 c4274g8 = (C4274g8) C7019kk.m27452k4(obj, C4274g8.class);
        if (c4274g8 == null) {
            return false;
        }
        return C10017to.m49170k4(this.f11657k4, c4274g8.f11657k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this.f11657k4;
    }

    public int hashCode() {
        return this.f11657k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo17207k4(AbstractC4282kp abstractC4282kp) {
        this.f11657k4.addItem(abstractC4282kp);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: t_ */
    public List<AbstractC4282kp> mo17208t_() {
        return this.f11657k4;
    }

    public C4274g8(AbstractC4282kp abstractC4282kp) {
        this();
        mo17207k4(abstractC4282kp);
    }
}
