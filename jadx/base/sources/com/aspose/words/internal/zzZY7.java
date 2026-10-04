package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY7 extends zzZV5 {
    private zzEG zzM;
    private byte[] zzP;
    private String zzbI;
    private int zzwi;

    public zzZY7(String str, byte[] bArr, zzZY0 zzzy0) throws Exception {
        super(zzzy0);
        this.zzbI = str;
        this.zzP = bArr;
        this.zzwi = zzEF.zzZU(bArr);
        this.zzM = zzEF.zzZT(bArr);
    }

    public final String zzqX() {
        return this.zzbI;
    }

    public final void zzqY() throws Exception {
        String strZzZ;
        if (zzn4().zznh().getExportEmbeddedImages()) {
            strZzZ = zzZKN.format("data:{0};base64,{1}", zzKE.zzWY(this.zzwi), zzZQB.zzYT(this.zzP));
        } else {
            strZzZ = zzn4().zzZ(zzZKN.format("{0}.{1}", this.zzbI, zzKE.zzWX(this.zzwi)), this.zzP, false);
        }
        zzng().zzY("image");
        zzng().zzX("id", this.zzbI);
        zzng().zzX("xlink:href", strZzZ);
        zzng().zzX("width", zzJB.zzWD(this.zzM.getWidth()));
        zzng().zzX("height", zzJB.zzWD(this.zzM.getHeight()));
        zzng().zzp();
    }
}
