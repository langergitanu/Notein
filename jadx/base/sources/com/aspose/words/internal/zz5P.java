package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
final class zz5P extends zz5S {
    private static char[] zzkE = {'\n', ControlChar.PARAGRAPH_BREAK_CHAR};
    private int zzYa;
    private String zzYb;
    private float zzYc;
    private float zzYd;
    private zzPM zzZl;
    private float zzkF;
    private boolean zzkG;
    private String zzkH;
    private boolean zzkI;
    private zz5T zzkK;

    private zz5P(zz2M zz2m, zzZV zzzv, boolean z, String str, zzPM zzpm, String str2, float f, float f2, int i) throws Exception {
        super(zz2m, zzzv);
        this.zzkI = z;
        this.zzkH = str;
        this.zzZl = zzpm;
        this.zzYb = str2;
        this.zzYd = f;
        this.zzYc = f2;
        this.zzYa = i;
        this.zzkG = zzZKN.zzU(str2, zzkE).length > 1;
        zzX(zzm(zzzv.zzZv()));
        this.zzkF = zzwd();
        this.zzkK = zzwa();
    }

    public static zz5P zzZ(zz2M zz2m, zzZC zzzc) throws Exception {
        return new zz5P(zz2m, zzzc, false, zzzc.zzYR(), zzzc.zzZr(), zzzc.zzYR(), zzzc.zzYT(), zzzc.zzYS(), zzzc.getMaxLength());
    }

    private zzZQ4 zzm(zzZQ4 zzzq4) {
        int length = zzZKN.zzU(this.zzYb, zzkE).length;
        float height = zzzq4.getHeight();
        float width = zzzq4.getWidth();
        return new zzZQ4(zzzq4.getX() - 1.75f, zzzq4.getY() - 1.75f, width + 3.5f, Math.max(this.zzYd * length, height) + 3.5f);
    }

    private int zzw9() {
        return this.zzkG ? 1 : 0;
    }

    private zz5T zzwa() throws Exception {
        zz5T zz5t = new zz5T(zzuN());
        zz5t.zzX(new zzZQ4(0.0f, 0.0f, zzZv().getWidth(), zzZv().getHeight()));
        zzZ(zz5t.zzvl());
        return zz5t;
    }

    private float zzwb() {
        return (zzZv().getHeight() / 2.0f) - this.zzZl.zzPl().zzJ((this.zzZl.zzPl().zzpO() / 2) - this.zzZl.zzPl().zzpt().zzHU(), this.zzZl.zzPg());
    }

    private String zzwc() throws Exception {
        return zzZKN.format("{0} {1} ", zzZ(this.zzZl, zzZu()), !this.zzkG ? zzZKN.format("1 0 0 1 0 {0} Tm", zz1D.zzT(this.zzkF - zzwb(), 8)) : "");
    }

    private float zzwd() {
        return (zzZv().getHeight() - this.zzYc) - 1.75f;
    }

    @Override // com.aspose.words.internal.zz5S
    public final int getFieldType() {
        return 1;
    }

    @Override // com.aspose.words.internal.zz5S
    public final void zzX(zzFY zzfy) throws Exception {
        int i = this.zzYa;
        if (i != 0) {
            zzfy.zzM("/MaxLen", i);
        }
        if (!this.zzkI) {
            zzfy.zzD("/DA", zzwc());
            if (!"".equals(this.zzkH)) {
                zzfy.zzC("/DV", this.zzkH);
            }
        } else if (!"".equals(this.zzkH)) {
            zzfy.zzC("/RV", this.zzkH);
            zzfy.zzC("/DS", "font: 12pt Arial");
        }
        zzfy.zzC("/V", this.zzYb);
        zzfy.zzYY("/AP");
        zzfy.zzFd();
        zzfy.zzZ("/N", this.zzkK);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz5S
    public final int zzwk() {
        return (zzw9() << 12) | ((this.zzkI ? 1 : 0) << 25) | super.zzwk();
    }

    public static zz5P zzZ(zz2M zz2m, zzZB zzzb) throws Exception {
        zzPM zzpmZzY = zz2m.zzuN().zzvc().zztv().zzY("Times New Roman", 12.0f, 0);
        float fZzPg = zzpmZzY.zzPg();
        return new zz5P(zz2m, zzzb, true, zzzb.zzYQ(), zzpmZzY, zzzb.zzYR(), fZzPg, fZzPg - zzpmZzY.getDescentPoints(), zzzb.getMaxLength());
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzkK.zzY(zzfx);
    }

    private void zzZ(zz4X zz4x) throws Exception {
        float f = this.zzkF;
        zz4x.zzXW(" /Tx BMC\r\n  q\r\n   BT\r\n    ");
        int i = 0;
        zz5S.zzZ(zz4x, zzZu(), false);
        zz3Q zz3qZzZ = zzZ(zz4x, this.zzZl);
        zz5S.zzZ(zz4x, f);
        String[] strArrZzU = zzZKN.zzU(this.zzYb, zzkE);
        while (i < strArrZzU.length) {
            if (f < 0.0f) {
                break;
            }
            if (zzZYD.zzXk(strArrZzU[i])) {
                zz5S.zzY(zz4x, i != 0 ? -this.zzYd : 0.0f);
                zz5S.zzZ(zz4x, strArrZzU[i], zz3qZzZ);
            }
            f -= this.zzYd;
            i++;
        }
        zz4x.zzXW("\r\n   ET\r\n  Q\r\n EMC");
    }
}
