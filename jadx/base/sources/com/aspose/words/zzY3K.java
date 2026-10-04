package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY3K extends VbaReference {
    private int zzX0a;
    private byte[] zzX0b;
    private String zzX0c;
    private String zzX0d;
    private String zzX0e;

    public zzY3K(String str) {
        super(str);
    }

    @Override // com.aspose.words.VbaReference
    public String getLibId() {
        return this.zzX0d;
    }

    @Override // com.aspose.words.VbaReference
    public int getType() {
        return 47;
    }

    @Override // com.aspose.words.VbaReference
    public void zzY(zzY3M zzy3m) throws Exception {
        zzy3m.zzXc();
        this.zzX0d = zzy3m.readString();
        zzy3m.zzXc();
        zzy3m.zzXa();
        if (zzy3m.zzXTW() == 22) {
            this.zzX0e = zzy3m.zzV4(22, 62);
        }
        zzy3m.zzXa();
        zzy3m.zzXc();
        this.zzX0c = zzy3m.readString();
        zzy3m.zzXc();
        zzy3m.zzXa();
        this.zzX0b = zzy3m.zzn(16);
        this.zzX0a = zzy3m.zzXc();
    }

    @Override // com.aspose.words.VbaReference
    public void zzZ(zzY3L zzy3l) throws Exception {
        zzy3l.zzY((short) 22, getName());
        zzy3l.zzZ((short) 62, com.aspose.words.internal.zzZO0.zzhU(), getName());
        zzy3l.zzJ((short) getType());
        zzy3l.zzl(zzy3l.zzQZ().getBytes(this.zzX0d).length + 10);
        zzy3l.writeString(this.zzX0d);
        zzy3l.zzl(0);
        zzy3l.zzXTU();
        zzy3l.zzJ((short) 48);
        zzy3l.zzl(zzy3l.zzQZ().getBytes(this.zzX0c).length + 30);
        zzy3l.writeString(this.zzX0c);
        zzy3l.zzl(0);
        zzy3l.zzXTU();
        zzy3l.writeBytes(this.zzX0b);
        zzy3l.zzl(this.zzX0a);
    }
}
