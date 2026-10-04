package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4271e0;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.wp */
/* JADX INFO: loaded from: classes.dex */
public class C4306wp extends AbstractC4271e0.k4 {
    public C4306wp(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14302k4(int i, AbstractC3533um abstractC3533um, boolean z, boolean z2) {
        AbstractC4282kp abstractC4282kpMo14302k4 = super.mo14302k4(0, abstractC3533um, z, z2);
        AbstractC3524ks abstractC3524ksM14393k4 = abstractC3533um.m14393k4();
        String strM59589yj = this.f11665k4 == 183 ? abstractC3524ksM14393k4.m14111q_().m59589yj() : abstractC3524ksM14393k4.m14111q_().m59573ks();
        if (abstractC4282kpMo14302k4.mo17251du() != 64) {
            return abstractC4282kpMo14302k4.m17256x6() ? mo14415k4(abstractC3533um, strM59589yj, abstractC3524ksM14393k4) : abstractC4282kpMo14302k4;
        }
        int i2 = this.f11665k4 == 183 ? 186 : 183;
        int iMo17251du = abstractC3533um.m14402to(StyleIdentifier.PLAIN_TABLE_1).mo17251du();
        int iMo9884to = abstractC3533um.m14402to(197).mo9878h4().mo9884to();
        return (abstractC3533um.mo14065x1(i2) == null || abstractC3533um.mo14065x1(i2).mo17251du() != 64) ? abstractC4282kpMo14302k4 : ((iMo17251du == 140 || !(iMo9884to == 0 || iMo9884to == 180 || iMo9884to == -180)) && !(iMo17251du == 140 && (iMo9884to == 90 || iMo9884to == 270 || iMo9884to == -270))) ? this.f11665k4 == 183 ? mo14415k4(abstractC3533um, strM59589yj, abstractC3524ksM14393k4) : abstractC4282kpMo14302k4 : this.f11665k4 == 186 ? mo14415k4(abstractC3533um, strM59589yj, abstractC3524ksM14393k4) : abstractC4282kpMo14302k4;
    }
}
