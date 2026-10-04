package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJJ {
    static zzYJJ zzXC5 = new zzYJJ(zzPS.zzZqo, new zzNZ());
    private zzNZ zzXC2;
    private com.aspose.words.internal.zzD3<zzPS> zzXC3;
    private ArrayList<zzMD> zzXC4;
    private zzPS zzZq9;

    public zzYJJ(zzPS zzps, zzNZ zznz) {
        this.zzZq9 = zzps;
        this.zzXC4 = zznz.zzZVS();
        this.zzXC2 = zznz;
    }

    public final zzPS zzMj(int i) {
        zzPS zzps;
        if (i == 0) {
            return this.zzZq9;
        }
        com.aspose.words.internal.zzD3<zzPS> zzd3 = this.zzXC3;
        return (zzd3 == null || (zzps = zzd3.get(i)) == null) ? zzPS.zzZqo : zzps;
    }

    public final void zzZ(int i, zzPS zzps) {
        if (this.zzXC3 == null) {
            this.zzXC3 = new com.aspose.words.internal.zzD3<>();
        }
        if (this.zzXC3.get(i) == null) {
            this.zzXC3.set(i, zzps);
        }
    }

    public final zzPS zzZVr() {
        zzPR zzpr = new zzPR();
        zzQJ zzqj = new zzQJ();
        for (zzLT zzlt : this.zzXC2.zzMp(0)) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                zzqj.zzZ(zzlt.zzZWe(), 0, zzmd.zzZXs());
            }
        }
        zzqj.zzY(zzpr);
        return zzpr.zzZWe();
    }

    public final ArrayList<zzMD> zzZVs() {
        return this.zzXC4;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }
}
