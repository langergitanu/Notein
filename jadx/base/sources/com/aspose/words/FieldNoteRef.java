package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class FieldNoteRef extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\f", "\\h", "\\p");

    private Run zzW(Footnote footnote) throws Exception {
        zzYAD zzyadZzX = zzZgo().zzZay().zzX(footnote);
        if (zzyadZzX == null) {
            return null;
        }
        Run run = new Run(getStart().getDocument(), zzyadZzX.getText());
        if (getInsertReferenceMark()) {
            run.getFont().setStyleIdentifier(zzZMP.zzB0(footnote.getFootnoteType()));
        }
        return run;
    }

    private Run zzX(Bookmark bookmark) {
        if (!getInsertRelativePosition() || zzZgt()) {
            return null;
        }
        return new Run(getStart().getDocument(), " " + zzZPO.zzZ(this, bookmark));
    }

    private zzYWB zzZ(Bookmark bookmark, Footnote footnote) throws Exception {
        Paragraph paragraph = new Paragraph(getStart().getDocument());
        Run runZzW = zzW(footnote);
        if (runZzW == null) {
            return null;
        }
        paragraph.appendChild(runZzW);
        Run runZzX = zzX(bookmark);
        if (runZzX != null) {
            paragraph.appendChild(runZzX);
        } else {
            runZzX = runZzW;
        }
        return new zzYWB(runZzW, runZzX);
    }

    public String getBookmarkName() {
        return zzZgq().zzDG(0);
    }

    public boolean getInsertHyperlink() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getInsertReferenceMark() {
        return zzZgq().zzMj("\\f");
    }

    public boolean getInsertRelativePosition() {
        return zzZgq().zzMj("\\p");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) ? 1 : 0;
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setInsertHyperlink(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setInsertReferenceMark(boolean z) throws Exception {
        zzZgq().zzs("\\f", z);
    }

    public void setInsertRelativePosition(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzYWB zzywbZzZ;
        if (!com.aspose.words.internal.zzZYD.zzXk(getBookmarkName())) {
            return new zzZP2(this, "Error! No bookmark name given.");
        }
        Bookmark bookmarkZzT = zzZOO.zzT(this, getBookmarkName());
        if (bookmarkZzT == null) {
            return new zzZP2(this, "Error! Bookmark not defined.");
        }
        ArrayList<Node> arrayListZzY = zzYWG.zzY(bookmarkZzT.zz9m(), 20);
        if (arrayListZzY.size() != 0 && (zzywbZzZ = zzZ(bookmarkZzT, (Footnote) arrayListZzY.get(0))) != null) {
            return new zzZP5(this, new zzYW7(zzywbZzZ));
        }
        return new zzZP2(this, "Error! Bookmark not defined.");
    }
}
