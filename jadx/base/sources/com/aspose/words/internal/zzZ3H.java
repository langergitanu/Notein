package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3H extends zzZ3J<zzZ2Z> implements zzZ5R {
    private BigInteger zzWlv;

    public zzZ3H(zzZ5W zzz5w, zzZ2Y<zzZ2Z> zzz2y, BigInteger bigInteger) {
        super(zzz5w, zzz2y);
        this.zzWlv = bigInteger;
    }

    private static BigInteger zzY(zzZ7D zzz7d) {
        try {
            byte[] bArrZzXL5 = zzZD9.zzYz(zzz7d.zzXHI()).zzXL5();
            byte[] bArr = new byte[bArrZzXL5.length];
            for (int i = 0; i != bArrZzXL5.length; i++) {
                bArr[i] = bArrZzXL5[(bArrZzXL5.length - 1) - i];
            }
            return new BigInteger(1, bArr);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3H)) {
            return false;
        }
        zzZ3H zzz3h = (zzZ3H) obj;
        return this.zzWlv.equals(zzz3h.zzWlv) && zzXGz().equals(zzz3h.zzXGz());
    }

    public final byte[] getEncoded() {
        byte[] byteArray = this.zzWlv.toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        if (zzXGz().zzXJw() != null) {
            return zzZ2X.zzZ(new zzZ86(zzZAE.zzWER, new zzZA9(zzXGz().zzXJw(), zzXGz().zzXJv(), zzXGz().zzXJx())), new zzZC6(bArr));
        }
        return zzZ2X.zzZ(new zzZ86(zzZAE.zzWER), new zzZC6(bArr));
    }

    public final BigInteger getY() {
        return this.zzWlv;
    }

    public final int hashCode() {
        return zzXGz().hashCode() + (this.zzWlv.hashCode() * 31);
    }

    public zzZ3H(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzZAE.zzWER, zzz7d.zzXHJ());
        this.zzWlv = zzY(zzz7d);
    }
}
