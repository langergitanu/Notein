package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4E extends zzZ4F {
    private int zzYSE;
    private boolean zzYce;
    private zzZPV zzYcf;
    private zzZ49 zzYch;
    private boolean zzZut;
    private com.aspose.words.internal.zzZQC<FieldChar> zzYCc = new com.aspose.words.internal.zzZQC<>();
    private zzZ49[] zzYci = new zzZ49[zzZ4F.zzYcp];
    private com.aspose.words.internal.zzZQC<zzZ49> zzYcg = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZ> zzYnu = new com.aspose.words.internal.zzZQC<>();

    public static class zzZ {
        private boolean zzYcd;
        private Paragraph zzYtC;

        public zzZ(Paragraph paragraph) {
            this.zzYtC = paragraph;
        }

        public final Paragraph getParagraph() {
            return this.zzYtC;
        }

        public final void zzUJ(boolean z) {
            this.zzYcd = true;
        }

        public final boolean zzYOi() {
            return this.zzYcd;
        }
    }

    private zzZ4E(Document document, int i) {
        this.zzYSE = i;
        this.zzYcf = new zzZPV(document);
        for (int i2 = 0; i2 < zzZ4F.zzYcp; i2++) {
            this.zzYci[i2] = new zzZ49();
        }
        this.zzYch = this.zzYci[0];
    }

    private Paragraph getCurrentParagraph() {
        return this.zzYnu.peek().getParagraph();
    }

    private void zzYOj() {
        this.zzYnu.peek().zzUJ(true);
    }

    private boolean zzYOk() {
        return this.zzYnu.peek().zzYOi();
    }

    private FieldChar zzYOl() {
        if (zzZfT()) {
            return this.zzYCc.peek();
        }
        return null;
    }

    private boolean zzYOm() {
        return this.zzYCc.size() == 2 && zzYOl().getNodeType() == 23;
    }

    private zzZ49 zzYOn() {
        return this.zzYcg.peek();
    }

    private boolean zzYOo() {
        return this.zzYcg.size() > 0;
    }

    private void zzYOp() {
        this.zzYcg.pop();
        if (zzYOo()) {
            this.zzYcf.zzZ(zzYOn());
        }
    }

    private void zzYOq() {
        if (zzYOk()) {
            return;
        }
        if (!zzZfT() || zzYOm()) {
            zzZ49 zzz49ZzYOn = zzYOn();
            boolean z = zzz49ZzYOn == this.zzYch;
            Paragraph currentParagraph = getCurrentParagraph();
            this.zzYcf.zzY(currentParagraph, zzZ4D.zzZ(currentParagraph, zzz49ZzYOn, this.zzYSE), z);
            zzYOj();
        }
    }

    private boolean zzZfT() {
        return this.zzYCc.size() > 0;
    }

    public static void zzk(Document document) throws Exception {
        zzZ4E zzz4e = new zzZ4E(document, 0);
        document.accept(zzz4e);
        if (zzz4e.zzZut) {
            document.accept(new zzZ4E(document, 1));
        }
    }

    private void zzxe(int i) {
        this.zzYcg.push(this.zzYci[i]);
        this.zzYcf.zzZ(zzYOn());
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (zzYOl() != null && zzYOl().getNodeType() == 23) {
            this.zzYCc.pop();
        }
        if (zzYOl() != null) {
            this.zzYCc.pop();
        }
        this.zzYcf.zzW(fieldEnd);
        zzYOq();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        if (zzYOl() == null) {
            return 0;
        }
        this.zzYCc.push(fieldSeparator);
        this.zzYcf.zzW(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        this.zzYCc.push(fieldStart);
        this.zzYcf.zzT(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) {
        if (!zzYOk()) {
            this.zzYcf.zzY(getCurrentParagraph(), false, zzYOn() == this.zzYch);
        }
        this.zzYnu.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        this.zzYnu.push(new zzZ(paragraph));
        if (paragraph.isListItem() && !this.zzYce) {
            for (zzZ49 zzz49 : this.zzYci) {
                zzz49.zzwV(paragraph.getListFormat().zzYON());
            }
            this.zzYce = true;
        }
        if (paragraph.hasRevisions()) {
            this.zzZut = true;
        }
        zzYOq();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        this.zzYce = false;
        return 0;
    }

    @Override // com.aspose.words.zzZ4F
    public final void zzYOE() {
        zzYOp();
    }

    @Override // com.aspose.words.zzZ4F
    public final void zzxf(int i) {
        zzxe(i);
    }
}
