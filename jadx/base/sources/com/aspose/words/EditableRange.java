package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class EditableRange {
    private EditableRangeEnd zzYLR;
    private EditableRangeStart zzYLS;

    public EditableRange(EditableRangeStart editableRangeStart) {
        if (editableRangeStart == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: editableRangeStart");
        }
        this.zzYLS = editableRangeStart;
    }

    public EditableRangeEnd getEditableRangeEnd() throws Exception {
        if (this.zzYLR == null) {
            this.zzYLR = zzZV4.zzW(this.zzYLS.getDocument(), getId());
        }
        return this.zzYLR;
    }

    public EditableRangeStart getEditableRangeStart() {
        return this.zzYLS;
    }

    public int getEditorGroup() {
        return getEditableRangeStart().getEditorGroup();
    }

    public int getId() {
        return this.zzYLS.getId();
    }

    public String getSingleUser() {
        return getEditableRangeStart().getSingleUser();
    }

    public void remove() throws Exception {
        getEditableRangeStart().remove();
        getEditableRangeEnd().remove();
    }

    public void setEditorGroup(int i) {
        getEditableRangeStart().setEditorGroup(i);
        getEditableRangeStart().setSingleUser("");
    }

    public void setSingleUser(String str) {
        getEditableRangeStart().setSingleUser(str);
        getEditableRangeStart().setEditorGroup(0);
    }
}
