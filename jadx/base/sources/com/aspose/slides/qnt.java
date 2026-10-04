package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class qnt {

    /* JADX INFO: renamed from: k4 */
    private long f48365k4;

    /* JADX INFO: renamed from: x1 */
    private long f48366x1;

    public qnt(long j, long j2) {
        this.f48365k4 = j;
        this.f48366x1 = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public long m69713k4(List<C0899df> list, long j, byte[] bArr) {
        long[] jArr = {j};
        m69712k4(list, jArr, bArr);
        return C13760l2.m64251k4(list, (byte) 1, -27273042329608L, C13760l2.m64251k4(list, (byte) 0, jArr[0], -27273042329602L, this.f48365k4), 0L);
    }

    /* JADX INFO: renamed from: kk */
    public long m69714kk(List<C0899df> list, long j, byte[] bArr) {
        return C13760l2.m64251k4(list, (byte) 0, j, -27273042329602L, this.f48365k4);
    }

    /* JADX INFO: renamed from: to */
    public long m69715to(List<C0899df> list, long j, byte[] bArr) {
        return C13760l2.m64251k4(list, (byte) 0, j, -27273042329603L, this.f48366x1);
    }

    /* JADX INFO: renamed from: x1 */
    public long m69716x1(List<C0899df> list, long j, byte[] bArr) {
        long[] jArr = {j};
        m69712k4(list, jArr, bArr);
        return C13760l2.m64251k4(list, (byte) 1, -27273042329609L, C13760l2.m64251k4(list, (byte) 0, jArr[0], -27273042329603L, this.f48366x1), 0L);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69712k4(List<C0899df> list, long[] jArr, byte[] bArr) {
        int i;
        byte b;
        long j = jArr[0];
        if (j < -27273042329600L && (i = (int) ((-27273042329601L) - j)) < bArr.length && (b = (byte) (bArr[i] & 15)) != 0) {
            byte b2 = (byte) (b & 3);
            byte b3 = (byte) (b & 12);
            if (b2 != 0) {
                long jM64251k4 = C13760l2.m64251k4(list, (byte) 3, C13760l2.m64251k4(list, (byte) 1, -27273042329602L, 0L, -27273042329603L), C13760l2.m64251k4(list, (byte) 0, -27273042329603L, 1L, -27273042329602L), 1L);
                if (b2 == 1) {
                    jArr[0] = C13760l2.m64251k4(list, (byte) 0, jArr[0], jM64251k4, 1L);
                } else {
                    long j2 = this.f48365k4;
                    if (b2 == 2) {
                        jArr[0] = C13760l2.m64251k4(list, (byte) 1, this.f48365k4, 0L, C13760l2.m64251k4(list, (byte) 0, C13760l2.m64251k4(list, (byte) 1, j2, 0L, jArr[0]), jM64251k4, 1L));
                    } else {
                        long jM64251k42 = C13760l2.m64251k4(list, (byte) 0, j2, 1L, 2L);
                        jArr[0] = C13760l2.m64251k4(list, (byte) 1, C13760l2.m64251k4(list, (byte) 0, C13760l2.m64251k4(list, (byte) 1, jArr[0], 0L, jM64251k42), jM64251k4, 1L), jM64251k42, 0L);
                    }
                }
            }
            if (b3 != 0) {
                long jM64251k43 = C13760l2.m64251k4(list, (byte) 3, C13760l2.m64251k4(list, (byte) 1, -27273042329603L, 0L, -27273042329602L), C13760l2.m64251k4(list, (byte) 0, -27273042329602L, 1L, -27273042329603L), 1L);
                if (b3 == 4) {
                    jArr[0] = C13760l2.m64251k4(list, (byte) 0, jArr[0], jM64251k43, 1L);
                    return;
                }
                long j3 = this.f48366x1;
                if (b3 == 8) {
                    jArr[0] = C13760l2.m64251k4(list, (byte) 1, this.f48366x1, 0L, C13760l2.m64251k4(list, (byte) 0, C13760l2.m64251k4(list, (byte) 1, j3, 0L, jArr[0]), jM64251k43, 1L));
                } else {
                    long jM64251k44 = C13760l2.m64251k4(list, (byte) 0, j3, 1L, 2L);
                    jArr[0] = C13760l2.m64251k4(list, (byte) 1, C13760l2.m64251k4(list, (byte) 0, C13760l2.m64251k4(list, (byte) 1, jArr[0], 0L, jM64251k44), jM64251k43, 1L), jM64251k44, 0L);
                }
            }
        }
    }
}
