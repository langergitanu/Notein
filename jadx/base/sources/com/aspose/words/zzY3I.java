package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3I extends VbaReference {
    private short zzX05;
    private int zzX06;
    private String zzX07;
    private String zzX08;

    public zzY3I(String str) {
        super(str);
    }

    @Override // com.aspose.words.VbaReference
    public final String getLibId() {
        return this.zzX08;
    }

    @Override // com.aspose.words.VbaReference
    public final int getType() {
        return 14;
    }

    @Override // com.aspose.words.VbaReference
    public final void zzY(zzY3M zzy3m) throws Exception {
        zzy3m.zzXc();
        this.zzX08 = zzy3m.readString();
        this.zzX07 = zzy3m.readString();
        this.zzX06 = zzy3m.zzXb();
        this.zzX05 = zzy3m.zzX9();
    }

    @Override // com.aspose.words.VbaReference
    public final void zzZ(zzY3L zzy3l) throws Exception {
        zzy3l.zzY((short) 22, getName());
        zzy3l.zzZ((short) 62, com.aspose.words.internal.zzZO0.zzhU(), getName());
        zzy3l.zzJ((short) getType());
        zzy3l.zzl(zzy3l.zzQZ().getBytes(this.zzX08).length + zzy3l.zzQZ().getBytes(this.zzX07).length + 14);
        zzy3l.writeString(this.zzX08);
        zzy3l.writeString(this.zzX07);
        zzy3l.zzk(this.zzX06);
        zzy3l.zzJ(this.zzX05);
    }
}
