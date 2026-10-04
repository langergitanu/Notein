package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzZ4M;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYV<T extends zzZ4M> implements zzZ4P<T> {
    private final boolean zzW8v;
    private final T zzWjS;
    private final zzYV1 zzWjT;
    private final zzYUX zzWkt;

    public zzYYV(zzYV1 zzyv1, zzYUX zzyux, T t) {
        this(zzyv1, zzyux, t, false);
    }

    private BigInteger[] zzX8(byte[] bArr) throws IOException {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        zzYV1 zzyv1 = this.zzWjT;
        if ((zzyv1 instanceof zzYYG) || (zzyv1 instanceof zzYXF)) {
            byte[] bArr2 = new byte[32];
            byte[] bArr3 = new byte[32];
            if (bArr.length != 64) {
                throw new IOException("malformed signature");
            }
            System.arraycopy(bArr, 0, bArr3, 0, 32);
            System.arraycopy(bArr, 32, bArr2, 0, 32);
            bigIntegerArr[0] = new BigInteger(1, bArr2);
            bigIntegerArr[1] = new BigInteger(1, bArr3);
            return bigIntegerArr;
        }
        if (zzyv1 instanceof zzYYR) {
            byte[] bArrZzXL5 = ((zzZD9) zzZD5.zzXo(bArr)).zzXL5();
            byte[] bArr4 = new byte[bArrZzXL5.length / 2];
            byte[] bArr5 = new byte[bArrZzXL5.length / 2];
            if (this.zzW8v) {
                zzYYU.zzXf(bArrZzXL5);
            }
            System.arraycopy(bArrZzXL5, 0, bArr5, 0, bArrZzXL5.length / 2);
            System.arraycopy(bArrZzXL5, bArrZzXL5.length / 2, bArr4, 0, bArrZzXL5.length / 2);
            return new BigInteger[]{new BigInteger(1, bArr4), new BigInteger(1, bArr5)};
        }
        zzZD4 zzzd4 = (zzZD4) zzZD5.zzXo(bArr);
        if (zzzd4.size() != 2) {
            throw new IOException("malformed signature");
        }
        if (!zzYGU.zzp(bArr, zzzd4.getEncoded("DER"))) {
            throw new IOException("malformed signature");
        }
        bigIntegerArr[0] = zzZDD.zzYB(zzzd4.zzg6(0)).zzXKZ();
        bigIntegerArr[1] = zzZDD.zzYB(zzzd4.zzg6(1)).zzXKZ();
        return bigIntegerArr;
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
        } catch (IOException e) {
            throw new zzZ5C(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to process signature: ")), e);
        }
    }

    public zzYYV(zzYV1 zzyv1, zzYUX zzyux, T t, boolean z) {
        this.zzWjT = zzyv1;
        this.zzWkt = zzyux;
        this.zzWjS = t;
        this.zzW8v = z;
    }
}
