package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p385rr.C10052k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C13595ck {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC6901du m62710k4(boolean z) {
        int i;
        int i2;
        int[] iArrM49684k4 = C10052k4.m49684k4(16);
        if (z) {
            i = 255;
            i2 = -17;
        } else {
            i2 = 17;
            i = 0;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            iArrM49684k4[i3] = C13598dy.m62724k4(C13598dy.m62725k4(i, i, i));
            i += i2;
        }
        return new C13594c5(iArrM49684k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC6901du m62711x1(boolean z) {
        int[] iArrM49684k4 = C10052k4.m49684k4(256);
        int i = 0;
        if (z) {
            int i2 = 255;
            while (i < 256) {
                iArrM49684k4[i] = C13598dy.m62724k4(C13598dy.m62725k4(i2, i2, i2));
                i2--;
                i++;
            }
        } else {
            while (i < 256) {
                iArrM49684k4[i] = C13598dy.m62724k4(C13598dy.m62725k4(i, i, i));
                i++;
            }
        }
        return new C13594c5(iArrM49684k4);
    }
}
