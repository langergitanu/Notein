package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zz21 extends zz33 {
    private zz20 zzg0;
    private zzZOR zzkX;

    public zz21(zz4W zz4w) throws Exception {
        super(zz4w);
        zztg();
    }

    private void zztg() throws Exception {
        this.zzkX = new zzZOR();
    }

    public void zzN(zzFY zzfy) throws Exception {
    }

    public zz45 zzW() throws Exception {
        int textCompression;
        if (this.zzkX.getLength() >= 200 && (textCompression = zzuN().zzvc().getTextCompression()) != 0) {
            if (textCompression == 1) {
                return new zz3X();
            }
            if (textCompression == 2) {
                return new zz42();
            }
            if (textCompression == 3) {
                return new zz43();
            }
            throw new IllegalStateException("Unknown text compression filter type.");
        }
        return new zz3Y();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        try {
            zzuE();
            zzfy.zzFd();
            this.zzg0 = new zz20(zzuN());
            zzN(zzfy);
            zzfy.zzZ("/Length", this.zzg0);
            zz45 zz45VarZzW = zzW();
            zz45VarZzW.zzH(zzfy);
            zzfy.zzFc();
            long jZzFa = zzfy.zzFa();
            zz45VarZzW.zzZ(this.zzkX, zzfy.zzq(), zztQ());
            this.zzg0.setLength((int) (zzfy.zzF9() - jZzFa));
        } finally {
            zztg();
        }
    }

    public final zzZOP zzq() {
        return this.zzkX;
    }

    public void zzuE() throws Exception {
    }

    @Override // com.aspose.words.internal.zz33
    public void zzZ(zzFX zzfx) throws Exception {
        this.zzg0.zzY(zzfx);
    }
}
