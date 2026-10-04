package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p488x0.C12330ar;
import com.aspose.slides.internal.p488x0.C12344qq;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C1331uz extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7816k4(C3134k4 c3134k4) {
        C12344qq c12344qq = new C12344qq();
        c12344qq.m57787k4(c3134k4.m13382u4());
        c12344qq.m57794x1(c3134k4.m13382u4());
        c12344qq.m57790kk(c3134k4.m13382u4());
        c12344qq.m57788k4(new C12330ar[(c12344qq.m57786k4() & 65535) / 2]);
        for (int i = 0; i < (c12344qq.m57786k4() & 65535) / 2; i++) {
            c12344qq.m57792to()[i] = (C12330ar) new C1329u4().m7814k4(c3134k4);
        }
        c12344qq.m57791to(c3134k4.m13382u4());
        if ((c12344qq.m57786k4() & 65535) != (c12344qq.m57785h4() & 65535)) {
            C6005k4.m24263kk("Warning: WmfScan.Count != WmfScan.Count2");
        }
        return c12344qq;
    }
}
