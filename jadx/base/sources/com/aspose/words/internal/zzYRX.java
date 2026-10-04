package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRX implements zzYUI {
    private final zzYVC zzVXy;
    private boolean zzW7V;
    private final zzYUX zzWkt;
    private final zzZ86 zzWyM;

    public zzYRX(zzYVC zzyvc, zzYUX zzyux, zzZDA zzzda) {
        this.zzVXy = zzyvc;
        this.zzWkt = zzyux;
        this.zzWyM = new zzZ86(zzzda, zzZC8.zzWHS);
    }

    private void reset() {
        this.zzWkt.reset();
    }

    private byte[] zzVX(byte[] bArr) throws IOException {
        return new zzZ7X(this.zzWyM, bArr).getEncoded("DER");
    }

    public static boolean zzt(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == bArr.length) {
            return zzYGU.zzo(bArr, bArr2);
        }
        if (bArr2.length == bArr.length - 2) {
            bArr[1] = (byte) (bArr[1] - 2);
            byte b = (byte) (bArr[3] - 2);
            bArr[3] = b;
            int i = b + 4;
            int i2 = b + 6;
            int i3 = 0;
            for (int i4 = 0; i4 < bArr.length - i2; i4++) {
                i3 |= bArr2[i + i4] ^ bArr[i2 + i4];
            }
            for (int i5 = 0; i5 < i; i5++) {
                i3 |= bArr2[i5] ^ bArr[i5];
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) {
        this.zzWkt.update(b);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) throws zzZ5C {
        if (this.zzW7V) {
            throw new IllegalStateException("RsaDigestSigner not initialised for verification");
        }
        byte[] bArr2 = new byte[this.zzWkt.zzQI()];
        this.zzWkt.doFinal(bArr2, 0);
        try {
            return zzt(zzVX(bArr2), this.zzVXy.zzy(bArr, 0, bArr.length));
        } catch (Exception e) {
            throw new zzZ5C(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to process signature: ")), e);
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() throws zzYV0, zzYV2 {
        if (!this.zzW7V) {
            throw new IllegalStateException("RsaDigestSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[this.zzWkt.zzQI()];
        this.zzWkt.doFinal(bArr, 0);
        try {
            byte[] bArrZzVX = zzVX(bArr);
            return this.zzVXy.zzy(bArrZzVX, 0, bArrZzVX.length);
        } catch (IOException e) {
            throw new zzYV2(C21111o0ooOoO.OooO00o(e, new StringBuilder("unable to encode signature: ")), e);
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW7V = z;
        zzYT2 zzyt2 = zzyv3 instanceof zzYS3 ? (zzYT2) ((zzYS3) zzyv3).zzXC6() : (zzYT2) zzyv3;
        if (z && !zzyt2.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        }
        if (!z && zzyt2.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        reset();
        this.zzVXy.zzZ(z, zzyv3);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) {
        this.zzWkt.update(bArr, i, i2);
    }
}
