package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYW<T extends zzZ4M> implements zzZ4R<T> {
    private final boolean zzW8v;
    private final zzZ zzW8w;
    private final boolean zzWjQ;
    private final T zzWjS;
    private final zzYV1 zzWjT;
    private final zzYUX zzWkt;

    public interface zzZ {
        void zzZ(zzYV1 zzyv1, SecureRandom secureRandom);
    }

    public zzYYW(zzYV1 zzyv1, zzYUX zzyux, T t, zzZ zzz) {
        this(false, zzyv1, zzyux, t, zzz, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ50
    /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
    public zzYYW<T> zzX(SecureRandom secureRandom) {
        this.zzW8w.zzZ(this.zzWjT, secureRandom);
        return new zzYYW<>(true, this.zzWjT, this.zzWkt, this.zzWjS, this.zzW8w, this.zzW8v);
    }

    private byte[] zzZ(BigInteger[] bigIntegerArr) throws IOException {
        zzYV1 zzyv1 = this.zzWjT;
        if ((zzyv1 instanceof zzYYG) || (zzyv1 instanceof zzYXF)) {
            byte[] bArr = new byte[64];
            byte[] byteArray = bigIntegerArr[0].toByteArray();
            byte[] byteArray2 = bigIntegerArr[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr, 64 - byteArray.length, byteArray.length);
                return bArr;
            }
            System.arraycopy(byteArray, 1, bArr, 64 - (byteArray.length - 1), byteArray.length - 1);
            return bArr;
        }
        if (!(zzyv1 instanceof zzYYR)) {
            zzZDJ zzzdj = new zzZDJ();
            zzzdj.zzZ(new zzZDD(bigIntegerArr[0]));
            zzzdj.zzZ(new zzZDD(bigIntegerArr[1]));
            return new zzZC2(zzzdj).getEncoded("DER");
        }
        byte[] byteArray3 = bigIntegerArr[0].toByteArray();
        byte[] byteArray4 = bigIntegerArr[1].toByteArray();
        int length = (byteArray3.length > byteArray4.length ? byteArray3.length : byteArray4.length) * 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(byteArray4, 0, bArr2, (length / 2) - byteArray4.length, byteArray4.length);
        System.arraycopy(byteArray3, 0, bArr2, length - byteArray3.length, byteArray3.length);
        if (this.zzW8v) {
            zzYYU.zzXf(bArr2);
        }
        return new zzZC6(bArr2).getEncoded();
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

    public zzYYW(zzYV1 zzyv1, zzYUX zzyux, T t, zzZ zzz, byte b) {
        this(false, zzyv1, zzyux, t, zzz, true);
    }

    private zzYYW(boolean z, zzYV1 zzyv1, zzYUX zzyux, T t, zzZ zzz, boolean z2) {
        this.zzWjQ = z;
        this.zzWjT = zzyv1;
        this.zzWkt = zzyux;
        this.zzWjS = t;
        this.zzW8w = zzz;
        this.zzW8v = z2;
    }
}
