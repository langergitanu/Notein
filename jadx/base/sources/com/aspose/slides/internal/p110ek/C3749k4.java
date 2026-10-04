package com.aspose.slides.internal.p110ek;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ek.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3749k4 {
    /* JADX INFO: renamed from: k4 */
    public static String m15045k4(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (true) {
            if (i < bArr.length - 1) {
                if ((bArr[i] & 255) == 0 && (bArr[i + 1] & 255) == 0) {
                    length = i;
                    break;
                }
                i += 2;
            } else {
                break;
            }
        }
        return AbstractC6747ar.m26643rv().mo26682x1(bArr, 0, length);
    }

    /* JADX INFO: renamed from: kk */
    public static String m15050kk(long j, C3134k4 c3134k4) {
        return m15052to((int) j, c3134k4);
    }

    /* JADX INFO: renamed from: to */
    public static String m15052to(int i, C3134k4 c3134k4) {
        return AbstractC6747ar.m26643rv().m26681x1(c3134k4.m13372dy(i << 1));
    }

    /* JADX INFO: renamed from: x1 */
    public static float[] m15053x1(long j, C3134k4 c3134k4) {
        return m15051kk((int) j, c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m15046k4(short[] sArr) {
        byte[] bArr = new byte[sArr.length << 1];
        for (int i = 0; i < sArr.length; i++) {
            int i2 = i << 1;
            short s = sArr[i];
            bArr[i2] = (byte) s;
            bArr[i2 + 1] = (byte) (s >> 8);
        }
        return AbstractC6747ar.m26643rv().m26681x1(bArr);
    }

    /* JADX INFO: renamed from: kk */
    public static float[] m15051kk(int i, C3134k4 c3134k4) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = c3134k4.m13374ix();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static int[] m15054x1(int i, C3134k4 c3134k4) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = c3134k4.m13382u4();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15047k4(AbstractC3150x6 abstractC3150x6, int i) {
        if (((int) (abstractC3150x6.getPosition() % ((long) i))) > 0) {
            abstractC3150x6.seek(i - r0, 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static long[] m15048k4(long j, C3134k4 c3134k4) {
        int i = (int) (j & 4294967295L);
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = c3134k4.m13384uz();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static short[] m15049k4(int i, C3134k4 c3134k4) {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = c3134k4.m13381rv();
        }
        return sArr;
    }
}
