package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPJ {
    private static int zzYrK = 6;
    private zzYRE zzXMi;
    private zzYRY zzXQS;
    private zzYTG zzXQU;
    private zzYTN zzXQW;
    private zzYQD zzXRO;
    private zzYOZ zzXRQ;
    private zzYOW zzXRR;
    private zzYOR zzXRT;
    private HeaderFooter[] zzYsl = new HeaderFooter[zzYrK];

    public zzYPJ(zzYOR zzyor, zzYTN zzytn, zzYOW zzyow, zzYRE zzyre, zzYOZ zzyoz) throws Exception {
        this.zzXRT = zzyor;
        this.zzXQW = zzytn;
        this.zzXRR = zzyow;
        this.zzXMi = zzyre;
        this.zzXRQ = zzyoz;
        this.zzXQU = zzyor.zzDg("/styles.xml");
        this.zzXQS = new zzYRY(this.zzXRT);
        this.zzXRO = new zzYQD(this.zzXRT);
    }

    private zzYQJ zzD(Section section) {
        WordAttrCollection wordAttrCollection = (WordAttrCollection) section.zzYvR().zzbn();
        zzYQJ zzyqj = new zzYQJ(this.zzXRT);
        for (int i = 0; i < wordAttrCollection.getCount(); i++) {
            int iZzT3 = wordAttrCollection.zzT3(i);
            Object objZzVY = wordAttrCollection.zzVY(i);
            if (objZzVY != null && !zzyqj.zzd(iZzT3, objZzVY)) {
                switch (iZzT3) {
                    case CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH /* 2010 */:
                        String strZzrU = zzYQU.zzrU(((Integer) objZzVY).intValue());
                        if (!"1".equals(strZzrU)) {
                            zzyqj.zzXNR = strZzrU;
                        }
                        break;
                    case 2210:
                        zzyqj.zzXNS = zzYS3.zzs3(((Integer) objZzVY).intValue());
                        break;
                    case 2240:
                        zzyqj.setBorderDistanceFrom(((Integer) objZzVY).intValue());
                        break;
                    case 2260:
                        zzyqj.zzXNU = this.zzXRT.zzr2(((Integer) objZzVY).intValue());
                        break;
                    case 2270:
                        zzyqj.zzXNT = this.zzXRT.zzr2(((Integer) objZzVY).intValue());
                        break;
                    case 2280:
                        zzyqj.zzrl(((Integer) objZzVY).intValue());
                        break;
                    case 2290:
                        zzyqj.zzrk(((Integer) objZzVY).intValue());
                        break;
                    case 2300:
                        zzyqj.zzrj(((Integer) objZzVY).intValue());
                        break;
                    case 2310:
                        zzyqj.zzri(((Integer) objZzVY).intValue());
                        break;
                    case 2320:
                        zzyqj.zzvR(((Integer) objZzVY).intValue());
                        break;
                    case 2330:
                        zzyqj.zzvQ(((Integer) objZzVY).intValue());
                        break;
                    case 2440:
                        zzZ(objZzVY, zzyqj);
                        break;
                    case 2450:
                        zzyqj.zzDP(((Boolean) objZzVY).booleanValue() ? "rl-tb" : "lr-tb");
                        break;
                }
            }
        }
        if (zzY(section, 1) != null) {
            zzyqj.zzYv9();
        }
        if (zzY(section, 3) != null) {
            zzyqj.zzYv8();
        }
        if (zzyqj.zzXNS == null) {
            zzyqj.zzXNS = zzYS3.zzs3(((Integer) zzYCZ.zzOt(2210)).intValue());
        }
        return zzyqj;
    }

    private void zzE(Section section) {
        Document document = this.zzXRT.getDocument();
        ViewOptions viewOptions = document.getViewOptions();
        int pageColor = document.getPageColor();
        zzYQJ zzyqjZzD = zzD(section);
        this.zzXQU.zz0("style:print-orientation", zzyqjZzD.zzXNS);
        this.zzXQU.zz0("fo:page-width", zzyqjZzD.zzXNU);
        this.zzXQU.zz0("fo:page-height", zzyqjZzD.zzXNT);
        this.zzXQU.zz0("style:writing-mode", zzyqjZzD.zzYtp());
        this.zzXQU.zz0("style:num-format", zzyqjZzD.zzXNR);
        if (zzZ(pageColor, viewOptions)) {
            this.zzXQU.zz0("fo:background-color", zzYOU.zzZQ(new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzZQ1.zzRh(pageColor))));
        }
        zzyqjZzD.zzYw4();
    }

    private void zzF(Section section) throws Exception {
        Document document = this.zzXRT.getDocument();
        zzYQ0 zzyq0 = new zzYQ0(this.zzXRT);
        zzYQ2 zzyq2ZzW = zzyq0.zzW(section.zzYvR());
        this.zzXQU.zzY("style:page-layout-properties");
        zzE(section);
        if (zzZ(zzyq2ZzW, section)) {
            zzyq0.zzYui();
        }
        if (document.getBackgroundShape() != null && document.getViewOptions().getDisplayBackgroundShape()) {
            this.zzXMi.zzZ("style:background-image", document.getBackgroundShape());
        }
        this.zzXQU.zzo();
    }

    private void zzG(List list) throws Exception {
        int i = list.isMultiLevel() ? 9 : 1;
        for (int i2 = 0; i2 < i; i2++) {
            zzZ(list.zzxw(i2), list.getListId(), i2);
        }
    }

    private void zzH(List list) throws Exception {
        this.zzXQU.zzY("text:list-style");
        this.zzXQU.zzGz(com.aspose.words.internal.zzZKN.format("LS{0}", Integer.valueOf(list.getListId())));
        zzG(list);
        this.zzXQU.zzo();
    }

    private void zzI(List list) {
        int i = list.isMultiLevel() ? 9 : 1;
        for (int i2 = 0; i2 < i; i2++) {
            ListLevel listLevelZzxw = list.zzxw(i2);
            if (listLevelZzxw.zzZYh().getCount() > 0 && !listLevelZzxw.zzYOb()) {
                this.zzXQW.zzZ(listLevelZzxw, list, com.aspose.words.internal.zzZKN.format("List{0}Level{1}", Integer.valueOf(list.getListId()), Integer.valueOf(i2)));
            }
        }
    }

    private void zzJ(ListLevel listLevel) {
        if (listLevel.zzYOb()) {
            double size = ((double) listLevel.zzZYh().getSize()) / 2.0d;
            double dZzYz = com.aspose.words.internal.zzZPW.zzYz(listLevel.zzZ0P().zzYzG().getSize());
            double dIntBitsToFloat = Float.intBitsToFloat((int) listLevel.zzZ0P().zzYzG().getSize());
            if (size < dZzYz) {
                dIntBitsToFloat *= size / dZzYz;
            } else {
                size = dZzYz;
            }
            this.zzXQU.zz0("fo:width", this.zzXRT.zzWu(dIntBitsToFloat));
            this.zzXQU.zz0("fo:height", this.zzXRT.zzWu(size));
        }
    }

    private void zzK(ListLevel listLevel) {
        this.zzXQU.zzY("style:list-level-properties");
        String strZzWu = this.zzXRT.zzWu(listLevel.getTextPosition() - listLevel.getNumberPosition());
        if (listLevel.getAlignment() == 2) {
            this.zzXQU.zz0("text:min-label-width", this.zzXRT.zzWu(listLevel.getTextPosition()));
            this.zzXQU.zz0("text:min-label-distance", strZzWu);
        } else {
            this.zzXQU.zz0("text:space-before", this.zzXRT.zzWu(listLevel.getNumberPosition()));
            this.zzXQU.zz0("text:min-label-width", strZzWu);
        }
        this.zzXQU.zz0("fo:text-align", zzYS3.zzsc(listLevel.getAlignment()));
        zzJ(listLevel);
        if (listLevel.getTrailingCharacter() == 2 || listLevel.getTrailingCharacter() == 0) {
            this.zzXQU.zz0("text:list-level-position-and-space-mode", "label-alignment");
            this.zzXQU.zzY("style:list-level-label-alignment");
            this.zzXQU.zz0("text:label-followed-by", zzYS3.zzsz(listLevel.getTrailingCharacter()));
            this.zzXQU.zz0("fo:margin-left", this.zzXRT.zzr2(listLevel.zzZYj().zzYM7()));
            this.zzXQU.zz0("fo:text-indent", this.zzXRT.zzr2(listLevel.zzZYj().zzYMa()));
            this.zzXQU.zzo();
        }
        this.zzXQU.zzo();
    }

    private static boolean zzL(ListLevel listLevel) {
        return (com.aspose.words.internal.zzAN.zzZD(listLevel.getTextPosition()) && com.aspose.words.internal.zzAN.zzZD(listLevel.getNumberPosition()) && listLevel.getAlignment() == 0 && !listLevel.zzYOb()) ? false : true;
    }

    private String zzM(ListLevel listLevel) {
        String strZzT = this.zzXQU.zzT(listLevel.getNumberFormat());
        return com.aspose.words.internal.zzZYD.zzXk(strZzT) ? strZzT.substring(0, 1) : " ";
    }

    private String zzN(ListLevel listLevel) throws Exception {
        this.zzXQU.zzY("text:list-level-style-image");
        this.zzXMi.zzZ("text:list-level-style-image", listLevel.zzZ0P());
        return "text:list-level-style-image";
    }

    private String zzO(ListLevel listLevel) {
        this.zzXQU.zzY("text:list-level-style-bullet");
        this.zzXQU.zz0("text:bullet-char", zzM(listLevel));
        return "text:list-level-style-bullet";
    }

    private void zzS4(boolean z) {
        Document document = this.zzXRT.getDocument();
        zzZAU endnoteOptions = z ? document.getEndnoteOptions() : document.getFootnoteOptions();
        this.zzXQU.zzY("text:notes-configuration");
        this.zzXQU.zz0("text:note-class", z ? "endnote" : "footnote");
        this.zzXQU.zz0("style:num-format", zzYQU.zzrU(endnoteOptions.getNumberStyle()));
        if (endnoteOptions.getStartNumber() > 0) {
            this.zzXQU.zz0("text:start-value", Integer.toString(endnoteOptions.getStartNumber() - 1));
        }
        this.zzXQU.zz0("text:footnotes-position", zzYS3.zzsm(endnoteOptions.getLocation()));
        this.zzXQU.zz0("text:start-numbering-at", zzYS3.zzsp(endnoteOptions.getRestartRule()));
        zzZa("text:citation-style-name", z ? 42 : 38);
        zzZa("text:citation-body-style-name", z ? 43 : 29);
        this.zzXQU.zzo();
    }

    private void zzW(Section section, int i) throws Exception {
        HeaderFooter headerFooterZzY = zzY(section, i);
        if (headerFooterZzY != null) {
            headerFooterZzY.accept(this.zzXRT);
        }
    }

    private String zzX(ListLevel listLevel, int i, int i2) {
        String numberFormat = listLevel.getNumberFormat();
        String strZzZ = zzZ(listLevel, i2, numberFormat);
        this.zzXQU.zz0("text:style-name", com.aspose.words.internal.zzZKN.format("List{0}Level{1}", Integer.valueOf(i), Integer.valueOf(i2)));
        this.zzXQU.zz0("style:num-suffix", zzYS3.zzZf(numberFormat, i2));
        this.zzXQU.zz0("style:num-prefix", zzYS3.zzX(listLevel, i2));
        return strZzZ;
    }

    private String zzY(ListLevel listLevel, int i, int i2) throws Exception {
        return listLevel.zzYOb() ? zzN(listLevel) : zzX(listLevel, i, i2);
    }

    private void zzYe(String str, String str2) {
        if (this.zzXRT.zzYsI().isStrictSchema11() && com.aspose.words.internal.zzZYD.zzXk(str2) && com.aspose.words.internal.zzZKN.zzW(str2, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            this.zzXQU.zz0(str, com.aspose.words.internal.zzZKN.format("{0}cm", com.aspose.words.internal.zzJB.zzZZ(com.aspose.words.internal.zzJB.parseDouble(str2.replace("%", "")) / 10000.0d)));
        } else {
            this.zzXQU.zz0(str, str2);
        }
    }

    private void zzYtA() {
        StyleCollection styles = this.zzXRT.getDocument().getStyles();
        for (int i = 0; i < styles.getCount(); i++) {
            Style style = styles.get(i);
            if (zzY0C.zzZ(style, this.zzXRT.getWarningCallback(), 15)) {
                this.zzXQW.zzK(style);
            }
        }
        zzZ(styles, 38, this.zzXRT.zzYsf());
        zzZ(styles, 42, this.zzXRT.zzYsh());
    }

    private void zzYtB() {
        this.zzXQW.zzGH("table");
        this.zzXQU.zzX("style:table-properties", "table:border-model", "collapsing");
        this.zzXQU.zzo();
        this.zzXQW.zzGH("table-column");
        zzYTG zzytg = this.zzXQU;
        Boolean bool = Boolean.TRUE;
        zzytg.zzX("style:table-column-properties", "style:use-optimal-column-width", bool);
        this.zzXQU.zzo();
        this.zzXQW.zzGH("table-row");
        this.zzXQU.zzX("style:table-row-properties", "style:use-optimal-row-height", bool);
        this.zzXQU.zzo();
    }

    private void zzYtC() {
        StyleCollection styles = this.zzXRT.getDocument().getStyles();
        Style byStyleIdentifier = styles.getByStyleIdentifier(0);
        this.zzXQW.zzGH("paragraph");
        this.zzXRO.zzZ((zzZ9Q) byStyleIdentifier, (zzZS) styles.zzY36(), true);
        this.zzXRQ.zzZ((zzZ9G) byStyleIdentifier, styles.zzY37(), true);
        this.zzXQU.zzo();
    }

    private void zzYtD() {
        zzYtC();
        zzYtB();
    }

    private void zzYtE() throws Exception {
        for (List list : this.zzXRT.getDocument().getLists()) {
            zzI(list);
            zzH(list);
        }
    }

    private void zzYtF() {
        zzS4(false);
        zzS4(true);
    }

    private void zzYtG() {
        for (int i = 0; i < this.zzXRT.zzYsc().zzYu3(); i++) {
            zzYR1 zzyr1 = (zzYR1) this.zzXRT.zzYsc().zzrF(i);
            this.zzXQU.zzX("draw:marker", "draw:name", zzyr1.getName(), "draw:display-name", zzyr1.getDisplayName(), "svg:viewBox", zzyr1.zzYvA(), "svg:d", zzyr1.zzYvz());
        }
    }

    private void zzYtH() {
        for (int i = 0; i < this.zzXRT.zzYsb().zzYu3(); i++) {
            zzYRP zzyrp = (zzYRP) this.zzXRT.zzYsb().zzrF(i);
            this.zzXQU.zzX("draw:gradient", "draw:name", zzyrp.getName(), "draw:display-name", zzyrp.getDisplayName(), "draw:style", zzyrp.zzG7(), "draw:cx", zzyrp.zzYwg(), "draw:cy", zzyrp.zzYwf(), "draw:angle", zzyrp.zzYwe(), "draw:border", zzyrp.zzYwd(), "draw:start-color", zzyrp.zzYwc(), "draw:end-color", zzyrp.zzYwb(), "draw:start-intensity", zzyrp.zzYwa(), "draw:end-intensity", zzyrp.zzYw9());
        }
    }

    private void zzYtI() {
        for (int i = 0; i < this.zzXRT.zzYsd().zzYu3(); i++) {
            zzYPR zzypr = (zzYPR) this.zzXRT.zzYsd().zzrF(i);
            this.zzXQU.zzY("draw:stroke-dash");
            this.zzXQU.zz0("draw:name", zzypr.getName());
            this.zzXQU.zz0("draw:display-name", zzypr.getDisplayName());
            this.zzXQU.zz0("draw:style", zzypr.zzG7());
            this.zzXQU.zz0("draw:dots1", zzypr.zzYub());
            zzYe("draw:dots1-length", zzypr.zzYua());
            this.zzXQU.zz0("draw:dots2", zzypr.zzYu9());
            zzYe("draw:dots2-length", zzypr.zzYu8());
            zzYe("draw:distance", zzypr.zzYu7());
            this.zzXQU.zzo();
        }
    }

    private void zzYtJ() {
        zzYCZ zzyczZzYvR = this.zzXRT.getDocument().getFirstSection().zzYvR();
        Object objZzPk = zzyczZzYvR.zzPk(2120);
        if (objZzPk != null) {
            Integer num = (Integer) objZzPk;
            if (num.intValue() == 0) {
                return;
            }
            Object objZzPk2 = zzyczZzYvR.zzPk(2180);
            Object objZzPk3 = zzyczZzYvR.zzPk(EditingLanguage.MALAY_BRUNEI_DARUSSALAM);
            this.zzXQU.zzY("text:linenumbering-configuration");
            this.zzXQU.zz0("text:number-lines", TelemetryEventStrings.Value.TRUE);
            this.zzXQU.zzP("text:increment", num);
            this.zzXQU.zz0("text:offset", this.zzXRT.zzr2(zzyczZzYvR.zzYLm()));
            if (objZzPk2 != null || objZzPk3 != null) {
                this.zzXQU.zz0("text:restart-on-page", TelemetryEventStrings.Value.TRUE);
            }
            this.zzXQU.zzo();
        }
    }

    private void zzYtK() throws Exception {
        this.zzXRT.zzrd(5);
        zzYtx();
        for (Section section = (Section) this.zzXRT.getDocument().getFirstChild(); section != null; section = (Section) section.getNextSibling()) {
            zzI(section);
        }
    }

    private void zzYtL() throws Exception {
        zzYtK();
        this.zzXRT.zzrd(2);
        this.zzXQU.zzY("office:styles");
        zzYtG();
        zzYtI();
        zzYtH();
        zzYtD();
        zzYtA();
        zzYtE();
        zzYtF();
        zzYtJ();
        this.zzXQU.zzo();
    }

    private void zzYtx() {
        HeaderFooter[] headerFooterArr = this.zzYsl;
        com.aspose.words.internal.zzZKV.zzY(headerFooterArr, headerFooterArr.length);
    }

    private void zzYty() throws Exception {
        Document document = this.zzXRT.getDocument();
        zzYtx();
        this.zzXQU.zzY("office:master-styles");
        for (Section section = (Section) document.getFirstChild(); section != null; section = (Section) section.getNextSibling()) {
            zzZ(section, (String) null);
        }
        if (this.zzXRT.zzYsh()) {
            zzZ(document.getLastSection(), "Endnote");
        }
        this.zzXQU.zzo();
    }

    private void zzYtz() throws Exception {
        this.zzXRT.zzrd(3);
        this.zzXRT.zzYsL();
        zzYtx();
        this.zzXQU.zzY("office:automatic-styles");
        this.zzXRR.zzYsV();
        for (Section section = (Section) this.zzXRT.getDocument().getFirstChild(); section != null; section = (Section) section.getNextSibling()) {
            if (zzYOR.zzC(section)) {
                zzH(section);
                zzI(section);
            }
        }
        this.zzXQU.zzo();
        this.zzXRT.zzYsL();
    }

    private void zzZ(ListLevel listLevel, int i, int i2) throws Exception {
        zzY(listLevel, i, i2);
        this.zzXQU.zzZj("text:level", i2 + 1);
        if (zzL(listLevel)) {
            zzK(listLevel);
        }
        if (this.zzXRQ.zzE(listLevel.zzZYh()) && !listLevel.zzYOb()) {
            this.zzXRQ.zzS2(false);
        }
        this.zzXQU.zzo();
    }

    private void zzZa(String str, int i) {
        StyleCollection styles = this.zzXRT.getDocument().getStyles();
        if (styles.contains(i)) {
            this.zzXQU.zz0(str, zzYS3.zzI(styles.getByStyleIdentifier(i)));
        }
    }

    public final void zzIg() throws Exception {
        this.zzXQU.zzY(this.zzXRT);
        this.zzXQS.zzIg();
        zzYtL();
        zzYtz();
        zzYty();
        this.zzXQU.endDocument();
    }

    private String zzG(Section section) {
        return com.aspose.words.internal.zzZKN.format("pm{0}", Integer.valueOf(this.zzXRT.getDocument().getSections().indexOf(section) + 1));
    }

    private String zzY(ListLevel listLevel, int i, String str) {
        this.zzXQU.zzY("text:list-level-style-number");
        this.zzXQU.zzX("style:num-format", zzYQU.zzrU(listLevel.getNumberStyle()));
        this.zzXQU.zz0("text:display-levels", zzYS3.zzZe(str, i));
        if (listLevel.getStartAt() > 1) {
            this.zzXQU.zz0("text:start-value", Integer.toString(listLevel.getStartAt()));
        }
        return "text:list-level-style-number";
    }

    private void zzH(Section section) throws Exception {
        this.zzXQU.zzY("style:page-layout");
        this.zzXQU.zz0("style:name", zzG(section));
        zzF(section);
        if (zzY(section, 1) != null) {
            zzY(section, true);
        }
        if (zzY(section, 3) != null) {
            zzY(section, false);
        }
        this.zzXQU.zzo();
    }

    private void zzX(Section section, boolean z) throws Exception {
        zzW(section, z ? 4 : 1);
        zzW(section, z ? 5 : 3);
        if (section.getPageSetup().getOddAndEvenPagesHeaderFooter()) {
            zzW(section, 0);
            zzW(section, 2);
        }
    }

    private void zzI(Section section) throws Exception {
        if (section.getPageSetup().getDifferentFirstPageHeaderFooter()) {
            zzX(section, true);
        }
        zzX(section, false);
    }

    private String zzZ(ListLevel listLevel, int i, String str) {
        if (listLevel.getNumberStyle() == 23) {
            return zzO(listLevel);
        }
        return zzY(listLevel, i, str);
    }

    private void zzY(Section section, boolean z) {
        String str = z ? "style:header-style" : "style:footer-style";
        zzYCZ zzyczZzYvR = section.zzYvR();
        this.zzXQU.zzY(str);
        this.zzXQU.zzY("style:header-footer-properties");
        if (z) {
            this.zzXQU.zz0("fo:min-height", this.zzXRT.zzr2(zzyczZzYvR.zzZRg() - zzyczZzYvR.zzYLy()));
        } else {
            this.zzXQU.zz0("fo:min-height", this.zzXRT.zzr2(zzyczZzYvR.zzZRf() - zzyczZzYvR.zzYLx()));
        }
        this.zzXQU.zz0("style:dynamic-spacing", TelemetryEventStrings.Value.TRUE);
        this.zzXQU.zzo();
        this.zzXQU.zzo();
    }

    private void zzZ(StyleCollection styleCollection, int i, boolean z) {
        if (styleCollection.contains(i) || !z) {
            return;
        }
        this.zzXQW.zzK(styleCollection.getByStyleIdentifier(i));
    }

    private void zzZ(Section section, String str) throws Exception {
        if (zzYOR.zzC(section)) {
            this.zzXRT.zzrd(4);
            boolean differentFirstPageHeaderFooter = section.getPageSetup().getDifferentFirstPageHeaderFooter();
            if (str == null) {
                str = zzYTN.zzZ(this.zzXRT, section);
            }
            String str2 = com.aspose.words.internal.zzZKN.format("MasterPageNext{0}", Integer.valueOf(this.zzXRT.getDocument().getSections().indexOf(section)));
            if (differentFirstPageHeaderFooter) {
                zzZ(section, str, str2, true);
                zzZ(section, str2, null, false);
            } else {
                zzZ(section, str, null, false);
            }
        }
    }

    private HeaderFooter zzY(Section section, int i) {
        HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType != null && byHeaderFooterType.hasChildNodes()) {
            this.zzYsl[byHeaderFooterType.getHeaderFooterType()] = byHeaderFooterType;
            return byHeaderFooterType;
        }
        return this.zzYsl[i];
    }

    private void zzZ(Section section, String str, String str2, boolean z) throws Exception {
        this.zzXQU.zzY("style:master-page");
        this.zzXQU.zzGz(str);
        this.zzXQU.zz0("style:page-layout-name", zzG(section));
        this.zzXQU.zz0("style:next-style-name", str2);
        if (!"Endnote".equals(str)) {
            zzX(section, z);
        }
        this.zzXQU.zzo();
    }

    private static boolean zzZ(zzYQ2 zzyq2, Section section) {
        Document documentZzYBb = section.zzYBb();
        return zzyq2.zzXMr > 0 && documentZzYBb.getSections().getCount() == 1 && !documentZzYBb.zzZpV().zzYVg.getNoColumnBalance();
    }

    private static boolean zzZ(int i, ViewOptions viewOptions) {
        if (com.aspose.words.internal.zzZQ1.zzRk(i)) {
            return false;
        }
        return viewOptions.getDisplayBackgroundShape() || viewOptions.getViewType() == 5;
    }

    private static void zzZ(Object obj, zzYQJ zzyqj) {
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 1) {
            zzyqj.zzDP("tb-rl");
        }
        if (iIntValue == 3) {
            zzyqj.zzDP("rl-tb");
        }
    }
}
