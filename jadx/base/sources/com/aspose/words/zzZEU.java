package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefDouble;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEU {
    private com.aspose.words.internal.zzQP zzYlv = new com.aspose.words.internal.zzQP();
    private zzZEV zzYlw;
    private zzZAO zzYqI;
    private zzZHR zzYqf;
    private zzZ1F zzYs4;
    private zzZN8 zzYs5;
    private zzZET zzYsc;
    private HtmlSaveOptions zzYt2;
    private Document zzZEY;

    public zzZEU(Document document, zzZET zzzet, zzZAO zzzao, HtmlSaveOptions htmlSaveOptions, zzZN8 zzzn8, zzZ1F zzz1f) {
        this.zzZEY = document;
        this.zzYsc = zzzet;
        this.zzYlw = new zzZEV(zzzet, htmlSaveOptions);
        this.zzYt2 = htmlSaveOptions;
        this.zzYqI = zzzao;
        this.zzYqf = new zzZHR(document, htmlSaveOptions);
        this.zzYs5 = zzzn8;
        this.zzYs4 = zzz1f;
    }

    private void zzK(Font font) {
        int iZzZ7j;
        this.zzYqI.zzZ3E().zzYXX().zzYXj().zzJH("class");
        if (this.zzYsc.zzYYM() && (iZzZ7j = font.zzZ7j()) != 10) {
            zzKc(this.zzYsc.zzyZ(iZzZ7j));
        }
    }

    private void zzKc(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYqI.zzZ3E().zzX("class", this.zzYsc.zzKb(str));
        }
    }

    private void zzT(zzLU zzlu) throws Exception {
        Style styleZzZ7 = this.zzZEY.getStyles().zzZ7(0, true);
        zzYMX zzymx = new zzYMX();
        styleZzZ7.zzY(zzymx, 65);
        zzYEF zzyef = new zzYEF();
        styleZzZ7.zzT(zzyef, 33);
        zzLU zzluZzZ = zzMO.zzZ(zzymx, true, this.zzYt2.getExportRoundtripInformation());
        zzMO.zzZ(zzyef, zzluZzZ, true, this.zzYqf, this.zzYs5, this.zzZEY.zzZqI(), this.zzYt2.getExportRoundtripInformation());
        zzPS zzpsZzZWe = zzluZzZ.zzZWe();
        zzPR zzpr = new zzPR();
        String[] strArr = {"text-align", "font-family", "font-size", "font-weight", "font-style", "line-height", "widows", "orphans", "color"};
        for (int i = 0; i < 9; i++) {
            zzpr.zzX(zzpsZzZWe.zzSx(strArr[i]));
        }
        Iterator<zzPT> it = zzpr.iterator();
        while (it.hasNext()) {
            zzlu.zzV(it.next());
        }
    }

    private void zzU(zzLU zzlu) {
        this.zzYqI.zzZ3E().zzYXX().zzYXj().zzJH("style");
        zzZEV zzzev = this.zzYlw;
        zzPS zzpsZzZ = zzzev != null ? zzzev.zzZ(this.zzYqI.zzZ3E().zzYXX(), zzlu) : zzlu.zzZWe();
        this.zzYqI.zzZ3E().zzYXX().zzYXj().zzJH("style");
        if (zzpsZzZ.getCount() != 0) {
            this.zzYqI.zzZ3E().zzH(zzpsZzZ);
        }
    }

    private void zzw(Table table) {
        this.zzYqI.zzZ3E().zzYXX().zzYXj().zzJH("class");
        if (this.zzYsc.zzYYM() && this.zzYt2.getExportRoundtripInformation() && table.getStyle().zzZ7j() != 11) {
            zzKc(this.zzYsc.zzyZ(table.getStyle().zzZ7j()));
        }
    }

    public final void zzQ(Section section) {
        if (this.zzYt2.getExportPageSetup() || this.zzYt2.getExportPageMargins()) {
            int i = 1;
            for (Node previousSibling = section; previousSibling.getPreviousSibling() != null; previousSibling = previousSibling.getPreviousSibling()) {
                i++;
            }
            this.zzYqI.zzZ3E().zzX("class", this.zzYsc.zzKb("Section_" + com.aspose.words.internal.zzJB.zzWD(i)));
        }
        zzLU zzlu = new zzLU();
        zzZ(section.getPageSetup(), zzlu, !section.zz9I() && this.zzYt2.zzYZc());
        zzU(zzlu);
    }

    public final void zzV(zzLU zzlu) {
        zzU(zzlu);
    }

    public final void zzX(zzWG zzwg) {
        zzLU zzluZzY = zzLR.zzY(zzwg);
        if (this.zzYt2.getExportRoundtripInformation()) {
            if (zzwg.zz4Z().getRowFormat().getHeightRule() == 1) {
                zzluZzY.zzZs("-aw-height-rule", "exactly");
            }
            if (!zzwg.zz4Z().getRowFormat().getAllowBreakAcrossPages()) {
                zzluZzY.zzZs("page-break-inside", "avoid");
            }
        }
        zzU(zzluZzY);
    }

    public final void zzY(Paragraph paragraph, zzLU zzlu) throws Exception {
        zzLU zzlu2 = new zzLU();
        zzO7.zzZ(zzlu2, paragraph, this.zzYqf, this.zzYs5, null, false, true, false);
        zzPT zzptZzSx = zzlu2.zzZWe().zzSx("text-decoration");
        if (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZno)) {
            return;
        }
        zzlu.zzV(zzptZzSx);
    }

    public final void zzYYP() {
        this.zzYlv.removeAt(r0.getCount() - 1);
    }

    public final void zzZ(Font font, int i, int i2, zzLU zzlu, boolean z) throws Exception {
        zzK(font);
        zzLU zzlu2 = new zzLU();
        if (z && font.getStyleIdentifier() == 85 && (font.zzZ7g() instanceof zzZAM)) {
            zzYEF zzyef = new zzYEF();
            zzZ7R.zzZ((zzZAM) font.zzZ7g(), zzyef, 5);
            zzP3.zzZ(zzlu2, Font.zzZ(zzyef, this.zzZEY), i, i2, this.zzYqf, this.zzYs5, this.zzYt2.getExportRoundtripInformation());
        } else {
            zzP3.zzZ(zzlu2, font, i, i2, this.zzYqf, this.zzYs5, this.zzYt2.getExportRoundtripInformation());
        }
        if (zzlu != null) {
            zzlu2.zzW(zzlu);
        }
        zzU(zzlu2);
    }

    public final void zzZ3f() throws Exception {
        zzLU zzlu = new zzLU();
        if (this.zzZEY.getBackgroundShape() != null) {
            zzlu.zzW(zzRN.zzZ(this.zzZEY.getBackgroundShape(), this.zzYs4));
        }
        if (this.zzYt2.getCssStyleSheetType() == 0) {
            zzT(zzlu);
        }
        zzU(zzlu);
    }

    public final void zzZM(Paragraph paragraph) {
        this.zzYqI.zzZ3E().zzYXX().zzYXj().zzJH("class");
        if (this.zzYsc.zzYYM()) {
            int iZzZ7j = paragraph.zzZYj().zzZ7j();
            if (iZzZ7j < 0 || iZzZ7j > 6) {
                zzKc(this.zzYsc.zzyZ(iZzZ7j));
            }
        }
    }

    public final zzLU zzY(Paragraph paragraph, zzYMX zzymx, int i) throws Exception {
        paragraph.getDocument();
        RefDouble refDouble = new RefDouble(0.0d);
        RefDouble refDouble2 = new RefDouble(0.0d);
        RefBoolean refBoolean = new RefBoolean(false);
        paragraph.zzZ(refDouble, refDouble2, refBoolean);
        refDouble.get();
        double d = refDouble2.get();
        refBoolean.get();
        return zzMW.zzZ(paragraph, new ParagraphFormat(zzymx, this.zzZEY.getStyles()), d, i, zzMW.zzT(paragraph), zzMW.zzS(paragraph), zzL5.zzQ(paragraph), this.zzYt2.getExportRoundtripInformation());
    }

    public final void zzQ(Paragraph paragraph, boolean z) throws Exception {
        double size = paragraph.getListLabel().getFont().getSize();
        Shape shapeZzZ0P = zzZGI.zzZW(paragraph).zzZ0P();
        zzU(zzO7.zzZ(this.zzYt2, paragraph, (shapeZzZ0P == null || size <= 0.0d) ? null : this.zzYs4.zzZ(shapeZzZ0P, size), z));
    }

    public final void zzZ(Paragraph paragraph, zzYMX zzymx, boolean z, boolean z2, int i, boolean z3) throws Exception {
        zzZM(paragraph);
        zzLU zzluZzY = zzY(paragraph, zzymx, i);
        int iZzQ = zzL5.zzQ(paragraph);
        zzZGL zzzglZzX = zzZGL.zzX(paragraph, z, this.zzYt2.getPrettyFormat());
        this.zzYqI.zzZ3E().zzYXX().zzWS(zzzglZzX.zzZ18());
        for (int i2 = 0; i2 < this.zzYlv.getCount(); i2++) {
            zzzglZzX.setLeftMargin(zzzglZzX.getLeftMargin() - this.zzYlv.get(i2));
        }
        this.zzYlv.add(zzzglZzX.getLeftMargin() + zzzglZzX.getLeftPadding());
        zzzglZzX.zzZ(zzluZzY, iZzQ, paragraph.getParagraphFormat().getBidi());
        zzLU zzlu = new zzLU();
        zzO7.zzZ(zzlu, paragraph, this.zzYqf, this.zzYs5, zzzglZzX, false, z2, z3);
        zzMP zzmpZzSd = zzlu.zzSd("text-decoration");
        if (zzmpZzSd != null && !zzmpZzSd.zzP(zzL4.zzZno)) {
            zzlu.remove("text-decoration");
        }
        zzluZzY.zzW(zzlu);
        zzU(zzluZzY);
    }

    public final void zzZ(Table table, double d, boolean z) throws Exception {
        zzw(table);
        zzU(zzLR.zzZ(table, d, this.zzYt2.getTableWidthOutputMode(), z, this.zzYt2.getExportRoundtripInformation()));
    }

    public final void zzZ(zzWH zzwh, boolean z, boolean z2) {
        zzU(zzLR.zzZ(zzwh, this.zzYt2.getTableWidthOutputMode(), z, this.zzYt2.getExportRoundtripInformation(), z2));
    }

    public final void zzZ(zzZEM zzzem, double d, Font font, String str, int i) throws Exception {
        zzLU zzlu = new zzLU();
        if (font != null) {
            zzP3.zzZ(zzlu, font, 3, i, this.zzYqf, null, this.zzYt2.getExportRoundtripInformation());
        }
        zzlu.zzZs("display", "inline-block");
        zzlu.zzZ("width", d, 4);
        zzlu.zzZ("text-indent", 0.0d, 4);
        if (this.zzYt2.getExportRoundtripInformation() && !zzzem.zzYYK()) {
            zzlu.zzZs("-aw-tabstop-align", zzZDY.zzyO(zzzem.getAlignment()));
            zzlu.zzZ("-aw-tabstop-pos", zzzem.getPosition(), 4);
            if (zzzem.getLeader() != 0) {
                zzlu.zzZs("-aw-tabstop-leader", zzZDY.zzyN(zzzem.getLeader()));
            }
        }
        if (this.zzYt2.getExportRoundtripInformation() && com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzlu.setString("-aw-font-family", str);
        }
        zzU(zzlu);
    }

    private void zzZ(PageSetup pageSetup, zzLU zzlu, boolean z) {
        int iZzMc = zzL5.zzMc(pageSetup.zzYLa());
        if (iZzMc != 0 && !this.zzYt2.zzYZc()) {
            String strZzMa = zzL5.zzMa(iZzMc);
            zzlu.zzZs("writing-mode", strZzMa);
            zzlu.zzZs("-ms-writing-mode", zzL5.zzM9(iZzMc));
            zzlu.zzZs("-webkit-writing-mode", strZzMa);
            zzlu.zzZs("-moz-writing-mode", strZzMa);
        }
        if (z) {
            zzL5.zzZ(pageSetup.getSectionStart(), zzlu);
        }
    }
}
