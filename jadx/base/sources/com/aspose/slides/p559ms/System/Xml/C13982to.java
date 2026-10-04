package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13982to {
    /* JADX INFO: renamed from: k4 */
    private static int m65916k4(byte[] bArr, int i, int i2, char[] cArr) {
        int length = cArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = i4 + 1;
            cArr[i4] = "0123456789ABCDEF".charAt((b & 255) >> 4);
            if (i6 == length) {
                return i6;
            }
            i4 += 2;
            cArr[i6] = "0123456789ABCDEF".charAt(b & 15);
            if (i4 == length) {
                return i4;
            }
            i3++;
            i = i5;
        }
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65917k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inArray");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offsetIn");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        char[] cArr = new char[i2 * 2];
        return C14113y2.m67406k4(cArr, 0, m65916k4(bArr, i, i2, cArr));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m65918k4(byte[] bArr, int i, int i2, AbstractC13958qb abstractC13958qb) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        int i3 = i2 * 2;
        if (i3 >= 128) {
            i3 = 128;
        }
        char[] cArr = new char[i3];
        int i4 = i + i2;
        while (i < i4) {
            int i5 = 64;
            if (i2 < 64) {
                i5 = i2;
            }
            abstractC13958qb.mo21891a_(cArr, 0, m65916k4(bArr, i, i5, cArr));
            i += i5;
            i2 -= i5;
        }
    }
}
