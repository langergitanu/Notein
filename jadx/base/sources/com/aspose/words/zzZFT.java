package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFT {
    private zzZ zzYnG = new zzZ(0);
    private zzZGH zzYnH;
    private zzZAO zzYsu;

    public zzZFT(zzZAO zzzao, zzZGH zzzgh) {
        this.zzYsu = zzzao;
        this.zzYnH = zzzgh;
    }

    private static boolean zzU(zzYMX zzymx) {
        return zzymx.zz5A().isVisible() || zzymx.zz5y().isVisible() || zzymx.zz5z().isVisible() || zzymx.zz5x().isVisible() || zzymx.zzYpv().isVisible();
    }

    private static boolean zzZR(Paragraph paragraph) {
        Iterator<T> it = paragraph.getChildNodes(18, true).iterator();
        while (it.hasNext()) {
            if (((Shape) it.next()).isHorizontalRule()) {
                return true;
            }
        }
        return false;
    }

    private static Paragraph zzZS(Paragraph paragraph) throws Exception {
        while (paragraph.zzYoY()) {
            paragraph = (Paragraph) paragraph.zzYB5();
        }
        return paragraph;
    }

    public final void zzS(Paragraph paragraph, boolean z) throws Exception {
        this.zzYnG.zzZ05();
        if (this.zzYnG.zzZ07() != 0) {
            this.zzYsu.zzZ3E().zzZN("div", 0);
            this.zzYsu.zzZ3E().zzYXX().zzyz(5);
            zzLU zzluZzZ = zzZ(paragraph, this.zzYnG.zzZ03(), z);
            zzluZzZ.remove("border-top-style");
            zzluZzZ.remove("border-top-color");
            zzluZzZ.remove("border-top-width");
            this.zzYsu.zzZ3C().zzV(zzluZzZ);
        }
    }

    public final void zzZ(Paragraph paragraph, zzYMX zzymx, boolean z) throws Exception {
        if (this.zzYnG.zzZ07() != 0) {
            paragraph.zzYBd();
            this.zzYnG.zzZ03().zzYBd();
            this.zzYnG.zzZQ(paragraph);
        } else if (zzU(zzymx)) {
            Paragraph paragraphZzZS = zzZS(paragraph);
            if (paragraph != paragraphZzZS || zzZR(paragraph)) {
                this.zzYnG.zzZP(paragraphZzZS);
                this.zzYnH.zzZ0K();
                this.zzYsu.zzZ3E().zzZN("div", 0);
                this.zzYsu.zzZ3E().zzYXX().zzyz(5);
                this.zzYsu.zzZ3C().zzV(zzZ(paragraph, this.zzYnG.zzZ03(), z));
            }
        }
    }

    public final int zzZ07() {
        return this.zzYnG.zzZ07();
    }

    public final void zzZ08() {
        if (this.zzYnG.zzZ07() != 0) {
            zzZDN zzzdnZzYXX = this.zzYsu.zzZ3E().zzYXX();
            zzPR zzpr = new zzPR(zzzdnZzYXX.zzYXf());
            zzpr.remove("border-bottom-style");
            zzpr.remove("border-bottom-color");
            zzpr.remove("border-bottom-width");
            zzzdnZzYXX.zzYXj().remove("style");
            zzzdnZzYXX.zzYXj().zzZ(new zzZDP(zzpr.zzZWe()));
            this.zzYnG.zzZ06();
            this.zzYsu.zzZ3E().endElement("div");
        }
    }

    public final void zzZT(Paragraph paragraph) {
        if (paragraph == this.zzYnG.zzZ03()) {
            this.zzYsu.zzZ3E().endElement("div");
            this.zzYnG.zzZ04();
        }
    }

    public static class zzZ {
        private com.aspose.words.internal.zzZQC<C19096zzZ> zzYnE;
        private C19096zzZ zzYnF;

        /* JADX INFO: renamed from: com.aspose.words.zzZFT$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19096zzZ {
            private Paragraph zzYnC;
            private int zzYnD;

            private C19096zzZ() {
            }

            public final Paragraph zzZ03() {
                return this.zzYnC;
            }

            public final int zzZ07() {
                return this.zzYnD;
            }

            public final void zzZO(Paragraph paragraph) {
                this.zzYnC = paragraph;
            }

            public final void zzzb(int i) {
                this.zzYnD = i;
            }

            public /* synthetic */ C19096zzZ(byte b) {
                this();
            }
        }

        private zzZ() {
            this.zzYnF = new C19096zzZ((byte) 0);
            this.zzYnE = new com.aspose.words.internal.zzZQC<>();
        }

        public final Paragraph zzZ03() {
            return this.zzYnF.zzZ03();
        }

        public final void zzZ04() {
            this.zzYnF = new C19096zzZ((byte) 0);
        }

        public final void zzZ05() {
            if (this.zzYnE.size() > 0) {
                this.zzYnF = this.zzYnE.pop();
            }
        }

        public final void zzZ06() {
            this.zzYnE.push(this.zzYnF);
            zzZ04();
        }

        public final int zzZ07() {
            return this.zzYnF.zzZ07();
        }

        public final void zzZP(Paragraph paragraph) {
            this.zzYnF.zzZO(paragraph);
            this.zzYnF.zzzb(1);
        }

        public final void zzZQ(Paragraph paragraph) {
            C19096zzZ c19096zzZ = this.zzYnF;
            c19096zzZ.zzzb(paragraph == c19096zzZ.zzZ03() ? 3 : 2);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static zzLU zzZ(Paragraph paragraph, Paragraph paragraph2, boolean z) throws Exception {
        double d;
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        zzLU zzlu = new zzLU();
        zzlu.zzZs("clear", "both");
        zzQS.zzZ(zzlu, paragraphFormat.getBorders(), z);
        double leftIndent = (paragraphFormat.getLeftIndent() - paragraphFormat.getBorders().getLeft().getDistanceFromText()) - ((double) zzQS.zzH(paragraphFormat.getBorders().getLeft()));
        if (paragraphFormat.getFirstLineIndent() < 0.0d) {
            leftIndent += paragraphFormat.getFirstLineIndent();
        }
        double rightIndent = (paragraphFormat.getRightIndent() - paragraphFormat.getBorders().getRight().getDistanceFromText()) - ((double) zzQS.zzH(paragraphFormat.getBorders().getRight()));
        if (paragraphFormat.getBidi()) {
            d = rightIndent;
            rightIndent = leftIndent;
        } else {
            d = leftIndent;
        }
        zzlu.zzU(paragraphFormat.getSpaceBefore(), rightIndent, paragraph2.getParagraphFormat().getSpaceAfter(), d);
        return zzlu;
    }
}
