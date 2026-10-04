package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTY extends zz8P {
    private zzZTU zz6J;
    private zzZV1 zz6K;

    public zzZTY(zz8T zz8t, zzG8 zzg8) {
        this(zz8t, new zzZV1(zz8t.zzR1()), zzg8);
    }

    public final zzZTU zzmO() {
        return this.zz6J;
    }

    public final zzZV1 zzmP() {
        return this.zz6K;
    }

    private zzZTY(zz8T zz8t, zzZV1 zzzv1, zzG8 zzg8) {
        this(zz8t, zzzv1, new zzZTU(zzzv1), zzg8);
    }

    private zzZTY(zz8T zz8t, zzZV1 zzzv1, zzZTU zzztu, zzG8 zzg8) {
        super(zz8t, zzztu, zzg8);
        this.zz6K = zzzv1;
        this.zz6J = zzztu;
    }
}
