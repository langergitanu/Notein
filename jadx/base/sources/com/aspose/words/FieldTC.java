package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldTC extends Field implements zzZ8Z, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\n", "\\f", "\\l");
    private boolean zzYBL;
    private zzYWB zzYF7;
    private int zzYw;

    private void zz0P() {
        boolean z = false;
        zzZR8 zzzr8ZzDH = zzZgq().zzDH(0);
        int i = 1;
        if (zzzr8ZzDH != null && zzzr8ZzDH.zzW2(true).length() > 0) {
            z = true;
        }
        this.zzYBL = z;
        this.zzYF7 = zzZgq().zzZfE();
        if (zzZc2()) {
            int iZzUz = zzZc1().zzUz(1);
            if (zzZ5S.zzxU(iZzUz)) {
                i = iZzUz;
            }
        }
        this.zzYw = i;
    }

    private static void zzX(Node node, Node node2, boolean z) {
        if (z) {
            node2.zzYD(node);
        } else {
            node2.zzYC(node);
        }
    }

    private zzYWB zzZc0() {
        if (!this.zzYBL || this.zzYF7.isEmpty()) {
            return null;
        }
        this.zzYF7.zzYA8();
        return this.zzYF7;
    }

    private com.aspose.words.internal.zz7I zzZc1() {
        return zzZgq().zzMc("\\l");
    }

    private boolean zzZc2() {
        return zzZgq().zzMj("\\l");
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final String getDocumentOutlineTitle() {
        throw new IllegalStateException();
    }

    public final String getEntryLevel() {
        return zzZgq().zzt("\\l", false);
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final zzYWB getLabelRange() {
        return null;
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final int getLevel() {
        return this.zzYw;
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean getOmitPageNumber() {
        return zzZgq().zzMj("\\n");
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final int getPageNumber() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final Paragraph getParagraph() {
        zzYWB zzywbZzZc0 = zzZc0();
        if (zzywbZzZc0 == null) {
            return null;
        }
        return (Paragraph) zzywbZzZc0.zzYA2().getNode().getAncestor(8);
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final int getSequenceValue(String str) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public final int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return (iZzTP == 1 || iZzTP == 2) ? 2 : 0;
        }
        return 1;
    }

    public final String getText() {
        return zzZgq().zzDG(0);
    }

    public final String getTypeIdentifier() {
        return zzZgq().zzt("\\f", false);
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final boolean hasBookmark() {
        return true;
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final zzYWB insertBookmark(String str) {
        zzYWB zzywbZzZc0 = zzZc0();
        if (zzywbZzZc0 == null) {
            return null;
        }
        BookmarkStart bookmarkStart = new BookmarkStart(getStart().zzYBb(), str);
        zzX(bookmarkStart, zzywbZzZc0.zzYA2().getNode(), zzywbZzZc0.zzYA2().zzZot());
        BookmarkEnd bookmarkEnd = new BookmarkEnd(getStart().zzYBb(), str);
        zzX(bookmarkEnd, zzywbZzZc0.zzYA1().getNode(), !zzywbZzZc0.zzYA1().zzZou());
        return Bookmark.zzZ(bookmarkStart, bookmarkEnd);
    }

    @Override // com.aspose.words.zzZ8Z
    @ReservedForInternalUse
    @Deprecated
    public final boolean isInFieldCode() {
        return false;
    }

    public final void setEntryLevel(String str) throws Exception {
        zzZgq().zzZe("\\l", str);
    }

    public final void setOmitPageNumber(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public final void setText(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public final void setTypeIdentifier(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    @Override // com.aspose.words.Field
    public final void zzZ(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        super.zzZ(fieldStart, fieldSeparator, fieldEnd);
        zz0P();
    }

    public final zzYWB zzZeH() {
        return this.zzYF7;
    }
}
