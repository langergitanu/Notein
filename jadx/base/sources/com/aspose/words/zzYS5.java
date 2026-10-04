package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS5 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("SHA1", "SHA1/1K", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha1-1k", "SHA256", "SHA256/1K", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k", "checksum-type", "checksum", "algorithm", "key-derivation", "start-key-generation");
    private String zzXQy;
    private byte[] zzXQz;
    private zzYS6 zzXQx = new zzYS6();
    private zzYRC zzXQw = new zzYRC();
    private zzYPS zzXQv = new zzYPS();

    private void zzV(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzQ("encryption-data")) {
            switch (zzUR.zzTP(zzo.getLocalName())) {
                case 8:
                    this.zzXQx.zzX(zzo);
                    break;
                case 9:
                    this.zzXQw.zzX(zzo);
                    break;
                case 10:
                    this.zzXQv.zzX(zzo);
                    break;
            }
        }
    }

    private void zzW(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 6) {
                this.zzXQy = zzo.getValue();
            } else if (iZzTP == 7) {
                this.zzXQz = com.aspose.words.internal.zzZQB.zzVT(zzo.getValue());
            }
        }
    }

    private byte[] zzXX(byte[] bArr) {
        int iZzTP = zzUR.zzTP(this.zzXQy);
        int i = 1;
        if (iZzTP != 0 && iZzTP != 1 && iZzTP != 2) {
            i = 3;
            if (iZzTP != 3 && iZzTP != 4 && iZzTP != 5) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected checksum type: {0}", this.zzXQy));
            }
        }
        String str = this.zzXQy;
        int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzIL.zzW(i, bArr, (com.aspose.words.internal.zzZKN.zzW(str, "1K", i2) || com.aspose.words.internal.zzZKN.zzW(this.zzXQy, "1k", i2)) ? Math.min(1024, bArr.length) : bArr.length);
    }

    public final void zzX(com.aspose.words.internal.zzO zzo) {
        zzW(zzo);
        zzV(zzo);
    }

    public final void zzXY(byte[] bArr) {
        this.zzXQz = zzXX(bArr);
    }

    public final void zzY(zzYU6 zzyu6) {
        zzyu6.zzY("manifest:encryption-data");
        zzyu6.zzX("manifest:checksum-type", this.zzXQy);
        zzyu6.zz0("manifest:checksum", com.aspose.words.internal.zzZQB.zzYT(this.zzXQz));
        this.zzXQx.zzY(zzyu6);
        this.zzXQw.zzY(zzyu6);
        this.zzXQv.zzY(zzyu6);
        zzyu6.zzo();
    }

    public final zzYPS zzYwE() {
        return this.zzXQv;
    }

    public final zzYRC zzYwF() {
        return this.zzXQw;
    }

    public final zzYS6 zzYwG() {
        return this.zzXQx;
    }

    public final void zzra() {
        this.zzXQy = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k";
        this.zzXQx.zzra();
        this.zzXQw.zzra();
        this.zzXQv.zzra();
    }
}
