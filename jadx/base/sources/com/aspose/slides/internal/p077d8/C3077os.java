package com.aspose.slides.internal.p077d8;

import com.aspose.slides.PatternStyle;
import java.io.ByteArrayOutputStream;
import java.text.MessageFormat;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.os */
/* JADX INFO: loaded from: classes3.dex */
class C3077os {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13018k4(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        return m13022x1(bArr, bArr2, bArr3, bArr4);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m13021x1(byte[] bArr) {
        int length = bArr.length;
        if (length == 128) {
            return "SHA1";
        }
        if (length == 256) {
            return "SHA256";
        }
        throw new IllegalStateException(MessageFormat.format("Unexpected public key modulus length: {0}", Integer.valueOf(bArr.length)));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m13019k4(byte[] bArr) {
        return m13021x1(bArr).equals("SHA1") ? new byte[]{PatternStyle.Wave, 33, PatternStyle.Wave, 9, 6, 5, PatternStyle.Sphere, 14, 3, 2, 26, 5, 0, 4, 20} : new byte[]{PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Wave, 13, 6, 9, 96, -122, 72, 1, 101, 3, 4, 2, 1, 5, 0, 4, 32};
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m13022x1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        boolean z;
        if (bArr4.length != bArr.length) {
            C3102wz.m13203k4(1);
            z = true;
        } else {
            z = false;
        }
        byte[] bArrM13064k4 = C3084ss.m13064k4(bArr4);
        C3098w6 c3098w6 = new C3098w6(bArr, bArr2);
        byte[] bArrM13063k4 = C3084ss.m13063k4(c3098w6, bArrM13064k4);
        byte[] bArrM13065k4 = C3084ss.m13065k4(bArrM13063k4, c3098w6.m13166k4().bitLength() >> 3);
        byte[] bArrM13020k4 = m13020k4(bArr, bArr3, bArrM13065k4.length);
        if (bArrM13065k4.length != bArrM13020k4.length) {
            z = true;
        } else {
            for (int i = 0; i < bArrM13065k4.length; i++) {
                z = z || bArrM13065k4[i] != bArrM13020k4[i];
            }
        }
        C3071m4 c3071m4 = new C3071m4(bArrM13063k4);
        c3071m4.m12978k4(bArrM13064k4.length, bArrM13020k4.length, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArrM13063k4, 0, bArrM13063k4.length);
        c3071m4.m12981k4(byteArrayOutputStream, bArrM13020k4, bArrM13064k4.length);
        if (c3071m4.m12980k4()) {
            bArrM13064k4[0] = 0;
            bArrM13064k4[1] = 17;
        }
        C3070m2 c3070m2 = new C3070m2(c3071m4, bArrM13065k4, true, c3071m4.m12980k4());
        int[] iArr = new int[bArrM13063k4.length];
        for (int i2 = 0; i2 < bArrM13063k4.length; i2++) {
            iArr[i2] = bArrM13063k4[i2];
        }
        c3070m2.m12970k4(iArr, c3071m4);
        c3070m2.m12972k4((String) null, true);
        c3070m2.m12973k4(true);
        c3071m4.m12979k4(true);
        c3070m2.m12972k4("1234567890ABCDEF", false);
        c3070m2.m12975k4(bArrM13063k4, "Aspose.Slides");
        return !z;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m13020k4(byte[] bArr, byte[] bArr2, int i) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(m13019k4(bArr), 0, m13019k4(bArr).length);
        byte[] bArrM13208k4 = C3105x6.m13208k4(bArr.length == 128 ? 0 : 1, bArr2);
        byteArrayOutputStream.write(bArrM13208k4, 0, bArrM13208k4.length);
        if (i < byteArrayOutputStream.size() + 11) {
            C3102wz.m13203k4(11);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(1);
        int size = (i - byteArrayOutputStream.size()) - 3;
        for (int i2 = 0; i2 < size; i2++) {
            byteArrayOutputStream2.write(255);
        }
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream.writeTo(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}
