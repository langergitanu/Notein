package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMY extends DocumentVisitor {
    private zzZ zzYwA;
    private zzZ zzYwB;

    public static class zzZ {
        private LayoutCollector zzYwu;
        private int zzYwv;
        private int zzYww;
        private int zzYwx;
        private int zzYwy;
        private zzZAU zzYwz;

        public zzZ(LayoutCollector layoutCollector) {
            this.zzYwu = layoutCollector;
        }

        public final void zzZ(zzZAU zzzau) {
            this.zzYwz = zzzau;
        }

        public final void zzZ6U() {
            this.zzYwx = 0;
        }

        public final int zzZd(Node node) throws Exception {
            int i;
            int restartRule = this.zzYwz.getStartNumber() == 1 ? this.zzYwz.getRestartRule() : 0;
            if (restartRule == 1) {
                i = this.zzYwx;
            } else if (restartRule != 2) {
                i = this.zzYwy;
            } else {
                int startPageIndex = this.zzYwu.getStartPageIndex(node);
                if (startPageIndex != this.zzYwv) {
                    this.zzYww = 0;
                    this.zzYwv = startPageIndex;
                }
                i = this.zzYww;
            }
            this.zzYwy++;
            this.zzYwx++;
            this.zzYww++;
            return i + this.zzYwz.getStartNumber();
        }
    }

    private zzZMY(Document document) {
        LayoutCollector layoutCollector = new LayoutCollector(document);
        this.zzYwB = new zzZ(layoutCollector);
        this.zzYwA = new zzZ(layoutCollector);
    }

    public static void zzs(Document document) throws Exception {
        document.accept(new zzZMY(document));
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) throws Exception {
        if (!footnote.isAuto()) {
            return 0;
        }
        footnote.setIndex(footnote.getFootnoteType() == 0 ? this.zzYwB.zzZd(footnote) : this.zzYwA.zzZd(footnote));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        this.zzYwB.zzZ(section.getPageSetup().getFootnoteOptions());
        this.zzYwB.zzZ6U();
        this.zzYwA.zzZ(section.getPageSetup().getEndnoteOptions());
        this.zzYwA.zzZ6U();
        return 0;
    }
}
