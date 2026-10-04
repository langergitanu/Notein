package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz22 extends zz21 {
    private boolean zzD;
    private byte[] zzGi;
    private int zzVL;
    private int zzVN;

    public zz22(zz4W zz4w, byte[] bArr, int i, int i2, boolean z) throws Exception {
        super(zz4w);
        this.zzGi = bArr;
        this.zzVL = i;
        this.zzVN = i2;
        this.zzD = z;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/XObject");
        zzfy.zzH("/Subtype", "/Image");
        zzfy.zzM("/Width", this.zzVL);
        zzfy.zzM("/Height", this.zzVN);
        zzfy.zzH("/ColorSpace", "/DeviceGray");
        zzfy.zzM("/BitsPerComponent", 8);
        if (this.zzD) {
            zzfy.zzZ("/Matte", new int[]{0, 0, 0});
        }
    }

    @Override // com.aspose.words.internal.zz21
    public final zz45 zzW() {
        return new zz43();
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        zzZOP zzzopZzq = zzq();
        byte[] bArr = this.zzGi;
        zzzopZzq.write(bArr, 0, bArr.length);
    }
}
