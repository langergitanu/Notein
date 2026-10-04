package com.aspose.words;

import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class FieldRef extends Field implements zzZAA, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\f", "\\h", "\\n", "\\p", "\\r", "\\t", "\\w", "\\d");

    private zzYWB zzW(Bookmark bookmark) throws Exception {
        if (getInsertParagraphNumber() || getInsertParagraphNumberInRelativeContext() || getInsertParagraphNumberInFullContext() || getInsertRelativePosition()) {
            return null;
        }
        return bookmark.zz9m();
    }

    private String zzZ(Bookmark bookmark, Paragraph paragraph) throws Exception {
        if (getInsertParagraphNumber()) {
            return zzZPO.zzZ(this, bookmark, paragraph, getSuppressNonDelimiters(), getInsertRelativePosition());
        }
        if (getInsertParagraphNumberInRelativeContext()) {
            return zzZPO.zzZ(this, bookmark, paragraph, getStart().getParentParagraph(), getSuppressNonDelimiters(), getNumberSeparator(), getInsertRelativePosition());
        }
        if (getInsertParagraphNumberInFullContext()) {
            return zzZPO.zzZ(this, bookmark, paragraph, getSuppressNonDelimiters(), getNumberSeparator(), getInsertRelativePosition());
        }
        if (getInsertRelativePosition()) {
            return zzZPO.zzZ(this, bookmark);
        }
        return null;
    }

    private boolean zzZcz() {
        return getInsertParagraphNumber() || getInsertParagraphNumberInRelativeContext() || getInsertParagraphNumberInFullContext();
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean canWorkAsMergeField() {
        return true;
    }

    public String getBookmarkName() {
        return zzZgq().zzDG(0);
    }

    public boolean getIncludeNoteOrComment() {
        return zzZgq().zzMj("\\f");
    }

    public boolean getInsertHyperlink() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getInsertParagraphNumber() {
        return zzZgq().zzMj("\\n");
    }

    public boolean getInsertParagraphNumberInFullContext() {
        return zzZgq().zzMj("\\w");
    }

    public boolean getInsertParagraphNumberInRelativeContext() {
        return zzZgq().zzMj("\\r");
    }

    public boolean getInsertRelativePosition() {
        return zzZgq().zzMj("\\p");
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFieldName() {
        return getBookmarkName();
    }

    public String getNumberSeparator() {
        return zzZgq().zzt("\\d", false);
    }

    public boolean getSuppressNonDelimiters() {
        return zzZgq().zzMj("\\t");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean isMergeValueRequired() {
        return true;
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setIncludeNoteOrComment(boolean z) throws Exception {
        zzZgq().zzs("\\f", z);
    }

    public void setInsertHyperlink(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setInsertParagraphNumber(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public void setInsertParagraphNumberInFullContext(boolean z) throws Exception {
        zzZgq().zzs("\\w", z);
    }

    public void setInsertParagraphNumberInRelativeContext(boolean z) throws Exception {
        zzZgq().zzs("\\r", z);
    }

    public void setInsertRelativePosition(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    public void setNumberSeparator(String str) throws Exception {
        zzZgq().zzZf("\\d", str);
    }

    public void setSuppressNonDelimiters(boolean z) throws Exception {
        zzZgq().zzs("\\t", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(getBookmarkName())) {
            return new zzZP2(this, "Error! No bookmark name given.");
        }
        Bookmark bookmarkZzT = zzZOO.zzT(this, getBookmarkName());
        if (bookmarkZzT == null) {
            return new zzZP2(this, "Error! Reference source not found.");
        }
        zzYWB zzywbZzW = zzW(bookmarkZzT);
        RefBoolean refBoolean = new RefBoolean(false);
        Paragraph paragraphZzZ = zzZPO.zzZ(this, bookmarkZzT, zzZcz(), refBoolean);
        boolean z = refBoolean.get();
        String strZzZ = zzZ(bookmarkZzT, paragraphZzZ);
        return strZzZ != null ? new zzZP5(this, strZzZ) : zzZPO.zzZ(this, bookmarkZzT, zzywbZzW, paragraphZzZ, z, getIncludeNoteOrComment());
    }

    @Override // com.aspose.words.Field
    public final int zzZgN() throws Exception {
        boolean zZzZcz = zzZcz();
        if (zZzZcz || !getInsertRelativePosition()) {
            return zzZPO.zzZ(this, getBookmarkName(), zZzZcz);
        }
        return 0;
    }
}
