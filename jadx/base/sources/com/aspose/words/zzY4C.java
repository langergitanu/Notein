package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY4C extends zzYNQ implements zzZBJ {
    @Override // com.aspose.words.zzYNQ
    public final boolean zzYqQ() {
        return true;
    }

    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) {
        zzTL zztlZzZY5 = zztj.zzZY5();
        return zztlZzZY5.isError() ? zztlZzZY5 : !(zztlZzZY5 instanceof zzZVZ) ? zzZU3.zzZiV() : zzZ((zzZVZ) zztlZzZY5);
    }

    public abstract zzTL zzZ(zzZVZ zzzvz);
}
