package com.aspose.slides.internal.p385rr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.rr.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10052k4 {
    /* JADX INFO: renamed from: k4 */
    public static void m49679k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > bArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49680k4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49681k4(int[] iArr, int i, int i2) {
        if (iArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > iArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            iArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49682k4(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        System.arraycopy(iArr, i / 4, iArr2, i2 / 4, i3 / 4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49683k4(long[] jArr, int i, int i2) {
        if (jArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > jArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            jArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m49684k4(int i) {
        return new int[i];
    }
}
