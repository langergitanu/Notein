package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIN {
    private zzJF zzZig;
    private zzIW zzZhG = new zzIU();
    private int zzZhF = 0;
    private int zzZhE = 1;
    private int zzZhD = 0;

    public final void zzX(com.aspose.words.internal.zzZYT<String> zzzyt) {
        if (zzzyt.containsKey("linDir")) {
            this.zzZhG = zzIW.zzRH(zzzyt.get("linDir"));
        }
        if (zzzyt.containsKey("nodeHorzAlign")) {
            this.zzZhF = zz9Z.zzQ1(zzzyt.get("nodeHorzAlign"));
        }
        if (zzzyt.containsKey("nodeVertAlign")) {
            this.zzZhE = zz9Z.zzQ0(zzzyt.get("nodeVertAlign"));
        }
        if (zzzyt.containsKey("fallback")) {
            this.zzZhD = zz9Z.zzPZ(zzzyt.get("fallback"));
        }
        this.zzZig = zzJF.zzY(zzzyt);
    }

    public final int zzZRF() {
        return this.zzZhE;
    }

    public final int zzZRG() {
        return this.zzZhF;
    }

    public final zzIW zzZRH() {
        return this.zzZhG;
    }

    public final zzJF zzZSe() {
        return this.zzZig;
    }
}
