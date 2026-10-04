package com.aspose.words;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class Comment extends InlineStory implements zzZA1, zzZA6 {
    private String zzLu;
    private int zzYG;
    private CommentCollection zzZvh;
    private com.aspose.words.internal.zzZQ9 zzZvi;
    private com.aspose.words.internal.zzZQ9 zzZvj;
    private String zzZvk;
    private int zzZvl;
    private boolean zzZvm;
    private boolean zzZvn;
    private int zzZvo;

    public Comment(DocumentBase documentBase, zzYEF zzyef) {
        super(documentBase, zzyef);
        this.zzZvl = -1;
        this.zzZvk = "";
        this.zzLu = "";
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        this.zzZvj = zzzq9;
        this.zzZvi = zzzq9;
        this.zzYG = documentBase.zzZpW();
    }

    private Comment zzZ(String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9, String str3) throws Exception {
        if (getParentId() != -1) {
            throw new IllegalStateException("Cannot add a reply to another reply.");
        }
        if (getParentNode() == null) {
            throw new IllegalStateException("No parent node.");
        }
        Comment comment = new Comment(getDocument(), str, str2, zzzq9);
        comment.setIdInternal(zzUR.zzZ(getDocument()));
        comment.setParentId(this.zzYG);
        comment.setText(str3);
        Comment comment2 = this;
        for (Comment comment3 = (Comment) com.aspose.words.internal.zzZKW.zzZ(zzYB4(), Comment.class); comment3 != null && comment3.getParentId() == this.zzYG; comment3 = (Comment) com.aspose.words.internal.zzZKW.zzZ(comment3.zzYB4(), Comment.class)) {
            comment2 = comment3;
        }
        getParentNode().insertAfter(comment, comment2);
        zzUK zzuk = new zzUK();
        if (zzuk.zzY(getDocument(), this.zzYG)) {
            zzZ(zzuk.zzZZE(), new CommentRangeStart(getDocument(), comment.getId()));
            zzZ(zzuk.zzZZD(), new CommentRangeEnd(getDocument(), comment.getId()));
        }
        return comment;
    }

    private void zzw(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzZvj = zzzq9;
        com.aspose.words.internal.zzZQ9 zzzq92 = this.zzZvi;
        com.aspose.words.internal.zzZQ9 zzzq9ZzkF = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq92, zzzq9ZzkF)) {
            return;
        }
        if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9, zzzq9ZzkF)) {
            zzzq9ZzkF = zzzq9.zzkF();
        }
        this.zzZvi = zzzq9ZzkF;
    }

    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitCommentEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitCommentStart(this);
    }

    public final Comment addReply(String str, String str2, Date date, String str3) throws Exception {
        return zzZ(str, str2, com.aspose.words.internal.zzZQ9.zzZ(date), str3);
    }

    public final Comment getAncestor() {
        if (getDocument() != null && getParentId() != -1) {
            for (Comment comment : getDocument().getChildNodes(19, true)) {
                if (comment.getId() == getParentId()) {
                    return comment;
                }
            }
        }
        return null;
    }

    public final String getAuthor() {
        return this.zzLu;
    }

    public final Date getDateTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzZvj);
    }

    public final boolean getDone() {
        return this.zzZvm;
    }

    public final int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getIdInternal() {
        return getId();
    }

    public final String getInitial() {
        return this.zzZvk;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public final zzYX5 getMoveFromRevision() {
        return zzZYh().getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public final zzYX5 getMoveToRevision() {
        return zzZYh().getMoveToRevision();
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 19;
    }

    public final int getParentId() {
        return this.zzZvl;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getParentIdInternal() {
        return getParentId();
    }

    public final CommentCollection getReplies() {
        if (this.zzZvh == null) {
            this.zzZvh = new CommentCollection(getDocument(), this);
        }
        return this.zzZvh;
    }

    @Override // com.aspose.words.InlineStory, com.aspose.words.zzZ96
    public final int getStoryType() {
        return 4;
    }

    public final void removeAllReplies() throws Exception {
        Iterator it = getReplies().zzYAN().iterator();
        while (it.hasNext()) {
            removeReply((Comment) it.next());
        }
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public final void removeMoveRevisions() {
        zzZYh().remove(13);
        zzZYh().remove(15);
    }

    public final void removeReply(Comment comment) throws Exception {
        zzUK zzuk = new zzUK();
        if (zzuk.zzY(getDocument(), comment.getId())) {
            zzuk.zzZZE().remove();
            zzuk.zzZZD().remove();
        }
        comment.remove();
    }

    public final void setAuthor(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "Author");
        this.zzLu = str;
    }

    public final void setDateTime(Date date) {
        zzw(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public final void setDone(boolean z) {
        this.zzZvm = z;
    }

    public final void setId(int i) {
        this.zzYG = i;
        if (getDocument() != null) {
            getDocument().zzZq8();
        }
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setIdInternal(int i) {
        setId(i);
    }

    public final void setInitial(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "Initial");
        this.zzZvk = str;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public final void setMoveFromRevision(zzYX5 zzyx5) {
        zzZYh().zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public final void setMoveToRevision(zzYX5 zzyx5) {
        zzZYh().zzQ(15, zzyx5);
    }

    public final void setParentId(int i) {
        this.zzZvl = i;
        if (getDocument() != null) {
            getDocument().zzZq8();
        }
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setParentIdInternal(int i) {
        setParentId(i);
    }

    public final void setText(String str) {
        removeAllChildren();
        Paragraph paragraph = new Paragraph(getDocument());
        paragraph.getParagraphFormat().setStyleIdentifier(30);
        appendChild(paragraph);
        DocumentBuilder documentBuilder = new DocumentBuilder(zzYBb());
        documentBuilder.moveTo(paragraph);
        SpecialChar specialChar = new SpecialChar(zzYBb(), (char) 5, new zzYEF());
        specialChar.getFont().setStyleIdentifier(39);
        documentBuilder.insertNode(specialChar);
        documentBuilder.write(str);
    }

    public final void zzNb(int i) {
        this.zzZvo = i;
    }

    public final void zzYk(boolean z) {
        this.zzZvn = z;
    }

    public final String zzZZQ() {
        StringBuilder sb = new StringBuilder();
        zzI(sb);
        if (sb.length() > 0 && sb.charAt(0) == 5) {
            sb.delete(0, 1);
        }
        return sb.toString();
    }

    public final boolean zzZZR() {
        return this.zzZvn;
    }

    public final int zzZZS() {
        return this.zzZvo;
    }

    public final com.aspose.words.internal.zzZQ9 zzZZT() {
        return this.zzZvi;
    }

    public final com.aspose.words.internal.zzZQ9 zzZZU() {
        return this.zzZvj;
    }

    public final void zzu(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzZvi = zzzq9;
    }

    public final void zzv(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzZvj = zzzq9;
    }

    public Comment(DocumentBase documentBase) {
        this(documentBase, "", "", com.aspose.words.internal.zzZQ9.zz35);
    }

    private Comment(DocumentBase documentBase, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9) {
        this(documentBase, new zzYEF());
        setAuthor(str);
        setInitial(str2);
        this.zzZvj = zzzq9;
        getFont().setStyleIdentifier(39);
    }

    public Comment(DocumentBase documentBase, String str, String str2, Date date) {
        this(documentBase, str, str2, com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.aspose.words.CommentRangeStart] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r5v2 */
    private void zzZ(CommentRangeStart commentRangeStart, CommentRangeStart commentRangeStart2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getReplies().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(((Comment) it.next()).getId()));
        }
        while (commentRangeStart.getNextSibling() != null) {
            Node nextSibling = commentRangeStart.getNextSibling();
            if (nextSibling.getNodeType() != 33 || !arrayList.contains(Integer.valueOf(((CommentRangeStart) nextSibling).getId()))) {
                break;
            } else {
                commentRangeStart = nextSibling;
            }
        }
        commentRangeStart.zzYD(commentRangeStart2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.aspose.words.CommentRangeEnd] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r6v2 */
    private void zzZ(CommentRangeEnd commentRangeEnd, CommentRangeEnd commentRangeEnd2) {
        int id;
        ArrayList arrayList = new ArrayList();
        for (Comment comment : getReplies()) {
            if (comment.getId() != commentRangeEnd2.getId()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(comment.getId()));
            }
        }
        while (commentRangeEnd.getNextSibling() != null) {
            Node nextSibling = commentRangeEnd.getNextSibling();
            if (nextSibling.getNodeType() == 34) {
                id = ((CommentRangeEnd) nextSibling).getId();
            } else if (nextSibling.getNodeType() != 19) {
                break;
            } else {
                id = ((Comment) nextSibling).getId();
            }
            if (!arrayList.contains(Integer.valueOf(id)) && id != this.zzYG) {
                break;
            } else {
                commentRangeEnd = nextSibling;
            }
        }
        commentRangeEnd.zzYD(commentRangeEnd2);
    }
}
