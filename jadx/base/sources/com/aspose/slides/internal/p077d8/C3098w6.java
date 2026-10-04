package com.aspose.slides.internal.p077d8;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.w6 */
/* JADX INFO: loaded from: classes3.dex */
class C3098w6 {

    /* JADX INFO: renamed from: k4 */
    BigInteger f9214k4;

    /* JADX INFO: renamed from: x1 */
    BigInteger f9215x1;

    public C3098w6(byte[] bArr, byte[] bArr2) {
        this.f9214k4 = new BigInteger(1, bArr);
        this.f9215x1 = new BigInteger(1, bArr2);
    }

    /* JADX INFO: renamed from: k4 */
    public BigInteger m13166k4() {
        return this.f9214k4;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m13167k4(byte[] bArr) {
        return (bArr == null || bArr.length < 1) ? new byte[0] : new BigInteger(1, bArr).modPow(this.f9215x1, this.f9214k4).toByteArray();
    }
}
