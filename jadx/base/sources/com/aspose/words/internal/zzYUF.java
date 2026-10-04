package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYUF implements zzYUE, zzYV8 {
    private final zzYV8 zzW67;

    public zzYUF(zzYV8 zzyv8) {
        this.zzW67 = zzyv8;
    }

    public final zzYV8 zzXCK() {
        return this.zzW67;
    }

    @Override // com.aspose.words.internal.zzYUE
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws zzYV0 {
        if (i3 + i2 > bArr2.length) {
            throw new zzYV0("output buffer too short");
        }
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new zzYV0("input buffer too small");
        }
        while (i < i4) {
            bArr2[i3] = zzd(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    public abstract byte zzd(byte b);

    @Override // com.aspose.words.internal.zzYUE
    public final byte zze(byte b) {
        return zzd(b);
    }
}
