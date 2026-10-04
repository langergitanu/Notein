package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYS4 implements zzYV3 {

    /* JADX INFO: renamed from: iv */
    private byte[] f51257iv;
    private zzYV3 zzVXO;

    public zzYS4(zzYV3 zzyv3, byte[] bArr) {
        this(zzyv3, bArr, 0, bArr.length);
    }

    public final byte[] getIV() {
        return this.f51257iv;
    }

    public final zzYV3 zzXC6() {
        return this.zzVXO;
    }

    public zzYS4(zzYV3 zzyv3, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f51257iv = bArr2;
        this.zzVXO = zzyv3;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
