package com.aspose.words;

import androidx.appcompat.widget.C21559Oooo0oO;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTN {
    private static com.aspose.words.internal.zzZNR zzXRM = new com.aspose.words.internal.zzZNR("(am/pm|AM/PM)|(g|G)|(yyyy|YYYY)|(yy|YY)|(MMMM)|(MMM)|(MM)|(M)|(dddd)|(ddd)|(dd)|(d)|(hh)|(h)|(HH)|(H)|(mm)|(m)|(ss|SS)|(s|S)|'(.*?)'|([^gGyYMdHhmsSapAP]*)", 0);
    private zzYQ0 zzXRN;
    private zzYQD zzXRO;
    private zzYRM zzXRP;
    private zzYOZ zzXRQ;
    private zzYOW zzXRR;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYTN(zzYOR zzyor, zzYPM zzypm, zzYOW zzyow, zzYOZ zzyoz, zzYRM zzyrm, zzYQD zzyqd, zzYQ0 zzyq0) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXRR = zzyow;
        this.zzXRQ = zzyoz;
        this.zzXRP = zzyrm;
        this.zzXRO = zzyqd;
        this.zzXRN = zzyq0;
    }

    private void zzF(zzYEF zzyef) {
        zz7X zz7x = (zz7X) zzyef.get(830);
        if (zz7x == null) {
            return;
        }
        this.zzXRT.zzYsG().zzY("loext:graphic-properties");
        this.zzXRT.zzYsG().zz0("draw:fill", zzYS3.zzss(zz7x.zzZQ4()));
        this.zzXRT.zzYsG().zz0("draw:fill-color", zzYOU.zzZQ(zz7x.zz8Q().zzPF()));
        if (!com.aspose.words.internal.zzAN.zzL(zz7x.getOpacity(), 1.0d)) {
            this.zzXRT.zzYsG().zz0("draw:opacity", zzYOU.zzrn(com.aspose.words.internal.zzSA.zzl(1.0d - zz7x.getOpacity())));
        }
        this.zzXRT.zzYsG().zzp();
    }

    private static String zzGF(String str) {
        if (str.length() >= 2 && str.charAt(0) == '\'' && androidx.core.content.OooO0O0.OooO00o(1, str) == '\'') {
            return str.substring(1, str.length() - 1).replace("''", "'");
        }
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z || cCharAt != '\\') {
                sb.append(cCharAt);
                z = false;
            } else {
                z = true;
            }
        }
        return sb.toString();
    }

    private String zzGI(String str) {
        if (this.zzXRT.zzYsE()) {
            return str;
        }
        com.aspose.words.internal.zzD3<String> zzd3ZzYs8 = this.zzXRT.zzYs8();
        int i = 0;
        String str2 = str;
        while (zzd3ZzYs8.containsValue(str2)) {
            str2 = com.aspose.words.internal.zzZKN.format("{0}_{1}", str, Integer.valueOf(i));
            i++;
        }
        zzd3ZzYs8.add(zzd3ZzYs8.getCount(), str2);
        return str2;
    }

    private boolean zzH(Inline inline) {
        return zzZ7R.zzY(inline).getStyleIdentifier() == 85 && this.zzXRT.zzYs4();
    }

    private boolean zzI(Inline inline) {
        return (!inline.isDeleteRevision() || this.zzXRT.zzYs0() || zzYOW.zzXv(inline)) ? false : true;
    }

    private void zzN(com.aspose.words.internal.zzZNT zzznt) {
        zzN("number:seconds", C21559Oooo0oO.OooO0OO(zzznt, 20), C21559Oooo0oO.OooO0OO(zzznt, 19));
    }

    private void zzO(com.aspose.words.internal.zzZNT zzznt) {
        zzN("number:minutes", C21559Oooo0oO.OooO0OO(zzznt, 18), C21559Oooo0oO.OooO0OO(zzznt, 17));
    }

    private void zzP(com.aspose.words.internal.zzZNT zzznt) {
        com.aspose.words.internal.zzZNU zzznuZzhJ = zzznt.zzhJ();
        boolean z = true;
        boolean z2 = com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(14).getValue()) || com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(16).getValue());
        if (!com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(13).getValue()) && !com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(15).getValue())) {
            z = false;
        }
        zzN("number:hours", z2, z);
    }

    private void zzQ(com.aspose.words.internal.zzZNT zzznt) {
        zzN("number:day-of-week", C21559Oooo0oO.OooO0OO(zzznt, 10), C21559Oooo0oO.OooO0OO(zzznt, 9));
    }

    private void zzR(com.aspose.words.internal.zzZNT zzznt) {
        zzN("number:day", C21559Oooo0oO.OooO0OO(zzznt, 12), C21559Oooo0oO.OooO0OO(zzznt, 11));
    }

    private void zzT(com.aspose.words.internal.zzZNT zzznt) {
        zzN("number:year", C21559Oooo0oO.OooO0OO(zzznt, 4), C21559Oooo0oO.OooO0OO(zzznt, 3));
    }

    private void zzU(com.aspose.words.internal.zzZNT zzznt) {
        if (C21559Oooo0oO.OooO0OO(zzznt, 2)) {
            this.zzXRT.zzYsG().zzZ("number:era", (String) null);
        }
    }

    private boolean zzYyf() {
        zzYEF zzyefZzZYh = this.zzXRT.getDocument().getStyles().getByStyleIdentifier(0).zzZYh();
        return zzyefZzZYh.getLocaleId() == 127 || zzyefZzZYh.getLocaleIdBi() == 127 || zzyefZzZYh.getLocaleIdFarEast() == 127;
    }

    private static boolean zzZP(ShapeBase shapeBase) {
        Object objZzPk = shapeBase.zzYvW().zzPk(136);
        if (objZzPk == null) {
            return false;
        }
        Integer num = (Integer) objZzPk;
        return num.intValue() == 3 || num.intValue() == 1;
    }

    private void zzZQ(ShapeBase shapeBase) {
        if (zzZP(shapeBase)) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("style:paragraph-properties");
            zzytgZzYsG.zz0("style:writing-mode", "tb-rl");
            zzytgZzYsG.zzo();
        }
    }

    private boolean zzZa(Paragraph paragraph) {
        return this.zzXRT.zzYsp() && !this.zzXRT.zzYs0() && (paragraph.getParentNode() instanceof Comment) && ((Comment) com.aspose.words.internal.zzZKW.zzZ(paragraph.getParentNode(), Comment.class)).isDeleteRevision();
    }

    private void zzZb(Paragraph paragraph) {
        if (zzZa(paragraph)) {
            return;
        }
        this.zzXRS.zzYtN();
        zzy(this.zzXRS.getNextParagraphStyleName(), "paragraph", zzQ(paragraph));
        zzW(paragraph, this.zzXRS.zzYtM() == 1 && paragraph.getParentSection().zz9I(), false);
        zzF(paragraph.zzYp5());
        this.zzXRO.zzZ((zzZ9Q) paragraph, (zzZS) paragraph.zzZYj(), false);
        this.zzXRQ.zzZ((zzZ9G) paragraph, paragraph.zzYp5(), false);
        this.zzXRT.zzYsG().zzo();
    }

    private void zzy(String str, String str2, String str3) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("style:style");
        zzytgZzYsG.zzGz(zzGI(str));
        zzytgZzYsG.zz0("style:family", str2);
        zzytgZzYsG.zz0("style:parent-style-name", zzYOU.zzDq(str3));
    }

    public final void zzGG(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("number:date-style");
            zzytgZzYsG.zzGz(this.zzXRS.zzYtR());
            if (zzYyf()) {
                zzytgZzYsG.zz0("number:automatic-order", TelemetryEventStrings.Value.TRUE);
                zzytgZzYsG.zz0("number:format-source", "language");
            }
            Iterator<com.aspose.words.internal.zzZNT> it = zzXRM.zzUW(str).iterator();
            while (it.hasNext()) {
                zzV(it.next());
            }
            zzytgZzYsG.zzo();
        }
    }

    public final void zzGH(String str) {
        this.zzXRT.zzYsG().zzY("style:default-style");
        this.zzXRT.zzYsG().zz0("style:family", str);
    }

    public final void zzIg() throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXRT.zzYsL();
        this.zzXRT.zzrd(0);
        zzytgZzYsG.zzY("office:automatic-styles");
        this.zzXRR.zzYsV();
        Iterator<T> it = this.zzXRT.getDocument().getSections().iterator();
        while (it.hasNext()) {
            this.zzXRT.zzK((Section) it.next());
            this.zzXRT.zzYBx().accept(this.zzXRT);
        }
        zzytgZzYsG.zzo();
        this.zzXRT.zzYsL();
    }

    public final void zzJ(Inline inline) {
        if (zzI(inline)) {
            return;
        }
        zzy(this.zzXRS.zzYtV(), "text", !zzH(inline) ? zzQ(inline) : null);
        this.zzXRQ.zzZ((zzZ9G) inline, inline.zzZYh(), false);
        this.zzXRT.zzYsG().zzo();
    }

    public final void zzK(Style style) {
        if (style.getType() == 3) {
            return;
        }
        String strZzI = zzYS3.zzI(style);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzI)) {
            zzy(strZzI, zzYS3.zzs5(style.getType()), zzQ(style));
            zzYMX zzymxZzZYj = style.zzZYj();
            if (zzymxZzZYj.getOutlineLevel() != 9) {
                this.zzXRT.zzYsG().zzZj("style:default-outline-level", zzymxZzZYj.getOutlineLevel() + 1);
            }
            if (style.getType() != 2) {
                this.zzXRO.zzZ((zzZ9Q) style, (zzZS) zzymxZzZYj, false);
            }
            this.zzXRQ.zzZ((zzZ9G) style, style.zzZYh(), false);
            this.zzXRT.zzYsG().zzo();
        }
    }

    public final void zzL(Section section) {
        zzy(this.zzXRS.zzYtS(), "section", null);
        if (zzYOR.zzC(section)) {
            zzYOR zzyor = this.zzXRT;
            this.zzXRT.zzYsG().zz0("style:master-page-name", zzZ(zzyor, zzyor.zzYBx()));
        }
        this.zzXRN.zzJ(section);
        this.zzXRT.zzYsG().zzo();
    }

    public final Style zzS(zzZ9G zzz9g) {
        Object objZzPk;
        Style styleZzVp;
        Style style = (Style) com.aspose.words.internal.zzZKW.zzZ(zzz9g, Style.class);
        if (style != null) {
            return style;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9g, Paragraph.class);
        if (paragraph != null) {
            return zzZ(this.zzXRT, paragraph);
        }
        Footnote footnote = (Footnote) com.aspose.words.internal.zzZKW.zzZ(zzz9g, Footnote.class);
        if (footnote != null) {
            return footnote.getParentParagraph().zzqy(0);
        }
        if ((zzz9g instanceof Shape) || (zzz9g instanceof GroupShape)) {
            return zzR(zzz9g);
        }
        Inline inline = (Inline) zzz9g;
        zzZMK zzzmk = (zzZMK) inline.zzZYh().zzPk(10010);
        if (zzzmk != null && (objZzPk = zzzmk.zzZ6C().zzPk(1000)) != null && (styleZzVp = this.zzXRT.getDocument().getStyles().zzVp(((Integer) objZzPk).intValue(), 0)) != null && styleZzVp.getStyleIdentifier() != 65) {
            return styleZzVp;
        }
        Style styleZzZ8 = inline.getDocument().getStyles().zzZ8(inline.zzZYh().zzZ7j(), false);
        if (styleZzZ8 == null || styleZzZ8.getStyleIdentifier() == 65) {
            return null;
        }
        return styleZzZ8;
    }

    public final void zzV(Paragraph paragraph, boolean z, boolean z2) {
        this.zzXRO.zzSk(z);
        this.zzXRO.zzSl(z2);
        zzZb(paragraph);
        this.zzXRO.zzSk(false);
        this.zzXRO.zzSl(false);
    }

    public final void zzW(Paragraph paragraph, boolean z, boolean z2) {
        boolean z3 = paragraph != null && paragraph.zzYB9() == null && paragraph.getParentSection().getPageSetup().getSectionStart() == 0 && !zzYOR.zzW(paragraph.getParentSection(), (Section) com.aspose.words.internal.zzZKW.zzZ(paragraph.getParentSection().getPreviousSibling(), Section.class));
        if ((this.zzXRT.zzYsj() || z || z3) && !this.zzXRT.zzYs0()) {
            zzYOR zzyor = this.zzXRT;
            String strZzZ = zzZ(zzyor, zzyor.zzYBx());
            if (strZzZ == null && (!z2 || z)) {
                strZzZ = "Standard";
            }
            this.zzXRT.zzYsG().zz0("style:master-page-name", strZzZ);
            this.zzXRT.zzYsi();
        }
    }

    public final void zzX(ShapeBase shapeBase, boolean z) throws Exception {
        zzy(z ? this.zzXRS.zzYtV() : this.zzXRS.zzYtT(), z ? "text" : "graphic", zzQ(shapeBase));
        if (z) {
            this.zzXRQ.zzZ((zzZ9G) shapeBase, shapeBase.zzZYh(), false);
        } else {
            this.zzXRP.zzZM(shapeBase);
            zzZQ(shapeBase);
        }
        this.zzXRT.zzYsG().zzo();
    }

    public final void zzYw(String str, String str2) {
        zzy(str, str2, null);
    }

    public final void zzZ(Run run, zzYEJ zzyej) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzy(this.zzXRS.zzYtU(), "ruby", null);
        zzytgZzYsG.zzY("style:ruby-properties");
        zzytgZzYsG.zz0("style:ruby-align", zzYS3.zzsA(zzyej.zzZGm));
        zzytgZzYsG.zz0("style:ruby-position", "above");
        zzytgZzYsG.zzo();
        zzytgZzYsG.zzo();
        zzy(this.zzXRS.zzYtV(), "text", zzQ(run));
        this.zzXRQ.zzZ((zzZ9G) run, zzyej.zzYe7().zzYe5().zzXqg, false);
        this.zzXRT.zzYsG().zzo();
    }

    public final void zzZc(Paragraph paragraph) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        zzy(this.zzXRS.zzYtT(), "graphic", "Standard");
        zzytgZzYsG.zzY("style:graphic-properties");
        zzytgZzYsG.zz0("draw:stroke", "none");
        zzytgZzYsG.zz0("draw:fill", "none");
        zzytgZzYsG.zz0("fo:border-top", "none");
        zzytgZzYsG.zz0("fo:border-bottom", "none");
        zzytgZzYsG.zz0("fo:border-left", "none");
        zzytgZzYsG.zz0("fo:border-right", "none");
        zzytgZzYsG.zz0("style:horizontal-pos", zzYS3.zzsf(zzymxZzZYj.zzYpH()));
        zzytgZzYsG.zz0("style:horizontal-rel", zzYS3.zzsg(zzymxZzZYj.zzYpz()));
        zzytgZzYsG.zz0("style:vertical-pos", zzYS3.zzsi(zzymxZzZYj.zzYpE()));
        zzytgZzYsG.zz0("style:vertical-rel", zzYS3.zzsj(zzymxZzZYj.zzYpy()));
        zzytgZzYsG.zz0("style:flow-with-text", TelemetryEventStrings.Value.FALSE);
        if (zzymxZzZYj.zzYpx() == 1) {
            zzytgZzYsG.zz0("style:wrap", "none");
        }
        zzytgZzYsG.zz0("fo:wrap-option", "no-wrap");
        zzytgZzYsG.zz0("draw:auto-grow-height", TelemetryEventStrings.Value.TRUE);
        zzytgZzYsG.zz0("draw:auto-grow-width", TelemetryEventStrings.Value.TRUE);
        zzytgZzYsG.zzo();
        this.zzXRT.zzYsG().zzo();
    }

    private void zzV(com.aspose.words.internal.zzZNT zzznt) {
        zzU(zzznt);
        zzT(zzznt);
        zzS(zzznt);
        zzR(zzznt);
        zzP(zzznt);
        zzO(zzznt);
        zzN(zzznt);
        zzQ(zzznt);
        if (C21559Oooo0oO.OooO0OO(zzznt, 1)) {
            this.zzXRT.zzYsG().zzZ("number:am-pm", (String) null);
        }
        String strZzGF = zzGF(zzznt.zzhJ().zzQx(21).getValue() + zzznt.zzhJ().zzQx(22).getValue());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzGF)) {
            this.zzXRT.zzYsG().zzZ("number:text", strZzGF);
        }
    }

    private static boolean zzJ(Style style) {
        return style == null || style.getStyleIdentifier() == 107;
    }

    private void zzX(String str, boolean z, boolean z2, boolean z3) {
        if (z || z2) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY(str);
            if (z2) {
                zzytgZzYsG.zz0("number:style", "long");
            }
            if (z3) {
                zzytgZzYsG.zz0("number:textual", TelemetryEventStrings.Value.TRUE);
            }
            zzytgZzYsG.zzo();
        }
    }

    private void zzN(String str, boolean z, boolean z2) {
        zzX(str, z, z2, false);
    }

    private String zzQ(zzZ9G zzz9g) {
        Style styleZzS = zzS(zzz9g);
        if (styleZzS == null) {
            return null;
        }
        if (!(zzz9g instanceof Style)) {
            return zzYS3.zzI(styleZzS);
        }
        Style styleZzZ8 = styleZzS.getStyles().zzZ8(styleZzS.zzY3v(), false);
        if (styleZzZ8 != null) {
            return zzYS3.zzI(styleZzZ8);
        }
        return null;
    }

    private static Style zzR(zzZ9G zzz9g) {
        ShapeBase shapeBase = (ShapeBase) zzz9g;
        Paragraph parentParagraph = shapeBase.getParentParagraph();
        GroupShape groupShape = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getParentNode(), GroupShape.class);
        if (groupShape != null) {
            parentParagraph = groupShape.getParentParagraph();
        }
        if (parentParagraph == null) {
            return null;
        }
        return parentParagraph.zzqy(0);
    }

    public final void zzO(Comment comment) {
        if (!comment.isDeleteRevision() || this.zzXRT.zzYs0()) {
            zzy(this.zzXRS.zzYtV(), "text", zzQ(comment.getParentParagraph()));
            this.zzXRQ.zzZ((zzZ9G) comment.getParentParagraph(), comment.zzZYh(), false);
            this.zzXRT.zzYsG().zzo();
        }
    }

    private static Style zzZ(zzYOR zzyor, Paragraph paragraph) {
        Object objZzPk;
        zzZMK zzzmk = (zzZMK) paragraph.zzZYj().zzPk(10010);
        if (zzzmk != null && (objZzPk = zzzmk.zzZ6C().zzPk(1000)) != null) {
            return zzyor.getDocument().getStyles().zzVp(((Integer) objZzPk).intValue(), 0);
        }
        return paragraph.zzqy(0);
    }

    private void zzS(com.aspose.words.internal.zzZNT zzznt) {
        com.aspose.words.internal.zzZNU zzznuZzhJ = zzznt.zzhJ();
        boolean z = true;
        boolean z2 = com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(8).getValue()) || com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(6).getValue());
        boolean z3 = com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(7).getValue()) || com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(5).getValue());
        if (!com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(6).getValue()) && !com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(5).getValue())) {
            z = false;
        }
        zzX("number:month", z2, z3, z);
    }

    public static String zzZ(zzYOR zzyor, Section section) {
        int iIndexOf = zzyor.getDocument().getSections().indexOf(section);
        if (iIndexOf != 0) {
            return com.aspose.words.internal.zzZKN.format("MasterPage{0}", Integer.valueOf(iIndexOf));
        }
        if (zzyor.zzYsE()) {
            return null;
        }
        return "Standard";
    }

    public final void zzO(Footnote footnote) {
        zzy(this.zzXRS.zzYtV(), "text", zzQ(footnote));
        this.zzXRQ.zzZ((zzZ9G) footnote, footnote.zzZYh(), false);
        this.zzXRT.zzYsG().zzo();
    }

    public final void zzZ(ListLevel listLevel, List list, String str) {
        if (this.zzXRQ.zzE(listLevel.zzZYh())) {
            Style styleZzZ8 = this.zzXRT.getDocument().getStyles().zzZ8(list.zzYPa().zzYOO(), false);
            zzy(str, "text", zzJ(styleZzZ8) ? "" : zzYS3.zzI(styleZzZ8));
            this.zzXRQ.zzS2(false);
            this.zzXRT.zzYsG().zzo();
        }
    }
}
