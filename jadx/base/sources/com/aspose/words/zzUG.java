package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUG {
    int zzZuO;
    CommentRangeEnd zzZuP;
    CommentRangeStart zzZuQ;
    Comment zzZuR;

    private boolean zzZZw() {
        return zzZZy() && zzZZx() && this.zzZuQ.getParentNode() == this.zzZuP.getParentNode();
    }

    public final void zzZZA() {
        Comment comment = this.zzZuR;
        if (comment != null) {
            comment.setIdInternal(this.zzZuO);
        }
        CommentRangeStart commentRangeStart = this.zzZuQ;
        if (commentRangeStart != null) {
            commentRangeStart.setId(this.zzZuO);
        }
        CommentRangeEnd commentRangeEnd = this.zzZuP;
        if (commentRangeEnd != null) {
            commentRangeEnd.setId(this.zzZuO);
        }
    }

    public final boolean zzZZv() {
        if (!zzZZw()) {
            return false;
        }
        for (Node nextSibling = this.zzZuQ; nextSibling != null && nextSibling != this.zzZuP; nextSibling = nextSibling.getNextSibling()) {
            if (nextSibling.zz0R() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzZZx() {
        return this.zzZuP != null;
    }

    public final boolean zzZZy() {
        return this.zzZuQ != null;
    }

    public final void zzZZz() {
        CommentRangeStart commentRangeStart = this.zzZuQ;
        if (commentRangeStart != null) {
            if (commentRangeStart.getParentNode() != null) {
                this.zzZuQ.remove();
            }
            this.zzZuQ = null;
        }
        CommentRangeEnd commentRangeEnd = this.zzZuP;
        if (commentRangeEnd != null) {
            if (commentRangeEnd.getParentNode() != null) {
                this.zzZuP.remove();
            }
            this.zzZuP = null;
        }
    }
}
