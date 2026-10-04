package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHM {
    private Run zzYpY;
    private boolean zzYpZ;
    private zzZHN zzYq0;
    private boolean zzYq1;
    private int zzYq4;
    private int zzYq5;
    private zzZAU zzYq8;
    private zzZAU zzYq9;
    private zzZF0 zzYrW;
    private zzZJU zzYsy;
    private zzZH5 zzYsz;
    private zzZAO zzYt4;
    private boolean zzYt6;
    private int zzYq7 = 1;
    private int zzYq6 = 1;
    private ArrayList<zzZHN> zzYq3 = new ArrayList<>();
    private ArrayList<zzZHN> zzYq2 = new ArrayList<>();

    public zzZHM(zzZAO zzzao, zzZH5 zzzh5, zzZJU zzzju, zzZF0 zzzf0, zzZAU zzzau, zzZAU zzzau2, boolean z) {
        this.zzYt4 = zzzao;
        this.zzYsz = zzzh5;
        this.zzYsy = zzzju;
        this.zzYrW = zzzf0;
        this.zzYq9 = zzzau;
        this.zzYq8 = zzzau2;
        this.zzYq5 = zzzau.getStartNumber();
        this.zzYq4 = zzzau2.getStartNumber();
        this.zzYt6 = z;
    }

    private void zzO(Font font) throws Exception {
        this.zzYsz.zzP(this.zzYq0.zzZ1X(), true, false);
        this.zzYrW.zzZ(font, this.zzYq0.zzZ1Z());
        this.zzYsz.zzZlN();
    }

    private String zzQ(Footnote footnote) {
        return footnote.isAuto() ? com.aspose.words.internal.zzZKN.format("[{0}]", zzYTW.zzM(zzzx(footnote.getFootnoteType()), zzzy(footnote.getFootnoteType()), true)) : com.aspose.words.internal.zzZKN.format("[{0}]", footnote.getReferenceMark());
    }

    private int zzR(Footnote footnote) throws Exception {
        String strZzQ = zzQ(footnote);
        com.aspose.words.internal.zzZQG.zzZ(zzzB(footnote.getFootnoteType()), new zzZHN(strZzQ, zzzu(footnote.getFootnoteType()), zzzt(footnote.getFootnoteType()), footnote));
        this.zzYsz.zzP(zzzv(footnote.getFootnoteType()), true, false);
        this.zzYrW.zzZ(footnote.getFont(), strZzQ);
        this.zzYsz.zzZlN();
        zzzA(footnote.getFootnoteType());
        if (footnote.isAuto()) {
            zzzz(footnote.getFootnoteType());
        }
        return 1;
    }

    private int zzS(Footnote footnote) {
        if (footnote.isAuto()) {
            return 0;
        }
        Paragraph firstParagraph = footnote.getFirstParagraph();
        if (firstParagraph.zzYVe() == null || !com.aspose.words.internal.zzZKN.equals(firstParagraph.zzYVe().getText(), footnote.getReferenceMark())) {
            return 0;
        }
        this.zzYpY = firstParagraph.zzYVe();
        firstParagraph.zzYVe().remove();
        return 0;
    }

    private static boolean zzT(Footnote footnote) {
        return footnote.getFootnoteType() == 0 || footnote.getFootnoteType() == 1;
    }

    private String zzZL(String str, int i) {
        int i2 = i == 0 ? this.zzYq7 : this.zzYq6;
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(com.aspose.words.internal.zzJB.zzWD(i2));
        return sbOooO0OO.toString();
    }

    private void zzzA(int i) {
        if (i == 0) {
            this.zzYq7++;
        } else {
            this.zzYq6++;
        }
    }

    private ArrayList<zzZHN> zzzB(int i) {
        return i == 0 ? this.zzYq3 : this.zzYq2;
    }

    private int zzzC(int i) {
        return (i == 0 ? this.zzYq9 : this.zzYq8).getStartNumber();
    }

    private void zzzD(int i) {
        this.zzYt4.zzZ3E().zzZN(TranslateLanguage.CROATIAN, 1);
        zzLU zzlu = new zzLU();
        zzlu.zzU("width", 33.0d);
        zzlu.zzZ("height", 1.0d, 6);
        zzlu.zzZs("text-align", "left");
        if (this.zzYt6) {
            zzlu.zzV("-aw-footnote-type", i);
            zzlu.zzV("-aw-footnote-numberstyle", zzzy(i));
            zzlu.zzV("-aw-footnote-startnumber", zzzC(i));
        }
        this.zzYt4.zzZ3C().zzV(zzlu);
        this.zzYt4.zzZ3E().endElement(TranslateLanguage.CROATIAN);
    }

    private void zzzE(int i) throws Exception {
        for (zzZHN zzzhn : zzzB(i)) {
            this.zzYq0 = zzzhn;
            this.zzYpZ = true;
            this.zzYt4.zzZ3E().zzZN("div", 0);
            this.zzYt4.zzZ3E().zzX("id", zzzhn.zzZ1Y());
            if (this.zzYt6) {
                zzLU zzlu = new zzLU();
                zzlu.zzV("-aw-footnote-isauto", zzzhn.zzZ1W().isAuto() ? 1.0d : 0.0d);
                this.zzYt4.zzZ3C().zzV(zzlu);
            }
            this.zzYt4.zzZa(zzzhn.zzZ1W());
            this.zzYt4.zzZ3E().endElement("div");
            this.zzYq0 = null;
        }
        zzzB(i).clear();
    }

    private void zzzF(int i) throws Exception {
        if (zzzB(i).size() > 0) {
            zzzD(i);
            zzzE(i);
        }
    }

    private String zzzt(int i) {
        return zzZL(i == 0 ? "#_ftnref" : "#_ednref", i);
    }

    private String zzzu(int i) {
        return zzZL(i == 0 ? "_ftn" : "_edn", i);
    }

    private String zzzv(int i) {
        return zzZL(i == 0 ? "#_ftn" : "#_edn", i);
    }

    private String zzzw(int i) {
        return zzZL(i == 0 ? "_ftnref" : "_ednref", i);
    }

    private int zzzx(int i) {
        return i == 1 ? this.zzYq4 : this.zzYq5;
    }

    private int zzzy(int i) {
        return i == 1 ? this.zzYq8.getNumberStyle() : this.zzYq9.getNumberStyle();
    }

    private void zzzz(int i) {
        if (i == 0) {
            this.zzYq5++;
        } else {
            this.zzYq4++;
        }
    }

    public final void zzIg() throws Exception {
        this.zzYq1 = true;
        zzzF(0);
        zzzF(1);
        this.zzYq1 = false;
    }

    public final int zzU(Footnote footnote) {
        if (!zzT(footnote)) {
            return 1;
        }
        if (this.zzYq1 || this.zzYpY == null) {
            return 0;
        }
        footnote.getFirstParagraph().insertBefore(this.zzYpY, footnote.getFirstParagraph().zzYVe());
        this.zzYpY = null;
        return 0;
    }

    public final int zzV(Footnote footnote) throws Exception {
        if (!zzT(footnote)) {
            return 1;
        }
        if (this.zzYq1) {
            return zzS(footnote);
        }
        this.zzYsy.zzL1(zzzw(footnote.getFootnoteType()));
        return zzR(footnote);
    }

    public final void zzX(SpecialChar specialChar) throws Exception {
        if (this.zzYq1 && this.zzYpZ && this.zzYq0.zzZ1W().isAuto()) {
            zzO(specialChar.getFont());
            this.zzYpZ = false;
        }
    }

    public final void zzZ3N() throws Exception {
        if (this.zzYq1 && this.zzYpZ && !this.zzYq0.zzZ1W().isAuto()) {
            zzO(this.zzYq0.zzZ1W().getFont());
            this.zzYpZ = false;
        }
    }
}
