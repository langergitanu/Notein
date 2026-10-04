package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY4E extends DocumentVisitor implements zzZBR {
    private static int[] zzX17 = {0, 1, 2, 3, 4, 5};
    private StringBuilder zzX14;
    private StringBuilder zzX15;
    private TxtSaveOptionsBase zzX16;
    private DocumentBase zzZCL;
    private zzYDZ zzZFZ;
    private StringBuilder zzxe;

    private void zzW(Section section, int i) throws Exception {
        HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType != null) {
            byHeaderFooterType.accept(this);
        }
    }

    private void zzY(Section section) throws Exception {
        if (this.zzX16.getExportHeadersFootersMode() == 2) {
            zzO(section);
        }
        if (this.zzX16.getExportHeadersFootersMode() == 1) {
            zzW(section, 1);
        }
        if (section.getBody() != null) {
            section.getBody().accept(this);
        }
        if (this.zzX16.getExportHeadersFootersMode() == 1) {
            zzW(section, 3);
        }
    }

    private static boolean zzq(Run run) {
        Paragraph parentParagraph = run.getParentParagraph();
        return (parentParagraph == null || parentParagraph.zzYp7() == null || parentParagraph.zzYp7().getFont() == null || !parentParagraph.zzYp7().getFont().getAllCaps()) ? false : true;
    }

    public static String zzr(Run run) {
        String text = run.getText();
        if (run.zzZYh().contains(885)) {
            text = ((zzYEJ) run.zzZYh().get(885)).getText();
        }
        if (run.getFont().getAllCaps() || zzq(run)) {
            text = text.toUpperCase();
        }
        return (text.length() == 1 && com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 87, 103, 110, 105, 100, 103, 110, 115}).equals(zzU1.zzZ(run.zzZYh().zzYdS(), run.getDocument().zzZqI()))) ? Character.toString(com.aspose.words.internal.zzJF.zzD(text.charAt(0))) : text;
    }

    public final DocumentBase getDocument() {
        return this.zzZCL;
    }

    public void zzO(Section section) throws Exception {
        this.zzxe = this.zzX14;
        for (int i : zzX17) {
            zzW(section, i);
            if (section.getHeadersFooters().getByHeaderFooterType(i) != null) {
                com.aspose.words.internal.zzZNH.zzU(this.zzxe, this.zzX16.getParagraphBreak());
            }
        }
        this.zzxe = this.zzX15;
    }

    public void zzWa(Node node) {
    }

    public void zzWb(Node node) throws Exception {
        if (node.getNodeType() == 29) {
            ((StructuredDocumentTagRangeStart) node).zzY(this);
        }
    }

    public final TxtSaveOptionsBase zzXUj() {
        return this.zzX16;
    }

    public final StringBuilder zzXUk() {
        return this.zzX14;
    }

    public final String zzZ(Node node, TxtSaveOptionsBase txtSaveOptionsBase) throws Exception {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(node, Document.class);
        if (document != null) {
            zzY0C.zzZM(document);
        }
        zzZ(node.getDocument(), txtSaveOptionsBase);
        zzWb(node);
        node.accept(this);
        zzWa(node);
        return this.zzxe.toString();
    }

    public final StringBuilder zzZeE() {
        return this.zzxe;
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    private void zzZ(DocumentBase documentBase, TxtSaveOptionsBase txtSaveOptionsBase) {
        this.zzZCL = documentBase;
        this.zzX16 = txtSaveOptionsBase;
        this.zzX15 = new StringBuilder();
        this.zzX14 = new StringBuilder();
        this.zzxe = this.zzX15;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        zzZ((DocumentBase) zzydz.zzYfy, (TxtSaveOptionsBase) zzydz.zzXpa);
        for (Node firstChild = this.zzZCL.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzY((Section) firstChild);
        }
        this.zzZCL.acceptEnd(this);
        com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zzydz.zzXpb, this.zzX16.zzZ9Y());
        zzzon.write(this.zzxe.toString());
        zzzon.write(this.zzX14.toString());
        zzzon.flush();
        return new SaveOutputParameters("text/plain");
    }
}
