package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ4F extends DocumentVisitor {
    protected static int zzYcp = 6;

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) {
        zzYOE();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) {
        zzxf(0);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) {
        zzYOE();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        zzxf(5);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        zzYOE();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            zzxf(2);
            return 0;
        }
        if (footnoteType != 1) {
            throw new IllegalArgumentException();
        }
        zzxf(3);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) {
        zzYOE();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) {
        zzxf(1);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) {
        zzYOE();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) {
        zzxf(4);
        return 0;
    }

    public abstract void zzYOE();

    public abstract void zzxf(int i);
}
