package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz3O extends zz3P {
    private zz3L zzhW;
    private zz3H zzhX;

    public zz3O(zzZXH zzzxh, zz4W zz4w) throws Exception {
        super(zzzxh);
        if (zzzxh.zzHG()) {
            if (zzzxh.zzVe()) {
                zz3G zz3g = new zz3G(zzZ(zzzxh, zz4w, true));
                this.zzhX = zz3g;
                this.zzhW = new zz3J(zz4w, "/CIDFontType0C", zz3g);
            } else {
                boolean zZzvG = zz4w.zzv7().zzvG();
                zz3F zz3f = new zz3F(zzZ(zzzxh, zz4w, !zZzvG));
                this.zzhX = zz3f;
                this.zzhW = new zz3J(zz4w, zZzvG ? "/OpenType" : "/CIDFontType0C", zz3f);
            }
        } else {
            zz3F zz3f2 = new zz3F(zzZ(zzzxh, zz4w, false));
            this.zzhX = zz3f2;
            this.zzhW = new zz3K(zz4w, zz3f2);
        }
        this.zzhX.zzue();
        this.zzhX.zzTW(65);
        this.zzhX.zzTW(32);
    }

    private static zzJO zzZ(zzZXH zzzxh, zz4W zz4w, boolean z) {
        return zzzxh.zzZ(zz4w.zzvc().getEmbedFullFonts(), z, false);
    }

    @Override // com.aspose.words.internal.zz3P
    public final boolean isEmbedded() {
        return true;
    }

    @Override // com.aspose.words.internal.zz3P
    public final void zzF(zzFY zzfy) throws Exception {
        zzfy.zzZ(this.zzhW.zzuj(), this.zzhW);
    }

    @Override // com.aspose.words.internal.zz3P
    public final boolean zzTX(int i) {
        return this.zzhX.zzud().zzVE(i);
    }

    @Override // com.aspose.words.internal.zz3P
    public final void zzY(int i, int[] iArr) {
        this.zzhX.zzY(i, iArr);
    }

    @Override // com.aspose.words.internal.zz3P
    public final void zzZO(int i, int i2) {
        this.zzhX.zzZM(i, i2);
    }

    public final zz3H zzuk() {
        return this.zzhX;
    }

    public final zz3L zzul() {
        return this.zzhW;
    }

    @Override // com.aspose.words.internal.zz3P
    public final zz5G zzum() {
        int iZzt5 = zz1E.zzt5();
        int iZzt6 = zz1E.zzt6();
        zzZYV<Integer> zzzyvZzud = this.zzhX.zzud();
        for (int i = 0; i < zzzyvZzud.getCount(); i++) {
            int iZzT3 = zzzyvZzud.zzT3(i);
            if (zz1E.zzTE(iZzT3)) {
                int iZzTD = zz1E.zzTD(iZzT3) & 255;
                if (iZzt5 > iZzTD) {
                    iZzt5 = iZzTD;
                }
                if (iZzt6 < iZzTD) {
                    iZzt6 = iZzTD;
                }
            }
        }
        return new zz5G(iZzt5, iZzt6, zzZN(iZzt5, iZzt6));
    }
}
