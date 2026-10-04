package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYA implements zzYUI {
    private zzYYB zzW7T;
    private zzYYC zzW7U;
    private boolean zzW7V;
    private final zzZ zzW7W = new zzZ(0);

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) throws IOException {
        this.zzW7W.write(b);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) {
        zzYYB zzyyb;
        if (this.zzW7V || (zzyyb = this.zzW7T) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.zzW7W.zzZ(zzyyb, bArr);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() {
        zzYYC zzyyc;
        if (!this.zzW7V || (zzyyc = this.zzW7U) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.zzW7W.zzZ(zzyyc, this.zzW7T);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW7V = z;
        if (z) {
            zzYYC zzyyc = (zzYYC) zzyv3;
            this.zzW7U = zzyyc;
            this.zzW7T = zzyyc.zzXDz();
        } else {
            this.zzW7U = null;
            this.zzW7T = (zzYYB) zzyv3;
        }
        this.zzW7W.reset();
    }

    public static class zzZ extends ByteArrayOutputStream {
        private final zzYIE zzW7Y;

        private zzZ() {
            this.zzW7Y = new zzYIE() { // from class: com.aspose.words.internal.zzYYA.zzZ.1
                @Override // com.aspose.words.internal.zzYIE
                public final zzYUX zzXDy() {
                    return zzYW6.zzZ(zzZ0P.zzZ.zzWdD);
                }
            };
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            zzYGU.zzZP(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).count = 0;
        }

        public final synchronized byte[] zzZ(zzYYC zzyyc, zzYYB zzyyb) {
            byte[] bArr;
            bArr = new byte[64];
            zzyyc.zzZ(zzyyb, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, bArr);
            reset();
            return bArr;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        public final synchronized boolean zzZ(zzYYB zzyyb, byte[] bArr) {
            boolean zZzW;
            zZzW = this.zzW7Y.zzW(bArr, zzyyb.getEncoded(), ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
            reset();
            return zZzW;
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) throws IOException {
        this.zzW7W.write(bArr, i, i2);
    }
}
