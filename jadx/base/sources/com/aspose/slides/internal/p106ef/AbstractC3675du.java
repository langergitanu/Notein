package com.aspose.slides.internal.p106ef;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4112yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.du */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3675du {

    /* JADX INFO: renamed from: k4 */
    protected static int f10193k4 = 10;

    /* JADX INFO: renamed from: x1 */
    private C4112yj f10194x1;

    public AbstractC3675du(C4112yj c4112yj) {
        m14876k4(c4112yj);
    }

    /* JADX INFO: renamed from: du */
    public C4112yj m14874du() {
        return this.f10194x1;
    }

    /* JADX INFO: renamed from: k4 */
    public C4090du m14875k4(long[] jArr) {
        int i;
        byte b;
        C4090du c4090du = new C4090du();
        byte[] bArr = new byte[33];
        int[] iArr = new int[257];
        int[] iArr2 = new int[257];
        for (int i2 = 0; i2 < 257; i2++) {
            iArr2[i2] = -1;
        }
        jArr[256] = 1;
        while (true) {
            long j = LocationRequestCompat.PASSIVE_INTERVAL;
            int i3 = -1;
            long j2 = Long.MAX_VALUE;
            for (int i4 = 0; i4 <= 256; i4++) {
                long j3 = jArr[i4];
                if (j3 != 0 && j3 <= j2) {
                    i3 = i4;
                    j2 = j3;
                }
            }
            int i5 = -1;
            for (int i6 = 0; i6 <= 256; i6++) {
                long j4 = jArr[i6];
                if (j4 != 0 && j4 <= j && i6 != i3) {
                    i5 = i6;
                    j = j4;
                }
            }
            if (i5 < 0) {
                break;
            }
            jArr[i3] = jArr[i3] + jArr[i5];
            jArr[i5] = 0;
            iArr[i3] = iArr[i3] + 1;
            while (true) {
                int i7 = iArr2[i3];
                if (i7 < 0) {
                    break;
                }
                iArr[i7] = iArr[i7] + 1;
                i3 = i7;
            }
            iArr2[i3] = i5;
            iArr[i5] = iArr[i5] + 1;
            while (true) {
                i5 = iArr2[i5];
                if (i5 >= 0) {
                    iArr[i5] = iArr[i5] + 1;
                }
            }
        }
        for (int i8 = 0; i8 <= 256; i8++) {
            int i9 = iArr[i8];
            if (i9 != 0) {
                bArr[i9] = (byte) (bArr[i9] + 1);
            }
        }
        int i10 = 32;
        while (i10 > 16) {
            while ((bArr[i10] & 255) > 0) {
                int i11 = i10 - 2;
                while ((bArr[i11] & 255) == 0) {
                    i11--;
                }
                bArr[i10] = (byte) ((bArr[i10] & 255) - 2);
                int i12 = i10 - 1;
                bArr[i12] = (byte) (bArr[i12] + 1);
                int i13 = i11 + 1;
                bArr[i13] = (byte) ((bArr[i13] & 255) + 2);
                bArr[i11] = (byte) (bArr[i11] - 1);
            }
            i10--;
        }
        while (true) {
            b = bArr[i10];
            if ((b & 255) != 0) {
                break;
            }
            i10--;
        }
        bArr[i10] = (byte) (b - 1);
        System.arraycopy(bArr, 0, c4090du.m16280k4(), 0, c4090du.m16280k4().length);
        int i14 = 0;
        for (i = 1; i <= 32; i++) {
            for (int i15 = 0; i15 <= 255; i15++) {
                if (iArr[i15] == i) {
                    c4090du.m16274du()[i14] = (byte) i15;
                    i14++;
                }
            }
        }
        c4090du.m16276fa();
        return c4090du;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo14877k4(C4103to[] c4103toArr);

    /* JADX INFO: renamed from: k4 */
    public abstract C4090du[] mo14878k4();

    /* JADX INFO: renamed from: kk */
    public abstract void mo14879kk();

    /* JADX INFO: renamed from: to */
    public abstract void mo14880to();

    /* JADX INFO: renamed from: x1 */
    public abstract void mo14881x1();

    /* JADX INFO: renamed from: x1 */
    public abstract void mo14882x1(C4103to[] c4103toArr);

    /* JADX INFO: renamed from: k4 */
    public void m14876k4(C4112yj c4112yj) {
        this.f10194x1 = c4112yj;
    }
}
