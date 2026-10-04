package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzGQ extends zzGL {
    private float zzZg8 = Float.NaN;

    private void zzZPC() {
        this.zzZg8 = 0.0f;
        for (ChartSeries chartSeries : zzZPj()) {
            for (int i = 0; i < chartSeries.getValueCount(); i++) {
                zzCF zzcfZzL0 = chartSeries.zz2x().zzL0(i);
                if (!zzCF.zzR(zzcfZzL0)) {
                    this.zzZg8 = Math.max(this.zzZg8, (float) zzcfZzL0.getValue());
                }
            }
        }
    }

    public final boolean getBubble3D() {
        return ((Boolean) zzZPg().zzLv(18)).booleanValue();
    }

    public final float zzZPB() {
        if (Float.isNaN(this.zzZg8)) {
            zzZPC();
        }
        return this.zzZg8;
    }

    public final int zzZPD() {
        return ((Integer) zzZPg().zzLv(21)).intValue();
    }

    public final int zzZPE() {
        return ((Integer) zzZPg().zzLv(19)).intValue();
    }

    @Override // com.aspose.words.zzGK
    public final int zzZQO() {
        return 15;
    }
}
