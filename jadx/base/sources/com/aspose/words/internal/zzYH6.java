package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYH6 {

    /* JADX INFO: renamed from: dL */
    private zzYH5 f50864dL = new zzYH5(new zzYM7());

    public static class zzZ extends OutputStream {

        /* JADX INFO: renamed from: dW */
        private MessageDigest f50869dW;

        public zzZ(MessageDigest messageDigest) {
            this.f50869dW = messageDigest;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f50869dW.update(bArr, i, i2);
        }

        public final byte[] zzXI5() {
            return this.f50869dW.digest();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f50869dW.update(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f50869dW.update((byte) i);
        }
    }

    public final zzYHE zzXyt() throws zzYHB {
        return new zzYHE() { // from class: com.aspose.words.internal.zzYH6.1
            @Override // com.aspose.words.internal.zzYHE
            public final zzYHF zzM(final zzZ86 zzz86) throws zzYHB {
                try {
                    final zzZ zzz = new zzZ(zzYH6.this.f50864dL.zzL(zzz86));
                    return new zzYHF() { // from class: com.aspose.words.internal.zzYH6.1.1
                        @Override // com.aspose.words.internal.zzYHF
                        public final OutputStream getOutputStream() {
                            return zzz;
                        }

                        @Override // com.aspose.words.internal.zzYHF
                        public final byte[] zzXI5() {
                            return zzz.zzXI5();
                        }

                        @Override // com.aspose.words.internal.zzYHF
                        public final zzZ86 zzXyu() {
                            return zzz86;
                        }
                    };
                } catch (GeneralSecurityException e) {
                    throw new zzYHB("exception on setup: " + e, e);
                }
            }
        };
    }
}
