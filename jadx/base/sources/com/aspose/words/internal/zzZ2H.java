package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2H<T extends zzZ4M> extends zzZ0V<T> {
    private final T zzWjS;
    private final zzYV1 zzWjT;
    private final zzYUX zzWkt;

    public zzZ2H(zzYV1 zzyv1, zzYUX zzyux, T t) {
        this.zzWjT = zzyv1;
        this.zzWkt = zzyux;
        this.zzWjS = t;
    }

    private static BigInteger[] zzX8(byte[] bArr) throws IOException {
        zzZD4 zzzd4 = (zzZD4) zzZD5.zzXo(bArr);
        if (zzzd4.size() != 2) {
            throw new IOException("malformed signature");
        }
        if (zzYGU.zzp(bArr, zzzd4.getEncoded("DER"))) {
            return new BigInteger[]{zzZDD.zzYB(zzzd4.zzg6(0)).zzXKZ(), zzZDD.zzYB(zzzd4.zzg6(1)).zzXKZ()};
        }
        throw new IOException("malformed signature");
    }

    @Override // com.aspose.words.internal.zzZ4P
    public final zzZ41 zzXGN() {
        return new zzYU6(this.zzWkt);
    }

    @Override // com.aspose.words.internal.zzZ4P
    public final boolean zzXh(byte[] bArr) throws zzZ5C {
        try {
            BigInteger[] bigIntegerArrZzX8 = zzX8(bArr);
            byte[] bArr2 = new byte[this.zzWkt.zzQI()];
            this.zzWkt.doFinal(bArr2, 0);
            return this.zzWjT.zzZ(bArr2, bigIntegerArrZzX8[0], bigIntegerArrZzX8[1]);
        } catch (Exception e) {
            throw new zzZ5C(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to process signature: ")), e);
        }
    }
}
