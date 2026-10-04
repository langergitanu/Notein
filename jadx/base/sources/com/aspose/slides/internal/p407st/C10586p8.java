package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.p8 */
/* JADX INFO: loaded from: classes4.dex */
public class C10586p8 {

    /* JADX INFO: renamed from: k4 */
    private final float f37281k4;

    /* JADX INFO: renamed from: kk */
    private final int f37282kk;

    /* JADX INFO: renamed from: x1 */
    private final short f37283x1;

    public C10586p8(long j) {
        byte[] bArrM66776k4 = C14069jd.m66776k4(j);
        int iM27457kk = C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrM66776k4[0]), 6) + (C7019kk.m27462to(Byte.valueOf(bArrM66776k4[1]), 6) << 8)), 9);
        this.f37282kk = iM27457kk;
        short sM27468x1 = C7019kk.m27468x1(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrM66776k4[2]), 6) + (C7019kk.m27462to(Byte.valueOf(bArrM66776k4[3]), 6) << 8)), 9);
        this.f37283x1 = sM27468x1;
        this.f37281k4 = (C7019kk.m27437dy(Integer.valueOf(iM27457kk), 8) / 65536.0f) + sM27468x1;
    }

    /* JADX INFO: renamed from: k4 */
    public float m51464k4() {
        return this.f37281k4;
    }
}
