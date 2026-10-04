package com.aspose.words.internal;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH2 extends zzZG6 {
    zzZH3 zzWOH;

    public zzZH2(zzZH3 zzzh3) {
        this.zzWOH = zzzh3;
    }

    @Override // com.aspose.words.internal.zzZG6
    public final String zzXOZ() {
        zzZH3 zzzh3 = this.zzWOH;
        if (zzzh3.zzWOK) {
            return null;
        }
        return "Expected <" + zzZDX.zzZ(zzzh3.zzXOV(), ">, <", "> or <") + ">";
    }

    @Override // com.aspose.words.internal.zzZG6
    public final zzZG6 zzXP0() {
        return new zzZH2(this.zzWOH);
    }

    @Override // com.aspose.words.internal.zzZG6
    public final String zzZ(zzZDZ zzzdz) {
        zzZH3 zzzh3ZzY = this.zzWOH.zzY(zzzdz);
        if (zzzh3ZzY != null) {
            this.zzWOH = zzzh3ZzY;
            return null;
        }
        TreeSet<zzZDZ> treeSetZzXOV = this.zzWOH.zzXOV();
        if (treeSetZzXOV.size() == 0) {
            return "Expected $END";
        }
        if (this.zzWOH.zzWOK) {
            return "Expected <" + zzZDX.zzZ(treeSetZzXOV, ">, <", null) + "> or $END";
        }
        return "Expected <" + zzZDX.zzZ(treeSetZzXOV, ">, <", "> or <") + ">";
    }
}
