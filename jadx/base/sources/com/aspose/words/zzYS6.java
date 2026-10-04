package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("initialisation-vector", "algorithm-name");
    private String mName;
    private byte[] zzXQA;

    public final String getName() {
        return this.mName;
    }

    public final void zzX(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                this.zzXQA = com.aspose.words.internal.zzZQB.zzVT(zzo.getValue());
            } else if (iZzTP == 1) {
                this.mName = zzo.getValue();
            }
        }
    }

    public final void zzY(zzYU6 zzyu6) {
        zzyu6.zzY("manifest:algorithm");
        zzyu6.zzX("manifest:algorithm-name", this.mName);
        zzyu6.zz0("manifest:initialisation-vector", com.aspose.words.internal.zzZQB.zzYT(this.zzXQA));
        zzyu6.zzp();
    }

    public final byte[] zzYwH() {
        return this.zzXQA;
    }

    public final void zzra() {
        this.mName = "http://www.w3.org/2001/04/xmlenc#aes256-cbc";
        this.zzXQA = com.aspose.words.internal.zzZZS.zzT8(16);
    }
}
