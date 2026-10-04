package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Oooo0;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.q6 */
/* JADX INFO: loaded from: classes3.dex */
class C2255q6 {

    /* JADX INFO: renamed from: k4 */
    private int f7758k4;

    public C2255q6(int i) {
        int i2;
        if (i == 0) {
            i2 = 55665;
        } else if (i != 1) {
            return;
        } else {
            i2 = 4330;
        }
        this.f7758k4 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m11274k4(byte b) {
        byte b2 = (byte) (this.f7758k4 >> 8);
        byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(b2), 6) ^ C7019kk.m27462to(Byte.valueOf(b), 6));
        this.f7758k4 = Oooo0.OooO00o(C7019kk.m27462to(Byte.valueOf(b), 6), this.f7758k4, 52845, 22719) & 65535;
        return bM27462to;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m11275x1(byte b) {
        byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(b), 6) ^ C7019kk.m27462to(Byte.valueOf((byte) (this.f7758k4 >> 8)), 6));
        this.f7758k4 = Oooo0.OooO00o(C7019kk.m27462to(Byte.valueOf(bM27462to), 6), this.f7758k4, 52845, 22719) & 65535;
        return bM27462to;
    }
}
