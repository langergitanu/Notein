package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.NotImplementedException;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.transactions.TransactionsConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.x1 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C3206x1 {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f9577k4 = {"", "0", "00", "000", TransactionsConstants.API_RESULT_SUCCESS, "00000", "000000", "0000000", "00000000", "000000000", "0000000000", "0000 0000000", "000000000000", "0000000000000", "00000000000000", "00000000000000", "0000000000000000"};

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.x1$k4 */
    public static final class k4 {

        /* JADX INFO: renamed from: to */
        private String f9581to;

        /* JADX INFO: renamed from: k4 */
        public static final k4 f9578k4 = new k4(null);

        /* JADX INFO: renamed from: x1 */
        public static final k4 f9580x1 = new k4("/**\n * ${0} bytes (${1} bits)\n */\nprivate static final byte[] byteArray = ${2};");

        /* JADX INFO: renamed from: kk */
        public static final k4 f9579kk = new k4("//<summary>\n// ${0} bytes (${1} bits)\n//</summary>\nprivate static readonly byte[] byteArray = new byte[${0}] ${2};");

        private k4(String str) {
            this.f9581to = str;
        }

        /* JADX INFO: renamed from: k4 */
        public String m13895k4() {
            return this.f9581to;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.x1$kk */
    public enum kk {
        NONE(""),
        SPACE(" "),
        DOT("."),
        COMMA(","),
        HYPHEN(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);


        /* JADX INFO: renamed from: h4 */
        private String f9588h4;

        kk(String str) {
            this.f9588h4 = str;
        }

        /* JADX INFO: renamed from: k4 */
        public String m13896k4() {
            return this.f9588h4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.x1$x1 */
    public static final class x1 {

        /* JADX INFO: renamed from: k4 */
        public static final x1 f9589k4 = new x1();

        /* JADX INFO: renamed from: x1 */
        public static final x1 f9592x1 = new x1();

        /* JADX INFO: renamed from: kk */
        public static final x1 f9590kk = new x1();

        /* JADX INFO: renamed from: to */
        public static final x1 f9591to = new x1();

        private x1() {
        }
    }

    /* JADX INFO: renamed from: du */
    public static double m13876du(byte[] bArr, int i, boolean z) {
        return Double.longBitsToDouble(m13893to(bArr, i, z));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13877k4(double d, byte[] bArr, int i, boolean z) {
        return m13880k4(Double.doubleToLongBits(d), bArr, i, 8, z);
    }

    /* JADX INFO: renamed from: kk */
    public static float m13892kk(byte[] bArr, int i, boolean z) {
        return Float.intBitsToFloat(m13894x1(bArr, i, z));
    }

    /* JADX INFO: renamed from: to */
    public static long m13893to(byte[] bArr, int i, boolean z) {
        return m13883k4(bArr, i, 8, z);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m13894x1(byte[] bArr, int i, boolean z) {
        return (int) m13883k4(bArr, i, 4, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13878k4(float f, byte[] bArr, int i, boolean z) {
        return m13880k4(Float.floatToIntBits(f), bArr, i, 4, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13879k4(int i, byte[] bArr, int i2, boolean z) {
        return m13880k4(i, bArr, i2, 4, z);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m13880k4(long j, byte[] bArr, int i, int i2, boolean z) {
        int i3 = i / 8;
        long j2 = 255;
        int i4 = i % 8;
        if (z) {
            if (i4 != 0) {
                throw new NotImplementedException();
            }
            long j3 = j;
            for (int i5 = 0; i5 < i2; i5++) {
                bArr[i3 + i5] = (byte) (j3 & 255);
                j3 >>>= 8;
            }
        } else if (i4 == 0) {
            long j4 = j;
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr[i3 + i6] = (byte) (j4 & 255);
                j4 >>>= 8;
            }
        } else {
            int i7 = 8 - i4;
            byte b = (byte) (255 << i7);
            byte b2 = (byte) (255 >>> i4);
            int i8 = i2 - 1;
            long j5 = j;
            while (i8 >= 0) {
                int i9 = i3 + i8;
                int i10 = i9 + 1;
                long j6 = j2;
                byte b3 = (byte) (j5 & j6);
                byte b4 = (byte) (bArr[i10] & b2);
                byte b5 = (byte) (bArr[i9] & b);
                bArr[i10] = (byte) (b4 | (b3 << i7));
                bArr[i9] = (byte) (((b3 & 255) >> i4) | b5);
                j5 >>>= 8;
                i8--;
                j2 = j6;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13881k4(long j, byte[] bArr, int i, boolean z) {
        return m13880k4(j, bArr, i, 8, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13882k4(short s, byte[] bArr, int i, boolean z) {
        return m13880k4(s, bArr, i, 2, z);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m13883k4(byte[] bArr, int i, int i2, boolean z) {
        long j = 0;
        if (z) {
            if (i % 8 != 0) {
                throw new NotImplementedException();
            }
            int i3 = i / 8;
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                j = (j << 8) | ((long) (bArr[i3 + i4] & 255));
            }
            return j;
        }
        int i5 = i % 8;
        int i6 = 0;
        if (i5 == 0) {
            int i7 = i / 8;
            while (i6 < i2) {
                j = (j << 8) | ((long) (bArr[i7 + i6] & 255));
                i6++;
            }
            return j;
        }
        int i8 = 8 - i5;
        int i9 = i / 8;
        while (i6 < i2) {
            int i10 = i9 + i6;
            j = (j << 8) | ((long) (((byte) (bArr[i10] << i5)) & 255)) | ((long) (((byte) ((bArr[i10 + 1] & 255) >> i8)) & 255));
            i6++;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[PHI: r2
      0x0041: PHI (r2v11 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String), (r2v13 java.lang.String) binds: [B:36:0x0075, B:31:0x005f, B:24:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m13884k4(byte[] bArr, x1 x1Var, kk kkVar, boolean z, k4 k4Var) {
        String string;
        String hexString;
        if (bArr == null) {
            return "<NULL>";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = z || k4Var == k4.f9580x1 || k4Var == k4.f9579kk;
        if (z2) {
            stringBuffer.append("{ ");
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (i != 0) {
                stringBuffer.append(kkVar.m13896k4());
            }
            if (x1.f9589k4 == x1Var) {
                hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    stringBuffer.append("0");
                }
                string = hexString.toUpperCase();
                stringBuffer.append(string);
            } else if (x1.f9592x1 == x1Var) {
                stringBuffer.append("0x");
                hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                }
                string = hexString.toUpperCase();
                stringBuffer.append(string);
            } else if (x1.f9590kk == x1Var) {
                stringBuffer.append("(byte)0x");
                hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                }
                string = hexString.toUpperCase();
                stringBuffer.append(string);
            } else if (x1.f9591to == x1Var) {
                string = Long.toString(b);
                stringBuffer.append(string);
            }
        }
        if (z2) {
            stringBuffer.append(" }");
        }
        String strM13895k4 = k4Var.m13895k4();
        if (strM13895k4 == null || "".equals(strM13895k4)) {
            return stringBuffer.toString();
        }
        return strM13895k4.replace("${0}", "" + bArr.length).replace("${1}", "" + (bArr.length * 8)).replace("${2}", stringBuffer.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public static short m13885k4(byte[] bArr, int i, boolean z) {
        return (short) m13883k4(bArr, i, 2, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13886k4(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13887k4(double d, boolean z) {
        byte[] bArr = new byte[8];
        m13877k4(d, bArr, 0, z);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13888k4(float f, boolean z) {
        byte[] bArr = new byte[4];
        m13878k4(f, bArr, 0, z);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13889k4(int i, boolean z) {
        byte[] bArr = new byte[4];
        m13879k4(i, bArr, 0, z);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13890k4(long j, boolean z) {
        byte[] bArr = new byte[8];
        m13881k4(j, bArr, 0, z);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13891k4(short s, boolean z) {
        byte[] bArr = new byte[2];
        m13882k4(s, bArr, 0, z);
        return bArr;
    }
}
