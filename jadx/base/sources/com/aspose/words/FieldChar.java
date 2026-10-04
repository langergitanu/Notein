package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FieldChar extends SpecialChar {
    private boolean zzBK;
    private boolean zzYGa;
    private boolean zzYGb;
    private int zzYGc;

    public FieldChar(DocumentBase documentBase, char c, zzYEF zzyef, int i) {
        super(documentBase, c, zzyef);
        this.zzYGc = i;
    }

    public Field getField() {
        zzZR4 zzzr4ZzW = zzZR4.zzW(this);
        return zzZQB.zzX(zzzr4ZzW.getStart(), zzzr4ZzW.getSeparator(), zzzr4ZzW.getEnd());
    }

    public int getFieldType() {
        return this.zzYGc;
    }

    public void isDirty(boolean z) {
        this.zzYGb = z;
    }

    public void isLocked(boolean z) {
        this.zzBK = z;
    }

    public final boolean isPrivate() {
        return this.zzYGa;
    }

    public final void zzDJ(int i) {
        this.zzYGc = i;
    }

    public final void zzVY(boolean z) {
        this.zzYGa = z;
    }

    public boolean isDirty() {
        return this.zzYGb;
    }

    public boolean isLocked() {
        return this.zzBK;
    }
}
