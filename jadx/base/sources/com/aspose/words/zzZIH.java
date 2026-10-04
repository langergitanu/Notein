package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZIH {
    zzYB5 zzYr2;
    boolean zzYr3;
    int zzYr4;
    int zzYr5;
    int zzYr6;
    int zzYr7;
    boolean zzYr8;
    zzZIH zzYr9;
    zzZAS zzYra;
    private zzPS zzZq9;

    public zzZIH(zzZAS zzzas, zzPS zzps) {
        this.zzYra = zzzas;
        this.zzZq9 = zzps;
    }

    public final zzPS zzMj(int i) {
        return i != 0 ? i != 1 ? i != 2 ? zzPS.zzZqo : zzZ2R() : zzZUB() : this.zzZq9;
    }

    public abstract zzPS zzZ2R();

    public abstract zzYKK zzZ2S();

    public abstract int zzZ2T();

    public abstract zzPS zzZUB();

    public final zzPS zzZWe() {
        return zzMj(0);
    }
}
