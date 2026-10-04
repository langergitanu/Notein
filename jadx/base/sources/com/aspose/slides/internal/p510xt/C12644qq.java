package com.aspose.slides.internal.p510xt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3857k4;
import com.aspose.slides.internal.p132fj.C4001ar;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p276ml.AbstractC6397x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p488x0.C12347u4;
import com.aspose.slides.internal.p488x0.C12351wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.xt.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12644qq extends AbstractC6397x1 {
    @Override // com.aspose.slides.internal.p276ml.AbstractC6397x1
    /* JADX INFO: renamed from: k4 */
    public C3857k4 mo26252k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12351wl c12351wl;
        C4001ar c4001ar = (C4001ar) c4047sv;
        if ((c4001ar.m15811k4() & 65535) < c3856h4.m15510m9().length && (c12351wl = (C12351wl) C7019kk.m27452k4(c3856h4.m15510m9()[c4001ar.m15811k4() & 65535], C12351wl.class)) != null) {
            C12347u4 c12347u4M57856dy = c12351wl.m57856dy();
            return C3857k4.m15542k4(c12347u4M57856dy.m57808k4() - c4001ar.m15815to(), c12347u4M57856dy.m57814x1() - c4001ar.m15814kk(), c4001ar.m15815to() + c12347u4M57856dy.m57810kk(), c4001ar.m15814kk() + c12347u4M57856dy.m57812to());
        }
        return C3857k4.m15543kk();
    }
}
