package com.aspose.slides.internal.p077d8;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C3110yd {

    /* JADX INFO: renamed from: com.aspose.slides.internal.d8.yd$k4 */
    public static class k4 extends Exception {
        public k4() {
            super("buffer underrun");
        }
    }

    /* JADX INFO: renamed from: du */
    public static long m13235du(byte[] bArr, int i) {
        return m13254to(bArr, i, 8);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m13236h4(byte[] bArr, int i) {
        m13258x1(bArr, 0, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m13237k4(long j) {
        long j2 = 4294967295L & j;
        double d = (j & C18177fb.f54859s) / 65535.0d;
        int i = (int) ((j2 >> 16) & C18177fb.f54859s);
        int i2 = 65535 & i;
        return (i & 32768) != 0 ? ((double) (i2 - 65536)) + d : d + ((double) i2);
    }

    /* JADX INFO: renamed from: kk */
    public static int m13249kk(byte[] bArr, int i) {
        return (int) m13254to(bArr, i, 4);
    }

    /* JADX INFO: renamed from: to */
    public static long m13252to(byte[] bArr) {
        return m13235du(bArr, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m13255x1(AbstractC3150x6 abstractC3150x6) {
        return m13256x1(m13260x1(abstractC3150x6, 4));
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13238k4(double d) {
        long jM27435du;
        double dM67475k4;
        double dM67490kk = C14116yg.m67490kk(d);
        if (d < 0.0d) {
            jM27435du = ((((long) (C7019kk.m27468x1(Double.valueOf(dM67490kk), 14) + 65536)) & 4294967295L) << 16) & 4294967295L;
            dM67475k4 = (C14116yg.m67475k4(dM67490kk) - 1.0d) + (1.0d - C14116yg.m67475k4(d));
        } else {
            jM27435du = ((C7019kk.m27435du(Double.valueOf(dM67490kk), 14) & 4294967295L) << 16) & 4294967295L;
            dM67475k4 = d - dM67490kk;
        }
        return ((C7019kk.m27435du(Double.valueOf(dM67475k4 * 65536.0d), 14) & C18177fb.f54859s) | jM27435du) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public static long m13250kk(byte[] bArr) {
        return m13253to(bArr, 0);
    }

    /* JADX INFO: renamed from: to */
    public static long m13253to(byte[] bArr, int i) {
        return m13254to(bArr, i, 4);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m13256x1(byte[] bArr) {
        return m13249kk(bArr, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static short m13239k4(AbstractC3150x6 abstractC3150x6) {
        return (short) C3085sv.m13073k4(m13240k4(m13260x1(abstractC3150x6, 2)));
    }

    /* JADX INFO: renamed from: kk */
    public static byte[] m13251kk(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: to */
    private static long m13254to(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            j = (j << 8) | ((long) (((byte) (bArr[i3] & 255)) & 255));
        }
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m13257x1(byte[] bArr, int i) {
        short sM13254to = (short) m13254to(bArr, i, 2);
        return sM13254to >= 0 ? sM13254to : sM13254to + 65536;
    }

    /* JADX INFO: renamed from: k4 */
    public static short m13240k4(byte[] bArr) {
        return m13241k4(bArr, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13258x1(byte[] bArr, int i, int i2) {
        m13245k4(bArr, i, i2, 4);
    }

    /* JADX INFO: renamed from: k4 */
    public static short m13241k4(byte[] bArr, int i) {
        return (short) m13254to(bArr, i, 2);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13259x1(byte[] bArr, int i, long j) {
        m13245k4(bArr, i, j, 8);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13242k4(AbstractC3150x6 abstractC3150x6, int i) {
        byte[] bArr = new byte[4];
        m13258x1(bArr, 0, i);
        abstractC3150x6.write(bArr, 0, 4);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m13260x1(AbstractC3150x6 abstractC3150x6, int i) {
        byte[] bArr = new byte[i];
        int i2 = abstractC3150x6.read(bArr, 0, i);
        if (i2 == -1) {
            AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) bArr), 0, i);
            return bArr;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13243k4(byte[] bArr, int i, int i2) {
        m13245k4(bArr, i, i2, 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13244k4(byte[] bArr, int i, long j) {
        m13245k4(bArr, i, j, 4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m13245k4(byte[] bArr, int i, long j, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13246k4(byte[] bArr, int i, short s) {
        m13245k4(bArr, i, s, 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13247k4(byte[] bArr, long j) {
        m13259x1(bArr, 0, j);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13248k4(byte[] bArr, short s) {
        m13246k4(bArr, 0, s);
    }
}
