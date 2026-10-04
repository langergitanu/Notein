package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("salt", "key-derivation-name", "key-size", "iteration-count");
    private String mName;
    private int zzVf;
    private int zzXOp;
    private byte[] zzXOq;

    public final int getIterationCount() {
        return this.zzXOp;
    }

    public final byte[] getSalt() {
        return this.zzXOq;
    }

    public final int getSize() {
        return this.zzVf;
    }

    public final void zzX(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                this.zzXOq = com.aspose.words.internal.zzZQB.zzVT(zzo.getValue());
            } else if (iZzTP == 1) {
                this.mName = zzo.getValue();
            } else if (iZzTP == 2) {
                this.zzVf = zzo.zzb();
            } else if (iZzTP == 3) {
                this.zzXOp = zzo.zzb();
            }
        }
    }

    public final void zzY(zzYU6 zzyu6) {
        zzyu6.zzY("manifest:key-derivation");
        zzyu6.zz0("manifest:key-derivation-name", this.mName);
        zzyu6.zzZj("manifest:key-size", this.zzVf);
        zzyu6.zzZj("manifest:iteration-count", this.zzXOp);
        zzyu6.zz0("manifest:salt", com.aspose.words.internal.zzZQB.zzYT(this.zzXOq));
        zzyu6.zzp();
    }

    public final void zzra() {
        this.mName = "PBKDF2";
        this.zzXOp = 1024;
        this.zzXOq = com.aspose.words.internal.zzZZS.zzT8(16);
        this.zzVf = 32;
    }
}
