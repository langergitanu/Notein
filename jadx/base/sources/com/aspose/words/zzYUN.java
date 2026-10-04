package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUN {
    private zzYV2 zzXSF;
    private zzYV7 zzXSG;
    private zzYV8 zzXSH;
    private zzYUE zzXUo;
    private zzYUT zzXUp;
    private zzYUP zzXUr;
    private zzZ9X zzYNv;
    private static char[] zzXSI = {ControlChar.SPACE_CHAR, '\t'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("", "noBreakHyphen", ContextChain.TAG_PRODUCT, "tbl", "rsidDel", "rsidR", "rsidRPr", "rPr", "rFonts", "ruby", "t", "instrText", "delText", "delInstrText", "tab", "cr", "softHyphen", "sym", "endnoteReference", "endnote", "footnoteReference", "footnote", "footnoteRef", "endnoteRef", "separator", "continuationSeparator", "commentReference", "annotation", FirebaseAnalytics.Param.CONTENT, "annotationRef", "pgNum", "AlternateContent", "ptab", "commentRangeStart", "commentRangeEnd", "alignment", "leader", "relativeTo", "pict", "object", "drawing", "br", "fldChar", "fldSimple", "r", "body", "oMath", "hlink", "hyperlink", "sect", "sectPr", "bookmarkStart", "bookmarkEnd", "id", C18437z2.f56754h, "customMarkFollows", "suppressRef", "clear", "Choice", "Fallback", "Requires", "rubyPr", "rt", "rubyBase", "ins", "del", "rubyAlign", "hps", "hpsRaise", "hpsBaseText", "lid");

    public zzYUN(zzYUE zzyue, zzYUP zzyup, zzYUT zzyut, zzYV8 zzyv8, zzYV7 zzyv7, zzYV2 zzyv2, zzZ9X zzz9x) {
        this.zzXUo = zzyue;
        this.zzXUr = zzyup;
        this.zzXUp = zzyut;
        this.zzXSH = zzyv8;
        this.zzXSG = zzyv7;
        this.zzXSF = zzyv2;
        this.zzYNv = zzz9x;
    }

    private zzO zzA(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzO zzo = new zzO();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 60) {
                zzyu4ZzZsD.zzZ(16777216, 14, zzyu4ZzZsD.getLocalName());
            } else {
                String value = zzyu4ZzZsD.getValue();
                if (com.aspose.words.internal.zzZYD.zzXk(value) && zzHe(zzyu4ZzZsD.zzM(value))) {
                    zzo.zzTH(value);
                    z = true;
                }
            }
        }
        if (!z) {
            return null;
        }
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        zzyvb.zztj(compositeNodeZzYz7.getNodeType());
        compositeNodeZzYz7.remove();
        CompositeNode compositeNode = (CompositeNode) compositeNodeZzYz7.deepClone(false);
        zzyvb.zzT(compositeNode);
        zzX(zzyvb, zzyef, false);
        zzyvb.zztj(compositeNode.getNodeType());
        compositeNode.remove();
        zzyvb.zzT(compositeNodeZzYz7);
        while (compositeNode.hasChildNodes()) {
            zzyvb.zzYz7().appendChild(compositeNode.getFirstChild());
        }
        return zzo;
    }

    private static void zzC(zzYVB zzyvb, zzYEF zzyef) {
        zzM(zzyvb, zzyef);
        for (Node node : zzYYM.zzZ(zzyvb.getDocument(), zzyef)) {
            zzyvb.zzXB(node);
        }
    }

    private void zzD(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        this.zzXSH.zzW(zzyvb, zzyef);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzE(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        ShapeBase shapeBaseZzZmg = ((zzZA0) zzyvb).zzZmg();
        if (shapeBaseZzZmg != null) {
            zzyvb.zzXUm.zzZ(zzyef, shapeBaseZzZmg);
            shapeBaseZzZmg.zzZ(zzyef);
            zzyvb.zzZT(shapeBaseZzZmg);
        }
    }

    private boolean zzF(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        zzZ9X zzz9x = this.zzYNv;
        if (zzz9x == null) {
            return false;
        }
        for (ShapeBase shapeBase : zzz9x.zzZ(zzyvb)) {
            if (shapeBase != null) {
                shapeBase.zzZ(zzyef);
                if (shapeBase.getShapeType() == 75) {
                    ((Shape) shapeBase).zzQW(zzyvb.zzZmh());
                }
                zzyvb.zzXB(shapeBase);
            }
        }
        return true;
    }

    private void zzG(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        IWarningCallback warningCallback = zzyvb.zzYyZ().getWarningCallback();
        Comment commentZzU = zzU(zzyvb, zzyef);
        if (commentZzU != null) {
            if (commentZzU.getParentNode() == null) {
                commentZzU.zzL(zzyef);
                zzyvb.zzXB(commentZzU);
            } else if (warningCallback != null) {
                warningCallback.warning(new WarningInfo(1, 9, com.aspose.words.internal.zzZKN.format("Custom comment with id={0} was already added", Integer.toString(commentZzU.getId()))));
            }
        }
    }

    private static boolean zzH(zzYVB zzyvb, zzYEF zzyef) {
        Node nodeZzZYq = zzyvb.zzYz7().zzZYq();
        Footnote footnote = (nodeZzZYq == null || nodeZzZYq.getNodeType() != 20) ? null : (Footnote) nodeZzZYq;
        if (footnote != null && !footnote.isAuto() && footnote.getReferenceMark().length() < 10) {
            Style styleZzZ7 = zzyvb.getDocument().getStyles().zzZ7(38, false);
            if (zzyef.contains(50) && styleZzZ7 != null && zzyef.zzZ7j() == styleZzZ7.zzZ7j()) {
                return footnote.zzZYh().zzW(zzyef, zzYEF.zzXq4);
            }
        }
        return false;
    }

    public static boolean zzHe(String str) {
        return zzZX5.zzMT(str) || zzZX5.zzMS(str) || zzZX5.zzMR(str);
    }

    private static boolean zzHf(String str) {
        if (str.length() <= 0 || str.charAt(0) != '\r') {
            return false;
        }
        return com.aspose.words.internal.zzZYD.zzXh(str);
    }

    private static boolean zzHg(String str) {
        return str.length() == 1 && str.charAt(0) == 8194;
    }

    private static void zzI(zzYVB zzyvb, zzYEF zzyef) {
        FontInfo fontInfo;
        zzM(zzyvb, zzyef);
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        zzyef2.remove(400);
        char cZzG = zzyvb.zzZsD().zzG(zzyef2);
        zzyef2.zzQ(890, Boolean.TRUE);
        if (cZzG != 160 && (fontInfo = zzyvb.getDocument().getFontInfos().get(zzyef2.getNameAscii())) != null && fontInfo.getCharset() == 2) {
            cZzG = com.aspose.words.internal.zzJF.zzE(cZzG);
        }
        if (!zzH(zzyvb, zzyef2)) {
            zzyvb.zzXB(new Run(zzyvb.getDocument(), Character.toString(cZzG), zzyef2));
            return;
        }
        ((Footnote) zzyvb.zzYz7().zzZYq()).setReferenceMark(((Footnote) zzyvb.zzYz7().zzZYq()).getReferenceMark() + cZzG);
    }

    private void zzJ(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        zzyvb.zzR(compositeNodeZzYz7.getParentNode());
        boolean zZzL = this.zzXUp.zzL(zzyvb);
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzyvb.zzYz7().zzZYq(), Paragraph.class);
        if (zZzL) {
            zzyvb.zzYz3();
            zzyvb.zzYz7().appendChild(compositeNodeZzYz7);
        }
        if (paragraph != null) {
            Paragraph paragraph2 = ((Paragraph) compositeNodeZzYz7.zztD(8)) != null ? (Paragraph) compositeNodeZzYz7.zztD(8) : paragraph;
            while (compositeNodeZzYz7.hasChildNodes()) {
                paragraph2.prependChild(compositeNodeZzYz7.getLastChild());
            }
            paragraph.zzYD(compositeNodeZzYz7);
            if (compositeNodeZzYz7.getNodeType() == 8) {
                zzYMX zzymxZzZYj = ((Paragraph) compositeNodeZzYz7).zzZYj();
                for (int i : zzymxZzZYj.zzrc()) {
                    if (i != 1000 && i != 1580) {
                        paragraph.zzZYj().zzN(i, zzymxZzZYj.get(i));
                    }
                }
            }
        }
        zzyvb.zzR(compositeNodeZzYz7);
    }

    private void zzK(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzM(zzyvb, zzyef);
        this.zzXSF.zzY(zzyvb);
    }

    public static void zzM(zzYVB zzyvb, zzYEF zzyef) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String string = zzyu4ZzZsD.zzYyz().toString();
        if (com.aspose.words.internal.zzZYD.zzXk(string) || zzyef.contains(885)) {
            Run run = new Run(zzyvb.getDocument(), string, zzyef);
            zzyvb.zzXB(run);
            if (zzyef.contains(885)) {
                zzM(run);
            }
            zzZMI.zzZ(run);
            zzyvb.zzN(run);
            zzyu4ZzZsD.zzYyz().setLength(0);
        }
    }

    private static void zzN(zzYVB zzyvb, zzYEF zzyef) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        AbsolutePositionTab absolutePositionTab = new AbsolutePositionTab(zzyvb.getDocument(), zzyef);
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 35:
                    absolutePositionTab.setAlignment(zzZXP.zzN3(zzyu4ZzZsD.getValue()));
                    break;
                case 36:
                    absolutePositionTab.zzPp(zzZXP.zzN2(zzyu4ZzZsD.getValue()));
                    break;
                case 37:
                    absolutePositionTab.zzPq(zzZXP.zzN1(zzyu4ZzZsD.getValue()));
                    break;
            }
        }
        zzyvb.zzXB(absolutePositionTab);
    }

    private void zzO(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        int iZzGV;
        if (zzyef == null) {
            zzyef = new zzYEF();
        }
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (!zzyvb.zzYyZ().zzZrB()) {
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 5) {
                    int iZzGV2 = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                    if (iZzGV2 != Integer.MIN_VALUE && iZzGV2 != zzyu4ZzZsD.zzYyx()) {
                        zzyef.zzQ(40, Integer.valueOf(iZzGV2));
                    }
                } else if (iZzTP == 6 && (iZzGV = zzYU3.zzGV(zzyu4ZzZsD.getValue())) != Integer.MIN_VALUE) {
                    zzyef.zzQ(30, Integer.valueOf(iZzGV));
                }
            }
        }
        zzX(zzyvb, zzyef, false);
        zzM(zzyvb, zzyef);
    }

    public static char zzR(zzYU4 zzyu4, zzYEF zzyef) {
        char cZzHn = ControlChar.LINE_BREAK_CHAR;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 54) {
                cZzHn = zzYUQ.zzHn(zzyu4.getValue());
            } else if (iZzTP == 57) {
                zzyef.zzQ(45, Integer.valueOf(zzYUQ.zzHo(zzyu4.getValue())));
            }
        }
        return cZzHn;
    }

    private void zzX(zzYVB zzyvb, zzYEF zzyef, boolean z) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        boolean z2 = false;
        boolean z3 = false;
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 7:
                        if (z3) {
                            zzM(zzyvb, zzyef);
                            zzyef = new zzYEF();
                            z3 = false;
                            z2 = true;
                        }
                        this.zzXUr.zzW(zzyvb, zzyef);
                        continue;
                    case 8:
                        this.zzXUr.zzV(zzyu4ZzZsD, zzyef);
                        continue;
                    case 9:
                        zzy(zzyvb, zzyef);
                        continue;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zzP(zzyvb, zzyef);
                        break;
                    case 14:
                        if (!z) {
                            com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), ControlChar.TAB);
                        }
                        break;
                    case 15:
                        com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), ControlChar.PARAGRAPH_BREAK);
                        continue;
                    case 16:
                        com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), ControlChar.zzZs3);
                        continue;
                    case 17:
                        zzI(zzyvb, zzyef);
                        zzyef = (zzYEF) zzyef.zzbn();
                        z2 = true;
                        continue;
                    case 18:
                    case 19:
                        zzZ(zzyvb, zzyef, 1);
                        continue;
                    case 20:
                    case 21:
                        zzZ(zzyvb, zzyef, 0);
                        continue;
                    case 22:
                    case 23:
                        zzZ(zzyvb, zzyef, (char) 2);
                        continue;
                    case 24:
                        zzZ(zzyvb, zzyef, (char) 3);
                        continue;
                    case 25:
                        zzZ(zzyvb, zzyef, (char) 4);
                        continue;
                    case 26:
                    case 27:
                    case 28:
                        if (!zzyvb.zzZmv()) {
                            zzG(zzyvb, zzyef);
                        } else {
                            continue;
                        }
                        break;
                    case 29:
                        zzZ(zzyvb, zzyef, (char) 5);
                        continue;
                    case 30:
                        zzC(zzyvb, zzyef);
                        continue;
                    case 31:
                        zzB(zzyvb, (zzYEF) zzyef.zzbn());
                        continue;
                    case 32:
                        zzN(zzyvb, zzyef);
                        continue;
                    case 33:
                        zzM(zzyvb, zzyef);
                        zzZY7.zzQ(zzyvb);
                        continue;
                    case 34:
                        zzM(zzyvb, zzyef);
                        zzZY7.zzP(zzyvb);
                        continue;
                    default:
                        if (!zzL(zzyvb, zzyef)) {
                            zzX(zzyvb, zzyef, true);
                        } else {
                            continue;
                        }
                        break;
                }
                z3 = true;
            } else {
                com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), ControlChar.zzZs4);
            }
        }
        if (z2) {
            zzM(zzyvb, zzyef);
        }
    }

    private void zzY(zzYVB zzyvb, zzYEF zzyef, zzO zzo) throws Exception {
        if (zzo != null) {
            zzZ(zzyvb, zzyef, zzo);
        } else {
            zzX(zzyvb, zzyef, false);
        }
    }

    private static void zzZ(zzYVB zzyvb, zzYEF zzyef, char c) {
        zzM(zzyvb, zzyef);
        zzyvb.zzXB(new SpecialChar(zzyvb.getDocument(), c, zzyef));
    }

    private void zzv(zzYVB zzyvb) throws Exception {
        Paragraph paragraph = (Paragraph) zzyvb.zzYz7();
        zzyvb.zztj(8);
        zzI(zzyvb);
        Table table = (Table) zzyvb.zzYz7().getLastChild();
        Row firstRow = table.getFirstRow();
        if (firstRow == null || firstRow.getFirstCell() == null) {
            table.remove();
            zzyvb.zzR(paragraph);
            return;
        }
        Paragraph paragraph2 = (Paragraph) firstRow.getFirstCell().getChild(8, 0, true);
        if (paragraph2 != null) {
            paragraph2.zzY(paragraph.getFirstChild(), null, null);
            zzYMX zzymx = (zzYMX) paragraph.zzZYj().zzbn();
            paragraph2.zzZYj().zzY(zzymx);
            paragraph2.zzZ(zzymx);
        }
        paragraph.remove();
        zzyvb.zzT(paragraph);
    }

    private void zzw(zzYVB zzyvb) throws Exception {
        zzZ7Q zzz7qZzYHk = zzyvb.zzYHk();
        StructuredDocumentTag structuredDocumentTagZzYUN = zzz7qZzYHk.zzYUN();
        int iZzZ = zzz7qZzYHk.zzZ((StructuredDocumentTag) zzyvb.zzYz7(), 8);
        this.zzXUp.zzL(zzyvb);
        zzz7qZzYHk.zzZ(structuredDocumentTagZzYUN, (Paragraph) zzyvb.zzYz7().zzZYq(), iZzZ);
    }

    private void zzx(zzYVB zzyvb) throws Exception {
        zzZ7Q zzz7qZzYHk = zzyvb.zzYHk();
        StructuredDocumentTag structuredDocumentTagZzYUN = zzz7qZzYHk.zzYUN();
        int iZzZ = zzz7qZzYHk.zzZ((StructuredDocumentTag) zzyvb.zzYz7(), 5);
        zzI(zzyvb);
        zzz7qZzYHk.zzZ(structuredDocumentTagZzYUN, (Table) zzyvb.zzYz7().zzZYq(), iZzZ);
    }

    private void zzy(zzYVB zzyvb) throws Exception {
        int nodeType = zzyvb.zzYz7().getNodeType();
        if (nodeType == 8) {
            zzv(zzyvb);
        } else if (nodeType != 28) {
            zzyvb.zzZsD().zzSw(zzyvb.zzZmh());
        } else {
            zzx(zzyvb);
        }
    }

    private void zzz(zzYVB zzyvb) throws Exception {
        Paragraph paragraph = (Paragraph) zzyvb.zzYz7();
        zzyvb.zztj(8);
        if (paragraph.getChildNodes(0, false).getCount() == 0) {
            paragraph.remove();
        }
        this.zzXUo.zzF(zzyvb);
        zzyvb.zzT(new Paragraph(zzyvb.getDocument()));
    }

    public final void zzB(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzO zzoZzA = null;
        boolean z = false;
        while (zzyu4ZzZsD.zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 58) {
                zzoZzA = zzA(zzyvb, zzyef);
                z = true;
            } else if (iZzTP != 59) {
                zzyu4ZzZsD.zzT(16777216, 14, zzyu4ZzZsD.getLocalName());
            } else {
                zzY(zzyvb, zzyef, zzoZzA);
                if (!z) {
                    return;
                } else {
                    zzyvb.zzZqn().zzYrc();
                }
            }
        }
    }

    public abstract void zzI(zzYVB zzyvb) throws Exception;

    public final boolean zzL(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 2) {
            return zzz(zzyvb, zzyef);
        }
        if (iZzTP == 3) {
            zzy(zzyvb);
            return true;
        }
        if (iZzTP == 7) {
            this.zzXUr.zzW(zzyvb, zzyef);
            return true;
        }
        if (iZzTP == 10) {
            zzP(zzyvb, zzyef);
            zzM(zzyvb, zzyef);
            return true;
        }
        if (iZzTP == 31) {
            zzB(zzyvb, (zzYEF) zzyef.zzbn());
            return true;
        }
        switch (iZzTP) {
            case 38:
            case 39:
                return zzF(zzyvb, zzyef);
            case 40:
                zzE(zzyvb, zzyef);
                return true;
            case 41:
                zzyu4ZzZsD.zzYyz().append(zzR(zzyu4ZzZsD, zzyef));
                return true;
            case 42:
                zzD(zzyvb, zzyef);
                return true;
            case 43:
                this.zzXSG.zzW(zzyvb, zzyef);
                return true;
            case 44:
                zzO(zzyvb, (zzYEF) zzyef.zzbn());
                return true;
            case 45:
                zzz(zzyvb);
                return true;
            case 46:
                zzZX7.zzM(zzyvb);
                return true;
            case 47:
            case 48:
                zzK(zzyvb, zzyef);
                return true;
            case 49:
                zzX(zzyvb, zzyef, false);
                return true;
            case 50:
                zzyvb.zzSA(false);
                return true;
            case 51:
                zzM(zzyvb, zzyef);
                zzZYE.zzS(zzyvb);
                return true;
            case 52:
                zzM(zzyvb, zzyef);
                zzZYE.zzR(zzyvb);
                return true;
            default:
                return zzZ(zzyu4ZzZsD.getLocalName(), zzyvb, zzyef);
        }
    }

    public final void zzP(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        boolean z = zzyvb.zzYz0() || "preserve".equals(zzyu4ZzZsD.zzV("space", "")) || !"t".equals(localName);
        while (zzyu4ZzZsD.zzY(localName, 3)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                String strReplace = com.aspose.words.internal.zzZKN.zzU(zzyu4ZzZsD.getValue().replace(ControlChar.CR_LF, ControlChar.zzZs5), '\n').replace(ControlChar.f50774LF, ControlChar.zzZs5).replace(ControlChar.f50773CR, ControlChar.zzZs5);
                if (!z) {
                    strReplace = com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzV(strReplace, zzXSI), '\t', ControlChar.SPACE_CHAR);
                }
                if (zzHg(strReplace)) {
                    zzZ(zzyvb, zzyef, strReplace.charAt(0));
                } else if (!zzHf(strReplace)) {
                    com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), strReplace);
                }
            } else if (iZzTP == 1) {
                com.aspose.words.internal.zzZNH.zzU(zzyu4ZzZsD.zzYyz(), ControlChar.zzZs4);
            } else if (iZzTP == 2) {
                zzJ(zzyvb, zzyef);
            } else if (iZzTP != 3) {
                zzL(zzyvb, zzyef);
            } else {
                zzy(zzyvb);
            }
        }
    }

    public abstract Comment zzU(zzYVB zzyvb, zzYEF zzyef) throws Exception;

    public final void zzW(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzO(zzyvb, zzyef);
    }

    public abstract Footnote zzZ(zzYVB zzyvb, int i, int i2, zzYEF zzyef) throws Exception;

    public abstract boolean zzZ(String str, zzYVB zzyvb, zzYEF zzyef) throws Exception;

    private void zzZ(zzYVB zzyvb, zzYEF zzyef, int i) throws Exception {
        zzM(zzyvb, zzyef);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzb = -1;
        boolean zZz8 = false;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 53) {
                iZzb = zzyu4ZzZsD.zzb();
            } else if (iZzTP == 55) {
                zZz8 = zzyu4ZzZsD.zz8();
            } else if (iZzTP == 56) {
                zZz8 = zzyu4ZzZsD.zz8();
            }
        }
        Footnote footnoteZzZ = zzZ(zzyvb, iZzb, i, zzyef);
        if (footnoteZzZ != null) {
            footnoteZzZ.isAuto(!zZz8);
            footnoteZzZ.zzL(zzyef);
            if (zZz8) {
                zzZ(zzyvb, zzyef, zzyu4ZzZsD, footnoteZzZ, iZzb);
            }
            zzyvb.zzXB(footnoteZzZ);
        }
    }

    public final void zzY(zzYVB zzyvb) throws Exception {
        zzO(zzyvb, null);
    }

    private void zzy(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYEJ zzyej = new zzYEJ();
        zzyef.zzQ(885, zzyej);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("ruby")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 61:
                    zzZ(zzyvb, zzyej);
                    break;
                case 62:
                    zzZ(zzyvb, zzyej.zzYe7());
                    break;
                case 63:
                    zzZ(zzyvb, zzyej.zzYe6());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private boolean zzz(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        int nodeType = zzyvb.zzYz7().getNodeType();
        if (nodeType == 8) {
            zzJ(zzyvb, zzyef);
            return true;
        }
        if (nodeType != 28) {
            return false;
        }
        zzw(zzyvb);
        return true;
    }

    private static void zzM(Run run) {
        int iIntValue = ((Integer) zzZ7R.zzZ(run, 190, 0)).intValue();
        zzYEJ zzyej = (zzYEJ) run.zzZYh().get(885);
        zzyej.zzXqk = iIntValue;
        zzyej.zzD(run);
    }

    private static void zzZ(zzYVB zzyvb, zzYEF zzyef, zzYU4 zzyu4, Footnote footnote, int i) {
        if (zzyu4.zzQ("r")) {
            if (!"t".equals(zzyu4.getLocalName()) && !"delText".equals(zzyu4.getLocalName()) && !"instrText".equals(zzyu4.getLocalName())) {
                if ("br".equals(zzyu4.getLocalName())) {
                    footnote.setReferenceMark(Character.toString(zzR(zzyu4, zzyef)));
                    return;
                } else if ("sym".equals(zzyu4.getLocalName())) {
                    footnote.setReferenceMark(Character.toString(zzyvb.zzZsD().zzG(zzyef)));
                    return;
                } else {
                    if ("tab".equals(zzyu4.getLocalName())) {
                        footnote.setReferenceMark(ControlChar.TAB);
                        return;
                    }
                    throw new IllegalStateException("Unsupported footnote reference mark.");
                }
            }
            if (zzyu4.zzY("t", 3) && "".equals(zzyu4.getLocalName())) {
                footnote.setReferenceMark(zzyu4.getValue());
                return;
            } else {
                zzyvb.zzZ(1, 9, com.aspose.words.internal.zzZKN.format("Custom footnote mark '{0}' with empty reference mark, ignored.", Integer.valueOf(i)));
                return;
            }
        }
        zzyvb.zzZ(1, 9, com.aspose.words.internal.zzZKN.format("Custom footnote mark '{0}' without reference mark, ignored.", Integer.valueOf(i)));
    }

    private void zzZ(zzYVB zzyvb, zzYEF zzyef, zzO zzo) throws Exception {
        String localName = zzyvb.zzZsD().getLocalName();
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        CompositeNode compositeNode = (CompositeNode) zzyvb.zzYz7().deepClone(false);
        zzyvb.zzT(compositeNode);
        try {
            zzX(zzyvb, (zzYEF) zzyef.zzbn(), false);
        } catch (Exception e) {
            while (zzyvb.zzZsD().zzQ(localName)) {
                zzyvb.zzZsD().zzYyH();
            }
            zzZ(zzyvb, compositeNode, compositeNodeZzYz7);
            zzyvb.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Read 'Fallback' element failed. Error details: {0}", e.getMessage()));
            compositeNode = null;
        }
        zzo.zzZ(compositeNode);
        Node firstChild = compositeNode != null ? compositeNode.getFirstChild() : null;
        if (firstChild instanceof ShapeBase) {
            ((ShapeBase) firstChild).zzY9e();
        }
        zzyef.zzZ(zzo);
        zzZ(zzyvb, compositeNode, compositeNodeZzYz7);
    }

    private static void zzZ(zzYVB zzyvb, CompositeNode compositeNode, CompositeNode compositeNode2) {
        if (compositeNode == null) {
            return;
        }
        zzyvb.zzR(compositeNode2);
        compositeNode.remove();
    }

    private void zzZ(zzYVB zzyvb, zzYEH zzyeh) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        Paragraph paragraph = new Paragraph(zzyvb.getDocument());
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 44 && iZzTP != 64 && iZzTP != 65) {
                zzyu4ZzZsD.zzk();
            } else {
                CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
                zzyvb.zzR(paragraph);
                paragraph.getChildNodes(0, false).clear();
                zzY(zzyvb);
                Run runZzYVe = paragraph.zzYVe();
                zzYEI zzyei = new zzYEI();
                zzyei.zzZAL = runZzYVe.getText();
                zzyei.zzXqg = (zzYEF) runZzYVe.zzZYh().zzbn();
                zzyeh.zzZ(zzyei);
                zzyvb.zzR(compositeNodeZzYz7);
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, zzYEJ zzyej) {
        int iZzYw;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        while (zzyu4ZzZsD.zzQ("rubyPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 66:
                    zzyej.zzZGm = zzYUQ.zzHh(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 67:
                    zzyej.zzXql = zzyu4ZzZsD.zzW(zzyo3ZzZqn);
                    break;
                case 68:
                    zzyej.zzXqj = zzyu4ZzZsD.zzW(zzyo3ZzZqn);
                    break;
                case 69:
                    zzyej.zzXqk = zzyu4ZzZsD.zzW(zzyo3ZzZqn);
                    break;
                case 70:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (zzyvb.zzZmh()) {
                        iZzYw = com.aspose.words.internal.zzBM.zzYx(strZzV);
                    } else {
                        iZzYw = com.aspose.words.internal.zzBM.zzYw(strZzV);
                    }
                    zzyej.zzQy = iZzYw;
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }
}
