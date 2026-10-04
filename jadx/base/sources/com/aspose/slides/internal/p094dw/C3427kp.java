package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6270du;
import com.aspose.slides.internal.p260ly.C6273h4;
import com.aspose.slides.internal.p260ly.C6281qq;
import com.aspose.slides.internal.p349q3.C9699rs;
import com.aspose.slides.internal.p349q3.C9721vj;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p422tl.C11047du;
import com.aspose.slides.internal.p422tl.C11051ix;
import com.aspose.slides.internal.p422tl.C11059to;
import com.aspose.slides.internal.p488x0.C12350uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.kp */
/* JADX INFO: loaded from: classes3.dex */
public class C3427kp {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13985k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9721vj c9721vj = new C9721vj(c9723vwArr[0]);
        c9721vj.m47751k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9721vj.m47749k4(c3134k4.m13384uz());
        c9721vj.m47757x1(c3134k4.m13384uz());
        c9721vj.m47754kk(c3134k4.m13384uz() & 4294967295L);
        C9699rs c9699rs = new C9699rs();
        int iM47756x1 = (int) c9721vj.m47756x1();
        C6281qq[] c6281qqArr = new C6281qq[iM47756x1];
        for (int i = 0; i < iM47756x1; i++) {
            c6281qqArr[i] = (C6281qq) new C11051ix().m53483k4(c3134k4);
        }
        c9699rs.m47617k4(c6281qqArr);
        if (c9721vj.m47755to() == 0 || c9721vj.m47755to() == 1) {
            int iM47753kk = (int) c9721vj.m47753kk();
            C6270du[] c6270duArr = new C6270du[iM47753kk];
            for (int i2 = 0; i2 < iM47753kk; i2++) {
                c6270duArr[i2] = (C6270du) new C11059to().m53491k4(c3134k4);
            }
            c9699rs.m47615k4(c6270duArr);
            c9699rs.m47614k4(c3134k4.m13372dy(((int) c9721vj.m47753kk()) * 4));
        } else if (c9721vj.m47755to() == 2) {
            int iM47753kk2 = (int) c9721vj.m47753kk();
            C6273h4[] c6273h4Arr = new C6273h4[iM47753kk2];
            for (int i3 = 0; i3 < iM47753kk2; i3++) {
                c6273h4Arr[i3] = (C6273h4) new C11047du().m53478k4(c3134k4);
            }
            c9699rs.m47616k4(c6273h4Arr);
        }
        c9721vj.m47750k4(c9699rs);
        c9723vwArr[0] = c9721vj;
        return true;
    }
}
