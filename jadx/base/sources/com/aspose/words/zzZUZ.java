package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUZ {
    private static zzZUZ zzYLF = new zzZUZ(null, null, true, null, true);
    private boolean zzYLG;
    private zzZUZ zzYLH;
    private boolean zzYLI;
    private zzQ4 zzYLJ;
    private zzQ4 zzYLK;

    public zzZUZ(zzQ4 zzq4, zzQ4 zzq42, boolean z, zzZUZ zzzuz, boolean z2) {
        this.zzYLK = zzq4;
        this.zzYLI = z;
        this.zzYLH = zzzuz;
        this.zzYLG = z2;
        this.zzYLJ = zzq42;
    }

    public static zzZUZ zzZjB() {
        return zzYLF;
    }

    private boolean zzZjF() {
        return (zzZjG() || zzZjI() || !this.zzYLK.zzZWj().zzX(this.zzYLJ.zzZWj())) ? false : true;
    }

    private boolean zzZjG() {
        return this.zzYLJ == null;
    }

    private boolean zzZjH() {
        zzQ4 zzq4ZzZjJ = zzZjJ();
        zzQ4 zzq4 = this.zzYLK;
        if (zzq4 == null && zzq4ZzZjJ == null) {
            return true;
        }
        return (zzq4 == null || zzq4ZzZjJ == null || !zzq4.zzZWj().zzX(zzq4ZzZjJ.zzZWj())) ? false : true;
    }

    private boolean zzZjI() {
        return this.zzYLK == null;
    }

    private zzQ4 zzZjJ() {
        for (zzZUZ zzzuz = this.zzYLH; zzzuz != null; zzzuz = zzzuz.zzYLH) {
            if (zzzuz.zzYLG) {
                return zzzuz.zzYLK;
            }
        }
        return null;
    }

    public final boolean zzZjC() {
        return this.zzYLI;
    }

    public final zzQ4 zzZjD() {
        return this.zzYLJ;
    }

    public final zzQ4 zzZjE() {
        return this.zzYLK;
    }

    public final zzPT zzZjK() {
        if (zzZjG() || zzZjF()) {
            return null;
        }
        return this.zzYLJ;
    }

    public final zzPT zzZjL() {
        if (zzZjI() || zzZjH()) {
            return null;
        }
        return this.zzYLK;
    }
}
