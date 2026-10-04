package com.aspose.slides.internal.p505xn;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.ks */
/* JADX INFO: loaded from: classes5.dex */
public class C12565ks {

    /* JADX INFO: renamed from: x1 */
    private static final char[] f42080x1 = {';'};

    /* JADX INFO: renamed from: kk */
    private static final char[] f42078kk = {','};

    /* JADX INFO: renamed from: to */
    private static final char[] f42079to = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: k4 */
    public static final byte[] f42077k4 = new byte[0];

    /* JADX INFO: renamed from: k4 */
    public static int m58608k4(double d) {
        return OooO.OooO00o(d, 14);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m58627kk(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m58629x1(long j, int i) {
        return m58609k4(j, i) * i;
    }

    /* JADX INFO: renamed from: kk */
    public static float[] m58628kk(List<Float> list) {
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = list.get_Item(i).floatValue();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m58630x1(String str) {
        return str != null && str.length() > 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m58631x1(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m58632x1(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("srcStream");
        }
        byte[] bArr = new byte[(int) abstractC3150x6.getLength()];
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            abstractC3150x6.setPosition(0L);
            m58615k4(abstractC3150x6, c3152yj);
            return bArr;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m58609k4(long j, int i) {
        long j2 = i;
        long j3 = j / j2;
        if (j % j2 != 0) {
            j3++;
        }
        return (int) j3;
    }

    /* JADX INFO: renamed from: x1 */
    public static long[] m58633x1(List<Long> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = list.get_Item(i).longValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3152yj m58610k4(AbstractC3150x6 abstractC3150x6) {
        C3152yj c3152yj = (C3152yj) C7019kk.m27452k4((Object) abstractC3150x6, C3152yj.class);
        if (c3152yj != null) {
            return c3152yj;
        }
        C3152yj c3152yj2 = new C3152yj((int) abstractC3150x6.getLength());
        m58615k4(abstractC3150x6, c3152yj2);
        return c3152yj2;
    }

    /* JADX INFO: renamed from: x1 */
    public static Byte[] m58634x1(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m58611k4(byte[] bArr) {
        return m58612k4(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean[] m58635x1(byte b) {
        boolean[] zArr = new boolean[8];
        for (int i = 0; i < 8; i++) {
            boolean z = true;
            if ((b & 255 & (1 << i)) == 0) {
                z = false;
            }
            zArr[i] = z;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m58612k4(byte[] bArr, int i, int i2, boolean z) {
        C6765kp c6765kp = new C6765kp(i2 * 2);
        int i3 = z ? -1 : 1;
        if (z) {
            i += i2 - 1;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c6765kp.m26798k4(m58626k4(bArr[i]));
            i += i3;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58613k4(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) i;
            i >>= 8;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58614k4(AbstractC3150x6 abstractC3150x6, int i) {
        long jM58629x1 = m58629x1(abstractC3150x6.getPosition(), i);
        if (abstractC3150x6.getLength() < jM58629x1) {
            abstractC3150x6.setLength(jM58629x1);
        }
        abstractC3150x6.setPosition(jM58629x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58615k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("srcStream");
        }
        if (abstractC3150x62 == null) {
            throw new ArgumentNullException("dstStream");
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i <= 0) {
                return;
            } else {
                abstractC3150x62.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58616k4(String str, String str2) {
        if (!m58630x1(str)) {
            throw new ArgumentException("The argument cannot be null or empty string.", str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58617k4(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58618k4(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58619k4(C3134k4 c3134k4, int i) {
        return ((long) i) <= c3134k4.m13371ck().getLength() - c3134k4.m13371ck().getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58620k4(C12015qq c12015qq, C12015qq c12015qq2, double d) {
        if (C14116yg.m67480k4(c12015qq.m56699x1() - c12015qq2.m56699x1()) > d || C14116yg.m67480k4(c12015qq.m56697kk() - c12015qq2.m56697kk()) > d) {
            return ((double) C14116yg.m67480k4(c12015qq.m56699x1() - c12015qq2.m56697kk())) <= d && ((double) C14116yg.m67480k4(c12015qq.m56697kk() - c12015qq2.m56699x1())) <= d;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58621k4(String str, String str2, boolean z) {
        if (z) {
            str = C14113y2.m67358c5(str);
            str2 = C14113y2.m67358c5(str2);
        }
        return C14113y2.m67364dy(str, str2) >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58622k4(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get_Item(i).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58623k4(AbstractC3150x6 abstractC3150x6, long j) {
        long position = abstractC3150x6.getPosition();
        int i = (int) j;
        byte[] bArr = new byte[i];
        abstractC3150x6.read(bArr, 0, i);
        abstractC3150x6.setPosition(position);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58624k4(C14047bz c14047bz) {
        byte[] bArrM66539k4 = c14047bz.m66539k4();
        AbstractC14092to.m67259x1(AbstractC14092to.m67208k4((Object) bArrM66539k4), 0, 4);
        AbstractC14092to.m67259x1(AbstractC14092to.m67208k4((Object) bArrM66539k4), 4, 2);
        AbstractC14092to.m67259x1(AbstractC14092to.m67208k4((Object) bArrM66539k4), 6, 2);
        return bArrM66539k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58625k4(String str) {
        C3130fa c3130faM13363to = C3131h4.m13363to(str);
        try {
            return m58632x1(c3130faM13363to);
        } finally {
            if (c3130faM13363to != null) {
                c3130faM13363to.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static char[] m58626k4(byte b) {
        char[] cArr = f42079to;
        return new char[]{cArr[((b & 255) >> 4) & 15], cArr[b & 15]};
    }
}
