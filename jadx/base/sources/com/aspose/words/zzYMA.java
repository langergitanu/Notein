package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMA extends zzZUH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("encryptedVerifierHashInput", "encryptedVerifierHashValue", "encryptedKeyValue");
    private byte[] zzXFs;
    private byte[] zzXFt;
    private byte[] zzXFu;

    public zzYMA(zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            if (!zzA(zzyu4)) {
                int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                if (iZzTP == 0) {
                    this.zzXFu = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
                } else if (iZzTP == 1) {
                    this.zzXFt = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
                } else {
                    if (iZzTP != 2) {
                        throw new IllegalStateException("Unknown tag name: " + zzyu4.getLocalName());
                    }
                    this.zzXFs = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
                }
            }
        }
    }

    public final byte[] zzYnQ() {
        return this.zzXFs;
    }

    public final byte[] zzYnR() {
        return this.zzXFt;
    }

    public final byte[] zzYnS() {
        return this.zzXFu;
    }
}
