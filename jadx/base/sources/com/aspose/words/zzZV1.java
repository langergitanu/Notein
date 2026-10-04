package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZV1 {
    EditableRangeEnd zzYLL;
    EditableRangeStart zzYLM;
    int zzZuO;

    public final void zzZZA() {
        EditableRangeStart editableRangeStart = this.zzYLM;
        if (editableRangeStart != null) {
            editableRangeStart.setId(this.zzZuO);
        }
        EditableRangeEnd editableRangeEnd = this.zzYLL;
        if (editableRangeEnd != null) {
            editableRangeEnd.setId(this.zzZuO);
        }
    }

    public final boolean zzZZx() {
        return this.zzYLL != null;
    }

    public final boolean zzZZy() {
        return this.zzYLM != null;
    }

    public final void zzZjN() {
        EditableRangeStart editableRangeStart = this.zzYLM;
        if (editableRangeStart != null) {
            if (editableRangeStart.getParentNode() != null) {
                this.zzYLM.remove();
            }
            this.zzYLM = null;
        }
        EditableRangeEnd editableRangeEnd = this.zzYLL;
        if (editableRangeEnd != null) {
            if (editableRangeEnd.getParentNode() != null) {
                this.zzYLL.remove();
            }
            this.zzYLL = null;
        }
    }
}
