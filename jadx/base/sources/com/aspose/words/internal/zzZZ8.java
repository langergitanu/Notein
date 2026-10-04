package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZ8 {
    BigInteger zzcv;
    BigInteger zzcw;

    public zzZZ8(byte[] bArr, byte[] bArr2) {
        this.zzcw = new BigInteger(1, bArr);
        this.zzcv = new BigInteger(1, bArr2);
    }

    public final BigInteger getExponent() {
        return this.zzcv;
    }

    public final BigInteger getModulus() {
        return this.zzcw;
    }

    public final byte[] zzZi(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? new byte[0] : new BigInteger(1, bArr).modPow(this.zzcv, this.zzcw).toByteArray();
    }
}
