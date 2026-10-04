package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0D extends DocumentVisitor {
    private com.aspose.words.internal.zzZQC<Boolean> zzWU3 = new com.aspose.words.internal.zzZQC<>();
    private int zzWU4;
    private int zzWU5;
    private int zzWU6;
    private int zzWU7;
    private boolean zzXGj;
    private boolean zzYdI;

    private static boolean zzI(ListLevel listLevel) {
        if (listLevel.getNumberStyle() != 23) {
            return true;
        }
        return ("\uf0b7".equals(listLevel.getNumberFormat()) || "\uf0a8".equals(listLevel.getNumberFormat())) ? false : true;
    }

    private void zzPw(boolean z) {
        this.zzWU3.pop();
        this.zzWU3.push(Boolean.valueOf(z));
    }

    private static boolean zzXA(char c) {
        if (c != '\f' && c != 14) {
            switch (c) {
                case 8203:
                case 8204:
                case 8205:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    private static boolean zzXB(char c) {
        return c == 8211 || c == 8212;
    }

    private static boolean zzXC(char c) {
        return c != 8232 && com.aspose.words.internal.zzZKU.zzG(c) && zzXA(c);
    }

    private static boolean zzXD(char c) {
        return c == '\f' || c == 14;
    }

    private boolean zzXRW() {
        return this.zzWU3.peek().booleanValue();
    }

    private void zzXRX() {
        if (this.zzYdI) {
            unlock();
        }
    }

    private void zzXRY() {
        if (this.zzYdI) {
            lock();
        }
    }

    private void zzXRZ() {
        if (zzXRW()) {
            this.zzWU4++;
            zzPw(false);
        }
    }

    private void zzXS0() {
        if (this.zzXGj) {
            this.zzWU5++;
            this.zzXGj = false;
        }
    }

    private void zzXS1() {
        this.zzWU6++;
    }

    private static boolean zzXT(Paragraph paragraph) {
        Run run;
        return (paragraph.zzYB4() == null && (run = (Run) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzZYu(), Run.class)) != null && com.aspose.words.internal.zzZKN.zzW(run.getText(), ControlChar.PAGE_BREAK, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) ? false : true;
    }

    private static boolean zzXz(char c) {
        return c != 8226;
    }

    private static boolean zzZ(char c, int i, boolean z) {
        return com.aspose.words.internal.zzUX.zzO(c) || (com.aspose.words.internal.zzUX.zzZb(c) && z && !zzZ3X.zzwK(i));
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) {
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) {
        zzXS0();
        document.getBuiltInDocumentProperties().setCharacters(this.zzWU6);
        document.getBuiltInDocumentProperties().setCharactersWithSpaces(this.zzWU6 + this.zzWU7);
        document.getBuiltInDocumentProperties().setWords(this.zzWU5);
        document.getBuiltInDocumentProperties().setParagraphs(this.zzWU4);
        return 2;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) throws Exception {
        zzZ4E.zzk(document);
        this.zzYdI = document.zzZpV().zzYVa;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.hasSeparator()) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        if (!isLocked()) {
            zzXS1();
            zzXS0();
        }
        zzXRX();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        zzXRY();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) {
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) {
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) {
        if (!isLocked()) {
            zzXS0();
            if (zzXT(paragraph)) {
                zzXRZ();
            }
        }
        this.zzWU3.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        this.zzWU3.push(Boolean.FALSE);
        if (isLocked() || !paragraph.isListItem()) {
            return 0;
        }
        this.zzWU6 = paragraph.getListLabel().zzYOu().length() + this.zzWU6;
        if (zzI(paragraph.getListFormat().getListLevel())) {
            this.zzWU5++;
        }
        if (paragraph.getListLabel().getTrailingCharacter() == 2) {
            return 0;
        }
        this.zzWU7++;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (!isLocked() && !zzZ7R.zzW((zzZ9G) run, 130)) {
            int iIntValue = ((Integer) zzZ7R.zzZ(run, 390, 0)).intValue();
            boolean zZzZ = com.aspose.words.internal.zzJF.zzZ(run.getDocument().zzZqy(), zzU1.zzZ((zzU1) zzZ7R.zzZ(run, 235, 0), run.getDocument().zzZqI()));
            String text = run.zzZYh().zzYrW() ? "" : run.getText();
            for (int i = 0; i < text.length(); i++) {
                char cCharAt = text.charAt(i);
                if (zzXD(cCharAt)) {
                    zzXS0();
                } else if (zzXC(cCharAt)) {
                    this.zzWU7++;
                    zzXS0();
                } else if (zzXB(cCharAt)) {
                    zzXS1();
                    zzXS0();
                } else if (zzXA(cCharAt)) {
                    zzXS1();
                    if (zzXz(cCharAt)) {
                        zzPw(true);
                        if (zzZ(cCharAt, iIntValue, zZzZ)) {
                            zzXS0();
                            this.zzXGj = true;
                            zzXS0();
                        } else {
                            this.zzXGj = true;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionEnd(Section section) {
        if (isLocked()) {
            return 0;
        }
        zzXS0();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) {
        zzXRX();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) {
        zzXRY();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) {
        if (com.aspose.words.internal.zzZKN.equals(specialChar.getText(), Character.toString(ControlChar.DEFAULT_TEXT_INPUT_CHAR))) {
            zzXS1();
            this.zzXGj = true;
        }
        if (!com.aspose.words.internal.zzZKN.equals(specialChar.getText(), ControlChar.zzZsc)) {
            return 0;
        }
        zzXS1();
        zzXS0();
        return 0;
    }
}
