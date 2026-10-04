package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZG4 {
    private zzZG4 zzYnK;
    private zzZG4 zzYnL;
    private zzZIG zzYnM;

    public final void zzK(zzZIG zzzig) {
        this.zzYnM = zzzig;
    }

    public abstract boolean zzM(boolean z, boolean z2);

    public final void zzY(zzZG4 zzzg4) {
        this.zzYnL = zzzg4;
    }

    public final void zzZ(zzZG4 zzzg4) {
        this.zzYnK = zzzg4;
    }

    public abstract void zzZ(StringBuilder sb, zzXYQ zzxyq);

    public final zzZG4 zzZ0c() {
        return this.zzYnL;
    }

    public final zzZG4 zzZ0d() {
        return this.zzYnK;
    }

    public final zzZIG zzZ0e() {
        return this.zzYnM;
    }

    public final void zzZ0f() {
        zzZIG zzzig = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(this, zzZIG.class);
        if (zzzig == null) {
            return;
        }
        zzZE5 zzze5 = new zzZE5(zzzig);
        while (true) {
            zzZG4 zzzg4ZzYXo = null;
            while (zzze5.moveNext()) {
                if (zzze5.zzZou() && zzzg4ZzYXo == null && zzze5.zzYXo().zzZ2A()) {
                    zzzg4ZzYXo = zzze5.zzYXo();
                }
                boolean zZzM = zzze5.zzYXo().zzM(zzze5.zzZou(), zzzg4ZzYXo != null);
                if (!zZzM) {
                    zzze5.zzYXp();
                }
                if (!zzze5.zzZou() || !zZzM) {
                    if (com.aspose.words.internal.zzZKO.zzA(zzze5.zzYXo(), zzzg4ZzYXo)) {
                        break;
                    }
                }
            }
            return;
        }
    }

    public final String zzZ0g() {
        zzXYQ zzxyq = new zzXYQ(this);
        StringBuilder sb = new StringBuilder();
        zzZ(sb, zzxyq);
        return sb.toString();
    }

    public boolean zzZ2A() {
        return false;
    }

    public abstract boolean zzZ2D();

    public abstract boolean zzZ2E();
}
