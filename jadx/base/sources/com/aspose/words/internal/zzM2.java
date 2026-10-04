package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzM2 extends zz8P {
    private zzO8 zzDq;
    private zzLU zzDr;

    public zzM2(zz8T zz8t, zzG8 zzg8) {
        this(zz8t, new zzO8(zz8t.zzR1()), zzg8);
    }

    public final zzLU zzJA() {
        return this.zzDr;
    }

    public final zzO8 zzJz() {
        return this.zzDq;
    }

    private zzM2(zz8T zz8t, zzO8 zzo8, zzG8 zzg8) {
        this(zz8t, zzo8, new zzLU(zzo8), zzg8);
    }

    private zzM2(zz8T zz8t, zzO8 zzo8, zzLU zzlu, zzG8 zzg8) {
        super(zz8t, zzlu, zzg8);
        this.zzDq = zzo8;
        this.zzDr = zzlu;
    }
}
