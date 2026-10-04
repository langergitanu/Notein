package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldIndex extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\r", "\\y", "\\b", "\\c", "\\d", "\\e", "\\f", "\\g", "\\h", "\\k", "\\l", "\\p", "\\s", "\\z");
    private zzZQ0 zzYDH;

    public static class zzZ {
        private Node zzYDA;
        private zzZA2 zzYDB;
        private Node zzYDC;
        private Node zzYDD;
        private Row zzYDE;
        private Run zzYDF;
        private Run zzYDG;
        private DocumentBase zzZCL;
        private zzYWB zzZtB;

        private zzZ(zzYWB zzywb, zzZA2 zzza2, Node node) {
            DocumentBase document = node.getDocument();
            Run run = new Run(document);
            Paragraph paragraph = new Paragraph(document);
            Body body = new Body(document);
            new Section(document).appendChild(body);
            body.appendChild(paragraph);
            paragraph.appendChild(run);
            this.zzZCL = document;
            this.zzYDC = run;
            this.zzYDA = node;
            this.zzZtB = zzywb;
            this.zzYDB = zzza2;
        }

        private void zzS(Row row) {
            zzZdw();
            zzZdv();
            this.zzYDF = new Run(this.zzZCL, " ");
            this.zzYDE = row;
        }

        public static void zzZ(zzYWB zzywb, zzZA2 zzza2, Node node) throws Exception {
            new zzZ(zzywb, zzza2, node).zzZdx();
        }

        private void zzZK(Node node) {
            this.zzYDA.zzYC(node);
        }

        private boolean zzZL(Node node) {
            Node node2 = this.zzYDD;
            return node2 != null && node.zzYF(node2);
        }

        private void zzZM(Node node) {
            this.zzYDD = node;
            zzZK(node.deepClone(true));
        }

        private void zzZdv() {
            Run run = this.zzYDF;
            if (run == null) {
                return;
            }
            zzZK(run);
            this.zzYDE = null;
            this.zzYDF = null;
        }

        private void zzZdw() {
            Run run = this.zzYDG;
            if (run == null) {
                return;
            }
            zzZK(run);
            this.zzYDG = null;
        }

        private void zzZdx() throws Exception {
            zzYWB zzywbZzZ = zzYWJ.zzZ(this.zzZtB, this.zzYDC, this.zzYDB, (zzZA3) null, true, 7);
            if (zzywbZzZ == null) {
                return;
            }
            for (Node node : zzywbZzZ) {
                if (!zzZL(node)) {
                    int nodeType = node.getNodeType();
                    if (nodeType == 6) {
                        zzS((Row) node);
                    } else if (nodeType == 8) {
                        zzu((Paragraph) node);
                    } else if (node instanceof zzZAM) {
                        zzZM(node);
                    }
                }
            }
        }

        private void zzu(Paragraph paragraph) {
            if (this.zzYDE != null && paragraph.getParentRow() != this.zzYDE) {
                zzZdv();
            }
            zzZdw();
            this.zzYDG = new Run(this.zzZCL, " ", paragraph.zzYp5());
        }
    }

    private void zzDh(int i) throws Exception {
        if (this.zzYDH.zzZdf()) {
            StringBuilder sbZzZdA = zzZdA();
            zzZ7X zzz7xZzZdg = this.zzYDH.zzZdg();
            zzZ(sbZzZdA, zzz7xZzZdg, zzz7xZzZdg.zzYV2(), i);
            zzZ(sbZzZdA, zzz7xZzZdg);
        }
    }

    private static int zzDi(int i) {
        switch (i) {
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
                return 12;
            case 4:
                return 13;
            case 5:
                return 14;
            case 6:
                return 15;
            case 7:
                return 16;
            case 8:
                return 17;
            case 9:
                return 18;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: subentryLevel");
        }
    }

    private void zzX(Node node, zzZ7Z zzz7z, int i) throws Exception {
        if (zzz7z.zzYV5()) {
            for (zzZ7X zzz7x : zzz7z.zzYV7()) {
                if (zzz7x.zzYUW().zzZez()) {
                    zzZ(node, zzz7x.zzYUW(), i);
                }
            }
        }
    }

    private static void zzY(DocumentBuilder documentBuilder, int i, int i2) {
        StructuredDocumentTag.zzWr(documentBuilder.getCurrentNode());
        documentBuilder.zzFU(0);
        zzYCZ zzyczZzYvR = documentBuilder.getCurrentSection().zzYvR();
        zzyczZzYvR.zzmy(i);
        zzyczZzYvR.zzmx(i2);
    }

    private void zzYY(char c) throws Exception {
        zzZQ3.zzZ(this, this.zzYDH.zzZp6(), 33);
        zzZQ3.zzZ(this.zzYDH.zzZp6(), (Paragraph) null);
        Paragraph currentParagraph = this.zzYDH.zzZp6().getCurrentParagraph();
        zzZQ3.zzZ(this.zzYDH.zzZp6().getDocument(), currentParagraph);
        currentParagraph.zzZYj().setKeepWithNext(true);
        zzZPB.zzZ(this, this.zzYDH.zzZp6(), this.zzYDH.zzZdj().zzZ5(c));
    }

    private zzZQ1 zzZ(zzZOQ zzzoq) throws Exception {
        zzZQV zzzqv;
        Bookmark bookmarkZzLG;
        String str = null;
        if (zzZN(getStart())) {
            zzzqv = new zzZQV(this);
            if (zzzqv.zzZfc() && !zzzqv.zzZfb()) {
                str = "Error! Not a valid range of characters.";
                bookmarkZzLG = null;
            } else if (zzzqv.zzZff()) {
                bookmarkZzLG = zzzoq.zzLG(zzzqv.getBookmarkName());
                if (bookmarkZzLG != null && !zzZN(bookmarkZzLG.getBookmarkStart())) {
                    bookmarkZzLG = null;
                }
                if (bookmarkZzLG == null) {
                    str = "Error! Bookmark not defined.";
                }
            } else {
                bookmarkZzLG = null;
            }
        } else {
            zzzqv = null;
            str = "Error! Index not allowed in footnote, endnote, header, footer, or comment.";
            bookmarkZzLG = null;
        }
        return new zzZQ1(str, zzzqv, bookmarkZzLG);
    }

    private static boolean zzZN(Node node) {
        return node.zztB(3) != null;
    }

    private StringBuilder zzZdA() {
        return new StringBuilder(this.zzYDH.zzZde() ? this.zzYDH.zzZdj().getPageNumberListSeparator() : this.zzYDH.zzZdj().getPageNumberSeparator());
    }

    public String getBookmarkName() {
        return zzZgq().zzt("\\b", false);
    }

    public String getCrossReferenceSeparator() {
        return zzZgq().zzt("\\k", false);
    }

    public String getEntryType() {
        return zzZgq().zzt("\\f", false);
    }

    public String getHeading() {
        return zzZgq().zzt("\\h", false);
    }

    public String getLanguageId() {
        return zzZgq().zzt("\\z", false);
    }

    public String getLetterRange() {
        return zzZgq().zzt("\\p", false);
    }

    public String getNumberOfColumns() {
        return zzZgq().zzt("\\c", false);
    }

    public String getPageNumberListSeparator() {
        return zzZgq().zzt("\\l", false);
    }

    public String getPageNumberSeparator() {
        return zzZgq().zzt("\\e", false);
    }

    public String getPageRangeSeparator() {
        return zzZgq().zzt("\\g", false);
    }

    public boolean getRunSubentriesOnSameLine() {
        return zzZgq().zzMj("\\r");
    }

    public String getSequenceName() {
        return zzZgq().zzt("\\s", false);
    }

    public String getSequenceSeparator() {
        return zzZgq().zzt("\\d", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return 2;
            default:
                return 0;
        }
    }

    public boolean getUseYomi() {
        return zzZgq().zzMj("\\y");
    }

    public boolean hasPageNumberSeparator() {
        return zzZgq().zzMj("\\e");
    }

    public boolean hasSequenceName() {
        return zzZgq().zzMj("\\s");
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzZf("\\b", str);
    }

    public void setCrossReferenceSeparator(String str) throws Exception {
        zzZgq().zzZf("\\k", str);
    }

    public void setEntryType(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setHeading(String str) throws Exception {
        zzZgq().zzZf("\\h", str);
    }

    public void setLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\z", str);
    }

    public void setLetterRange(String str) throws Exception {
        zzZgq().zzZf("\\p", str);
    }

    public void setNumberOfColumns(String str) throws Exception {
        zzZgq().zzZe("\\c", str);
    }

    public void setPageNumberListSeparator(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setPageNumberSeparator(String str) throws Exception {
        zzZgq().zzZf("\\e", str);
    }

    public void setPageRangeSeparator(String str) throws Exception {
        zzZgq().zzZf("\\g", str);
    }

    public void setRunSubentriesOnSameLine(boolean z) throws Exception {
        zzZgq().zzs("\\r", z);
    }

    public void setSequenceName(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setSequenceSeparator(String str) throws Exception {
        zzZgq().zzZf("\\d", str);
    }

    public void setUseYomi(boolean z) throws Exception {
        zzZgq().zzs("\\y", z);
    }

    public final com.aspose.words.internal.zz7I zzZdy() {
        return zzZgq().zzMc("\\c");
    }

    public final boolean zzZdz() {
        return zzZgq().zzMj("\\c");
    }

    @Override // com.aspose.words.Field
    public final com.aspose.words.internal.zzHH zzZgE() {
        return com.aspose.words.internal.zzSG.zzk(((Section) getStart().getAncestor(2)).zzYvR().getBidi());
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZ7Z zzz7zZzZ;
        int i;
        zzZQ1 zzzq1ZzZ = zzZ(zzZgo());
        if (zzzq1ZzZ.isError()) {
            return new zzZP2(this, zzzq1ZzZ.getErrorMessage());
        }
        zzZQV zzzqvZzZdj = zzzq1ZzZ.zzZdj();
        zzZPF zzzpf = zzzqvZzZdj.hasSequenceName() ? (zzZPF) zzZgo().zzZav().zzY(new zzZPF(zzZgo())) : null;
        int i2 = 0;
        if (zzzqvZzZdj.zzZff()) {
            Bookmark bookmark = zzzq1ZzZ.getBookmark();
            zzz7zZzZ = zzZ7Z.zzZ(zzzqvZzZdj, zzzpf, new zzYWB(bookmark.getBookmarkStart(), false, bookmark.getBookmarkEnd(), false));
        } else {
            zzz7zZzZ = zzZ7Z.zzZ(zzzqvZzZdj, zzzpf, getStart().getDocument());
        }
        if (!zzz7zZzZ.zzYV8()) {
            return new zzZP2(this, "No index entries found.");
        }
        com.aspose.words.internal.zzZOY zzzoyZzZbn = zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilderZzN = zzZQ3.zzN(this);
            if (zzzqvZzZdj.zzZfd()) {
                zzYCZ zzyczZzYvR = documentBuilderZzN.getCurrentSection().zzYvR();
                int columnsCount = zzyczZzYvR.getColumnsCount();
                int iZzYco = zzyczZzYvR.zzYco();
                zzY(documentBuilderZzN, zzzqvZzZdj.zzZfe(), 720);
                i = iZzYco;
                i2 = columnsCount;
            } else {
                i = 0;
            }
            this.zzYDH = new zzZQ0(zzzqvZzZdj, documentBuilderZzN);
            zzZ((Node) null, zzz7zZzZ, 1);
            this.zzYDH = null;
            if (zzzqvZzZdj.zzZfd()) {
                documentBuilderZzN.moveTo(getEnd());
                zzY(documentBuilderZzN, i2, i);
            }
            zzzoyZzZbn.dispose();
            return new zzZP4(this);
        } catch (Throwable th) {
            zzzoyZzZbn.dispose();
            throw th;
        }
    }

    private static void zzX(zzZ9G zzz9g, int i) {
        zzz9g.setRunAttr(i, ((zzZU) zzZ7R.zzZ(zzz9g, i, 0)).zzbr());
    }

    private static void zzY(Node node, Node node2, boolean z) {
        while (node.getNodeType() == 21) {
            Run run = (Run) node;
            node = node.zzSI(z);
            if (com.aspose.words.internal.zzZYD.zzXi(run.getText())) {
                run.remove();
                if (run == node2) {
                    return;
                }
            } else {
                String text = run.getText();
                run.setText(z ? com.aspose.words.internal.zzZKN.zzTZ(text) : com.aspose.words.internal.zzZKN.zzTY(text));
                return;
            }
        }
    }

    private void zzZ(Node node, zzZ7Z zzz7z, int i) throws Exception {
        FieldIndex fieldIndex;
        Node node2;
        zzZ7Z zzz7z2;
        int i2;
        char cZzZK;
        if (zzz7z.zzYV8()) {
            char c = 0;
            boolean z = i == 1 && this.zzYDH.zzZdj().zzZfg();
            int iZzDi = zzDi(i);
            int i3 = 0;
            while (i3 < zzz7z.zzYV9()) {
                String strZzye = zzz7z.zzye(i3);
                int iZzXf = com.aspose.words.internal.zzZYD.zzXf(strZzye);
                if (iZzXf == -1) {
                    zzZ(node, zzz7z.zzyd(i3), i + 1);
                    node2 = node;
                    zzz7z2 = zzz7z;
                    i2 = i;
                } else {
                    if (!z || c == (cZzZK = com.aspose.words.internal.zzZKU.zzZK(strZzye.charAt(iZzXf)))) {
                        fieldIndex = this;
                        node2 = node;
                        zzz7z2 = zzz7z;
                        i2 = i;
                    } else {
                        zzYY(cZzZK);
                        c = cZzZK;
                        node2 = node;
                        zzz7z2 = zzz7z;
                        i2 = i;
                        fieldIndex = this;
                    }
                    fieldIndex.zzZ(node2, zzz7z2, i2, i3, iZzDi);
                }
                i3++;
                node = node2;
                zzz7z = zzz7z2;
                i = i2;
            }
        }
    }

    private void zzY(Node node, zzZ7Z zzz7z, int i) throws Exception {
        int iZzYUZ;
        if (zzz7z.zzYV6()) {
            this.zzYDH.zzZdi();
            int i2 = -1;
            int iZzYV2 = -1;
            for (zzZ7X zzz7x : zzz7z.zzYV7()) {
                if (!zzz7x.zzYUW().zzZez()) {
                    int iZzYV0 = 0;
                    if (!this.zzYDH.zzZdj().hasSequenceName()) {
                        iZzYUZ = 0;
                    } else if (zzz7x.zzYUY()) {
                        iZzYV0 = zzz7x.zzYV0();
                        iZzYUZ = zzz7x.zzYUZ();
                    } else {
                        iZzYV0 = zzz7x.zzYV0();
                        iZzYUZ = 0;
                    }
                    if (zzz7x.zzYV2() != iZzYV2 || iZzYV0 != i2) {
                        zzDh(i2);
                        iZzYV2 = zzz7x.zzYV2();
                        i2 = iZzYV0;
                    }
                    if (zzz7x.zzYUW().zzZeB() && !zzz7x.zzYUX()) {
                        if (zzz7x.zzYUY()) {
                            zzZ(zzz7x, iZzYV0, iZzYUZ);
                        } else {
                            zzDh(iZzYV0);
                            zzZ(zzz7x, iZzYV0);
                        }
                    } else if (!this.zzYDH.zzZdf()) {
                        this.zzYDH.zzZ(zzz7x);
                    }
                }
            }
            zzDh(i2);
            zzX(node, zzz7z, i);
        }
    }

    private void zzZ(Node node, zzZ7Z zzz7z, int i, int i2, int i3) throws Exception {
        Node node2 = null;
        if (node == null) {
            zzZQ3.zzZ(this, this.zzYDH.zzZp6(), i3);
            zzZQ3.zzZ(this.zzYDH.zzZp6(), (Paragraph) null);
            node = zzZQ3.zzW(this.zzYDH.zzZp6());
            this.zzYDH.zzZp6().moveTo(node);
        }
        zzZ7Z zzz7zZzyd = zzz7z.zzyd(i2);
        if (this.zzYDH.zzZdj().getRunSubentriesOnSameLine()) {
            if (i2 == 0 && i == 2 && !zzz7z.zzYV6()) {
                zzZPB.zzZ(this, this.zzYDH.zzZp6(), ": ");
            } else if (i != 1) {
                zzZPB.zzZ(this, this.zzYDH.zzZp6(), "; ");
            }
        }
        Node previousSibling = node.getPreviousSibling();
        zzZ(zzz7zZzyd.zz9m(), node, i3);
        Node nextSibling = previousSibling != null ? previousSibling.getNextSibling() : node.getParentNode().getFirstChild();
        Node previousSibling2 = node.getPreviousSibling();
        zzY(nextSibling, previousSibling2, true);
        zzY(previousSibling2, nextSibling, false);
        zzY(node, zzz7zZzyd, i3);
        if (this.zzYDH.zzZdj().getRunSubentriesOnSameLine()) {
            node2 = node;
        } else {
            node.remove();
        }
        zzZ(node2, zzz7zZzyd, i + 1);
        if (i == 1 && this.zzYDH.zzZdj().getRunSubentriesOnSameLine()) {
            node2.remove();
        }
    }

    private static boolean zzY(zzZQO zzzqo) {
        return zzzqo != null && zzzqo.isItalic();
    }

    private void zzZ(zzYWB zzywb, Node node, int i) throws Exception {
        zzTU zztu = new zzTU(new zzZOM(zzywb), new zzZ7Y(i, getStart().getDocument().getStyles()));
        if (zzywb.getDocument() != getStart().getDocument()) {
            zztu.zzZ(new zzZSB(zzywb.getDocument(), getStart().getDocument(), 0));
        }
        zzZ.zzZ(zzywb, zztu, node);
    }

    private void zzZ(zzZ7X zzz7x, int i, int i2) throws Exception {
        zzZ7X zzz7xZzZdg = this.zzYDH.zzZdf() ? this.zzYDH.zzZdg() : zzz7x;
        StringBuilder sbZzZdA = zzZdA();
        zzZ(sbZzZdA, zzz7xZzZdg, zzz7xZzZdg.zzYV2(), i);
        zzZ(sbZzZdA, this.zzYDH.zzZdj().getPageRangeSeparator(), zzz7xZzZdg.zzYUW(), (zzZQO) null);
        zzZ(sbZzZdA, zzz7x, zzz7x.zzYV1(), i2);
        zzZ(sbZzZdA, zzz7x);
    }

    private void zzZ(zzZ7X zzz7x, int i) throws Exception {
        StringBuilder sbZzZdA = zzZdA();
        zzZ(sbZzZdA, (zzZQO) null);
        zzYEF zzyefZzZpG = this.zzYDH.zzZp6().zzZpG();
        DocumentBuilder documentBuilderZzZp6 = this.zzYDH.zzZp6();
        documentBuilderZzZp6.setRunAttr(60, zzZU.zzZF6);
        if (this.zzYDH.zzZp6().getDocument().getFieldOptions().isBidiTextSupportedOnUpdate()) {
            documentBuilderZzZp6.setRunAttr(250, zzZU.zzZF6);
        }
        zzZPB.zzZ(this, this.zzYDH.zzZp6(), "Error! Not a valid bookmark in entry on page ");
        this.zzYDH.zzZp6().zzZ(zzyefZzZpG, false);
        zzZ(sbZzZdA, zzz7x, zzz7x.zzYV2(), i);
        zzZ(sbZzZdA, zzz7x);
    }

    private void zzZ(StringBuilder sb, zzZ7X zzz7x) throws Exception {
        zzZ(sb, zzz7x.zzYUW());
        this.zzYDH.zzZdh();
    }

    private void zzZ(StringBuilder sb, zzZ7X zzz7x, int i, int i2) throws Exception {
        String strZzCr = zzz7x.zzYUV().zzCr(i);
        zzZ(sb, this.zzYDH.zzZdj().hasSequenceName() ? Integer.toString(i2) : strZzCr, (zzZQO) null, zzz7x.zzYUW());
        if (this.zzYDH.zzZdj().hasSequenceName()) {
            com.aspose.words.internal.zzZNH.zzU(sb, this.zzYDH.zzZdj().getSequenceSeparator());
            com.aspose.words.internal.zzZNH.zzU(sb, strZzCr);
        }
    }

    private void zzZ(StringBuilder sb, String str, zzZQO zzzqo, zzZQO zzzqo2) throws Exception {
        if (zzZ(zzzqo2) != zzZ(zzzqo) || zzY(zzzqo2) != zzY(zzzqo)) {
            zzZ(sb, zzzqo);
        }
        com.aspose.words.internal.zzZNH.zzU(sb, str);
    }

    private void zzZ(StringBuilder sb, zzZQO zzzqo) throws Exception {
        if (sb.length() == 0) {
            return;
        }
        String string = sb.toString();
        sb.setLength(0);
        boolean zZzZ = zzZ(zzzqo);
        boolean zZzY = zzY(zzzqo);
        if (!zZzZ && !zZzY) {
            zzZPB.zzZ(this, this.zzYDH.zzZp6(), string);
            return;
        }
        zzYEF zzyefZzZpG = this.zzYDH.zzZp6().zzZpG();
        boolean zIsBidiTextSupportedOnUpdate = this.zzYDH.zzZp6().getDocument().getFieldOptions().isBidiTextSupportedOnUpdate();
        if (zZzZ) {
            zzX(this.zzYDH.zzZp6(), 60);
        }
        if (zZzY) {
            zzX(this.zzYDH.zzZp6(), 70);
        }
        if (zZzZ && zIsBidiTextSupportedOnUpdate) {
            zzX(this.zzYDH.zzZp6(), 250);
        }
        if (zZzY && zIsBidiTextSupportedOnUpdate) {
            zzX(this.zzYDH.zzZp6(), StyleIdentifier.SUBTLE_EMPHASIS);
        }
        zzZPB.zzZ(this, this.zzYDH.zzZp6(), string);
        this.zzYDH.zzZp6().zzZ(zzyefZzZpG, false);
    }

    private static boolean zzZ(zzZQO zzzqo) {
        return zzzqo != null && zzzqo.isBold();
    }

    private void zzZ(Node node, zzZQO zzzqo, int i) throws Exception {
        String crossReferenceSeparator;
        if (this.zzYDH.zzZde()) {
            crossReferenceSeparator = this.zzYDH.zzZdj().getPageNumberListSeparator();
        } else if (hasPageNumberSeparator()) {
            crossReferenceSeparator = this.zzYDH.zzZdj().getPageNumberSeparator();
        } else {
            crossReferenceSeparator = this.zzYDH.zzZdj().getCrossReferenceSeparator();
        }
        zzZPB.zzZ(this, this.zzYDH.zzZp6(), crossReferenceSeparator);
        zzZ(zzzqo.zzZeA(), node, i);
        this.zzYDH.zzZdh();
    }
}
