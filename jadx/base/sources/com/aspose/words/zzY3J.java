package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3J extends zzY3K {
    private String zzX09;

    public zzY3J(String str) {
        super(str);
    }

    @Override // com.aspose.words.zzY3K, com.aspose.words.VbaReference
    public final String getLibId() {
        return this.zzX09;
    }

    @Override // com.aspose.words.zzY3K, com.aspose.words.VbaReference
    public final int getType() {
        return 51;
    }

    @Override // com.aspose.words.zzY3K, com.aspose.words.VbaReference
    public final void zzY(zzY3M zzy3m) throws Exception {
        this.zzX09 = zzy3m.readString();
        if (zzy3m.zzXTW() == 47) {
            zzy3m.zzX9();
            super.zzY(zzy3m);
        }
    }

    @Override // com.aspose.words.zzY3K, com.aspose.words.VbaReference
    public final void zzZ(zzY3L zzy3l) throws Exception {
        zzy3l.zzY((short) 22, getName());
        zzy3l.zzZ((short) 62, com.aspose.words.internal.zzZO0.zzhU(), getName());
        zzy3l.zzJ((short) getType());
        zzy3l.writeString(this.zzX09);
    }
}
