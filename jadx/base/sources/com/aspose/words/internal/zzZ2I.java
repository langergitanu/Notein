package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2I<T extends zzZ4M> extends zzZ0W<T> {
    private final boolean zzWjQ;
    private final zzZ zzWjR;
    private final T zzWjS;
    private final zzYV1 zzWjT;
    private final zzYUX zzWkt;

    public interface zzZ {
        void zzZ(zzYV1 zzyv1, SecureRandom secureRandom);
    }

    public zzZ2I(zzYV1 zzyv1, zzYUX zzyux, T t, zzZ zzz) {
        this(false, zzyv1, zzyux, t, zzz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ0W, com.aspose.words.internal.zzZ50
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public zzZ2I<T> zzX(SecureRandom secureRandom) {
        this.zzWjR.zzZ(this.zzWjT, secureRandom);
        return new zzZ2I<>(true, this.zzWjT, this.zzWkt, this.zzWjS, this.zzWjR);
    }

    private static byte[] zzZ(BigInteger[] bigIntegerArr) throws IOException {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(bigIntegerArr[0]));
        zzzdj.zzZ(new zzZDD(bigIntegerArr[1]));
        return new zzZC2(zzzdj).getEncoded("DER");
    }

    @Override // com.aspose.words.internal.zzZ4S
    public final byte[] getSignature() throws zzZ4H {
        byte[] bArr = new byte[this.zzWkt.zzQI()];
        this.zzWkt.doFinal(bArr, 0);
        try {
            return zzZ(this.zzWjT.zzX6(bArr));
        } catch (Exception e) {
            throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to create signature: ")), e);
        }
    }

    @Override // com.aspose.words.internal.zzZ4S
    public final zzZ41 zzXGO() {
        if (this.zzWjQ) {
            return new zzYU6(this.zzWkt);
        }
        throw new zzZ51("Signer requires a SecureRandom to be attached before use");
    }

    private zzZ2I(boolean z, zzYV1 zzyv1, zzYUX zzyux, T t, zzZ zzz) {
        this.zzWjQ = z;
        this.zzWjT = zzyv1;
        this.zzWkt = zzyux;
        this.zzWjS = t;
        this.zzWjR = zzz;
    }
}
