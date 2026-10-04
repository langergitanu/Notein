package com.aspose.slides.internal.p525yi;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12826jd {

    /* JADX INFO: renamed from: k4 */
    private static volatile Random f42673k4;

    /* JADX INFO: renamed from: c5 */
    public static boolean m59625c5(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) <= 0;
    }

    /* JADX INFO: renamed from: du */
    public static BigInteger m59626du(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.mod(bigInteger2);
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m59627dy(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) < 0;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m59628h4(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) > 0;
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m59629jd(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.equals(bigInteger2);
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m59630k4(int i) {
        return new BigInteger(i, m59635k4());
    }

    /* JADX INFO: renamed from: kk */
    public static BigInteger m59638kk(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger2);
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m59639m9(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) >= 0;
    }

    /* JADX INFO: renamed from: to */
    public static BigInteger m59640to(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.divide(bigInteger2);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m59641x1(BigInteger bigInteger) {
        return bigInteger.intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m59631k4(long j) {
        return BigInteger.valueOf(j);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m59642x1(BigInteger bigInteger, long j) {
        return m59641x1(bigInteger.mod(BigInteger.valueOf(j)));
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m59632k4(BigInteger bigInteger, long j) {
        return bigInteger.multiply(BigInteger.valueOf(j));
    }

    /* JADX INFO: renamed from: x1 */
    public static BigInteger m59643x1(int i) {
        return BigInteger.probablePrime(i, m59635k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m59633k4(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.add(bigInteger2);
    }

    /* JADX INFO: renamed from: x1 */
    public static BigInteger m59644x1(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.subtract(bigInteger2);
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m59634k4(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static Random m59635k4() {
        if (f42673k4 == null) {
            f42673k4 = new SecureRandom();
        }
        return f42673k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m59636k4(BigInteger bigInteger, int i) {
        return bigInteger.equals(BigInteger.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59637k4(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
