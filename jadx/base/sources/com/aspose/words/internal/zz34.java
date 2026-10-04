package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz34 extends zz21 implements zzFW {
    private int zzhq;
    private zz21 zzhr;
    private zz22 zzhs;
    private zzW zzht;
    private String zzkn;

    public zz34(zz4W zz4w, String str, byte[] bArr, zzEP zzep) throws Exception {
        super(zz4w);
        this.zzht = zzW.zzZ(zz4w, bArr, zzep);
        this.zzkn = str;
    }

    private void zzV(zzPV[] zzpvArr) throws Exception {
        this.zzhr = new zz21(zzuN());
        this.zzhq = zzpvArr.length;
        for (int i = 0; i < this.zzhq; i++) {
            this.zzhr.zzq().writeByte((byte) zzpvArr[i].zzPC());
            this.zzhr.zzq().writeByte((byte) zzpvArr[i].zzPB());
            this.zzhr.zzq().writeByte((byte) zzpvArr[i].zzPA());
        }
    }

    private void zztS() throws Exception {
        this.zzht.zzY(zzq());
        if (this.zzht.zzS() != null && this.zzht.zzS().length > 0) {
            zzV(this.zzht.zzS());
        }
        if (this.zzht.zzR() == null || this.zzht.zzR().length <= 0) {
            return;
        }
        this.zzhs = new zz22(zzuN(), this.zzht.zzR(), this.zzht.zzQ().getWidth(), this.zzht.zzQ().getHeight(), this.zzht.zzN());
    }

    private void zztT() throws Exception {
        this.zzht = zzW.zzZ(zzuN(), zzEF.zzDL(), (zzEP) null);
        zztS();
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/XObject");
        zzfy.zzH("/Subtype", "/Image");
        zzfy.zzM("/Width", this.zzht.zzQ().getWidth());
        zzfy.zzM("/Height", this.zzht.zzQ().getHeight());
        if (this.zzht.zzP() == zz57.zzvJ()) {
            zzfy.zzYY("/ColorSpace");
            zzfy.zzFf();
            zzfy.zzYY(this.zzht.zzP().zzwE());
            zzfy.zzYY("/DeviceRGB");
            zzfy.zzFh();
            zzfy.writeInt(this.zzhq - 1);
            zzfy.zzFh();
            zzfy.zzZ(this.zzhr);
            zzfy.zzFe();
        } else {
            zzfy.zzH("/ColorSpace", this.zzht.zzP().zzwE());
        }
        zzfy.zzM("/BitsPerComponent", this.zzht.zzO());
        zz22 zz22Var = this.zzhs;
        if (zz22Var != null) {
            zzfy.zzZ("/SMask", zz22Var);
        }
        if (this.zzht.zzM()) {
            zzfy.zzT("/Interpolate", true);
        }
    }

    @Override // com.aspose.words.internal.zz21
    public final zz45 zzW() {
        return this.zzht.zzW();
    }

    public final void zzZ(zzP9 zzp9) {
        this.zzht.zzZ(zzp9);
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        try {
            zztS();
        } catch (IndexOutOfBoundsException unused) {
            zzuN().zz2("Not enough memory to load the image.");
            zztT();
        } catch (Exception unused2) {
            zzuN().zz2("Image can not be processed. Possibly unsupported image format.");
            zztT();
        }
    }

    @Override // com.aspose.words.internal.zz21, com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        zz21 zz21Var = this.zzhr;
        if (zz21Var != null) {
            zz21Var.zzY(zzfx);
            this.zzhr = null;
        }
        zz22 zz22Var = this.zzhs;
        if (zz22Var != null) {
            zz22Var.zzY(zzfx);
            this.zzhs = null;
        }
    }
}
