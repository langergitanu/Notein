package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ64 {
    private zzZ86 zzWm7;
    private zzZ6N zzWm8;
    private zzZ6N zzWm9;
    private boolean zzWma;
    private zzYHE zzWmb;
    private final zzYHG zzWmc = new zzYHJ();
    private zzZ6I zzWmf;

    public zzZ64(zzYHE zzyhe, zzZ6I zzz6i) {
        this.zzWmb = zzyhe;
        this.zzWmf = zzz6i;
    }

    public final zzZ64 zzON(boolean z) {
        this.zzWma = true;
        return this;
    }

    public final zzZ65 zzZ(zzYHL zzyhl, zzZ6T zzz6t) throws zzYHB {
        zzZ65 zzz65ZzZ = zzZ(zzyhl, new zzZAH(new zzZAL(zzz6t.zzXHp())));
        zzz65ZzZ.zzW(zzz6t);
        return zzz65ZzZ;
    }

    private zzZ65 zzZ(zzYHL zzyhl, zzZAH zzzah) throws zzYHB {
        zzYHF zzyhfZzM;
        zzZ86 zzz86 = this.zzWm7;
        if (zzz86 != null) {
            zzyhfZzM = this.zzWmb.zzM(zzz86);
        } else {
            zzyhfZzM = this.zzWmb.zzM(this.zzWmc.zzN(zzyhl.zzXyu()));
        }
        zzYHF zzyhf = zzyhfZzM;
        if (this.zzWma) {
            return new zzZ65(zzzah, zzyhl, zzyhf.zzXyu(), this.zzWmf);
        }
        zzZ6N zzz6n = this.zzWm9;
        if (zzz6n == null && this.zzWm8 == null) {
            return new zzZ65(zzzah, zzyhl, zzyhf, this.zzWmf, new zzZ6A(), null);
        }
        if (zzz6n == null) {
            this.zzWm9 = new zzZ6A();
        }
        return new zzZ65(zzzah, zzyhl, zzyhf, this.zzWmf, this.zzWm9, this.zzWm8);
    }
}
