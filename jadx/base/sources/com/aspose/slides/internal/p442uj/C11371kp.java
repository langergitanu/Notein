package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1339du;
import com.aspose.slides.internal.p019ac.C1342h4;
import com.aspose.slides.internal.p019ac.C1350qq;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5037rs;
import com.aspose.slides.internal.p183ij.C5059vj;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5478du;
import com.aspose.slides.internal.p206jj.C5482ix;
import com.aspose.slides.internal.p206jj.C5490to;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C11371kp extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5059vj c5059vj = new C5059vj(c5061vwArr[0]);
        c5059vj.m21545k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c5059vj.m21543k4(c3134k4.m13384uz());
        c5059vj.m21551x1(c3134k4.m13384uz());
        c5059vj.m21548kk(c3134k4.m13384uz() & 4294967295L);
        C5037rs c5037rs = new C5037rs();
        int iM21550x1 = (int) c5059vj.m21550x1();
        C1350qq[] c1350qqArr = new C1350qq[iM21550x1];
        for (int i = 0; i < iM21550x1; i++) {
            c1350qqArr[i] = (C1350qq) new C5482ix().m22572k4(c3134k4);
        }
        c5037rs.m21420k4(c1350qqArr);
        if (c5059vj.m21549to() == 0 || c5059vj.m21549to() == 1) {
            int iM21547kk = (int) c5059vj.m21547kk();
            C1339du[] c1339duArr = new C1339du[iM21547kk];
            for (int i2 = 0; i2 < iM21547kk; i2++) {
                c1339duArr[i2] = (C1339du) new C5490to().m22580k4(c3134k4);
            }
            c5037rs.m21418k4(c1339duArr);
            c5037rs.m21417k4(c3134k4.m13372dy(((int) c5059vj.m21547kk()) * 4));
        } else if (c5059vj.m21549to() == 2) {
            int iM21547kk2 = (int) c5059vj.m21547kk();
            C1342h4[] c1342h4Arr = new C1342h4[iM21547kk2];
            for (int i3 = 0; i3 < iM21547kk2; i3++) {
                c1342h4Arr[i3] = (C1342h4) new C5478du().m22567k4(c3134k4);
            }
            c5037rs.m21419k4(c1342h4Arr);
        }
        c5059vj.m21544k4(c5037rs);
        c5061vwArr[0] = c5059vj;
        return true;
    }
}
