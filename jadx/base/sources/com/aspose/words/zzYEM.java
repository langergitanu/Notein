package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEM {
    private boolean zzXUb;
    private boolean zzXqp;
    private boolean zzXqq;
    private int zzXqr;
    private int zzXqs;
    private zzYEN zzXqy;
    private zzYHZ zzXuG;
    private FontInfoCollection zzYSn;
    private boolean zzYTr;
    private zzYDZ zzZFZ;
    private ArrayList<String> zzXqt = new ArrayList<>();
    private com.aspose.words.internal.zzD3<FontInfo> zzXqo = new com.aspose.words.internal.zzD3<>();
    private ArrayList<Integer> zzXqn = new ArrayList<>();
    private zzYFM zzXqx = new zzYFM(this);
    private zzYG3 zzXqw = new zzYG3(this);
    private zzYHW zzXrA = new zzYHW(this);
    private zzYEY zzXrB = new zzYEY(this);
    private zzYHG zzXqv = new zzYHG(this);
    private zzYFB zzXqu = new zzYFB(this);
    private zzYHV zzXt6 = new zzYHV(true);
    private zzYFS zzXt5 = new zzYFS(true);
    private zzYLV zzXt4 = new zzYLV();
    private int zzdV = 1252;

    public zzYEM(zzYDZ zzydz, zzYEN zzyen, zzYEX zzyex) throws Exception {
        this.zzZFZ = zzydz;
        this.zzYSn = zzZUU.zzX(zzydz.zzYfy, zzYen().getAllowEmbeddingPostScriptFonts());
        this.zzXqy = zzyen;
        this.zzXuG = new zzYHZ(zzyex, zzydz.zzXpa.getPrettyFormat());
        zzYep();
    }

    private int zzBr(String str) {
        return this.zzZFZ.zzYfy.getFontInfos().zzLn(str);
    }

    private void zzYep() {
        if (zzYeq()) {
            Theme theme = this.zzZFZ.zzYfy.getTheme();
            zzZ(65537, theme, zzYEF.zzYdx());
            zzZ(65539, theme, "MS Mincho");
            zzZ(InputDeviceCompat.SOURCE_TRACKBALL, theme, zzYEF.zzYdx());
            zzZ(65538, theme, zzYEF.zzYdx());
            zzZ(131073, theme, zzYEF.zzYdx());
            zzZ(131075, theme, "MS Mincho");
            zzZ(131076, theme, zzYEF.zzYdx());
            zzZ(131074, theme, zzYEF.zzYdx());
        }
    }

    public final Document getDocument() {
        return this.zzZFZ.zzYfy;
    }

    public final FontInfoCollection getFontInfos() {
        return this.zzYSn;
    }

    public final void zzRd(boolean z) {
        this.zzXqp = z;
    }

    public final void zzRe(boolean z) {
        this.zzXqq = z;
    }

    public final void zzRf(boolean z) {
        this.zzYTr = z;
    }

    public final void zzSB(boolean z) {
        this.zzXUb = z;
    }

    public final int zzT(zzU1 zzu1) {
        return zzZ(zzu1, zzYEF.zzYdx());
    }

    public final void zzU(zzU1 zzu1) {
        if (zzu1.zzZYI() || com.aspose.words.internal.zzZYD.zzXk(zzu1.getName())) {
            FontInfo fontInfo = zzu1.zzZYI() ? this.zzXqo.get(zzu1.zzZYJ()) : this.zzZFZ.zzYfy.getFontInfos().get(zzu1.getName());
            int iZzt = fontInfo != null ? com.aspose.words.internal.zzT8.zzt(fontInfo.getCharset(), 1252) : 1252;
            if (iZzt != this.zzdV) {
                this.zzXuG.zzZ(com.aspose.words.internal.zzZO0.zzQz(iZzt));
                this.zzdV = iZzt;
            }
        }
    }

    public final ArrayList<Integer> zzYea() {
        return this.zzXqn;
    }

    public final com.aspose.words.internal.zzD3<FontInfo> zzYeb() {
        return this.zzXqo;
    }

    public final boolean zzYec() {
        return this.zzXqp;
    }

    public final boolean zzYed() {
        return this.zzXqq;
    }

    public final int zzYee() {
        return this.zzXqr;
    }

    public final int zzYef() {
        return this.zzXqs;
    }

    public final zzYFB zzYeg() {
        return this.zzXqu;
    }

    public final zzYHG zzYeh() {
        return this.zzXqv;
    }

    public final zzYEY zzYei() {
        return this.zzXrB;
    }

    public final zzYHW zzYej() {
        return this.zzXrA;
    }

    public final zzYG3 zzYek() {
        return this.zzXqw;
    }

    public final zzYFM zzYel() {
        return this.zzXqx;
    }

    public final zzYEN zzYem() {
        return this.zzXqy;
    }

    public final RtfSaveOptions zzYen() {
        return (RtfSaveOptions) this.zzZFZ.zzXpa;
    }

    public final ArrayList<String> zzYeo() {
        return this.zzXqt;
    }

    public final boolean zzYeq() {
        zzYEF zzyefZzY37 = this.zzZFZ.zzYfy.getStyles().zzY37();
        if (!zzyefZzY37.zzVE(235)) {
            return false;
        }
        zzU1 zzu1 = (zzU1) zzyefZzY37.get(235);
        return zzu1.zzZYI() && (zzu1.zzZYJ() & 65535) == 3;
    }

    public final zzYHZ zzYfW() {
        return this.zzXuG;
    }

    public final zzYLV zzYgu() {
        return this.zzXt4;
    }

    public final zzYFS zzYgv() {
        return this.zzXt5;
    }

    public final zzYHV zzYgw() {
        return this.zzXt6;
    }

    public final int zzZ(zzU1 zzu1, String str) {
        return zzu1.zzZYI() ? this.zzXqn.size() == 0 ? zzBr(zzU1.zzZ(zzu1, this.zzZFZ.zzYfy.zzZqI(), str)) : zznk(zzu1.zzZYJ()) : zzBr(zzu1.getName());
    }

    public final int zzZM(com.aspose.words.internal.zzPV zzpv) {
        return this.zzXt6.zzZM(zzpv);
    }

    public final boolean zzZgt() {
        return this.zzXUb;
    }

    public final boolean zzZqP() {
        return this.zzYTr;
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    public final void zzni(int i) {
        this.zzXqr = i;
    }

    public final void zznj(int i) {
        this.zzXqs = i;
    }

    public final int zznk(int i) {
        return this.zzXqn.indexOf(Integer.valueOf(i)) + 31500;
    }

    private void zzZ(int i, Theme theme, String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXqn, Integer.valueOf(i));
        String fontName = theme != null ? theme.getFontName(i) : "";
        if (com.aspose.words.internal.zzZYD.zzXk(fontName)) {
            str = fontName;
        }
        this.zzXqo.add(i, new FontInfo(str));
    }
}
