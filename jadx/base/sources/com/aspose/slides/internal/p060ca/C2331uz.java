package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.uz */
/* JADX INFO: loaded from: classes3.dex */
class C2331uz {

    /* JADX INFO: renamed from: k4 */
    private byte[] f8074k4;

    /* JADX INFO: renamed from: x1 */
    private int f8075x1;

    public C2331uz(int i) {
        this.f8074k4 = new byte[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11552k4(byte b) {
        byte[] bArr = this.f8074k4;
        int i = this.f8075x1;
        this.f8075x1 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11554x1() {
        return this.f8075x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11553k4() {
        return this.f8074k4;
    }
}
