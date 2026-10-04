package com.aspose.slides.internal.p344pt;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4013e0;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9499e0 extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4013e0 c4013e0 = (C4013e0) c4047sv;
        C11896dy c11896dy = new C11896dy(c3856h4.m15513rv());
        int i = 0;
        for (int i2 = 0; i2 < (c4013e0.m15883k4() & 65535); i2++) {
            int i3 = c4013e0.m15888x1()[i2] & 65535;
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                c4013e0.m15887kk()[i + i4].m57706kk().CloneTo(c12025x6Arr[i4]);
            }
            c11896dy.m55564kk(c12025x6Arr);
            c11896dy.m55567m9();
            i += i3;
        }
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17527k4(c3856h4.m15472dy(), c11896dy);
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17540k4(c3856h4.m15464c5(), c11896dy);
        }
    }
}
