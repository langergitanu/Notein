package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wp */
/* JADX INFO: loaded from: classes3.dex */
class C2352wp {

    /* JADX INFO: renamed from: du */
    private byte f8159du;

    /* JADX INFO: renamed from: k4 */
    public long f8160k4;

    /* JADX INFO: renamed from: kk */
    public byte f8161kk;

    /* JADX INFO: renamed from: to */
    private byte[] f8162to;

    /* JADX INFO: renamed from: x1 */
    public long f8163x1;

    /* JADX INFO: renamed from: k4 */
    public final byte m11614k4(int i) {
        byte b = this.f8159du;
        if (b == 0) {
            return this.f8162to[i];
        }
        if (b != 3) {
            return (byte) 0;
        }
        long j = i;
        if (C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j - C7019kk.m27438h4(Long.valueOf(this.f8160k4), 10)), 11)), 10) < C7019kk.m27435du(Long.valueOf(this.f8163x1), 10)) {
            return this.f8161kk;
        }
        int length = this.f8162to.length;
        int i2 = 2;
        long j2 = 0;
        while (j >= C7019kk.m27435du(Long.valueOf(j2), 10)) {
            byte[] bArr = this.f8162to;
            byte b2 = bArr[i2];
            long jM27435du = C7019kk.m27435du(Integer.valueOf(C7019kk.m27462to(Integer.valueOf(C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[i2 + 1]), 6) << 8), 9)), 8) | C7019kk.m27462to(Integer.valueOf(C7019kk.m27457kk(Byte.valueOf(this.f8162to[i2 + 2]), 6)), 8)), 9);
            i2 += 3;
            if (j < C7019kk.m27435du(Long.valueOf(jM27435du), 10)) {
                this.f8160k4 = j2;
                this.f8163x1 = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du), 10) - C7019kk.m27435du(Long.valueOf(j2), 10)), 10);
                this.f8161kk = b2;
                return b2;
            }
            if (i2 >= length) {
                return (byte) 0;
            }
            j2 = jM27435du;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m11618x1() {
        return this.f8159du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11615k4(byte b) {
        this.f8159du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11616k4(byte[] bArr) {
        this.f8162to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11617k4() {
        return this.f8162to;
    }
}
