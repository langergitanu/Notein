package com.aspose.slides.internal.p094dw;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9735xk;
import com.aspose.slides.internal.p422tl.C11046ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C3491yd {
    /* JADX INFO: renamed from: k4 */
    public static boolean m14049k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9735xk c9735xk = new C9735xk(c9723vwArr[0]);
        c9735xk.m47840k4(c3134k4.m13384uz());
        c9735xk.m47847x1(c3134k4.m13384uz());
        if ((c9735xk.m47839k4() & 4294967295L) > 0) {
            c3134k4.m13371ck().seek(position + (c9735xk.m47846x1() & 4294967295L), 0);
            c9735xk.m47841k4(C11046ck.m53476k4(c3134k4, c9735xk.m47839k4()));
        }
        C3749k4.m15047k4(abstractC3150x6, 4);
        c9735xk.m47843kk(c3134k4.m13384uz());
        c9723vwArr[0] = c9735xk;
        return true;
    }
}
