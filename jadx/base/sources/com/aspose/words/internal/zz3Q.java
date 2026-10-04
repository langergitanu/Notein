package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz3Q extends zz33 implements zzFW {
    private zz3P zzhZ;
    private zz4I zzi0;
    private String zzi1;
    private boolean zziK;
    private boolean zziL;
    private String zzkn;

    public zz3Q(zz4W zz4w, boolean z, boolean z2, zz4I zz4i, zz3P zz3p) {
        super(zz4w);
        this.zziL = z;
        this.zziK = z2;
        this.zzi0 = zz4i;
        this.zzhZ = zz3p;
        this.zzkn = zzuu();
        this.zzi1 = zzut();
    }

    public static int zzZP(int i, int i2) {
        return zzAN.zzZG((((double) i) * 1000.0d) / ((double) i2));
    }

    private String zzut() {
        StringBuilder sb = new StringBuilder();
        if (zzuN().zzvc().getEmbedFullFonts() || !this.zzhZ.isEmbedded()) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        } else {
            zzZNH.zzU(sb, this.zzkn);
            sb.append('+');
        }
        zzZNH.zzU(sb, this.zzhZ.zzPl().zzpQ());
        boolean z = this.zziL;
        if (z && this.zziK) {
            zzZNH.zzU(sb, ",BoldItalic");
        } else if (z) {
            zzZNH.zzU(sb, ",Bold");
        } else if (this.zziK) {
            zzZNH.zzU(sb, ",Italic");
        }
        return sb.toString();
    }

    private String zzuu() {
        StringBuilder sb = new StringBuilder();
        zzZNH.zzU(sb, "/F");
        String str = zzZKN.format("{0:D5}", Integer.valueOf(zztR()));
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) + 17));
        }
        return sb.toString();
    }

    public final int getFlags() {
        return ((this.zzhZ.zzPl().getStyle() & 2) != 0 ? 64 : 0) | 32 | ((this.zzhZ.zzPl().getStyle() & 1) != 0 ? 262144 : 0);
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    public final int zzHU() {
        return -zzU0(this.zzhZ.zzPl().zzHU());
    }

    public final int zzHV() {
        return zzU0(this.zzhZ.zzPl().zzHV());
    }

    public final int zzU0(int i) {
        return zzZP(i, this.zzhZ.zzPl().zzpO());
    }

    public final void zzXQ(String str) {
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            this.zzhZ.zzZO(this.zzhZ.zzPl().zzpP().zzSx(iIntValue).getGlyphIndex(), iIntValue);
        }
    }

    public final void zzY(int i, int[] iArr) {
        this.zzhZ.zzY(i, iArr);
    }

    public final void zzZ(String str, zz4X zz4x) throws Exception {
        this.zzi0.zzY(zz4x);
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            zzZ(this.zzhZ.zzPl().zzpP().zzSx(iIntValue).getGlyphIndex(), iIntValue, zz4x);
        }
        this.zzi0.zzX(zz4x);
    }

    public final zz4I zzun() {
        return this.zzi0;
    }

    public final zz3P zzuo() {
        return this.zzhZ;
    }

    public final float zzup() {
        return this.zzhZ.zzPl().zzup();
    }

    public final zzZQ4 zzuq() {
        return new zzZQ4(zzU0(this.zzhZ.zzPl().zzpJ()), zzU0(this.zzhZ.zzPl().zzpI()), zzU0(this.zzhZ.zzPl().zzpH() - this.zzhZ.zzPl().zzpJ()), zzU0(this.zzhZ.zzPl().zzpG() - this.zzhZ.zzPl().zzpI()));
    }

    public final int zzur() {
        return zzU0(this.zzhZ.zzPl().zzur());
    }

    public final String zzus() {
        return this.zzi1;
    }

    public final void zzZ(int i, int i2, zz4X zz4x) throws Exception {
        this.zzhZ.zzZO(i, i2);
        this.zzi0.zzZ(i, i2, zz4x);
    }
}
