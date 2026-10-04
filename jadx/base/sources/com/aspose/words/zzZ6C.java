package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ6C extends zzZ6H {
    public zzZ6C(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    public abstract int getMaxLength();

    public abstract String getName();

    public abstract int getSelectedIndex() throws Exception;

    public abstract long getSize() throws Exception;

    public final boolean isChecked() throws Exception {
        return ((zzYAL) this.zzYgm).isChecked();
    }

    public abstract boolean isEnabled();

    public abstract String zzYQ();

    public abstract String zzYR() throws Exception;

    public abstract int zzYRH() throws Exception;

    public float zzYS() throws Exception {
        return ((zzZ55) this.zzYgm.zzZZJ()).zzYQj().zzYdD / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzZ(this);
    }

    public abstract ArrayList<String> zzZA() throws Exception;

    @Override // com.aspose.words.zzZ6H, com.aspose.words.zzZ6S
    public final long zzZT() throws Exception {
        if (!this.zzYfe) {
            this.zzYgm.zzZZJ();
            long jZzYqr = this.zzYgm.zzYqr();
            this.zzZN = com.aspose.words.internal.zzZPY.zzG(((int) jZzYqr) / 1000.0f, ((((int) (jZzYqr >> 32)) + this.zzYgm.getHeight()) + ((zzTC) this.zzYgm.zzZZJ()).zzZXQ()) / 1000.0f);
            this.zzYfe = true;
        }
        return this.zzZN;
    }
}
