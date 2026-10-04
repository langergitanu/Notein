package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz3M extends zz33 {
    private zz3Q zzhV;
    private zz3P zzhZ;

    public zz3M(zz4W zz4w, zz3Q zz3q, zz3P zz3p) {
        super(zz4w);
        this.zzhV = zz3q;
        this.zzhZ = zz3p;
    }

    public void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/FontDescriptor");
        zzfy.zzF("/FontName", this.zzhV.zzus());
        zzfy.zzM("/StemV", 80);
        zzfy.zzM("/Descent", this.zzhV.zzHU());
        zzfy.zzM("/Ascent", this.zzhV.zzHV());
        zzfy.zzM("/CapHeight", this.zzhV.zzur());
        zzfy.zzM("/Flags", this.zzhV.getFlags());
        zzfy.zzY("/ItalicAngle", this.zzhV.zzup());
        zzfy.zzZ("/FontBBox", this.zzhV.zzuq());
        this.zzhZ.zzF(zzfy);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzN(zzfy);
        zzfy.zzFc();
    }
}
