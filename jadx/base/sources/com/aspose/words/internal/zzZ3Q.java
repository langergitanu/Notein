package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3Q extends zzZ3J<zzZ33> implements zzZ5R {
    private zzYLX zzWln;

    public zzZ3Q(zzZ5W zzz5w, zzZ2Y<zzZ33> zzz2y, zzYLX zzylx) {
        super(zzz5w, zzz2y);
        this.zzWln = zzZ2X.zzZ(zzXGz().zzXGk().zzXHv(), zzylx);
    }

    private zzYLX zzX(zzZ7D zzz7d) {
        try {
            byte[] bArrZzXL5 = zzZD9.zzYz(zzz7d.zzXHI()).zzXL5();
            byte[] bArr = new byte[32];
            byte[] bArr2 = new byte[32];
            for (int i = 0; i != 32; i++) {
                bArr[i] = bArrZzXL5[31 - i];
            }
            for (int i2 = 0; i2 != 32; i2++) {
                bArr2[i2] = bArrZzXL5[63 - i2];
            }
            return zzXGz().zzXGk().zzXHv().zzY(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("error recovering public key: ")), e);
        }
    }

    private static void zzZ(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3Q)) {
            return false;
        }
        zzZ3Q zzz3q = (zzZ3Q) obj;
        return this.zzWln.zzU(zzz3q.zzWln) && zzXGz().equals(zzz3q.zzXGz());
    }

    public final byte[] getEncoded() {
        BigInteger bigInteger = this.zzWln.zzXzn().toBigInteger();
        BigInteger bigInteger2 = this.zzWln.zzXzm().toBigInteger();
        byte[] bArr = new byte[64];
        zzZ(bArr, 0, bigInteger);
        zzZ(bArr, 32, bigInteger2);
        if (zzXGz().zzXJw() == null) {
            return zzZ2X.zzZ(new zzZ86(zzZAE.zzWEQ), new zzZC6(bArr));
        }
        return zzZ2X.zzZ(new zzZ86(zzZAE.zzWEQ, new zzZA9(zzXGz().zzXJw(), zzXGz().zzXJv(), zzXGz().zzXJx())), new zzZC6(bArr));
    }

    public final int hashCode() {
        return zzXGz().hashCode() + (this.zzWln.hashCode() * 31);
    }

    public final zzYLX zzXGA() {
        return this.zzWln;
    }

    public zzZ3Q(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzZAE.zzWEQ, zzz7d.zzXHJ());
        this.zzWln = zzZ2X.zzZ(zzXGz().zzXGk().zzXHv(), zzX(zzz7d));
    }
}
