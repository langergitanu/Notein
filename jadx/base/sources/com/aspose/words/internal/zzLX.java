package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzLX extends zzMO {
    private boolean zzDA;
    private ArrayList<zzL1> zzDg;
    private int zzDh;
    private float zzDi;
    private float zzDj;

    public zzLX(boolean z) {
        this.zzDA = z;
    }

    public final ArrayList<zzL1> zzJt() {
        return this.zzDg;
    }

    public final int zzJu() {
        return this.zzDh;
    }

    public final float zzJv() {
        return this.zzDi;
    }

    public final float zzJw() {
        return this.zzDj;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        this.zzDh = zzJJ().zzXc();
        this.zzDj = Float.intBitsToFloat(zzJJ().zzXc());
        this.zzDi = Float.intBitsToFloat(zzJJ().zzXc());
        int iZzXc = zzJJ().zzXc();
        this.zzDg = new ArrayList<>();
        for (int i = 0; i < iZzXc; i++) {
            zzZQG.zzZ(this.zzDg, zzL1.zzZ(zzJJ(), zzJI(), this.zzDA));
        }
    }
}
