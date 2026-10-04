package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ2 extends zzZ1K implements zzZAO {
    private static int zzYrK = 6;
    private zzYE2 zzYQL;
    private Document zzYTQ;
    private zzZJ6 zzYrJ;
    private zzYXT zzYrL;
    private Paragraph zzYrM;
    private boolean zzYrN;
    private boolean zzYrO;
    private zzZJX zzYrP;
    private zzZF3[] zzYrR;
    private zzZGY zzYrT;
    private zzZFE zzYrU;
    private zzZFA zzYrV;
    private zzZF0 zzYrW;
    private zzZFR zzYrX;
    private zzZEF zzYrY;
    private zzZDT zzYrZ;
    private zzY86 zzYs0;
    private zzYWQ zzYs1;
    private zzZJA zzYs2;
    private zzZFT zzYs3;
    private zzZ1F zzYs4;
    private zzZN8 zzYs5;
    private zzYDW zzYs6;
    private zzZ1J zzYs7;
    private zzZH4 zzYs8;
    private zzZIL zzYs9;
    private zzZEU zzYsa;
    private zzZES zzYsb;
    private zzZET zzYsc;
    private zzZJC zzYsd;
    private zzZHM zzYse;
    private zzZGH zzYsf;
    private zzZIO zzYsg;
    private zzY3P zzYsh;
    private com.aspose.words.internal.zzZOP zzYsi;
    private zzZKU zzYsj;
    private HeaderFooter[] zzYsk;
    private HeaderFooter[] zzYsl;
    ArrayList<zzZE7> zzYsm;
    private zzZHP zzYsr;
    private zzZJU zzYsy;
    private zzZH5 zzYsz;
    private HtmlSaveOptions zzYt2;
    private com.aspose.words.internal.zzZYG<String> zzYt3;
    private zzZE7 zzZEa;
    private zzYDZ zzZFZ;
    private String zzZS;
    private LinkedList<zzZE3> zzYrS = new LinkedList<>();
    private com.aspose.words.internal.zzZQC<zzZ> zzYrQ = new com.aspose.words.internal.zzZQC<>();

    public static class zzZ {
        private StructuredDocumentTag zzYHQ;
        private boolean zzYrH;
        private boolean zzYrI;

        public zzZ(StructuredDocumentTag structuredDocumentTag, boolean z, boolean z2) {
            this.zzYHQ = structuredDocumentTag;
            this.zzYrI = z;
            this.zzYrH = z2;
        }

        public final boolean zzZ39() {
            return this.zzYrH;
        }

        public final boolean zzZ3a() {
            return this.zzYrI;
        }

        public final StructuredDocumentTag zzZh6() {
            return this.zzYHQ;
        }
    }

    public zzZJ2(Document document, com.aspose.words.internal.zzZOP zzzop, String str, HtmlSaveOptions htmlSaveOptions, zzYDZ zzydz, zzY86 zzy86, zzYWQ zzywq) {
        this.zzYTQ = document;
        this.zzYsi = zzzop;
        this.zzZS = str;
        this.zzYt2 = htmlSaveOptions;
        this.zzZFZ = zzydz;
        this.zzYs0 = zzy86;
        this.zzYs1 = zzywq;
        this.zzYt3 = com.aspose.words.internal.zzP.zzZ(zzydz.zzXp0);
        if (this.zzZFZ.zzXpa.getSaveFormat() == 53 || this.zzZFZ.zzXpa.getSaveFormat() == 54) {
            this.zzYrL = new zzYXT(this.zzZFZ.zzXpa.getSaveFormat());
            this.zzYsm = new ArrayList<>();
        } else {
            this.zzYrL = null;
            this.zzYsm = null;
        }
    }

    private static boolean zz0(Paragraph paragraph) {
        Node firstChild = paragraph.getFirstChild();
        boolean z = false;
        while (firstChild != null) {
            if ((firstChild.getNodeType() != 9 && firstChild.getNodeType() != 10) || !zzZJU.zzL0(((zzZD7) com.aspose.words.internal.zzZKW.zzZ(firstChild, zzZD7.class)).getName())) {
                return false;
            }
            firstChild = firstChild.getNextSibling();
            z = true;
        }
        return z;
    }

    private static boolean zz1(Paragraph paragraph) {
        boolean z = false;
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() != 9 && firstChild.getNodeType() != 10) {
                return false;
            }
            if (!zzZJU.zzL0(((zzZD7) com.aspose.words.internal.zzZKW.zzZ(firstChild, zzZD7.class)).getName())) {
                z = true;
            }
        }
        return z;
    }

    private static boolean zz2(Paragraph paragraph) {
        if (paragraph.getRuns().getCount() == 0) {
            return false;
        }
        for (Node node : paragraph.getChildNodes(0, false)) {
            if (node.getNodeType() != 21 || !com.aspose.words.internal.zzZYD.zzXi(((Run) node).getText())) {
                if ((node.getNodeType() != 9 && node.getNodeType() != 10) || !zzZJU.zzL0(((zzZD7) com.aspose.words.internal.zzZKW.zzZ(node, zzZD7.class)).getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean zz3(Paragraph paragraph) {
        Node firstChild = paragraph.getFirstChild();
        boolean z = false;
        while (firstChild != null) {
            if (firstChild.getNodeType() != 24) {
                return false;
            }
            firstChild = firstChild.getNextSibling();
            z = true;
        }
        return z;
    }

    private static boolean zz4(Paragraph paragraph) {
        Run runZzRD = paragraph.zzRD(false);
        return runZzRD != null && com.aspose.words.internal.zzZKN.zzW(runZzRD.getText(), ControlChar.LINE_BREAK, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private static boolean zz5(Paragraph paragraph) {
        boolean z = false;
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() != 9 && firstChild.getNodeType() != 10) {
                if (!(firstChild instanceof ShapeBase)) {
                    return false;
                }
                ShapeBase shapeBase = (ShapeBase) firstChild;
                if (zzZ1E.zz0(shapeBase) && (shapeBase.getWrapType() != 3 || !zzZ1E.zzZZ(shapeBase))) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    private static boolean zz6(Paragraph paragraph) {
        if (paragraph.zzZYw()) {
            return zz5(paragraph) || zz4(paragraph) || zz3(paragraph);
        }
        if (paragraph.isEndOfCell() && (paragraph.zzYB6() instanceof Table)) {
            return false;
        }
        return !paragraph.isEndOfSection() || paragraph.isEndOfDocument() || paragraph.getParentStory().zz6T();
    }

    private void zz7(Paragraph paragraph) throws Exception {
        this.zzYsf.zzZ0K();
        this.zzYs3.zzZ08();
        com.aspose.words.internal.zzZQC<StructuredDocumentTag> zzzqcZzZ3d = zzZ3d();
        zzS(paragraph.getParentSection());
        zzZ3h();
        zzZ3g();
        zzZ3w();
        this.zzYsg = this.zzYs9.zzZ2U();
        zzZ3x();
        this.zzZEa.startDocument();
        zzZ3p();
        zzZ3i();
        zzT(paragraph.getParentSection());
        zzY(zzzqcZzZ3d);
        this.zzYs3.zzS(paragraph, this.zzYt2.getExportRoundtripInformation());
    }

    private boolean zz8(Paragraph paragraph) {
        return this.zzYs9 != null && this.zzYsg.zzYrq == paragraph;
    }

    private static boolean zz9(Paragraph paragraph) {
        return (!paragraph.hasChildNodes() || zz0(paragraph)) && paragraph.isEndOfSection() && !paragraph.isEndOfDocument() && !paragraph.getParentStory().zz6T();
    }

    private void zzS(Section section) throws Exception {
        zzZ(section, false);
        this.zzZEa.endElement("div");
    }

    private void zzVt(boolean z) throws Exception {
        this.zzYrV.zzYZh();
        this.zzYsf.zzZ0K();
        this.zzZEa.zzZN("br", 1);
        zzLU zzlu = new zzLU();
        if (z) {
            zzlu.zzZs("mso-column-break-before", "always");
            zzlu.zzZs("clear", "both");
        } else {
            zzlu.zzZs("page-break-before", "always");
            zzlu.zzZs("clear", "both");
        }
        this.zzYsa.zzV(zzlu);
        this.zzZEa.endElement("br");
    }

    private boolean zzX(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) {
        return paragraph == null || paragraph2 == null || this.zzYt2.getCssStyleSheetType() != 0 || zz8(paragraph2) || zz1(paragraph) || zz1(paragraph2) || zzZDY.zzX(paragraph, zzymx, paragraph2, zzymx2);
    }

    private void zzZ3A() throws Exception {
        zzZN8 zzzn8 = new zzZN8();
        this.zzYs5 = zzzn8;
        this.zzYsc = new zzZET(this.zzYTQ, this.zzYt2, zzzn8);
        if (this.zzYt2.getExportFontResources()) {
            zzZHP zzzhpZzZ3u = zzZ3u();
            this.zzYsr = zzzhpZzZ3u;
            zzzhpZzZ3u.zzZ21();
        }
        if (this.zzYTQ.zzZqi()) {
            this.zzYTQ.zzZqk();
        }
        zzZ3l();
        zzZ3m();
        this.zzYs6 = new zzYDW(this.zzYTQ, this.zzYt2, 262144);
        zzZ3y();
        zzZ3x();
    }

    private void zzZ3B() throws Exception {
        if (this.zzYs3.zzZ07() == 3) {
            this.zzYsf.zzZ0K();
        }
    }

    private com.aspose.words.internal.zzZQC<StructuredDocumentTag> zzZ3d() throws Exception {
        com.aspose.words.internal.zzZQC<StructuredDocumentTag> zzzqc = new com.aspose.words.internal.zzZQC<>();
        while (this.zzYrQ.size() > 0) {
            zzzqc.push(this.zzYrQ.peek().zzZh6());
            zzZ3H();
        }
        return zzzqc;
    }

    private void zzZ3e() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (ShapeBase shapeBase : this.zzYTQ.getChildNodes(18, true)) {
            if (shapeBase.getWrapType() == 3) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<ShapeBase>) arrayList, shapeBase);
            }
        }
        for (ShapeBase shapeBase2 : this.zzYTQ.getChildNodes(17, true)) {
            if (shapeBase2.getWrapType() == 3) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<ShapeBase>) arrayList, shapeBase2);
            }
        }
        this.zzYrR = arrayList.size() != 0 ? zzZF3.zzZ(this.zzYTQ, arrayList) : null;
    }

    private void zzZ3f() throws Exception {
        this.zzYsa.zzZ3f();
        Shape backgroundShape = this.zzYTQ.getBackgroundShape();
        if (backgroundShape == null || !backgroundShape.getFilled()) {
            return;
        }
        Shading shading = new Shading();
        shading.zzZK(backgroundShape.zzY9J().zz8Q());
        this.zzYs5.zzU(shading);
    }

    private void zzZ3g() throws Exception {
        this.zzYsb.zzZ(this.zzYsc, this.zzZEa);
    }

    private void zzZ3h() throws Exception {
        this.zzYrP.close();
        this.zzYse.zzIg();
        this.zzYsd.zzVu(this.zzYt2.getExportRoundtripInformation());
        this.zzZEa.zzp();
    }

    private void zzZ3i() throws Exception {
        this.zzZEa.zzZN("body", 0);
        if (!this.zzYt2.zzYZ4() && this.zzYt2.getExportLanguageInformation()) {
            this.zzYs8.zzZ1D();
        }
        zzZ3f();
    }

    private void zzZ3j() throws Exception {
        zzZ3i();
        for (Node firstChild = this.zzYTQ.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzY((Section) firstChild);
        }
        zzZ3h();
    }

    private void zzZ3k() throws Exception {
        zzZHJ zzzhj = new zzZHJ(this.zzZS, this.zzYs0);
        if (!this.zzYt2.zzYZ4()) {
            new zzZHH(this.zzZEa, zzzhj).zzp(this.zzYTQ);
            return;
        }
        this.zzZEa.zzZN("body", 0);
        zzLU zzlu = new zzLU();
        zzlu.zzU("height", 100.0d);
        this.zzYsc.zzY(new zzLT(zzMD.zzSi("html"), zzlu));
        zzLU zzlu2 = new zzLU();
        zzlu2.zzU("height", 100.0d);
        zzlu2.zzU(0.0d, 0.0d, 0.0d, 0.0d);
        this.zzYsc.zzY(new zzLT(zzMD.zzSi("body"), zzlu2));
        String strZzKb = this.zzYsc.zzKb("aw-iframe-table");
        String strZzKb2 = this.zzYsc.zzKb("aw-iframe");
        zzLU zzlu3 = new zzLU();
        zzlu3.zzU("width", 100.0d);
        zzlu3.zzU("height", 100.0d);
        this.zzYsc.zzY(new zzLT(zzMD.zzSh(strZzKb), zzlu3));
        this.zzYsc.zzY(new zzLT(zzMD.zzSh(strZzKb2), zzlu3));
        new zzZH2(this.zzZEa, zzzhj, this.zzYrZ, strZzKb, strZzKb2).zzp(this.zzYTQ);
        this.zzZEa.endElement("body");
    }

    private void zzZ3l() {
        if (this.zzYt2.getExportPageSetup() || this.zzYt2.getExportPageMargins()) {
            int i = 0;
            while (i < this.zzYTQ.getSections().getCount()) {
                zzLU zzlu = new zzLU();
                zzZET zzzet = this.zzYsc;
                StringBuilder sb = new StringBuilder("Section_");
                int i2 = i + 1;
                sb.append(com.aspose.words.internal.zzJB.zzWD(i2));
                String strZzKb = zzzet.zzKb(sb.toString());
                PageSetup pageSetup = this.zzYTQ.getSections().get(i).getPageSetup();
                if (this.zzYt2.getExportPageSetup()) {
                    zzLU zzlu2 = new zzLU();
                    zzL5.zzZ(pageSetup, zzlu2);
                    if (this.zzYt2.getExportRoundtripInformation()) {
                        zzY(pageSetup, zzlu2);
                        zzX(pageSetup, zzlu2);
                    }
                    this.zzYsc.zzZ(new zzN0(new zzMZ(new String[]{strZzKb}), zzlu2.zzZWe()));
                    zzlu.zzZs("page", strZzKb);
                }
                if (this.zzYt2.getExportPageMargins()) {
                    zzlu.zzZ("margin-top", pageSetup.getTopMargin(), 4);
                    zzlu.zzZ("margin-left", pageSetup.getLeftMargin(), 4);
                    zzlu.zzZ("margin-right", pageSetup.getRightMargin(), 4);
                    zzlu.zzZ("margin-bottom", pageSetup.getBottomMargin(), 4);
                }
                this.zzYsc.zzY(new zzLT(zzMD.zzSi("div").zzS9(strZzKb), zzlu));
                i = i2;
            }
        }
    }

    private void zzZ3m() throws Exception {
        int iZzMc;
        if (this.zzYt2.zzYZc() && (iZzMc = zzL5.zzMc(this.zzYTQ.getFirstSection().getPageSetup().zzYLa())) != 0) {
            zzLU zzlu = new zzLU();
            zzlu.zzZs("-epub-writing-mode", zzL5.zzMa(iZzMc));
            this.zzYsc.zzY(new zzLT(zzMD.zzSi("html"), zzlu));
        }
        if (this.zzYTQ.getViewOptions().getDisplayBackgroundShape() && this.zzYTQ.getBackgroundShape() != null && this.zzYTQ.getBackgroundShape().getFilled() && this.zzYTQ.getBackgroundShape().zzY9J().getFillType() == 7) {
            zzLU zzlu2 = new zzLU();
            zzlu2.zzU("height", 100.0d);
            this.zzYsc.zzY(new zzLT(zzMD.zzSi("html"), zzlu2));
        }
        if (this.zzYt2.getCssStyleSheetType() != 0) {
            this.zzYsc.zzYYO();
        }
    }

    private void zzZ3n() {
        this.zzZEa.zzZN("meta", 1);
        this.zzZEa.zzX("charset", this.zzYt2.zzZ9Y().zzi1());
        this.zzZEa.endElement("meta");
    }

    private void zzZ3o() {
        this.zzZEa.zzZN("meta", 1);
        this.zzZEa.zzX("http-equiv", "Content-Type");
        this.zzZEa.zzX(FirebaseAnalytics.Param.CONTENT, com.aspose.words.internal.zzZKN.format("{0}; charset={1}", com.aspose.words.internal.zzZYD.zzXk(this.zzYt2.zzYZ5()) ? this.zzYt2.zzYZ5() : "text/html", this.zzYt2.zzZ9Y().zzi1()));
        this.zzZEa.endElement("meta");
        this.zzZEa.zzZN("meta", 1);
        this.zzZEa.zzX("http-equiv", "Content-Style-Type");
        this.zzZEa.zzX(FirebaseAnalytics.Param.CONTENT, "text/css");
        this.zzZEa.endElement("meta");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ3p() throws Exception {
        this.zzZEa.zzZN("head", 0);
        int iZzYZ1 = this.zzYt2.zzYZ1();
        if (iZzYZ1 == 0 || iZzYZ1 == 1) {
            zzZ3o();
        } else if (iZzYZ1 == 2) {
            zzZ3n();
        } else if (iZzYZ1 == 3) {
        }
        zzZ7("description", this.zzYTQ.getBuiltInDocumentProperties().getSubject());
        zzZ7("keywords", this.zzYTQ.getBuiltInDocumentProperties().getKeywords());
        if (this.zzYt2.getExportGeneratorName()) {
            zzZ7("generator", "Aspose.Words for Android via Java 24.3.0");
        }
        this.zzZEa.zzZN(NoteMeta.PROPERTY_TITLE, 0);
        this.zzZEa.writeString(this.zzYTQ.getBuiltInDocumentProperties().getTitle());
        this.zzZEa.endElement(NoteMeta.PROPERTY_TITLE);
        if (this.zzYt2.zzYZ4() && com.aspose.words.internal.zzZKN.equals(this.zzYTQ.getBuiltInDocumentProperties().getTitle(), "")) {
            this.zzYrZ.zzT(WarningType.HINT, "Document title is empty that doesn't conform to HTML5 standard (element title must not be empty).");
        }
        if (this.zzYt2.getExportDocumentProperties()) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, this.zzYt2.getPrettyFormat());
            zzYVC.zzZ(this.zzYTQ, (com.aspose.words.internal.zzHW) zzp, true);
            zzp.flush();
            zzzor.zzH(0L);
            String strZziv = new com.aspose.words.internal.zzZOO(zzzor).zziv();
            this.zzZEa.zzKK("gte mso 9");
            this.zzZEa.zzZN("xml", 0);
            this.zzZEa.zzY(strZziv, true);
            this.zzZEa.endElement("xml");
            this.zzZEa.zzZ2r();
        }
        DocumentProperty documentProperty = this.zzYTQ.getCustomDocumentProperties().get("Base Target");
        if (documentProperty != null) {
            this.zzZEa.zzZN("base", 1);
            this.zzZEa.zzX("target", documentProperty.toString());
            this.zzZEa.endElement("base");
        }
        this.zzZEa.endElement("head");
    }

    private String zzZ3q() throws Exception {
        return !com.aspose.words.internal.zzZKN.equals(this.zzYt2.getCssStyleSheetFileName(), "") ? com.aspose.words.internal.zzZOQ.zzVd(this.zzYt2.getCssStyleSheetFileName()) : "";
    }

    private boolean zzZ3r() {
        return !(com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolderAlias(), "")) && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getImagesFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getImagesFolderAlias(), "");
    }

    private boolean zzZ3s() {
        return !(com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolderAlias(), "")) && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolderAlias(), "");
    }

    private boolean zzZ3t() throws Exception {
        return !(com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getResourceFolderAlias(), "")) && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolder(), "") && com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolderAlias(), "") && this.zzYt2.getCssStyleSheetType() == 2 && com.aspose.words.internal.zzZKN.equals(zzZ3q(), "");
    }

    private zzZHP zzZ3u() throws Exception {
        return new zzZHP(this.zzZS, this.zzYs0, !com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolder(), "") ? this.zzYt2.getFontsFolder() : this.zzYt2.getResourceFolder(), !com.aspose.words.internal.zzZKN.equals(this.zzYt2.getFontsFolderAlias(), "") ? this.zzYt2.getFontsFolderAlias() : this.zzYt2.getResourceFolderAlias(), "Font file cannot be written to disk. When saving to a stream or to a string either FontsFolder should be specified, or custom streams should be provided via FontSavingCallback, or ExportFontsAsBase64 should be set to true. Please see documentation for details.", zzZ3t(), zzZ3s(), this.zzYrL, this.zzYTQ, this.zzYt2);
    }

    private zzZ8D zzZ3v() throws Exception {
        return new zzZ8D(this.zzZS, this.zzYs0, !com.aspose.words.internal.zzZKN.equals(this.zzYt2.getImagesFolder(), "") ? this.zzYt2.getImagesFolder() : this.zzYt2.getResourceFolder(), !com.aspose.words.internal.zzZKN.equals(this.zzYt2.getImagesFolderAlias(), "") ? this.zzYt2.getImagesFolderAlias() : this.zzYt2.getResourceFolderAlias(), "Image file cannot be written to disk. When saving to a stream or to a string either ImagesFolder should be specified, or custom streams should be provided via ImageSavingCallback, or ExportImagesAsBase64 should be set to true. Please see documentation for details.", zzZ3r(), this.zzYt2.getImageSavingCallback());
    }

    private void zzZ3w() throws Exception {
        zzYWQ zzywq;
        while (this.zzYrS.size() != 0) {
            this.zzYrS.removeFirst().run();
        }
        if (!this.zzYt2.getAllowNegativeIndent() && this.zzZEa.zzYXW() != null) {
            zzZG6.zzZ(this.zzZEa.zzYXW(), this.zzYsc.zzZVv(), this.zzYt2, this.zzYTQ.getWarningCallback());
        }
        if (this.zzZEa.zzYXW() != null) {
            zzZF1.zzY(this.zzZEa.zzYXW());
        }
        if (this.zzZFZ.zzXpa.getSaveFormat() == 53 || this.zzZFZ.zzXpa.getSaveFormat() == 54) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYsm, this.zzZEa);
            if (this.zzYs9 == null || (zzywq = this.zzYs1) == null) {
                return;
            }
            zzZIO zzzio = this.zzYsg;
            zzywq.zzYC(zzzio.zzYrn, zzzio.zzYro);
            return;
        }
        com.aspose.words.internal.zzZOP zzzopZzXU9 = this.zzYsh.zzXU9();
        if (this.zzZEa.zzYXW() != null) {
            zzZI0 zzzi0 = new zzZI0(zzzopZzXU9, this.zzYt2);
            this.zzZEa.zzYXW().zzZ(zzzi0);
            zzzi0.flush();
        }
        if (this.zzYs9 != null) {
            if (this.zzYs0 != null) {
                this.zzYs0.zzX(new zzYM(this.zzYt2.zzZ9Y(), this.zzYt2.zzYZ5(), this.zzYsg.zzYrn, com.aspose.words.internal.zzZYQ.zzZX(this.zzYsh.zzXU9()), 0, r5.length));
            }
            this.zzYsh.zzXU8();
            zzYWQ zzywq2 = this.zzYs1;
            if (zzywq2 != null) {
                zzZIO zzzio2 = this.zzYsg;
                zzywq2.zzYC(zzzio2.zzYrn, zzzio2.zzYro);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ3x() throws Exception {
        com.aspose.words.internal.zzZOP zzzop;
        if (this.zzYs9 == null) {
            this.zzYsh = new zzY3P(this.zzYsi, true);
        } else if (this.zzYt2.getDocumentPartSavingCallback() != null) {
            DocumentPartSavingArgs documentPartSavingArgs = new DocumentPartSavingArgs(this.zzYTQ, this.zzYsg.zzYrn);
            this.zzYt2.getDocumentPartSavingCallback().documentPartSaving(documentPartSavingArgs);
            if (this.zzYs0 != null && documentPartSavingArgs.zzro()) {
                throw new IllegalStateException("DocumentPartStream cannot be specified. When saving to EPUB format that is a container based on HTML, all document parts must be encapsulated into the output package.");
            }
            this.zzYsg.zzYrn = documentPartSavingArgs.getDocumentPartFileName();
            zzY3P zzy3pZzZVm = documentPartSavingArgs.zzro() ? documentPartSavingArgs.zzZVm() : null;
            if (zzy3pZzZVm == null) {
                if (this.zzYsh == null && (zzzop = this.zzYsi) != null) {
                    zzy3pZzZVm = new zzY3P(zzzop, true);
                } else if (this.zzYs0 != null) {
                    zzy3pZzZVm = new zzY3P((com.aspose.words.internal.zzZOP) new com.aspose.words.internal.zzZOR(), true);
                } else {
                    if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZS)) {
                        throw new IllegalStateException("Document part file cannot be written. When saving the document either output file name should be specified or custom streams should be provided via DocumentPartSavingCallback. Please see documentation for details.");
                    }
                    zzy3pZzZVm = new zzY3P((com.aspose.words.internal.zzZOP) com.aspose.words.internal.zzZOU.zzVl(com.aspose.words.internal.zzZOQ.zzZW(com.aspose.words.internal.zzZOQ.zzVd(this.zzZS), this.zzYsg.zzYrn)), false);
                }
            }
            this.zzYsh = zzy3pZzZVm;
        }
        this.zzZEa = new zzZE7();
        this.zzYrS.size();
    }

    private void zzZ3y() throws Exception {
        int i = zzYrK;
        this.zzYsl = new HeaderFooter[i];
        this.zzYsk = new HeaderFooter[i];
        this.zzYrZ = new zzZDT(this.zzYTQ);
        this.zzYs5 = new zzZN8();
        this.zzYs8 = new zzZH4(this.zzYTQ, this.zzYt2.getExportLanguageInformation(), this);
        this.zzYrU = new zzZFE(this.zzYTQ.getLayoutOptions().getRevisionOptions(), this);
        this.zzYsb = new zzZES(this.zzZS, this.zzYt2, this.zzYTQ, this.zzYrO, this.zzYs0, this.zzYrZ, this.zzYrL);
        this.zzYsy = new zzZJU(this.zzYt3, this.zzYt2, this);
        this.zzYsz = new zzZH5(this.zzYTQ, this.zzYt2.zzYZc(), this, this.zzYsy);
        this.zzYrJ = new zzZJ6(this.zzYsr);
        zzZ1F zzz1f = new zzZ1F(this, this.zzYsz, this.zzYt2.zzYZ3(), zzZ3v(), this.zzYs0, this.zzYTQ.zzZqx(), this.zzYrJ, !this.zzYt2.getExportOriginalUrlForLinkedImages(), this.zzYt2.getPrettyFormat(), this.zzYt2.zzZ9Y(), this.zzYrL);
        this.zzYs4 = zzz1f;
        this.zzYsa = new zzZEU(this.zzYTQ, this.zzYsc, this, this.zzYt2, this.zzYs5, zzz1f);
        this.zzYrP = new zzZJX(this, this.zzYTQ.zzZq2(), this.zzYt2.getExportRoundtripInformation());
        this.zzYrX = new zzZFR(this.zzYTQ, this, this.zzYt2, this.zzYs1, this.zzYs8, this.zzYs5);
        this.zzYrW = new zzZF0(this.zzYTQ, this, this.zzYs8, this.zzYt2);
        this.zzYrT = new zzZGY(this, this.zzYsa, this.zzYrU, this.zzYt2, this.zzZFZ, this.zzYrZ, this.zzYrL);
        this.zzYse = new zzZHM(this, this.zzYsz, this.zzYsy, this.zzYrW, this.zzYTQ.getFootnoteOptions(), this.zzYTQ.getEndnoteOptions(), this.zzYt2.getExportRoundtripInformation());
        this.zzYsd = new zzZJC(this.zzYTQ, this, this.zzYsz, this.zzYsy, this.zzZFZ);
        zzZEF zzzef = new zzZEF(this.zzYTQ, this, this.zzYs8, this.zzYt2, this.zzYrP, this.zzYrO);
        this.zzYrY = zzzef;
        this.zzYrV = new zzZFA(this.zzYrW, this, zzzef);
        this.zzYQL = new zzYE2(this.zzYrV, this.zzYTQ.getCompatibilityOptions(), this.zzYt2.getExportLanguageInformation() ? 3 : 1);
        zzYLW zzylw = new zzYLW(this, this.zzYsy);
        zzZGH zzzgh = new zzZGH(this.zzYTQ, this.zzYt2, this.zzYs8, this, this.zzYrX, this.zzYQL, this.zzYrU, this.zzYsc, this.zzYs1, zzylw);
        this.zzYsf = zzzgh;
        this.zzYs3 = new zzZFT(this, zzzgh);
        if (this.zzYt2.getCssStyleSheetType() == 0) {
            this.zzYs2 = new zzZJA(this, this.zzYt2.getExportRoundtripInformation());
        }
        zzZI3 zzzi3 = new zzZI3(this.zzYTQ, this.zzYt2, this.zzYQL, this.zzYsz, this, this.zzYrW, this.zzYsy);
        if (this.zzYt2.getDocumentSplitCriteria() != 0) {
            Document document = this.zzYTQ;
            String str = this.zzZS;
            HtmlSaveOptions htmlSaveOptions = this.zzYt2;
            zzZIL zzzil = new zzZIL(document, str, htmlSaveOptions, zzzi3, htmlSaveOptions.getCssStyleSheetType() == 0);
            zzzi3 = zzzi3;
            this.zzYs9 = zzzil;
            this.zzYsg = zzzil.zzZ2U();
        }
        this.zzYs7 = new zzZ1J(this.zzYsf, this, zzzi3, this.zzYsy, this.zzYrY, this.zzYs5, new zzZ1E(this, this.zzYs4, this.zzYsf), zzylw, this.zzYs6);
        zzZ3e();
    }

    private void zzZ3z() throws Exception {
        zzYWQ zzywq;
        zzZHP zzzhp = this.zzYsr;
        if (zzzhp != null) {
            this.zzYsc.zzZ(zzzhp.zzZ20());
        }
        zzZ3g();
        zzZ3w();
        if (this.zzYs9 == null && (zzywq = this.zzYs1) != null) {
            zzywq.zzYC(null, null);
        }
        this.zzYs6.complete();
    }

    private void zzZ7(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzZEa.zzZN("meta", 1);
            this.zzZEa.zzX("name", str);
            this.zzZEa.zzX(FirebaseAnalytics.Param.CONTENT, str2);
            this.zzZEa.endElement("meta");
        }
    }

    private void zzZ9(Node node) throws Exception {
        node.accept(this.zzYs7);
        this.zzYsf.zzZ0K();
    }

    private static boolean zzZZ(Paragraph paragraph) {
        return (paragraph.getParagraphBreakFont().getHidden() && zz1(paragraph)) ? false : true;
    }

    private void zzZm7() throws Exception {
        this.zzZEa.startDocument();
        if (this.zzYt2.zzYZ4()) {
            this.zzYs8.zzZ1D();
        }
        zzZ3p();
        if (this.zzYTQ.getFrameset() != null) {
            zzZ3k();
        } else {
            zzZ3j();
        }
    }

    public static String zzzO(int i) {
        switch (i) {
            case 1:
                return "h1";
            case 2:
                return "h2";
            case 3:
                return "h3";
            case 4:
                return "h4";
            case 5:
                return "h5";
            case 6:
                return "h6";
            default:
                return ContextChain.TAG_PRODUCT;
        }
    }

    @Override // com.aspose.words.zzZAO
    public final String zzKR(String str) {
        zzZIO zzzioZzKP;
        String str2;
        if (!com.aspose.words.internal.zzZVR.zzWw(str)) {
            return (com.aspose.words.internal.zzZVR.zzWF(str) || !com.aspose.words.internal.zzZVR.zzWE(str)) ? str : com.aspose.words.internal.zzZKN.format("file:///{0}", str);
        }
        String strSubstring = str.substring(1);
        com.aspose.words.internal.zzZYG<String> zzzyg = this.zzYt3;
        if (zzzyg != null && (str2 = zzzyg.get(strSubstring)) != null) {
            str = "#".concat(str2);
        }
        zzZIL zzzil = this.zzYs9;
        return (zzzil == null || (zzzioZzKP = zzzil.zzKP(strSubstring)) == null || zzzioZzKP == this.zzYsg) ? str : androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzzioZzKP.zzYrn, str);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzL(FieldStart fieldStart) {
        if (this.zzYrM == null) {
            Paragraph parentParagraph = fieldStart.getParentParagraph();
            this.zzYrM = zzY(parentParagraph, zzZDY.zzZI(parentParagraph));
        }
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzQ(Inline inline) throws Exception {
        boolean z;
        zzYEF zzyefZzZYh;
        this.zzYrW.zzO(inline);
        zzZJA zzzja = this.zzYs2;
        if (zzzja != null) {
            this.zzYrW.zzz4(zzzja.zzT(inline));
        }
        if (this.zzYs9 != null) {
            z = false;
            int i = 0;
            while (this.zzYsg.zzYrq == inline) {
                String text = inline.getText();
                int i2 = this.zzYsg.zzYrp;
                if (i2 > i) {
                    this.zzYQL.zzZ(C22241OooO0Oo.OooO00o(i2, i, i, i, text), inline.getFont());
                }
                if (!this.zzYs9.zzZ2V()) {
                    this.zzYs7.lock();
                    return 1;
                }
                zzZJA zzzja2 = this.zzYs2;
                if (zzzja2 != null) {
                    zzzja2.zzZ3M();
                }
                zzZJ9.zzY(this.zzZEa.zzYXX());
                this.zzYrW.zzYYY();
                if (this.zzYsf.zzZ0J()) {
                    this.zzZEa.endElement("li");
                } else {
                    this.zzYrX.zzYZQ();
                }
                zz7(inline.getParentParagraph());
                Node nextSibling = this.zzYsg.zzYrs;
                while (nextSibling != null && !(nextSibling instanceof Inline)) {
                    nextSibling = nextSibling.getNextSibling();
                }
                if (nextSibling instanceof Inline) {
                    this.zzYrN = false;
                    Paragraph parentParagraph = ((Inline) nextSibling).getParentParagraph();
                    this.zzYrX.zzY(parentParagraph, parentParagraph.zzqw(StyleIdentifier.COLORFUL_GRID_ACCENT_6), 0, true);
                } else {
                    this.zzYrN = true;
                }
                zzZIO zzzio = this.zzYsg;
                if (zzzio.zzYrs == inline) {
                    i = zzzio.zzYrr;
                    if (zzzio.zzYrq != inline) {
                        this.zzYQL.zzZ(text.substring(i), inline.getFont());
                    }
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (inline.zzZYh().zzYrV()) {
                this.zzYrU.zzZ(true, this.zzYt2.getExportRoundtripInformation(), inline.zzZYh().getInsertRevision().getAuthor(), inline.zzZYh().getInsertRevision().zzZx(), false);
            }
            if (inline.zzZYh().zzYrW()) {
                this.zzYrU.zzY(true, this.zzYt2.getExportRoundtripInformation(), inline.zzZYh().getDeleteRevision().getAuthor(), inline.zzZYh().getDeleteRevision().zzZx(), false);
            }
            this.zzYs5.zzU(inline.zzZYh().getShading());
            zzYEJ zzyej = (zzYEJ) inline.zzZYh().get(885);
            if (zzyej != null) {
                zzZ(inline, zzyej);
            } else {
                if (inline.zzZYh().zzYrV() || inline.zzZYh().zzYrW()) {
                    zzyefZzZYh = inline.zzZYh();
                    inline.zzZ((zzYEF) zzyefZzZYh.zzbn());
                    if (inline.zzZYh().zzYrV()) {
                        this.zzYrU.zzZ(inline.getFont(), inline.zzZYh().getInsertRevision().getAuthor(), false);
                    }
                    if (inline.zzZYh().zzYrW()) {
                        this.zzYrU.zzY(inline.getFont(), inline.zzZYh().getDeleteRevision().getAuthor(), false);
                    }
                } else {
                    zzyefZzZYh = null;
                }
                this.zzYQL.zzy(inline);
                if (zzyefZzZYh != null) {
                    inline.zzZ(zzyefZzZYh);
                }
            }
            this.zzYs5.zzZ7c();
            this.zzYrU.zzYZp();
        }
        zzZJA zzzja3 = this.zzYs2;
        if (zzzja3 != null) {
            zzzja3.zzS(inline);
            this.zzYrW.zzz4(0);
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzR(Comment comment) throws Exception {
        return this.zzYsd.zzR(comment);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzT(StructuredDocumentTag structuredDocumentTag) throws Exception {
        if (!this.zzYt2.getExportRoundtripInformation() || structuredDocumentTag.getLevel() == 3 || structuredDocumentTag.getLevel() == 4) {
            this.zzYrQ.push(new zzZ(structuredDocumentTag, false, false));
            return;
        }
        boolean z = this.zzZEa.zzYXX() == null || structuredDocumentTag.getLevel() == 2;
        if (z) {
            this.zzYsf.zzZ0K();
        }
        this.zzZEa.zzZN(z ? "div" : "span", 0);
        zzLU zzlu = new zzLU();
        zzlu.zzZr("-aw-sdt-tag", structuredDocumentTag.getTag());
        if (com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getTitle())) {
            zzlu.setString("-aw-sdt-title", structuredDocumentTag.getTitle());
        }
        if (structuredDocumentTag.isShowingPlaceholderText()) {
            zzlu.zzZs("-aw-sdt-content", "placeholder");
        }
        this.zzZEa.zzH(zzlu.zzZWe());
        this.zzYrQ.push(new zzZ(structuredDocumentTag, true, z));
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzU(Footnote footnote) throws Exception {
        this.zzYsf.zzZ0K();
        return this.zzYse.zzU(footnote);
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzV(Footnote footnote) throws Exception {
        return this.zzYse.zzV(footnote);
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzW(OfficeMath officeMath) throws Exception {
        int officeMathOutputMode = this.zzYt2.getOfficeMathOutputMode();
        if (officeMathOutputMode != 1) {
            return officeMathOutputMode != 2 ? 1 : 0;
        }
        if (officeMath.zzYrV()) {
            this.zzYrU.zzZ(false, false, "", com.aspose.words.internal.zzZQ9.zz35, false);
        }
        if (officeMath.zzYrW()) {
            this.zzYrU.zzY(false, false, "", com.aspose.words.internal.zzZQ9.zz35, false);
        }
        zzZ0P.zzZ(officeMath, (zzZAC) new zzZE4(this.zzZEa), false);
        this.zzYrU.zzYZp();
        return 1;
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzY(SpecialChar specialChar) throws Exception {
        this.zzYse.zzX(specialChar);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ(zzZFY zzzfy) {
        this.zzZEa.zzY(zzzfy.zzau(), false);
    }

    @Override // com.aspose.words.zzZAO
    public final zzZEU zzZ3C() {
        return this.zzYsa;
    }

    @Override // com.aspose.words.zzZAO
    public final String zzZ3D() {
        zzZIO zzzio = this.zzYsg;
        return zzzio != null ? zzzio.zzYrn : "";
    }

    @Override // com.aspose.words.zzZAO
    public final zzZE7 zzZ3E() {
        return this.zzZEa;
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ3F() {
        this.zzYrZ.zzT(65536, "Absolute position tabs are not supported in HTML, using regular tab character.");
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ3G() {
        this.zzZEa.endElement("span");
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ3H() throws Exception {
        this.zzYrQ.size();
        this.zzYrQ.peek();
        zzZ zzzPop = this.zzYrQ.pop();
        if (zzzPop.zzZ3a()) {
            if (!zzzPop.zzZ39()) {
                this.zzZEa.endElement("span");
            } else {
                this.zzYsf.zzZ0K();
                this.zzZEa.endElement("div");
            }
        }
    }

    public final void zzZ3I() throws Exception {
        this.zzYrO = false;
        zzZ3A();
        zzZm7();
        zzZ3z();
    }

    @Override // com.aspose.words.zzZAO
    public final boolean zzZ3b() {
        return this.zzYs7.zzZ3b();
    }

    @Override // com.aspose.words.zzZ1K
    public final boolean zzZ3c() {
        return false;
    }

    @Override // com.aspose.words.zzZAO
    public final void zzZa(Node node) throws Exception {
        node.accept(this.zzYs7);
    }

    public final void zzZb(Node node) throws Exception {
        this.zzYrO = true;
        switch (node.getNodeType()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                zzZ3A();
                zzZ9(node);
                zzZ3z();
                return;
            case 1:
                this.zzYrO = false;
                zzZ3A();
                zzZm7();
                zzZ3z();
                return;
            case 2:
                zzZ3A();
                Section section = (Section) node;
                zzT(section);
                zzZ(section.getBody());
                zzS(section);
                zzZ3z();
                return;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 30:
            default:
                throw new IllegalStateException("Unexpected node type.");
            case 29:
                zzZ3A();
                ((StructuredDocumentTagRangeStart) node).zzY(this.zzYs7);
                zzZ3z();
                return;
            case 31:
                throw new IllegalStateException("GlossaryDocument isn't supported!");
            case 32:
                throw new IllegalStateException("BuildingBlock isn't supported!");
        }
    }

    @Override // com.aspose.words.zzZ1K
    public final int zza(Paragraph paragraph) throws Exception {
        zzYMX zzymxZzZI = zzZDY.zzZI(paragraph);
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB5(), Paragraph.class);
        zzYMX zzymxZzZI2 = zzZDY.zzZI(paragraph2);
        if (paragraph != zzX(paragraph, zzymxZzZI)) {
            return 0;
        }
        this.zzYrW.zzYYY();
        this.zzYs5.zzZ7c();
        if (zz6(paragraph)) {
            this.zzYrW.zzU(paragraph.getParagraphBreakFont(), 7);
        }
        this.zzYsz.zzYHs();
        this.zzYsy.zzZ40();
        zzZJA zzzja = this.zzYs2;
        if (zzzja != null) {
            zzzja.zzZ3M();
        }
        zzZJ9.zzY(this.zzZEa.zzYXX());
        boolean zZzZ = zzZ(paragraph, zzymxZzZI);
        zzY(paragraph, zzymxZzZI, paragraph2, zzymxZzZI2);
        zzZ3B();
        this.zzYs3.zzZT(paragraph);
        this.zzYrP.zzd(paragraph);
        if (zZzZ) {
            this.zzYsf.zzZ0L();
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzb(Paragraph paragraph) throws Exception {
        zzYMX zzymxZzZI = zzZDY.zzZI(paragraph);
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB6(), Paragraph.class);
        zzYMX zzymxZzZI2 = zzZDY.zzZI(paragraph2);
        Paragraph paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB5(), Paragraph.class);
        zzYMX zzymxZzZI3 = zzZDY.zzZI(paragraph3);
        if (paragraph != zzY(paragraph, zzymxZzZI)) {
            return 0;
        }
        if (zz8(paragraph)) {
            this.zzYs9.zzZ2V();
            zz7(paragraph);
        }
        boolean zZzZZ = zzZZ(paragraph);
        this.zzYrW.zzR(paragraph, zZzZZ);
        if (zzZ(paragraph, zzymxZzZI, paragraph2, zzymxZzZI2)) {
            this.zzYsf.zzZ0K();
            zzV(zzymxZzZI);
        }
        this.zzYrP.zze(paragraph);
        this.zzYs3.zzZ(paragraph, zzymxZzZI, this.zzYt2.getExportRoundtripInformation());
        if (zz9(paragraph)) {
            this.zzYs3.zzZT(paragraph);
            this.zzYrP.zzd(paragraph);
            return 1;
        }
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        if (zz2(paragraph)) {
            zzZ(paragraph, zzzgiZzZW, zzymxZzZI, paragraph3, zzymxZzZI3);
            zzW(paragraph, zzymxZzZI, paragraph3, zzymxZzZI3);
            return 1;
        }
        this.zzYs5.zzU(paragraph.zzZYj().getShading());
        zzZ(paragraph, zzzgiZzZW, zzymxZzZI);
        if (zzzgiZzZW.isListItem()) {
            this.zzYsf.zzX(paragraph, zzymxZzZI, this.zzYs3.zzZ07(), zZzZZ);
        } else {
            this.zzYsf.zzZ0K();
            this.zzYrX.zzY(paragraph, zzymxZzZI, this.zzYs3.zzZ07(), zZzZZ);
        }
        this.zzYse.zzZ3N();
        this.zzYsd.zzZ3N();
        this.zzYsz.zzYHt();
        return 0;
    }

    @Override // com.aspose.words.zzZAO
    public final zzZF3 zze(ShapeBase shapeBase) {
        for (zzZF3 zzzf3 : this.zzYrR) {
            if (zzzf3.zzYYZ() == shapeBase) {
                return zzzf3;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzj(double d, double d2) {
        this.zzZEa.zzZN("span", 2);
        zzLU zzlu = new zzLU();
        zzlu.zzZs("display", "block");
        zzlu.zzZ("width", d, 4);
        zzlu.zzZ("height", d2, 4);
        this.zzYsa.zzV(zzlu);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzz(Shape shape) throws Exception {
        shape.isHorizontalRule();
        shape.isTopLevel();
        zzLU zzluZzy = this.zzYrT.zzy(shape);
        this.zzZEa.zzZN(TranslateLanguage.CROATIAN, 1);
        zzY(new zzZSA(this.zzZEa.zzYXX()));
        zzLU zzlu = new zzLU();
        zzZKI zzzkiZzZyf = shape.zzY9h().zzZyf();
        if (com.aspose.words.internal.zzAN.zzZD(zzzkiZzZyf.zzZ4v())) {
            zzlu.zzZ("width", com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(shape.getWidth())), 6);
        } else {
            zzlu.zzU("width", zzzkiZzZyf.zzZ4v());
        }
        if (this.zzYt2.zzYZ4()) {
            zzlu.zzZ("height", shape.getHeight(), 4);
            int iZzZ4w = zzzkiZzZyf.zzZ4w();
            if (iZzZ4w == 0) {
                zzlu.zzV("margin-left", 0.0d);
            } else if (iZzZ4w == 2) {
                zzlu.zzV("margin-right", 0.0d);
            }
            if (zzzkiZzZyf.getNoShade()) {
                zzlu.zzY("color", shape.zzY9J().zz8Q());
                zzlu.zzY("background-color", shape.zzY9J().zz8Q());
                zzlu.zzV("border-width", 0.0d);
            }
        } else {
            this.zzZEa.zzZD("size", com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(shape.getHeight())));
            this.zzZEa.zzX("align", zzZDY.zzyH(zzzkiZzZyf.zzZ4w()));
            if (zzzkiZzZyf.getNoShade()) {
                this.zzZEa.zzX("noshade", "");
                zzlu.zzY("color", shape.zzY9J().zz8Q());
                zzlu.zzY("background-color", shape.zzY9J().zz8Q());
            }
        }
        this.zzYsa.zzV(zzlu);
        this.zzZEa.endElement(TranslateLanguage.CROATIAN);
        this.zzYsa.zzV(zzluZzy);
        this.zzZEa.endElement("div");
    }

    private void zzV(zzYMX zzymx) {
        double dZzJ5 = ((double) zzymx.zzJ5()) / 20.0d;
        double dZzJ4 = ((double) zzymx.zzJ4()) / 20.0d;
        zzLU zzlu = new zzLU();
        if (zzymx.zzVE(1310)) {
            zzlu.zzZ("width", dZzJ5, 4);
        } else {
            zzlu.zzZs("width", "auto");
        }
        if (zzymx.zzVE(1430)) {
            zzlu.zzZ("height", dZzJ4, 4);
        } else {
            zzlu.zzZs("height", "auto");
        }
        if (zzymx.zzYpx() != 0) {
            if (zzymx.zzYpH() == 3 || zzymx.zzYpH() == 5) {
                zzlu.zzZs("float", "right");
            } else {
                zzlu.zzZs("float", "left");
            }
        }
        this.zzZEa.zzZN("div", 0);
        this.zzYsa.zzV(zzlu);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzR(Font font) throws Exception {
        this.zzYrW.zzU(font, 0);
    }

    @Override // com.aspose.words.zzZAO
    public final void zzY(zzZE3 zzze3) throws Exception {
        Iterator<zzZE3> it = this.zzYrS.iterator();
        while (it.hasNext()) {
            if (zzze3.zzZ(it.next())) {
                return;
            }
        }
        this.zzYrS.addLast(zzze3);
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzZ(CommentRangeStart commentRangeStart) {
        if (this.zzYt2.getSaveFormat() != 52) {
            return this.zzYsd.zzZ(commentRangeStart);
        }
        return 1;
    }

    private void zzY(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) throws Exception {
        if (!zzZDY.zzU(paragraph, zzymx) || zzV(paragraph, zzymx, paragraph2, zzymx2)) {
            return;
        }
        this.zzYsf.zzZ0K();
        this.zzZEa.endElement("div");
        if (zzymx.zzYpx() == 3 || zzymx.zzYpx() == 1) {
            this.zzZEa.zzZN("br", 1);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("clear", "both");
            this.zzZEa.zzH(zzlu.zzZWe());
            this.zzZEa.endElement("br");
        }
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzZ(CommentRangeEnd commentRangeEnd) {
        if (this.zzYt2.getSaveFormat() != 52) {
            return this.zzYsd.zzZ(commentRangeEnd);
        }
        return 1;
    }

    private Paragraph zzX(Paragraph paragraph, zzYMX zzymx) {
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class);
        zzYMX zzymxZzZI = zzZDY.zzZI(paragraph2);
        while (!zzX(paragraph, zzymx, paragraph2, zzymxZzZI)) {
            Paragraph paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph2.zzYB4(), Paragraph.class);
            zzYMX zzymxZzZI2 = zzZDY.zzZI(paragraph3);
            Paragraph paragraph4 = paragraph2;
            paragraph2 = paragraph3;
            paragraph = paragraph4;
            zzYMX zzymx2 = zzymxZzZI;
            zzymxZzZI = zzymxZzZI2;
            zzymx = zzymx2;
        }
        return paragraph;
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ(ShapeBase shapeBase, boolean z, boolean z2, String str, int i, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg) throws Exception {
        OfficeMath officeMathZzYK = this.zzZFZ.zzYK(shapeBase);
        if (officeMathZzYK != null) {
            if (officeMathZzYK.zzYrV()) {
                this.zzYrU.zzZ(false, false, "", com.aspose.words.internal.zzZQ9.zz35, false);
            }
            if (officeMathZzYK.zzYrW()) {
                this.zzYrU.zzY(false, false, "", com.aspose.words.internal.zzZQ9.zz35, false);
            }
        }
        this.zzYrT.zzZ(shapeBase, z, z2, str, i, zzzq4, zzg);
        this.zzYrU.zzYZp();
    }

    private void zzW(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) {
        this.zzYs3.zzZT(paragraph);
        this.zzYrP.zzd(paragraph);
        if (!zzZDY.zzU(paragraph, zzymx) || zzV(paragraph, zzymx, paragraph2, zzymx2)) {
            return;
        }
        this.zzZEa.endElement("div");
    }

    private static void zzX(PageSetup pageSetup, zzLU zzlu) {
        zzlu.zzZ("-aw-header-distance", pageSetup.getHeaderDistance(), 4);
        zzlu.zzZ("-aw-footer-distance", pageSetup.getFooterDistance(), 4);
    }

    @Override // com.aspose.words.zzZ1K
    public final void zzZ(ShapeBase shapeBase, byte[] bArr, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) throws Exception {
        zzZJ2 zzzj2;
        if (z) {
            zzzj2 = this;
            bArr = zzzj2.zzZ(bArr, shapeBase.getWidth(), shapeBase.getHeight());
        } else {
            zzzj2 = this;
        }
        zzzj2.zzYrT.zzZ(shapeBase, bArr, zzzq4);
    }

    private void zzT(Section section) throws Exception {
        this.zzZEa.zzZN("div", 0);
        this.zzZEa.zzYXX().zzyz(2);
        this.zzYsa.zzQ(section);
        this.zzYs8.zzR(section);
        zzZ(section, true);
    }

    private void zzY(Section section) throws Exception {
        if (this.zzYs9 != null && this.zzYsg.zzYrq == section) {
            this.zzYsf.zzZ0K();
            zzZ3h();
            zzZ3g();
            zzZ3w();
            zzZIO zzzioZzZ2U = this.zzYs9.zzZ2U();
            this.zzYsg = zzzioZzZ2U;
            z = zzzioZzZ2U != null;
            zzZ3x();
            this.zzZEa.startDocument();
            zzZ3p();
            zzZ3i();
        }
        if (!this.zzYs7.isLocked()) {
            if (!z && !section.zz9I() && !this.zzYt2.zzYZc()) {
                this.zzZEa.zzZN("br", 1);
                zzLU zzlu = new zzLU();
                zzL5.zzZ(section.getPageSetup().getSectionStart(), zzlu);
                this.zzYsa.zzV(zzlu);
                this.zzZEa.endElement("br");
            }
            zzT(section);
        }
        zzZ(section.getBody());
        if (this.zzYs7.isLocked()) {
            return;
        }
        zzS(section);
    }

    private byte[] zzZ(byte[] bArr, double d, double d2) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        try {
            zzY7K zzy7kZzV = zzY7I.zzV(zzzor, this.zzYTQ);
            if (!zzy7kZzV.zzY0W()) {
                zzy7kZzV.zzd(d, d2);
            }
            byte[] bArrZzPN = zzy7kZzV.zzPN(this.zzYt2.getPrettyFormat());
            zzy7kZzV.zzZ(this.zzYrJ);
            zzzor.close();
            return bArrZzPN;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static boolean zzV(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) {
        return paragraph != null && paragraph2 != null && zzZDY.zzU(paragraph, zzymx) && zzZDY.zzU(paragraph2, zzymx2) && zzymx.zzYpC() == zzymx2.zzYpC() && zzymx.zzYpB() == zzymx2.zzYpB();
    }

    private static boolean zzZ(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) {
        return zzZDY.zzU(paragraph, zzymx) && !zzV(paragraph2, zzymx2, paragraph, zzymx);
    }

    private void zzZ(Paragraph paragraph, zzZGI zzzgi, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) throws Exception {
        Paragraph paragraph3 = (Paragraph) paragraph.deepClone(true);
        paragraph3.zzYG(paragraph.getParentNode());
        if (zzzgi.isListItem()) {
            paragraph3.zzYx(paragraph);
        }
        paragraph3.getParagraphFormat().zzXd(0.0d);
        paragraph3.getParagraphFormat().zzXc(0.0d);
        Run runZzYVe = paragraph3.zzYVe();
        String text = runZzYVe.getText();
        runZzYVe.setText("firstDummyRun");
        paragraph3.acceptStart(this.zzYs7);
        runZzYVe.setText(text);
        for (Run run : paragraph3.getRuns()) {
            if (!run.getFont().zzZ7k().isEmpty()) {
                run.getFont().zz8(com.aspose.words.internal.zzPV.zzHZ);
            }
            if (run.getFont().getUnderline() != 0) {
                run.getFont().setUnderline(0);
            }
            if (run.getFont().getStrikeThrough()) {
                run.getFont().setStrikeThrough(false);
            }
            if (run.getFont().getDoubleStrikeThrough()) {
                run.getFont().setDoubleStrikeThrough(false);
            }
            run.accept(this.zzYs7);
        }
        if (zzX(paragraph, zzymx, paragraph2, zzymx2)) {
            paragraph3.acceptEnd(this.zzYs7);
        }
    }

    private HeaderFooter zzY(Section section, int i) {
        HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType != null && !byHeaderFooterType.isLinkedToPrevious()) {
            this.zzYsl[i] = byHeaderFooterType;
            return byHeaderFooterType;
        }
        return this.zzYsl[i];
    }

    private Paragraph zzY(Paragraph paragraph, zzYMX zzymx) {
        zzYMX zzymx2;
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB9(), Paragraph.class);
        zzYMX zzymxZzZI = zzZDY.zzZI(paragraph2);
        zzYMX zzymx3 = zzymx;
        Paragraph paragraph3 = paragraph;
        Paragraph paragraph4 = paragraph2;
        while (true) {
            zzymx2 = zzymx3;
            if (zzX(paragraph4, zzymxZzZI, paragraph3, zzymx2)) {
                break;
            }
            Paragraph paragraph5 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph4.zzYB9(), Paragraph.class);
            zzYMX zzymxZzZI2 = zzZDY.zzZI(paragraph5);
            paragraph3 = paragraph4;
            paragraph4 = paragraph5;
            zzymx3 = zzymxZzZI;
            zzymxZzZI = zzymxZzZI2;
        }
        Paragraph paragraph6 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph3.zzYB4(), Paragraph.class);
        zzYMX zzymxZzZI3 = zzZDY.zzZI(paragraph6);
        while (!zzX(paragraph3, zzymx2, paragraph6, zzymxZzZI3) && !paragraph3.hasChildNodes()) {
            Paragraph paragraph7 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph6.zzYB4(), Paragraph.class);
            zzYMX zzymxZzZI4 = zzZDY.zzZI(paragraph7);
            paragraph3 = paragraph6;
            paragraph6 = paragraph7;
            zzYMX zzymx4 = zzymxZzZI3;
            zzymxZzZI3 = zzymxZzZI4;
            zzymx2 = zzymx4;
        }
        return paragraph3;
    }

    private boolean zzZ(Paragraph paragraph, zzYMX zzymx) {
        Paragraph paragraphZzY = this.zzYrM;
        if (paragraphZzY == null) {
            paragraphZzY = zzY(paragraph, zzymx);
        }
        boolean zIsListItem = zzZGI.zzZW(paragraphZzY).isListItem();
        this.zzYrM = null;
        if (this.zzYrN) {
            this.zzYrN = false;
            return zIsListItem;
        }
        if (zIsListItem && !this.zzYsf.zzZ0J()) {
            return zIsListItem;
        }
        this.zzYrX.zzYZQ();
        return zIsListItem;
    }

    private static void zzY(PageSetup pageSetup, zzLU zzlu) {
        if (pageSetup.getPageNumberStyle() != 0) {
            zzlu.zzZs("-aw-page-numbers-style", zzZXP.zzFa(pageSetup.getPageNumberStyle()));
        }
        if (pageSetup.getChapterPageSeparator() != 0) {
            zzlu.zzZs("-aw-page-numbers-chapter-separator", zzYUL.zzZy(pageSetup.getChapterPageSeparator(), true));
        }
        if (pageSetup.getHeadingLevelForChapter() > 0) {
            zzlu.zzV("-aw-page-numbers-chapter-level", pageSetup.getHeadingLevelForChapter());
        }
        if (pageSetup.getRestartPageNumbering()) {
            zzlu.zzV("-aw-page-numbers-start", pageSetup.getPageStartingNumber());
        }
    }

    private void zzZ(Paragraph paragraph, zzZGI zzzgi, zzYMX zzymx) throws Exception {
        if ((zzzgi.isListItem() || !(zzymx.zzYMa() == 0 || this.zzYt2.getDocumentSplitCriteria() == 1 || this.zzYt2.getDocumentSplitCriteria() == 2 || zzZDY.zzZK(paragraph))) && !this.zzYrY.zzYNg()) {
            for (Node nodeZzZYr = paragraph.zzZYr(); nodeZzZYr != null && (nodeZzZYr instanceof Inline); nodeZzZYr = nodeZzZYr.zzYB4()) {
                String text = nodeZzZYr.getText();
                for (int i = 0; i < text.length(); i++) {
                    char cCharAt = text.charAt(i);
                    if (cCharAt == '\f') {
                        zzVt(false);
                    } else if (cCharAt != 14) {
                        return;
                    } else {
                        zzVt(true);
                    }
                }
            }
        }
    }

    @Override // com.aspose.words.zzZ1K
    public final int zzQ(Comment comment) throws Exception {
        this.zzYsf.zzZ0K();
        return this.zzYsd.zzQ(comment);
    }

    private void zzY(com.aspose.words.internal.zzZQC<StructuredDocumentTag> zzzqc) throws Exception {
        while (zzzqc.size() > 0) {
            zzT(zzzqc.pop());
        }
    }

    private void zzZ(Body body) throws Exception {
        if (body != null) {
            zzZ9(body);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(Section section, boolean z) throws Exception {
        HeaderFooter headerFooterZzY;
        String str;
        int exportHeadersFootersMode = this.zzYt2.getExportHeadersFootersMode();
        HeaderFooter headerFooter = null;
        if (exportHeadersFootersMode == 1) {
            headerFooterZzY = zzY(section, z ? 1 : 3);
        } else if (exportHeadersFootersMode == 2) {
            int i = z ? 1 : 3;
            HeaderFooter headerFooterZzY2 = zzY(section, i);
            if ((i != 1 || section.zz9I()) && (i != 3 || section.zzYB3())) {
                headerFooterZzY = headerFooterZzY2;
            }
        } else if (exportHeadersFootersMode != 3) {
            headerFooterZzY = null;
        } else {
            headerFooterZzY = zzY(section, z ? 4 : 5);
        }
        if (headerFooterZzY == null) {
            headerFooter = headerFooterZzY;
        } else {
            if (this.zzYsj == null) {
                this.zzYsj = new zzZKU(this.zzYTQ.zzZqh().zzZoz());
            }
            if (this.zzYsj.zzZ(section, headerFooterZzY.getHeaderFooterType())) {
            }
        }
        if (headerFooter != null) {
            int headerFooterType = headerFooter.getHeaderFooterType();
            if (headerFooterType == 1) {
                str = "header-primary";
            } else if (headerFooterType == 3) {
                str = "footer-primary";
            } else if (headerFooterType != 4) {
                str = headerFooterType != 5 ? "" : "footer-first";
            } else {
                str = "header-first";
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                this.zzZEa.zzZN("div", 0);
                this.zzZEa.zzYXX().zzyz(3);
                HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(headerFooter.getHeaderFooterType());
                if ((byHeaderFooterType == null || byHeaderFooterType.isLinkedToPrevious()) && headerFooter == this.zzYsk[headerFooter.getHeaderFooterType()]) {
                    str = "linked";
                }
                zzLU zzlu = new zzLU();
                if (this.zzYt2.getExportRoundtripInformation()) {
                    zzlu.zzZs("-aw-headerfooter-type", str);
                    if (section.getPageSetup().getDifferentFirstPageHeaderFooter()) {
                        zzlu.zzZs("-aw-different-first-page", TelemetryEventStrings.Value.TRUE);
                    }
                }
                zzlu.zzZs("clear", "both");
                this.zzYsa.zzV(zzlu);
            }
            zzZ9(headerFooter);
            this.zzYsk[headerFooter.getHeaderFooterType()] = headerFooter;
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                this.zzZEa.endElement("div");
            }
        }
    }

    private void zzZ(Inline inline, zzYEJ zzyej) throws Exception {
        this.zzZEa.zzZN("ruby", 0);
        zzLU zzlu = new zzLU();
        zzLU zzlu2 = new zzLU();
        int i = zzyej.zzZGm;
        if (i == 0) {
            zzlu.zzZs("ruby-align", "center");
            zzlu2.zzZs("text-align", "center");
        } else if (i == 1) {
            zzlu.zzZs("ruby-align", "distribute-letter");
        } else if (i == 2) {
            zzlu.zzZs("ruby-align", "distribute-space");
        } else if (i == 3) {
            zzlu.zzZs("ruby-align", "left");
            zzlu2.zzZs("text-align", "left");
        } else if (i == 4) {
            zzlu.zzZs("ruby-align", "right");
            zzlu2.zzZs("text-align", "right");
        } else if (i == 5) {
            zzlu.zzZs("ruby-align", "right-vertical");
        }
        zzYEF zzyefZzl1 = inline.getParentParagraph().getParagraphFormat().getStyle().zzl1(1);
        zzYEF zzyef = new zzYEF();
        zzyefZzl1.zzY(zzyef);
        zzyej.zzYe6().zzYe5().zzXqg.zzY(zzyef);
        this.zzZEa.zzZN("rb", 0);
        this.zzYQL.zzZ(zzyej.zzYe6().getText(), Font.zzZ(zzyef, inline.getDocument()));
        this.zzZEa.endElement("rb");
        zzYEF zzyef2 = new zzYEF();
        zzyefZzl1.zzY(zzyef2);
        zzyej.zzYe7().zzYe5().zzXqg.zzY(zzyef2);
        zzyef2.setSize(zzyej.zzXql);
        zzyef2.zzvA(zzyef2.getSize());
        this.zzZEa.zzZN("rt", 0);
        this.zzYQL.zzZ(zzyej.zzYe7().getText(), Font.zzZ(zzyef2, inline.getDocument()));
        if (zzlu2.getCount() > 0) {
            this.zzYsa.zzV(zzlu2);
        }
        this.zzZEa.endElement("rt");
        this.zzYsa.zzV(zzlu);
        this.zzZEa.endElement("ruby");
    }
}
