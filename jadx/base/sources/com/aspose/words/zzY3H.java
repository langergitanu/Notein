package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3H extends VbaReference {
    private String zzX04;

    public zzY3H(String str) {
        super(str);
    }

    @Override // com.aspose.words.VbaReference
    public final String getLibId() {
        return this.zzX04;
    }

    @Override // com.aspose.words.VbaReference
    public final int getType() {
        return 13;
    }

    @Override // com.aspose.words.VbaReference
    public final void zzY(zzY3M zzy3m) throws Exception {
        zzy3m.zzXc();
        this.zzX04 = zzy3m.readString();
        zzy3m.zzXc();
        zzy3m.zzXa();
    }

    @Override // com.aspose.words.VbaReference
    public final void zzZ(zzY3L zzy3l) throws Exception {
        zzy3l.zzY((short) 22, getName());
        zzy3l.zzZ((short) 62, com.aspose.words.internal.zzZO0.zzhU(), getName());
        zzy3l.zzJ((short) getType());
        zzy3l.zzl(zzy3l.zzQZ().getBytes(getLibId()).length + 10);
        zzy3l.writeString(getLibId());
        zzy3l.zzl(0);
        zzy3l.zzXTU();
    }
}
