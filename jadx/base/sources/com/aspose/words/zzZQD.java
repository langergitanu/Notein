package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQD extends zzZQF {
    private boolean zzYE7;
    private ArrayList<Field> zzYEO;

    public zzZQD() {
        this((byte) 0);
    }

    public final ArrayList<Field> getFields() {
        return this.zzYEO;
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() {
        if (this.zzYE7 || !zzZfT()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYEO, zzZe7());
        }
    }

    private zzZQD(byte b) {
        this(false, null);
    }

    public zzZQD(boolean z, int... iArr) {
        super(iArr);
        this.zzYEO = new ArrayList<>();
        this.zzYE7 = z;
    }
}
