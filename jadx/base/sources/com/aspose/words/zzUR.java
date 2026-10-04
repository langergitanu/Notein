package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUR extends DocumentVisitor {
    private int zzZv9 = -1;

    private zzUR() {
    }

    public static int zzZ(DocumentBase documentBase) throws Exception {
        zzUR zzur = new zzUR();
        documentBase.accept(zzur);
        return zzur.zzZv9 + 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        if (commentRangeEnd.getId() <= this.zzZv9) {
            return 0;
        }
        this.zzZv9 = commentRangeEnd.getId();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        if (commentRangeStart.getId() <= this.zzZv9) {
            return 0;
        }
        this.zzZv9 = commentRangeStart.getId();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        if (comment.getId() <= this.zzZv9) {
            return 0;
        }
        this.zzZv9 = comment.getId();
        return 0;
    }
}
