package com.aspose.slides.internal.p509xs;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5061vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.xs.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12603k4 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m58818k4(C5061vw c5061vw, AbstractC3150x6 abstractC3150x6) {
        try {
            C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
            c5061vw.m21558fa(c3134k4.m13371ck().getPosition());
            long jM13384uz = c3134k4.m13384uz();
            long jM13384uz2 = c3134k4.m13384uz();
            c5061vw.m21557ck(jM13384uz & 4294967295L);
            c5061vw.m21556c5((int) jM13384uz2);
            return true;
        } catch (EndOfStreamException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6);
}
