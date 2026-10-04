package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ80 extends zzZDB {
    zzZCG zzWqT;
    zzZ86 zzWqU;
    zzZ7B zzWqV;
    zzZD4 zzWvF;

    private zzZ80(zzZD4 zzzd4) {
        this.zzWvF = zzzd4;
        if (zzzd4.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.zzWqV = zzZ7B.zzWW(zzzd4.zzg6(0));
        this.zzWqU = zzZ86.zzXm(zzzd4.zzg6(1));
        this.zzWqT = zzZCG.zzYu(zzzd4.zzg6(2));
    }

    public static zzZ80 zzXh(Object obj) {
        if (obj instanceof zzZ80) {
            return (zzZ80) obj;
        }
        if (obj != null) {
            return new zzZ80(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZCG zzXIb() {
        return this.zzWqT;
    }

    public final zzZ86 zzXIc() {
        return this.zzWqU;
    }

    public final zzZ7D zzXId() {
        return this.zzWqV.zzWpq;
    }

    public final zzZ8C zzXIe() {
        return this.zzWqV.zzWpr;
    }

    public final zzZ7A zzXIf() {
        return this.zzWqV.zzWps;
    }

    public final zzZ7A zzXIg() {
        return this.zzWqV.zzWpt;
    }

    public final zzZ8C zzXIh() {
        return this.zzWqV.zzWpA;
    }

    public final int zzXIi() {
        return this.zzWqV.zzXIi();
    }

    public final zzZ7B zzXIj() {
        return this.zzWqV;
    }

    public final zzZDD zzXJQ() {
        return this.zzWqV.zzWFu;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWvF;
    }
}
