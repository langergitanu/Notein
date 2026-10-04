package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUK extends DocumentVisitor {
    private CommentRangeEnd zzZuT;
    private CommentRangeStart zzZuU;
    private int zzZuV;

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        if (commentRangeEnd.getId() != this.zzZuV) {
            return 0;
        }
        if (this.zzZuT != null) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Wrong comment range (ID = {0}).", Integer.valueOf(this.zzZuV)));
        }
        this.zzZuT = commentRangeEnd;
        return this.zzZuU != null ? 2 : 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        if (commentRangeStart.getId() != this.zzZuV) {
            return 0;
        }
        if (this.zzZuU != null) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Wrong comment range (ID = {0}).", Integer.valueOf(this.zzZuV)));
        }
        this.zzZuU = commentRangeStart;
        return this.zzZuT != null ? 2 : 0;
    }

    public final boolean zzY(Node node, int i) throws Exception {
        this.zzZuV = i;
        node.accept(this);
        CommentRangeStart commentRangeStart = this.zzZuU;
        if ((commentRangeStart != null) == (this.zzZuT != null)) {
            return commentRangeStart != null;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Wrong comment range (ID = {0}).", Integer.valueOf(i)));
    }

    public final CommentRangeEnd zzZZD() {
        return this.zzZuT;
    }

    public final CommentRangeStart zzZZE() {
        return this.zzZuU;
    }
}
