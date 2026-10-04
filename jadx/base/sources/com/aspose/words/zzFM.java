package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzFM {
    private int zzTL;
    private zzEQ zzZe3;
    private zzFJ zzZe4;
    private ArrayList<zzCK> zzZe5 = new ArrayList<>();
    private ChartSeries zzZyw;
    private boolean zzsy;
    private float zzwo;

    private zzFM(zzFJ zzfj, ChartSeries chartSeries, zzEQ zzeq, int i, boolean z) {
        this.zzZe4 = zzfj;
        this.zzZyw = chartSeries;
        this.zzZe3 = zzeq;
        this.zzTL = i;
        this.zzwo = zzeq == null ? 0.0f : com.aspose.words.internal.zzZPW.zzYz(zzeq.getSize());
        this.zzsy = z;
    }

    public static zzFM zzZ(zzFJ zzfj, ChartSeries chartSeries, zzEQ zzeq, int i) {
        return new zzFM(zzfj, chartSeries, zzeq, i, false);
    }

    public final float getHeight() {
        return this.zzwo;
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final com.aspose.words.internal.zzG zzz(float f, float f2) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        if (!this.zzsy) {
            zzg.zzX((com.aspose.words.internal.zzZL) this.zzZe3.zzZLM());
        }
        for (zzCK zzck : this.zzZe5) {
            if (!zzck.isEmpty()) {
                float width = (f - zzck.zzZGm().getWidth()) / 2.0f;
                zzck.zzZGn().zzZO().zzY(width + f2, (this.zzwo - zzck.zzZGm().getHeight()) / 2.0f, 0);
                zzg.zzX((com.aspose.words.internal.zzZL) zzck.zzZGn());
            }
            f2 += f;
        }
        return zzg;
    }

    public static zzFM zzZ(zzFJ zzfj, int i) {
        return new zzFM(zzfj, null, null, i, true);
    }

    public final void zzZ(float f, zzCF[] zzcfArr, boolean z) throws Exception {
        for (int i = 0; i < zzcfArr.length; i++) {
            zzCF zzcfZzKv = z ? zzcfArr[zzcfArr.length - (i + 1)] : zzcfArr[i];
            if (zzcfZzKv.getValueType() != 0) {
                if (!this.zzsy) {
                    zzcfZzKv = this.zzZyw.zz2y().zzZMv().zzKv(zzcfZzKv.getIndex());
                }
                zzCK zzckZzZ = this.zzZe4.zzZ(f, zzcfZzKv);
                com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, zzckZzZ);
                this.zzwo = Math.max(this.zzwo, zzckZzZ.zzZGm().getHeight());
            }
        }
    }
}
