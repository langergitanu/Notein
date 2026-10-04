package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZP6 {
    private Field zzZz7;

    public zzZP6(Field field) {
        this.zzZz7 = field;
    }

    public final Document getDocument() {
        return this.zzZz7.getStart().zzYBb();
    }

    public final Field getField() {
        return this.zzZz7;
    }

    public abstract void zzZhW() throws Exception;
}
