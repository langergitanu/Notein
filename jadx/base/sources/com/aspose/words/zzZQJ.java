package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZQJ {
    public final zzTL zzQ(Field field) throws Exception {
        int iZzR = zzR(field);
        if (iZzR != -1) {
            return new zzZ7P(iZzR);
        }
        return null;
    }

    public abstract int zzR(Field field) throws Exception;

    public abstract int zzV(FieldStart fieldStart) throws Exception;

    public final Section zzW(FieldStart fieldStart) throws Exception {
        int iZzV = zzV(fieldStart);
        if (iZzV >= 0) {
            return fieldStart.zzYBb().getSections().get(iZzV);
        }
        return null;
    }

    public abstract zzYAD zzX(Footnote footnote) throws Exception;

    public abstract Paragraph zzZ(FieldStart fieldStart, zzZPS zzzps) throws Exception;

    public abstract void zzZ(FieldStart fieldStart, zzZ9R zzz9r) throws Exception;

    public abstract boolean zzZ(Field field, boolean z) throws Exception;

    public abstract zzZOR zzZeh();
}
