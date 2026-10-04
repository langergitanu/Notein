package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ca */
/* JADX INFO: loaded from: classes5.dex */
public class C14050ca {

    /* JADX INFO: renamed from: k4 */
    private int f47184k4;

    /* JADX INFO: renamed from: kk */
    private int[] f47185kk;

    /* JADX INFO: renamed from: x1 */
    private int f47186x1;

    public C14050ca() {
        this((int) System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: du */
    private int m66544du() {
        int i = this.f47184k4;
        int i2 = this.f47186x1;
        int i3 = i + 1;
        if (i3 >= 56) {
            i3 = 1;
        }
        int i4 = i2 + 1;
        int i5 = i4 < 56 ? i4 : 1;
        int[] iArr = this.f47185kk;
        int i6 = iArr[i3] - iArr[i5];
        if (i6 < 0) {
            i6 += Integer.MAX_VALUE;
        }
        iArr[i3] = i6;
        this.f47184k4 = i3;
        this.f47186x1 = i5;
        return i6;
    }

    /* JADX INFO: renamed from: to */
    private double m66545to() {
        int iM66544du = m66544du();
        if (m66544du() % 2 == 0) {
            iM66544du = -iM66544du;
        }
        return (((double) iM66544du) + 2.147483646E9d) / 4.294967293E9d;
    }

    /* JADX INFO: renamed from: k4 */
    public int m66546k4() {
        return m66544du();
    }

    /* JADX INFO: renamed from: kk */
    public double m66550kk() {
        return ((double) m66544du()) * 4.656612875245797E-10d;
    }

    /* JADX INFO: renamed from: x1 */
    public double m66551x1() {
        return m66550kk();
    }

    public C14050ca(int i) {
        this.f47185kk = new int[56];
        int iAbs = 161803398 - Math.abs(i);
        this.f47185kk[55] = iAbs;
        int i2 = 1;
        int i3 = iAbs;
        int i4 = 1;
        while (i2 < 55) {
            this.f47185kk[(i2 * 21) % 55] = i4;
            int i5 = i3 - i4;
            if (i5 < 0) {
                i5 += Integer.MAX_VALUE;
            }
            i2++;
            int i6 = i5;
            i3 = i4;
            i4 = i6;
        }
        for (int i7 = 1; i7 < 5; i7++) {
            for (int i8 = 1; i8 < 56; i8++) {
                int[] iArr = this.f47185kk;
                int i9 = iArr[i8] - iArr[((i8 + 30) % 55) + 1];
                iArr[i8] = i9;
                if (i9 < 0) {
                    iArr[i8] = i9 + Integer.MAX_VALUE;
                }
            }
        }
        this.f47184k4 = 0;
        this.f47186x1 = 21;
    }

    /* JADX INFO: renamed from: k4 */
    public int m66547k4(int i) {
        if (i >= 0) {
            return (int) (m66550kk() * ((double) i));
        }
        throw new ArgumentOutOfRangeException("maxValue", "Max value is less than min value.");
    }

    /* JADX INFO: renamed from: k4 */
    public int m66548k4(int i, int i2) {
        if (i > i2) {
            throw new ArgumentOutOfRangeException("minValue", "Min value is greater than max value.");
        }
        long j = i2 - i;
        return (j <= 2147483647L ? (int) (m66550kk() * j) : (int) (m66545to() * j)) + i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m66549k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (m66544du() % 256);
        }
    }
}
