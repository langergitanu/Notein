package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRS extends zzYRQ {
    public zzYRS(zzYV8 zzyv8, boolean z) {
        super(zzyv8, zzYRQ.zzVXv, z);
    }

    @Override // com.aspose.words.internal.zzYRQ, com.aspose.words.internal.zzYUC
    public final /* bridge */ /* synthetic */ void zzZ(boolean z, zzYV3 zzyv3) {
        super.zzZ(z, zzyv3);
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzu(byte[] bArr, int i, int i2) throws zzYUT {
        if (this.zzW8i) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i3 = this.zzVXs;
        int i4 = i2 / i3;
        if (i3 * i4 != i2) {
            throw new zzYUT(C21023OooO0Oo.OooO0OO(" bytes", this.zzVXs, new StringBuilder("unwrap data must be a multiple of ")));
        }
        byte[] bArr2 = this.f51256iv;
        byte[] bArr3 = new byte[i2 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr2.length);
        byte[] bArr5 = this.f51256iv;
        System.arraycopy(bArr, bArr5.length, bArr3, 0, i2 - bArr5.length);
        zzZ(i4, bArr3, bArr4);
        if (zzYGU.zzo(bArr4, this.f51256iv)) {
            return bArr3;
        }
        throw new zzYUT("checksum failed");
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzv(byte[] bArr, int i, int i2) {
        if (!this.zzW8i) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i3 = this.zzVXs;
        int i4 = i2 / i3;
        if (i3 * i4 != i2) {
            throw new zzYV0(C21023OooO0Oo.OooO0OO(" bytes", this.zzVXs, new StringBuilder("wrap data must be a multiple of ")));
        }
        byte[] bArr2 = this.f51256iv;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.f51256iv.length, i2);
        return zzS(i4, bArr3);
    }
}
