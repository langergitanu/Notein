package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTL implements zzZBJ {
    public final boolean isError() {
        return zzbY() == 7;
    }

    public String zz8W() {
        throw new IllegalStateException();
    }

    public boolean zz8X() {
        throw new IllegalStateException();
    }

    public double zz8Y() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) {
        return this;
    }

    public abstract int zzbY();

    public zzZQ8 zzZ(zzYIU zzyiu, int i, IFieldResultFormatter iFieldResultFormatter) {
        return null;
    }

    public String zzZ(String str, int i, IFieldResultFormatter iFieldResultFormatter) {
        return null;
    }

    public boolean zzZ(RefDouble refDouble) {
        refDouble.set(0.0d);
        return false;
    }
}
