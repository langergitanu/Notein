package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOK extends zzYJF {
    private boolean zzXJv;
    private zzYEF zzXJw;
    private zzYEF zzZsP;

    public zzYOK(Iterable<Node> iterable, Paragraph paragraph) {
        super(iterable, paragraph);
    }

    @Override // com.aspose.words.zzYJF
    public final boolean isSuspended() {
        return this.zzXJv;
    }

    @Override // com.aspose.words.zzYJF
    public final boolean moveNext() throws Exception {
        if (!this.zzXJv) {
            return super.moveNext();
        }
        this.zzZsP = null;
        return true;
    }

    public final void suspend() {
        this.zzXJv = true;
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYBe() {
        this.zzZsP = this.zzXJw;
        this.zzXJw = null;
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYb(char c) {
        this.zzXJw = zzYrK().zzZYh();
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYc(char c) {
        if (this.zzZsP == null) {
            this.zzZsP = zzYrK().zzZYh();
        }
    }

    public final void zzYrH() {
        this.zzXJv = false;
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYrI() {
        if (zzYlB() || zzYlA()) {
            this.zzXJw = getCurrentParagraph() != null ? getCurrentParagraph().zzYp5() : null;
        }
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }
}
