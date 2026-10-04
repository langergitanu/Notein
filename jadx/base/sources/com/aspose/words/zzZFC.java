package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFC {
    private zzQQ zzYsS;
    private zzZIG zzYsT;
    private zzPS zzZq9;

    public zzZFC(zzZIG zzzig, zzPS zzps) {
        this.zzYsT = zzzig;
        this.zzYsS = zzQQ.zzZ(zzps, false);
        this.zzZq9 = zzps;
    }

    public final boolean zzYZi() {
        return "thead".equals(this.zzYsT.getName());
    }

    public final zzQQ zzZ3X() {
        return this.zzYsS;
    }

    public final zzZIG zzZ3Y() {
        return this.zzYsT;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }
}
