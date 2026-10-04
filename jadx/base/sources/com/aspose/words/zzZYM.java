package com.aspose.words;

import com.aspose.slides.PatternStyle;
import com.aspose.words.ref.RefInt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYM extends DocumentVisitor {
    private static HashMap<Integer, Integer> zzYPD;
    private boolean zzYPG;
    private zzYI4 zzYPI;
    private zzZVD zzYPJ;
    private zzYEG zzYPK;
    private zzYOM zzYPL;
    private HashMap<DocumentBase, zzY6W> zzYPM;
    private zzY97 zzYPN;
    private com.aspose.words.internal.zzFQ<String> zzYPO;
    private zzZ43 zzYPP;
    private zzY6D zzYPQ;
    private zzYZO zzYPR;
    private zzZON zzYPS;
    private zzY4 zzYPT;
    private zzZ7J zzYPU;
    private zzKL zzYPV;
    private zzYBV zzYPW;
    private zzZBZ zzYPX;
    private zzXYV zzYR0;
    private zzY40 zzYR1;
    private zzI zzYR4;
    private zzYDW zzYTo;
    private int zzYYj;
    private zzYDZ zzZFZ;
    static final String zzYPF = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{79, 79, 77, 88, 32, 76, 67, 69, 65, 77, PatternStyle.Cross, PatternStyle.DottedGrid, PatternStyle.DiagonalCross, 55});
    private static int[] zzYPE = {2180, 2400, 2120, EditingLanguage.MALAY_BRUNEI_DARUSSALAM};
    private zzY6L zzYR2 = new zzY6L();
    private com.aspose.words.internal.zzZQC<Table> zzYR3 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<StructuredDocumentTag> zzYPH = new com.aspose.words.internal.zzZQC<>();

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        zzYPD = map;
        com.aspose.words.internal.zzZQF.zzY(map, 10, 2369);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 11, 2369);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 20, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 22, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 21, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 23, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 24, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 25, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 26, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 27, 2080);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 30, 449);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 31, 2272);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 40, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 41, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 46, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 42, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 44, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 45, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 47, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 48, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 100, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 101, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 102, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 103, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 104, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 105, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 106, 1257);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 50, 137);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 51, 137);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 52, 137);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 53, 137);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 54, 137);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 60, 235);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 61, 235);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 70, 201);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 71, 201);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 72, 201);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 73, 201);
        com.aspose.words.internal.zzZQF.zzY(zzYPD, 80, 169);
    }

    private IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    private static void zzA(Paragraph paragraph) {
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (zzymxZzZYj.zzYpC() > 0) {
            zzymxZzZYj.zzYpG();
        }
        if (zzymxZzZYj.zzYpB() > 0) {
            zzymxZzZYj.zzYpD();
        }
    }

    private void zzB(Paragraph paragraph) {
        if (paragraph.zzYoR() == 0) {
            return;
        }
        com.aspose.words.internal.zzIM zzim = (com.aspose.words.internal.zzIM) this.zzZFZ.zzXoS[this.zzYPN.zzY45()];
        if (zzim.contains(Integer.valueOf(paragraph.zzYoR()))) {
            paragraph.zzqu(0);
        } else {
            zzim.add(Integer.valueOf(paragraph.zzYoR()));
        }
    }

    private void zzC(Document document) {
        zzYD3 zzyd3ZzZpR = document.zzZpR();
        if (zzyd3ZzZpR.zzYcD()) {
            return;
        }
        GlossaryDocument glossaryDocument = document.getGlossaryDocument();
        if (glossaryDocument != null && !glossaryDocument.zzZpR().zzYcD()) {
            zzyd3ZzZpR.zzB(glossaryDocument.zzZpR().zzYcE());
        }
        if (zzyd3ZzZpR.zzYcI()) {
            zzZ(1, 17, "One or more unused StructuredDocumentTag placeholder blocks were removed from Document Glossary.");
        }
    }

    private void zzD(Document document) {
        if (document.zzZqD() == null) {
            return;
        }
        for (zzP zzp : document.zzZqD()) {
            if (zzp.zzZGx == 0) {
                zzZ(1, 0, "Invalid allocated command changed to ApplyStyle Normal.");
                zzp.zzZGx = 101;
                zzp.zzZGw = new byte[]{1, 0, 0, 0, 0, 0};
            }
        }
    }

    private static void zzE(Document document) {
        if (document.getCompatibilityOptions().zzZYN()) {
            int mswVersion = document.getCompatibilityOptions().getMswVersion();
            zzZZF zzzzfZzZpV = document.zzZpV();
            if (mswVersion < 14) {
                zzzzfZzZpV.zzYV2 = false;
                zzzzfZzZpV.zzYV1 = 0;
                zzzzfZzZpV.zzYV0 = null;
            }
            if (mswVersion < 15) {
                zzzzfZzZpV.zzYV4 = false;
                zzzzfZzZpV.zzYV3 = null;
            }
        }
    }

    private boolean zzFA(int i) {
        return (this.zzYYj & i) == i;
    }

    private static boolean zzFB(int i) {
        if (i == 10 || i == 11 || i == 30 || i == 31) {
            return true;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            default:
                return false;
        }
    }

    private static int zzFz(int i) {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzYPD, Integer.valueOf(i), refInt);
        int i2 = refInt.get();
        if (zZzZ) {
            return i2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 115, 101, 118, 111, 70, 109, 114, 116, 97}));
    }

    private static boolean zzN(DocumentBase documentBase) {
        for (Style style : documentBase.getStyles()) {
            if ((style instanceof TableStyle) && style.zzZYa()) {
                return true;
            }
        }
        return false;
    }

    private void zzNV(String str) {
        zzD(1, com.aspose.words.internal.zzZKN.format("Aspose.Words does not support the '{0}' document setting for the {0} file format.", str));
    }

    private void zzNW(String str) {
        zzD(1, com.aspose.words.internal.zzZKN.format("The '{0}' document setting is not supported by the {0} file format.", str));
    }

    private void zzO(DocumentBase documentBase) throws Exception {
        boolean z = documentBase.zzZqI() != null;
        if (zzZn4() || z) {
            new zzYEB().zzZ(documentBase, this.zzYPO);
        }
        if (zzZn4()) {
            documentBase.getFontInfos().zzY(this.zzYPO);
        }
        MailMergeSettings mailMergeSettings = documentBase.zzZpV().zzYWd;
        if (!mailMergeSettings.isEmpty()) {
            mailMergeSettings.getOdso().getFieldMapDatas().zzYyg();
        }
        this.zzYPS.zzbQ();
        this.zzYR4.zzbQ();
        this.zzYPT.zzbQ();
        this.zzYPP.zzbQ();
        this.zzYPW.zzp(documentBase);
        if (this.zzZFZ.zzXp7) {
            zzZ(documentBase, 0);
            zzZ(documentBase, 1);
        }
        if (this.zzZFZ.zzXp6) {
            zzZ(documentBase, 3);
            zzZ(documentBase, 4);
        }
    }

    private void zzP(DocumentBase documentBase) {
        zzZZF zzzzfZzZpV = documentBase.zzZpV();
        int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
        if (this.zzZFZ.zzYdb()) {
            if (zzzzfZzZpV.zzYV2) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 100, 99, 115, 114, 97, 73, 100, 97, 109, 101, 103, 100, 69, 116, 105, 110, 105, 68, 103, 116, 97, 97}));
            }
            if (zzzzfZzZpV.zzYV1 > 0) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 100, 97, 102, 108, 117, 73, 116, 97, 109, 101, 103, 112, 68, 105}));
            }
            if (zzzzfZzZpV.zzYV4) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{104, 99, 114, 97, 84, 116, 97, 114, 107, 99, 110, 105, 82, 103, 102, 101, 97, 66, 101, 115, 100}));
            }
            if (com.aspose.words.internal.zzZYD.zzXk(zzzzfZzZpV.zzYV3)) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Horizontal, 119, 58, PatternStyle.UpwardDiagonal, 111, 100, 73, 99, 100}));
            }
            if (com.aspose.words.internal.zzZYD.zzXk(zzzzfZzZpV.zzYV0)) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Horizontal, 119, 58, PatternStyle.DownwardDiagonal, 111, 100, 73, 99, 100}));
            }
        }
        if (saveFormat == 31) {
            if (zzzzfZzZpV.zzYV7) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 100, 111, 78, 65, 116, 116, 117, 67, 111, 109, 111, 114, 112, 115, 101, 80, 115, 99, 105, 117, 116, 101, 114, 115}));
            }
            if (zzzzfZzZpV.zzYW0) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 114, 111, 109, 101, 118, 97, 68, 101, 116, 110, 65, 84, 100, 109, 105, 101}));
            }
        } else if (saveFormat == 30) {
            if (zzzzfZzZpV.zzYV7) {
                zzNV(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 100, 111, 78, 65, 116, 116, 117, 67, 111, 109, 111, 114, 112, 115, 101, 80, 115, 99, 105, 117, 116, 101, 114, 115}));
            }
            if (zzzzfZzZpV.zzYW0) {
                zzNV(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 114, 111, 109, 101, 118, 97, 68, 101, 116, 110, 65, 84, 100, 109, 105, 101}));
            }
        }
        if (this.zzZFZ.zzYdh()) {
            if (zzzzfZzZpV.zzYV6) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 117, 97, 100, 101, 116, 105, 70, 108, 101, 115, 100}));
            }
            if (zzzzfZzZpV.zzYV5) {
                zzNW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 102, 99, 114, 85, 101, 103, 112, 97, 114, 101, 100}));
            }
        }
    }

    private void zzR(DocumentBase documentBase) throws Exception {
        this.zzYPT = new zzY4(getWarningCallback(), this.zzZFZ.zzXpa.getSaveFormat());
        this.zzYR4 = new zzI(documentBase, this.zzZFZ, getWarningCallback());
        this.zzYPS = new zzZON(getWarningCallback(), this.zzZFZ.zzXpa.getSaveFormat());
        this.zzYPR = new zzYZO(documentBase);
        this.zzYPQ = new zzY6D(this.zzYYj, this.zzZFZ);
        this.zzYPW.zzZ(documentBase, this.zzYPT);
        this.zzYPO = zzZn4() ? new com.aspose.words.internal.zzX6() : null;
        this.zzYPN = new zzY97();
        if (zzFB(this.zzZFZ.zzYfy.getOriginalLoadFormat()) && zzFA(1) && zzN(documentBase)) {
            this.zzYPM.put(documentBase, new zzY6W());
        }
        if (documentBase.zzZq1().getCount() > 0 && this.zzZFZ.zzYdb()) {
            zzD(1, "Contact information for authors of comments and revisions is not supported in the {0} file format.");
        }
        zzY1Y.zzZ(documentBase, this.zzZFZ, getWarningCallback());
        zzP(documentBase);
    }

    private static void zzS(Table table) {
        Node nodeZzYB9;
        Row firstRow = table.getFirstRow();
        if (firstRow == null || firstRow.zzZYf().getRelativeVerticalPosition() != 2 || (nodeZzYB9 = table.zzYB9()) == null || nodeZzYB9.getNodeType() == 8) {
            return;
        }
        Paragraph paragraph = new Paragraph(table.getDocument());
        table.getParentNode().zzZ(paragraph, nodeZzYB9, true);
        paragraph.zzYp5().zzZ(zzZU.zzZF6);
    }

    private void zzT(Table table) {
        if (table.getFirstRow() == null) {
            return;
        }
        zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
        if (com.aspose.words.internal.zzZYD.zzXk(zzy6gZzZYf.getTitle()) || com.aspose.words.internal.zzZYD.zzXk(zzy6gZzZYf.getDescription())) {
            if (this.zzZFZ.zzYdb() || this.zzZFZ.zzXpa.getSaveFormat() == 60 || this.zzZFZ.zzXpa.getSaveFormat() == 61) {
                if (this.zzZFZ.zzYda() && !zzZn5()) {
                    Document document = this.zzZFZ.zzYfy;
                    if (document.zzZqn() == null) {
                        document.zzZ(new zzYO3());
                    }
                    document.zzZqn().zzYrc();
                    return;
                }
                if (com.aspose.words.internal.zzZYD.zzXk(zzy6gZzZYf.getTitle())) {
                    zzD(1, "Table title is not supported by the {0} file format.");
                }
                if (com.aspose.words.internal.zzZYD.zzXk(zzy6gZzZYf.getDescription())) {
                    zzD(1, "Table description is not supported by the {0} file format.");
                }
            }
        }
    }

    private static void zzV(Section section) {
        for (int i : zzYPE) {
            if (com.aspose.words.internal.zzZKO.equals(section.zzYvR().zzPj(i), zzYCZ.zzOt(i))) {
                section.zzYvR().remove(i);
            }
        }
    }

    private void zzW(Comment comment) {
        if (comment.zzZZS() == 0) {
            return;
        }
        if (this.zzZFZ.zzXoR.contains(Integer.valueOf(comment.zzZZS()))) {
            comment.zzNb(0);
        } else {
            this.zzZFZ.zzXoR.add(Integer.valueOf(comment.zzZZS()));
        }
    }

    private void zzY(SmartTag smartTag) {
        this.zzZFZ.zzXp1.set(smartTag.getUri() + smartTag.getElement(), smartTag);
    }

    private void zzZ(CustomXmlPropertyCollection customXmlPropertyCollection) {
        Iterator<CustomXmlProperty> it = customXmlPropertyCollection.iterator();
        while (it.hasNext()) {
            zzX(it.next().getUri(), false, true);
        }
    }

    private boolean zzZn4() {
        if (zzFA(2)) {
            return true;
        }
        return this.zzZFZ.zzYd9() && this.zzZFZ.zzYfy.zzZpV().zzYWy;
    }

    private boolean zzZn5() {
        OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzZFZ.zzXpa, OoxmlSaveOptions.class);
        return ooxmlSaveOptions != null && ooxmlSaveOptions.zzYqW();
    }

    private void zzZn8() {
        if (this.zzYPH.size() > 0) {
            this.zzZFZ.zzXoM.add(this.zzYPH.peek());
        }
    }

    private void zzZna() {
        int i = this.zzZFZ.zzYfy.zzZpV().zzYW5.getReadOnlyRecommended() ? 2 : 0;
        if (this.zzZFZ.zzYfy.zzZpV().zzYW5.isWriteProtected()) {
            i |= 4;
        }
        int protectionType = this.zzZFZ.zzYfy.getProtectionType();
        if (protectionType != -1 && protectionType != 0) {
            if (protectionType == 1) {
                i |= 8;
            } else if (protectionType != 2) {
                if (protectionType != 3) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 110, 107, 119, 111, 32, 110, 114, 112, 116, 111, 99, 101, 105, 116, 110, 111, 116, 32, 112, 121, PatternStyle.Divot, 101}));
                }
                i |= 8;
            }
        }
        this.zzZFZ.zzYfy.getBuiltInDocumentProperties().setSecurity(i);
    }

    private void zzZnc() {
        if (this.zzZFZ.zzYfy.hasMacros()) {
            int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
            if (saveFormat == 20 || saveFormat == 22 || saveFormat == 24) {
                throw new IllegalStateException("This document contains macros (VBA project) and you are attempting to save it in a Macro-Free format. Such document will be invalid if created. You need to either save it in a Macro-Enabled format (.DOCM or .DOTM) or remove macros before saving using the Document.RemoveMacros method.");
            }
        }
    }

    private static boolean zzi(Node node) {
        Table table = (Table) com.aspose.words.internal.zzZKW.zzZ(node.getParentNode(), Table.class);
        return table != null && table.getRows().getCount() == 0;
    }

    private boolean zzj(Node node) {
        if (this.zzYPN.zzY45() == 1) {
            return false;
        }
        node.remove();
        zzZ(1, 17, com.aspose.words.internal.zzZKN.format("{0} is not in the main text story and shall be removed.", Node.nodeTypeToString(node.getNodeType())));
        return true;
    }

    private static void zzy(Paragraph paragraph) {
        Paragraph paragraph2;
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (zzymxZzZYj.zzVE(1440) && zzymxZzZYj.getDropCapPosition() == 0 && (paragraph2 = (Paragraph) paragraph.zztD(8)) != null) {
            while (paragraph.hasChildNodes()) {
                Node firstChild = paragraph.getFirstChild();
                if (firstChild != null && firstChild.getNodeType() == 21) {
                    ((Run) firstChild).zzZ(paragraph2.zzYVe() != null ? paragraph2.zzYVe().zzZYh() : paragraph2.zzYp5());
                }
                paragraph2.prependChild(firstChild);
            }
            paragraph.remove();
        }
    }

    private static void zzz(Paragraph paragraph) {
        TabStopCollection tabStops;
        if (paragraph.getParentSection() == null || (tabStops = paragraph.zzZYj().getTabStops()) == null) {
            return;
        }
        for (int i = 0; i < tabStops.getCount(); i++) {
            tabStops.get(i).zzkt((short) (tabStops.get(i).zzY0E() & 65535));
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) {
        this.zzYPN.zzli(body.getStoryType());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) throws Exception {
        this.zzYPN.zzVF(body.getStoryType());
        this.zzYR1.visitBodyStart(body);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        if (zzi(bookmarkEnd)) {
            return 0;
        }
        this.zzYPT.zzZ(bookmarkEnd, this.zzYPN.zzY45());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        if (zzi(bookmarkStart)) {
            return 0;
        }
        zzZn8();
        this.zzYPT.zzZ(bookmarkStart, this.zzYPN.zzY45());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        zzV(cell.zz6G(), 3170);
        return this.zzYPQ.visitCellStart(cell);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) {
        this.zzYPN.zzli(comment.getStoryType());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        if (zzj(commentRangeEnd)) {
            return 1;
        }
        return this.zzYR4.visitCommentRangeEnd(commentRangeEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        if (zzj(commentRangeStart)) {
            return 1;
        }
        return this.zzYR4.visitCommentRangeStart(commentRangeStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        if (zzj(comment)) {
            return 1;
        }
        this.zzYR4.zzZ(comment);
        this.zzYPN.zzVF(comment.getStoryType());
        com.aspose.words.internal.zzZQ9 zzzq9ZzZZT = comment.zzZZT();
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZZT, zzzq9) && this.zzZFZ.zzYfy.getCompatibilityOptions().getMswVersion() >= 17) {
            comment.zzu(comment.zzZZU().zzkF());
        }
        if (comment.getDone() || comment.getParentId() != -1) {
            zzYO3.zze(this.zzZFZ.zzYfy);
        }
        if (comment.zzZZS() != 0) {
            zzYO3.zzY(this.zzZFZ.zzYfy, 16);
        }
        if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZT(), zzzq9) || comment.zzZZR()) {
            zzYO3.zzY(this.zzZFZ.zzYfy, 17);
        }
        zzW(comment);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) throws Exception {
        zzO(document);
        if (document.getCompatibilityOptions().zzZYN() && this.zzZFZ.zzYd9() && this.zzZFZ.zzZtY() == 0 && document.getCompatibilityOptions().getMswVersion() >= 14) {
            zzZ(WarningType.HINT, 17, "The OoxmlSaveOptions.Compliance property should be set to OoxmlCompliance.Iso29500_2008_Transitional or higher to remove the Compatibility Mode ribbon.");
        }
        zzYDW zzydw = this.zzYTo;
        if (zzydw == null) {
            return 0;
        }
        zzydw.complete();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) throws Exception {
        if (!this.zzZFZ.zzXpa.zzYd6()) {
            this.zzZFZ.zzYfy.zzZpV().zzYVj.clear();
        }
        if (document.zzZpV().zzYWm) {
            document.zzZ(this.zzZFZ.zzXpa);
        }
        zzE(document);
        zzR(document);
        this.zzYPU.zzS(document.getCompatibilityOptions());
        this.zzYPV.zzU(document);
        if (document.getDigitalSignatures().getCount() > 0) {
            zzZ(1, 17, "Document is digitally signed, export of digital signatures is not supported by Aspose.Words.");
        }
        zzY0C.zzZM(document);
        zzZna();
        document.getBuiltInDocumentProperties().zzYo();
        document.ensureMinimum();
        document.getStyles().zztF();
        if (!document.zzZpR().zzYcD()) {
            document.zzZpR().zzYcJ();
        }
        this.zzYR1.visitDocumentStart(document);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        return this.zzYR4.visitEditableRangeEnd(editableRangeEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        return this.zzYR4.visitEditableRangeStart(editableRangeStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        this.zzYPS.zzV(fieldEnd);
        if (fieldEnd.getFieldType() != 49) {
            return 0;
        }
        this.zzYPJ.zzW(fieldEnd.getField());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        zzYOC oleObject = fieldSeparator.getOleObject();
        if (oleObject != null) {
            this.zzZFZ.zzXp9.set(zzYO6.zzX(oleObject), oleObject.zzYrr());
        }
        this.zzYPS.zzV(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        if (fieldStart.getFieldType() == 88) {
            zzZn8();
        }
        this.zzYPS.zzN(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        this.zzYPN.zzli(footnote.getStoryType());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        if (this.zzYPN.zzY45() != 1) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 70, 116, 111, 111, 110, 101, 116, 32, 115, 114, 97, 32, 101, 110, 111, 121, 108, 97, 32, 108, 108, 119, 111, 100, 101, 105, 32, 115, 110, 100, 105, 32, 101, 104, 116, 32, 101, 97, 109, 110, 105, 116, 32, 120, 101, 32, 116, 102, 111, 116, 32, 101, 104, 100, 32, 99, 111, 109, 117, 110, 101, PatternStyle.Divot, 116}));
        }
        if (footnote.getFootnoteType() == 0) {
            this.zzZFZ.zzXp7 = true;
        } else {
            this.zzZFZ.zzXp6 = true;
        }
        footnote.ensureMinimum();
        this.zzYPN.zzVF(footnote.getStoryType());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) {
        zzZn8();
        this.zzYPS.zzY(formField);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentEnd(GlossaryDocument glossaryDocument) throws Exception {
        zzO(glossaryDocument);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentStart(GlossaryDocument glossaryDocument) throws Exception {
        glossaryDocument.zzZpR().zzYcJ();
        zzR(glossaryDocument);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeEnd(GroupShape groupShape) {
        return this.zzYPW.visitGroupShapeEnd(groupShape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        this.zzYPI.add(Integer.valueOf(groupShape.zzZYh().zzYe2()));
        return this.zzYPW.zzZ(groupShape, this.zzYPN);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) {
        this.zzYPN.zzli(headerFooter.getStoryType());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        this.zzYPN.zzVF(headerFooter.getStoryType());
        this.zzYR1.visitHeaderFooterStart(headerFooter);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathEnd(OfficeMath officeMath) throws Exception {
        this.zzYPL.zzX(officeMath, this);
        return this.zzYPR.visitOfficeMathEnd(officeMath);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        int iZzY = this.zzYPL.zzY(officeMath, this);
        return iZzY != 1 ? this.zzYPR.visitOfficeMathStart(officeMath) : iZzY;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (!this.zzYPG && zzFA(8) && paragraph.isListItem()) {
            ListLevel listLevelZzRB = paragraph.zzRB(false);
            if (listLevelZzRB.getLegacy() && listLevelZzRB.zzYO6() != 0) {
                this.zzZFZ.zzYfy.updateListLabels();
                this.zzYPG = true;
            }
        }
        zzYDZ zzydz = this.zzZFZ;
        zzydz.zzR5(zzydz.zzYsH() | paragraph.zzYp5().contains(830));
        zzB(paragraph);
        zzV(paragraph.zzZYj(), 1460);
        if (paragraph.zzYoU() || paragraph.zzYoT()) {
            this.zzYPP.zzZw(paragraph);
        }
        this.zzYR1.visitParagraphStart(paragraph);
        if (paragraph.getAncestor(18) != null) {
            paragraph.zzZYj().zzYpk();
        }
        if (!this.zzZFZ.zzXoX && paragraph.zzZYj().contains(1585)) {
            this.zzZFZ.zzXoX = true;
        }
        zzA(paragraph);
        for (int i : zzYMX.zzXGY) {
            zzE((Border) paragraph.zzZYj().get(i));
        }
        if (!this.zzYPN.zzY44()) {
            zzy(paragraph);
        }
        zzz(paragraph);
        if (paragraph.zzZYj().zzYpn() && this.zzZFZ.zzYdb()) {
            zzD(65536, "'Collapsed as default' property is not supported by the {0} file format.");
        }
        this.zzYPI.add(paragraph.zzZYj().get(1580));
        this.zzYPI.add(paragraph.zzYp5().get(40));
        this.zzYPI.add(paragraph.zzYp5().get(30));
        zzYDW zzydw = this.zzYTo;
        if (zzydw != null) {
            zzydw.zzYd0();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) {
        return this.zzYPQ.visitRowEnd(row);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        row.zzYke();
        return this.zzYPQ.visitRowStart(row);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        zzX(run);
        if (run.zzZYh().contains(885)) {
            this.zzYPK.zzC(run);
        } else if ("".equals(run.getText())) {
            run.remove();
        }
        zzTX.zzZ(run);
        this.zzYPI.add(Integer.valueOf(run.zzZYh().zzYe2()));
        this.zzYPI.add(Integer.valueOf(run.zzZYh().zzYe3()));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        section.ensureMinimum();
        this.zzYPU.zzP(section);
        if (section.zzYvR().zzYcg() > 0 && this.zzZFZ.zzYdb()) {
            zzD(65536, "Setting footnote columns is not supported by the {0} file format.");
        }
        zzV(section);
        for (int i : zzYCZ.zzXGY) {
            zzE((Border) section.zzYvR().get(i));
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) {
        int iVisitShapeEnd = this.zzYPW.visitShapeEnd(shape);
        this.zzYPN.zzli(shape.getStoryType());
        return iVisitShapeEnd;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        if (shape.getMarkupLanguage() == 0) {
            zzZn8();
            if (this.zzZFZ.zzYda() && shape.zzZYh().zzYdB() != null) {
                zzYO3.zzd(this.zzZFZ.zzYfy);
            }
        }
        int iZzZ = this.zzYPW.zzZ(shape, this.zzYPN);
        if (iZzZ == 0) {
            this.zzYPN.zzVF(shape.getStoryType());
        }
        this.zzYPI.add(Integer.valueOf(shape.zzZYh().zzYe2()));
        return iZzZ;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) {
        if (!com.aspose.words.internal.zzZYD.zzXk(smartTag.getUri())) {
            smartTag.setUri(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 117, 58, 110, 99, 115, 101, 104, 97, 109, PatternStyle.DottedGrid, 115, 105, 109, 114, 99, 115, 111, 102, 111, PatternStyle.DottedGrid, 116, 111, 99, 58, 109, 102, 111, 105, 102, 101, 99, 115, 58, 97, 109, 116, 114, 97, 116, 115, 103}));
        }
        zzY(smartTag);
        zzX(smartTag.getUri(), false, true);
        zzZ(smartTag.getProperties());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagEnd(StructuredDocumentTag structuredDocumentTag) {
        this.zzYPH.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagRangeEnd(StructuredDocumentTagRangeEnd structuredDocumentTagRangeEnd) {
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagRangeStart(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) throws Exception {
        visitStructuredDocumentTagStart(structuredDocumentTagRangeStart.zzYcK());
        visitStructuredDocumentTagEnd(structuredDocumentTagRangeStart.zzYcK());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        this.zzYPV.zzZ(structuredDocumentTag, this.zzYR0);
        zzZn8();
        this.zzYPH.push(structuredDocumentTag);
        if (this.zzZFZ.zzYda() && structuredDocumentTag.zzY3G()) {
            if (!zzZn5()) {
                zzYO3.zze(this.zzZFZ.zzYfy);
            }
            CompatibilityOptions compatibilityOptions = this.zzZFZ.zzYfy.getCompatibilityOptions();
            if (structuredDocumentTag.getSdtType() == 11 && !structuredDocumentTag.getXmlMapping().isEmpty() && !compatibilityOptions.zzZYN() && compatibilityOptions.getMswVersion() < 15) {
                compatibilityOptions.optimizeFor(5);
            }
            if (!structuredDocumentTag.getXmlMapping().isEmpty() && com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getXmlMapping().zzXQF())) {
                zzYO3.zzY(this.zzZFZ.zzYfy, 17);
            }
        }
        if (this.zzZFZ.zzYdb()) {
            if (structuredDocumentTag.getSdtType() == 16) {
                zzD(1, "Entity Picker element of Structured Document Tag is not supported by the {0} file format.");
            }
            if (structuredDocumentTag.zzY3N() != 0) {
                zzD(1, "Web Extensions are not supported by the {0} file format.");
            }
            if (structuredDocumentTag.getAppearance() != 0) {
                zzD(65536, "Appearance element of Structured Document Tag is not supported by the {0} file format.");
            }
        }
        structuredDocumentTag.zzQk(false);
        if (structuredDocumentTag.getDeleteRevision() == null) {
            if (this.zzZFZ.zzXpa.zzXoJ && structuredDocumentTag.getXmlMapping().zzX(this.zzYR0)) {
                if (!structuredDocumentTag.getXmlMapping().zzZ(this.zzYR0)) {
                    zzZ(1, 17, "Data binding failed for StructuredDocumentTag.");
                } else if (structuredDocumentTag.getXmlMapping() != null && structuredDocumentTag.getXmlMapping().getCustomXmlPart() != null && this.zzZFZ.zzZtY() != 0 && structuredDocumentTag.getSdtType() == 11) {
                    structuredDocumentTag.getXmlMapping().zzyg(com.aspose.words.internal.zzS4.zzH(structuredDocumentTag.getXmlMapping().getCustomXmlPart().getData()));
                }
            }
            if (!structuredDocumentTag.getXmlMapping().isEmpty() && com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getXmlMapping().zzXQF())) {
                zzYO3.zzY(this.zzZFZ.zzYfy, 17);
            }
            if (this.zzZFZ.zzYda()) {
                zzV(structuredDocumentTag);
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) throws Exception {
        Table tableZz1 = this.zzYR2.zz1(table);
        if (tableZz1 != null) {
            zzZYS.zzZ(tableZz1, this.zzYR3, false);
            zzY6W zzy6w = (zzY6W) com.aspose.words.internal.zzQW.zzZ(this.zzYPM, tableZz1.getDocument());
            if (zzy6w != null) {
                zzy6w.zz6(tableZz1);
            }
            if (this.zzZFZ.zzYdh() && this.zzZFZ.zzXpa.getSaveFormat() != 30) {
                zzS(tableZz1);
            }
            this.zzYPQ.visitTableEnd(tableZz1);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        zzT(table);
        table.zzY0b();
        return this.zzYPQ.visitTableStart(table);
    }

    public final void zzX(zzYDZ zzydz) throws Exception {
        Document document = zzydz.zzYfy;
        zzY81 zzy81 = new zzY81(document);
        try {
            try {
                zzY82 zzy82 = new zzY82(document);
                try {
                    this.zzZFZ = zzydz;
                    this.zzYPU = new zzZ7J(zzydz.zzXpa, getWarningCallback(), document.zzZqn());
                    int iZzFz = zzFz(this.zzZFZ.zzXpa.getSaveFormat());
                    this.zzYYj = iZzFz;
                    zzZBZ zzzbzZzZ = zzY07.zzZ(zzydz, iZzFz, this);
                    this.zzYPX = zzzbzZzZ;
                    try {
                        this.zzYPW = new zzYBV(zzydz, this.zzYYj, zzzbzZzZ, zzY07.zzXRS(), this);
                        this.zzYPP = new zzZ43(document.getLists(), this.zzZFZ, getWarningCallback());
                        this.zzYPV = new zzKL(this.zzZFZ);
                        this.zzYR1 = new zzY40();
                        zzYDZ zzydz2 = this.zzZFZ;
                        this.zzYPL = zzY07.zzY(zzydz2.zzYfy, zzydz2.zzXpa);
                        this.zzYPM = new HashMap<>();
                        this.zzYPK = new zzYEG(this, zzydz);
                        this.zzYPJ = new zzZVD(this, zzydz);
                        this.zzYPI = document.zzZpV().zzYVj;
                        this.zzYR0 = new zzXYV();
                        this.zzYTo = new zzYDW(document, this.zzZFZ.zzXpa, 1024);
                        zzKR zzkrZzRZ = document.getCompatibilityOptions().zzZYT().zzRZ("compatibilityMode");
                        if (zzkrZzRZ != null && "15".equals(zzkrZzRZ.getValue()) && zzydz.zzZtY() == 0) {
                            if (document.zzZqn() == null) {
                                document.zzZ(new zzYO3());
                            }
                            document.zzZqn().zzYrc();
                        }
                        document.accept(this);
                        this.zzYTo = null;
                        if (document.getGlossaryDocument() != null) {
                            document.getGlossaryDocument().accept(this);
                        }
                        zzC(document);
                        if (zzFA(128)) {
                            zzZ4E.zzk(document);
                            this.zzYPG = true;
                        }
                        this.zzYPW.finish();
                        zzydz.zzXp0 = this.zzYPT.zz95();
                        zzD(document);
                        zzZnc();
                        document.zzZpV().zzZ(document.getFontInfos());
                        if (this.zzZFZ.zzXpa.getMemoryOptimization()) {
                            zzZ7M.zzF(document);
                        }
                        zzy82.dispose();
                        zzy81.dispose();
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        zzy82.dispose();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                zzy81.dispose();
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            Throwable th52 = th;
            zzy81.dispose();
            throw th52;
        }
    }

    public final Map<ShapeBase, OfficeMath> zzZn6() {
        return this.zzYPL.zzZn6();
    }

    public final Map<OfficeMath, Shape> zzZn7() {
        return this.zzYPL.zzZn7();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final boolean zzZn9() {
        return false;
    }

    public final void zzZnb() throws Exception {
        zzY81 zzy81 = new zzY81(this.zzZFZ.zzYfy);
        try {
            if (this.zzZFZ.zzXpa.getMemoryOptimization()) {
                zzZ7M.zzE(this.zzZFZ.zzYfy);
            }
            Iterator<Map.Entry<DocumentBase, zzY6W>> it = this.zzYPM.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().zzXZP();
            }
            this.zzYPL.zzZnb();
            this.zzYPK.zzZnb();
            this.zzYPJ.zzZnb();
            this.zzYPQ.zzZnb();
            zzy81.dispose();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    private void zzZ(int i, int i2, String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), i, i2, str);
        }
    }

    private static void zzV(StructuredDocumentTag structuredDocumentTag) {
        Table table = (Table) com.aspose.words.internal.zzZKW.zzZ(structuredDocumentTag.getLastChild(), Table.class);
        if (table == null) {
            return;
        }
        Iterator<T> it = table.getLastRow().getCells().iterator();
        while (it.hasNext()) {
            if (((Cell) it.next()).getCellFormat().getVerticalMerge() != 2) {
                return;
            }
        }
        structuredDocumentTag.appendChild(new Paragraph(structuredDocumentTag.getDocument()));
    }

    private void zzD(int i, String str) {
        String string = SaveFormat.toString(this.zzZFZ.zzXpa.getSaveFormat());
        if (this.zzZFZ.zzYda()) {
            int iZzZtY = this.zzZFZ.zzZtY();
            if (iZzZtY == 0) {
                string = zzYPF;
            } else if (iZzZtY == 1) {
                string = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{79, 79, 77, 88, 32, 76, 83, 73, PatternStyle.Shingle, 79, 69, 73, 32, 67, 57, PatternStyle.Vertical, PatternStyle.Wave, PatternStyle.UpwardDiagonal, 32, PatternStyle.Wave, 114, 84, 110, 97, 105, 115, 105, 116, 110, 111, 108, 97});
            } else if (iZzZtY != 2) {
                com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 110, 107, 119, 111, 32, 110, 97, 118, 117, 108, PatternStyle.Divot, 101});
            } else {
                string = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{79, 79, 77, 88, 32, 76, 83, 73, PatternStyle.Shingle, 79, 69, 73, 32, 67, 57, PatternStyle.Vertical, PatternStyle.Wave, PatternStyle.UpwardDiagonal, 32, PatternStyle.Wave, 116, 83, 105, 114, 116, 99});
            }
        }
        zzZ(i, 17, com.aspose.words.internal.zzZKN.format(str, string));
    }

    private static void zzV(zzZS zzzs, int i) {
        Shading shading = (Shading) zzzs.get(i);
        if (shading == null || shading.getTexture() != 65535) {
            return;
        }
        zzzs.remove(i);
    }

    private static void zzE(Border border) {
        if (border != null) {
            border.zzOT(((int) border.getDistanceFromText()) & 31);
            if (border.getLineWidth() > 31.0d) {
                border.zzZ5(31.0d);
            }
        }
    }

    private static void zzZ(DocumentBase documentBase, int i) {
        if (documentBase.zzZpU().zzB1(i) != null) {
            return;
        }
        zzZMS zzzms = new zzZMS(documentBase, i);
        char c = 4;
        if (i != 1 && i != 4) {
            c = 3;
        }
        Paragraph paragraph = (Paragraph) zzzms.appendChild(new Paragraph(documentBase));
        paragraph.zzZYj().zzw3(0);
        paragraph.zzZYj().zzw6(240);
        paragraph.appendChild(new SpecialChar(documentBase, c, new zzYEF()));
        documentBase.zzZpU().zzZ(i, zzzms);
    }

    private void zzX(String str, boolean z, boolean z2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str) && !this.zzZFZ.zzXp4.containsKey(str)) {
            int count = this.zzZFZ.zzXp4.getCount() + 1;
            this.zzZFZ.zzXp4.zzB(str, Integer.valueOf(count));
            this.zzZFZ.zzXp3.add(count, Boolean.TRUE);
        }
    }

    private void zzX(Run run) {
        if (this.zzZFZ.zzXpa.getSaveFormat() == 20 && run.zzZYh().zzVE(StyleIdentifier.LIST_TABLE_4_ACCENT_5)) {
            Border border = run.zzZYh().getBorder();
            if (border.zz8F()) {
                border.zzYN(false);
            }
        }
    }
}
