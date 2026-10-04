package com.aspose.slides.internal.p094dw;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6269ck;
import com.aspose.slides.internal.p260ly.C6286up;
import com.aspose.slides.internal.p349q3.C9641e0;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p422tl.C11045c5;
import com.aspose.slides.internal.p422tl.C11056m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.wy */
/* JADX INFO: loaded from: classes3.dex */
public class C3479wy {
    /* JADX INFO: renamed from: k4 */
    public static boolean m14037k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        C9641e0 c9641e0 = new C9641e0(c9723vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c9641e0.m47168k4(c3134k4.m13384uz());
        int iM47766lr = c9641e0.m47766lr() - 12;
        long position = abstractC3150x6.getPosition();
        C6269ck c6269ck = iM47766lr <= 320 ? (C6269ck) new C11045c5().m53475k4(c3134k4) : (C6286up) new C11056m9().m53488k4(c3134k4);
        abstractC3150x6.seek(position + ((long) iM47766lr), 0);
        c9641e0.m47169k4(c6269ck);
        c9723vwArr[0] = c9641e0;
        return true;
    }
}
