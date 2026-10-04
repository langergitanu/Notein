package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14069jd;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13611to {
    /* JADX INFO: renamed from: k4 */
    public static int m62789k4(byte[] bArr, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        if (i < 0 || i + 4 > bArr.length) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The index falls outside the bytes array.");
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: kk */
    public static double m62795kk(byte[] bArr, int i) {
        int i2;
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        if (i < 0 || (i2 = i + 4) > bArr.length) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The index falls outside the bytes array.");
        }
        return C14069jd.m66764c5(new byte[]{bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i2], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]}, 0);
    }

    /* JADX INFO: renamed from: to */
    public static short m62796to(byte[] bArr, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        if (i < 0 || i + 2 > bArr.length) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The index falls outside the bytes array.");
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: x1 */
    public static float m62797x1(byte[] bArr, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        if (i < 0 || i + 4 > bArr.length) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The index falls outside the bytes array.");
        }
        return C14069jd.m66766dy(new byte[]{bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]}, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62790k4(double d, byte[] bArr, int i) {
        byte[] bArrM66773k4 = C14069jd.m66773k4(d);
        bArr[i] = bArrM66773k4[7];
        bArr[i + 1] = bArrM66773k4[6];
        bArr[i + 2] = bArrM66773k4[5];
        bArr[i + 3] = bArrM66773k4[4];
        bArr[i + 4] = bArrM66773k4[3];
        bArr[i + 5] = bArrM66773k4[2];
        bArr[i + 6] = bArrM66773k4[1];
        bArr[i + 7] = bArrM66773k4[0];
    }

    /* JADX INFO: renamed from: x1 */
    public static void m62798x1(int i, byte[] bArr, int i2) {
        int i3 = i & 65535;
        bArr[i2] = (byte) (i3 >> 8);
        bArr[i2 + 1] = (byte) i3;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62791k4(float f, byte[] bArr, int i) {
        byte[] bArrM66774k4 = C14069jd.m66774k4(f);
        bArr[i] = bArrM66774k4[3];
        bArr[i + 1] = bArrM66774k4[2];
        bArr[i + 2] = bArrM66774k4[1];
        bArr[i + 3] = bArrM66774k4[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62792k4(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62793k4(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((r6 >> 24) & 255);
        bArr[i + 1] = (byte) ((r6 >> 16) & 255);
        bArr[i + 2] = (byte) ((r6 >> 8) & 255);
        bArr[i + 3] = (byte) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62794k4(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s >> 8);
        bArr[i + 1] = (byte) s;
    }
}
