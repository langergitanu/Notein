package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("key-size", "start-key-generation-name");
    private String mName;
    private int zzVf;

    public final String getName() {
        return this.mName;
    }

    public final void zzX(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                this.zzVf = zzo.zzb();
            } else if (iZzTP == 1) {
                this.mName = zzo.getValue();
            }
        }
    }

    public final void zzY(zzYU6 zzyu6) {
        zzyu6.zzY("manifest:start-key-generation");
        zzyu6.zzX("manifest:start-key-generation-name", this.mName);
        zzyu6.zzZj("manifest:key-size", this.zzVf);
        zzyu6.zzp();
    }

    public final void zzra() {
        this.mName = "http://www.w3.org/2000/09/xmldsig#sha256";
        this.zzVf = 32;
    }
}
