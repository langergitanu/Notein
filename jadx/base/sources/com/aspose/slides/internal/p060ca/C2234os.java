package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.os */
/* JADX INFO: loaded from: classes3.dex */
class C2234os {

    /* JADX INFO: renamed from: du */
    private long f7699du;

    /* JADX INFO: renamed from: h4 */
    private long f7700h4;

    /* JADX INFO: renamed from: k4 */
    private int f7701k4;

    /* JADX INFO: renamed from: kk */
    private int[] f7702kk;

    /* JADX INFO: renamed from: to */
    private byte[] f7703to;

    /* JADX INFO: renamed from: x1 */
    private byte f7704x1;

    /* JADX INFO: renamed from: du */
    public final int[] m11201du() {
        return this.f7702kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m11202h4() {
        return this.f7703to;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m11203k4() {
        return this.f7699du;
    }

    /* JADX INFO: renamed from: kk */
    public final int m11210kk() {
        return this.f7701k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m11211to() {
        return this.f7704x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m11212x1() {
        return this.f7700h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11204k4(byte b) {
        this.f7704x1 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11213x1(long j) {
        this.f7700h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11205k4(int i) {
        this.f7701k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11206k4(int i, int[] iArr, int[] iArr2) {
        int i2 = i + 1;
        while (i2 < m11210kk() && m11201du()[i2] == 0) {
            i2++;
        }
        iArr2[0] = m11201du()[i2] - m11201du()[i];
        iArr[0] = m11201du()[i] - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11207k4(long j) {
        this.f7699du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11208k4(byte[] bArr) {
        this.f7703to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11209k4(int[] iArr) {
        this.f7702kk = iArr;
    }
}
