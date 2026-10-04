package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldPageRef extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\h", "\\p");
    private Node zzYCo;

    private static String zzD8(int i) {
        return com.aspose.words.internal.zzZKN.format("on page {0}", Integer.valueOf(i));
    }

    private String zzZ(zzZ7P zzz7p) throws Exception {
        int iZz8Y = (int) zzz7p.zz8Y();
        if (zzZPO.zzD(this) && zzYAH.zzZt(getStart().zzYBb().zzZqh().zzJ(getStart())) == iZz8Y) {
            return zzZPO.zzZ(this, zzZcG());
        }
        return zzD8(iZz8Y);
    }

    public String getBookmarkName() {
        return zzZgq().zzDG(0);
    }

    public boolean getInsertHyperlink() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getInsertRelativePosition() {
        return zzZgq().zzMj("\\p");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1) ? 1 : 0;
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setInsertHyperlink(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setInsertRelativePosition(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    public final void zzZI(Node node) {
        this.zzYCo = node;
    }

    public final Node zzZcG() throws Exception {
        Bookmark bookmarkZzT;
        Node node = this.zzYCo;
        if (node == null || node.getParentNode() == null) {
            if (!com.aspose.words.internal.zzZYD.zzXk(getBookmarkName()) || (bookmarkZzT = zzZOO.zzT(this, getBookmarkName())) == null) {
                return null;
            }
            this.zzYCo = bookmarkZzT.getBookmarkStart();
        }
        return this.zzYCo;
    }

    public final Node zzZcH() throws Exception {
        Bookmark bookmarkZzT = zzZOO.zzT(this, getBookmarkName());
        BookmarkStart bookmarkStart = bookmarkZzT.getBookmarkStart();
        if (bookmarkStart.getParentNode() != bookmarkZzT.getBookmarkEnd().getParentNode()) {
            for (Node node : bookmarkZzT.zz9m()) {
                if (node instanceof Inline) {
                    return node;
                }
            }
        }
        return bookmarkStart;
    }

    @Override // com.aspose.words.Field
    public final Section zzZgB() throws Exception {
        return (Section) (zzZcG() != null ? zzZcG().getAncestor(2) : null);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(getBookmarkName())) {
            return new zzZP2(this, "Error! No bookmark name given.");
        }
        zzTL zztlZzz = zzZgo().zzZav().zzz(this);
        if (zztlZzz != null) {
            return (getInsertRelativePosition() && getFormat().getGeneralFormats().zzZ5i() == 0 && !zzZgq().zzMj("\\#")) ? new zzZP5(this, zzZ((zzZ7P) zztlZzz)) : new zzZP5(this, zztlZzz);
        }
        if (zzZcG() == null) {
            return new zzZP2(this, "Error! Bookmark not defined.");
        }
        return null;
    }
}
