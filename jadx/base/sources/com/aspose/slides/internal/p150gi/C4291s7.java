package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4293sv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.s7 */
/* JADX INFO: loaded from: classes.dex */
public class C4291s7 extends C4293sv.k4 {
    public C4291s7(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14302k4(int i, AbstractC3533um abstractC3533um, boolean z, boolean z2) {
        AbstractC4282kp abstractC4282kpMo14302k4 = super.mo14302k4(0, abstractC3533um, z, z2);
        int iMo9884to = abstractC4282kpMo14302k4 != null ? abstractC4282kpMo14302k4.mo9878h4().mo9884to() : 0;
        if (C14116yg.m67482k4(iMo9884to) % 90 != 0 || C14116yg.m67482k4(iMo9884to) / 90 > 3) {
            throw new C1921qq(C14113y2.m67408k4("Illegal property value: ", "reference-orientation=\"", C14057f9.m66591x1(iMo9884to), "\" ", "on ", abstractC3533um.m14393k4().m14105ks()));
        }
        return abstractC4282kpMo14302k4;
    }
}
