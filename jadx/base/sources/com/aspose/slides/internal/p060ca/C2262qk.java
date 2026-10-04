package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qk */
/* JADX INFO: loaded from: classes3.dex */
class C2262qk {

    /* JADX INFO: renamed from: k4 */
    private static final short f7779k4 = C7019kk.m27468x1((Object) (byte) -18, 6);

    /* JADX INFO: renamed from: k4 */
    public static byte[] m11292k4(byte[] bArr) {
        short sM11673m9;
        int iM27462to;
        C2364x6 c2364x6 = new C2364x6(bArr);
        int iM27462to2 = C7019kk.m27462to(Integer.valueOf(c2364x6.m11669h4()), 8) * 2;
        byte[] bArr2 = new byte[iM27462to2];
        short s = 0;
        for (int i = 0; i < iM27462to2; i += 2) {
            byte bM11668dy = c2364x6.m11668dy();
            int iM27462to3 = C7019kk.m27462to(Byte.valueOf(bM11668dy), 6);
            short s2 = f7779k4;
            if (iM27462to3 < s2) {
                sM11673m9 = C7019kk.m27468x1(Byte.valueOf(bM11668dy), 6);
            } else {
                if (C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) >= C7019kk.m27462to((Object) (byte) -8, 6) && C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) <= C7019kk.m27462to((Object) (byte) -1, 6)) {
                    iM27462to = (((C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) - C7019kk.m27462to((Object) (byte) -8, 6)) + 1) * s2) + C7019kk.m27468x1(Byte.valueOf(c2364x6.m11668dy()), 6);
                } else if (C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) < C7019kk.m27462to((Object) (byte) -17, 6) || C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) > C7019kk.m27462to((Object) (byte) -9, 6)) {
                    sM11673m9 = c2364x6.m11673m9();
                } else {
                    iM27462to = -(((C7019kk.m27462to(Byte.valueOf(bM11668dy), 6) - C7019kk.m27462to((Object) (byte) -17, 6)) * s2) + C7019kk.m27468x1(Byte.valueOf(c2364x6.m11668dy()), 6));
                }
                sM11673m9 = (short) iM27462to;
            }
            s = (short) (sM11673m9 + s);
            bArr2[i] = (byte) ((s >> 8) & 255);
            bArr2[i + 1] = (byte) (s & 255);
        }
        return bArr2;
    }
}
