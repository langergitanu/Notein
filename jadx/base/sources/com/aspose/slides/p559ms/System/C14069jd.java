package com.aspose.slides.p559ms.System;

import com.aspose.slides.internal.p088dn.C3206x1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C14069jd {
    /* JADX INFO: renamed from: c5 */
    public static double m66764c5(byte[] bArr, int i) {
        return C3206x1.m13876du(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: du */
    public static int m66765du(byte[] bArr, int i) {
        return C3206x1.m13894x1(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: dy */
    public static float m66766dy(byte[] bArr, int i) {
        return C3206x1.m13892kk(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: h4 */
    public static long m66767h4(byte[] bArr, int i) {
        return C3206x1.m13893to(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: jd */
    public static String m66768jd(byte[] bArr, int i) {
        return m66771k4(bArr, i, bArr.length - i);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66769k4(byte[] bArr, int i) {
        return C3206x1.m13885k4(bArr, i << 3, true) & 65535;
    }

    /* JADX INFO: renamed from: kk */
    public static long m66779kk(byte[] bArr, int i) {
        return C3206x1.m13893to(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: m9 */
    public static char m66781m9(byte[] bArr, int i) {
        return (char) C3206x1.m13885k4(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: to */
    public static int m66782to(byte[] bArr, int i) {
        return C3206x1.m13885k4(bArr, i << 3, true);
    }

    /* JADX INFO: renamed from: x1 */
    public static long m66783x1(double d) {
        return m66767h4(m66773k4(d), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66770k4(byte[] bArr) {
        return m66768jd(bArr, 0);
    }

    /* JADX INFO: renamed from: kk */
    public static byte[] m66780kk(long j) {
        return C3206x1.m13890k4(j, true);
    }

    /* JADX INFO: renamed from: x1 */
    public static long m66784x1(byte[] bArr, int i) {
        return ((long) C3206x1.m13894x1(bArr, i << 3, true)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66771k4(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return C3206x1.m13884k4(bArr2, C3206x1.x1.f9589k4, C3206x1.kk.HYPHEN, false, C3206x1.k4.f9578k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m66785x1(int i) {
        return C3206x1.m13889k4(i, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66772k4(char c) {
        return m66778k4((short) c);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m66786x1(long j) {
        return C3206x1.m13890k4(j, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66773k4(double d) {
        return C3206x1.m13887k4(d, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66774k4(float f) {
        return C3206x1.m13888k4(f, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66775k4(int i) {
        return C3206x1.m13891k4((short) (i & 65535), true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66776k4(long j) {
        return C3206x1.m13889k4((int) (j & 4294967295L), true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66777k4(Boolean bool) {
        return new byte[]{bool.booleanValue() ? (byte) 1 : (byte) 0};
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m66778k4(short s) {
        return C3206x1.m13891k4(s, true);
    }
}
