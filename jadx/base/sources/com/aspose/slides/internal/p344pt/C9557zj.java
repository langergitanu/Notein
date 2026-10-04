package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.AbstractC3860to;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C3999ai;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C9557zj extends AbstractC3860to {
    @Override // com.aspose.slides.internal.p123f5.AbstractC3860to
    /* JADX INFO: renamed from: k4 */
    public void mo15559k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C3999ai c3999ai = (C3999ai) c4047sv;
        C11913yj c11913yjM15477h4 = c3856h4.m15477h4();
        C12025x6[] c12025x6Arr = {new C12025x6(c3999ai.m15804kk(), c3999ai.m15805x1())};
        c11913yjM15477h4.m55775k4(c12025x6Arr);
        if (c12025x6Arr[0].m56897x1() >= c3856h4.m15479ix().mo15760yj() || c12025x6Arr[0].m56895kk() >= c3856h4.m15479ix().mo15757m9() || c12025x6Arr[0].m56895kk() < 0.0f) {
            return;
        }
        c3856h4.m15479ix().m56604k4(C7019kk.m27462to(Float.valueOf(c12025x6Arr[0].m56897x1()), 13), C7019kk.m27462to(Float.valueOf(c12025x6Arr[0].m56895kk()), 13), c3999ai.m15801k4().m57666h4().Clone());
    }
}
