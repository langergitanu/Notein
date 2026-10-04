package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVA {
    public static void zzC(zzYVB zzyvb) {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            EditableRangeEnd editableRangeEnd = new EditableRangeEnd(zzyvb.getDocument(), zzyvh.getId());
            editableRangeEnd.zzOY(zzyvh.zz9d());
            zzyvb.zzYK(editableRangeEnd);
        }
    }

    public static void zzD(zzYVB zzyvb) {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            EditableRangeStart editableRangeStart = new EditableRangeStart(zzyvb.getDocument(), zzyvh.getId(), zzyvh.getSingleUser(), zzyvh.getEditorGroup());
            editableRangeStart.zzOY(zzyvh.zz9d());
            if (zzyvh.zzYzg() >= 0 && zzyvh.zzYzf() >= 0) {
                editableRangeStart.zzOX(zzyvh.zzYzg());
                editableRangeStart.zzOW(zzyvh.zzYzf());
            }
            zzyvb.zzYK(editableRangeStart);
        }
    }
}
