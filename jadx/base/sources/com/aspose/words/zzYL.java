package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYL extends zzYNQ implements zzZBJ {
    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) {
        zzTL zztlZzZY5 = zztj.zzZY5();
        if (zztlZzZY5.isError()) {
            return zztlZzZY5;
        }
        zzY94 zzy94 = (zzY94) com.aspose.words.internal.zzZKW.zzZ(zztlZzZY5, zzY94.class);
        if (zzy94 != null) {
            return zzZ(zzy94);
        }
        zzTL zztlZzZY52 = zztj.zzZY5();
        if (zztlZzZY52.isError()) {
            return zztlZzZY52;
        }
        zzY94 zzy942 = (zzY94) com.aspose.words.internal.zzZKW.zzZ(zztlZzZY52, zzY94.class);
        if (zzy942 != null) {
            return zzZ(zzy942);
        }
        zzZVZ zzzvz = (zzZVZ) com.aspose.words.internal.zzZKW.zzZ(zztlZzZY5, zzZVZ.class);
        if (zzzvz == null) {
            return new zzZVZ(0.0d);
        }
        zzZVZ zzzvz2 = (zzZVZ) com.aspose.words.internal.zzZKW.zzZ(zztlZzZY52, zzZVZ.class);
        return zzzvz2 == null ? new zzZVZ(0.0d) : zzZ(zzzvz2, zzzvz);
    }

    public abstract zzTL zzZ(zzZVZ zzzvz, zzZVZ zzzvz2);

    private static zzZU3 zzZ(zzY94 zzy94) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzy94.zz8W()) && Character.isDigit(zzy94.zz8W().charAt(0))) {
            return zzZU3.zzZiV();
        }
        return zzZU3.zzMy(zzy94.zz8W());
    }
}
