package com.huawei.hms.hatool;

/* JADX INFO: renamed from: com.huawei.hms.hatool.p0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18013p0 {

    /* JADX INFO: renamed from: a */
    public byte[] f53904a;

    /* JADX INFO: renamed from: b */
    public int f53905b = 0;

    public C18013p0(int i) {
        this.f53904a = null;
        this.f53904a = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    public void m77498a(byte[] bArr, int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = this.f53904a;
        int length = bArr2.length;
        int i2 = this.f53905b;
        if (length - i2 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(bArr, 0, bArr3, this.f53905b, i);
            this.f53904a = bArr3;
        }
        this.f53905b += i;
    }

    /* JADX INFO: renamed from: b */
    public int m77500b() {
        return this.f53905b;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m77499a() {
        int i = this.f53905b;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f53904a, 0, bArr, 0, i);
        return bArr;
    }
}
