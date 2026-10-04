package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUI extends zzZUH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("keyData", "dataIntegrity", "keyEncryptors", "keyEncryptor", "encryptedKey", "encryptedHmacKey", "encryptedHmacValue");
    private zzYMA zzYLd;
    private byte[] zzYLe;
    private byte[] zzYLf;

    public zzZUI(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZYQ.zzX(zzzox.zzq(), zzzor);
        zzYU4 zzyu4 = new zzYU4(zzzor);
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zzC(zzyu4);
            } else if (iZzTP == 1) {
                zzB(zzyu4);
            } else if (iZzTP != 2 && iZzTP != 3) {
                if (iZzTP != 4) {
                    throw new IllegalStateException("Unknown tag name.");
                }
                this.zzYLd = new zzYMA(zzyu4);
            }
        }
    }

    private void zzB(zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 5) {
                this.zzYLf = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
            } else {
                if (iZzTP != 6) {
                    throw new IllegalStateException("Unknown tag name.");
                }
                this.zzYLe = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
            }
        }
    }

    private void zzC(zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            if (!zzA(zzyu4)) {
                throw new IllegalStateException("Unknown tag name.");
            }
        }
    }

    public final zzYMA zzZjo() {
        return this.zzYLd;
    }

    public final byte[] zzZjp() {
        return this.zzYLe;
    }

    public final byte[] zzZjq() {
        return this.zzYLf;
    }
}
