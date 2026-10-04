package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY6 implements zzYUI {
    private zzYY7 zzW7M;
    private zzYY8 zzW7N;
    private final byte[] zzW7O;
    private final zzZ zzW7P = new zzZ(0);
    private boolean zzW7V;

    public zzYY6(byte[] bArr) {
        this.zzW7O = zzYGU.zzVI(bArr);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) throws IOException {
        this.zzW7P.write(b);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) {
        zzYY7 zzyy7;
        if (this.zzW7V || (zzyy7 = this.zzW7M) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.zzW7P.zzZ(zzyy7, this.zzW7O, bArr);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() {
        zzYY8 zzyy8;
        if (!this.zzW7V || (zzyy8 = this.zzW7N) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.zzW7P.zzZ(zzyy8, this.zzW7M, this.zzW7O);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW7V = z;
        if (z) {
            zzYY8 zzyy8 = (zzYY8) zzyv3;
            this.zzW7N = zzyy8;
            this.zzW7M = zzyy8.zzXDx();
        } else {
            this.zzW7N = null;
            this.zzW7M = (zzYY7) zzyv3;
        }
        this.zzW7P.reset();
    }

    public static class zzZ extends ByteArrayOutputStream {
        private final zzYID zzW7R;

        private zzZ() {
            this.zzW7R = new zzYID() { // from class: com.aspose.words.internal.zzYY6.zzZ.1
                @Override // com.aspose.words.internal.zzYID
                public final zzYUB zzXDw() {
                    return (zzYUB) zzYW6.zzZ(zzZ0P.zzZ.zzWdo);
                }
            };
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            zzYGU.zzZP(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).count = 0;
        }

        public final synchronized byte[] zzZ(zzYY8 zzyy8, zzYY7 zzyy7, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            zzyy8.zzZ(zzyy7, bArr, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, bArr2);
            reset();
            return bArr2;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        public final synchronized boolean zzZ(zzYY7 zzyy7, byte[] bArr, byte[] bArr2) {
            boolean zZzZ;
            zZzZ = this.zzW7R.zzZ(bArr2, zzyy7.getEncoded(), bArr, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
            reset();
            return zZzZ;
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) throws IOException {
        this.zzW7P.write(bArr, i, i2);
    }
}
