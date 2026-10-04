package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZPH {
    private boolean zzYC4;
    private Field zzZz7;

    public zzZPH(Field field) {
        this(field, true);
    }

    public final Field getField() {
        return this.zzZz7;
    }

    public abstract void zzZcw() throws Exception;

    public final void zzZcx() throws Exception {
        zzZB1 formatApplier = this.zzYC4 ? this.zzZz7.getFormat().zzZdZ().getFormatApplier() : null;
        this.zzZz7.zzW4(true);
        this.zzZz7.zzZgP();
        zzZcw();
        if (formatApplier != null) {
            formatApplier.zzZ(this.zzZz7.zzZgF());
        }
    }

    public zzZPH(Field field, boolean z) {
        this.zzZz7 = field;
        this.zzYC4 = z;
    }
}
