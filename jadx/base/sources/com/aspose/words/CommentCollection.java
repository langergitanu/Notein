package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CommentCollection extends NodeCollection<Comment> {

    public static class zzZ extends zzYWD {
        private Comment zzZvd;

        public zzZ(Comment comment) {
            this.zzZvd = comment;
        }

        @Override // com.aspose.words.zzYWD
        public final boolean zzJ(Node node) {
            return node.getNodeType() == 19 && ((Comment) node).getParentId() == this.zzZvd.getId();
        }

        @Override // com.aspose.words.zzYWD
        public final boolean zzZZP() {
            return true;
        }
    }

    public CommentCollection(DocumentBase documentBase, Comment comment) {
        super((CompositeNode) documentBase, (zzYWD) new zzZ(comment), true);
    }

    @Override // com.aspose.words.NodeCollection
    public Comment get(int i) {
        return (Comment) super.get(i);
    }
}
