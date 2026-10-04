package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz9L implements zzGE {
    private zzP8 zzFw;
    private ArrayList<zzGD> zzqS = new ArrayList<>();
    protected zzZQ4 zzqT;

    public zz9L(zzZQ4 zzzq4) {
        this.zzqT = zzzq4;
    }

    private static boolean zzK(zzP8 zzp8) throws Exception {
        zzZQ4 zzzq4ZzS = zzP6.zzS(zzp8);
        return Math.abs(zzzq4ZzS.zzZm()) > 4000000.0f || Math.abs(zzzq4ZzS.zzZo()) > 4000000.0f || Math.abs(zzzq4ZzS.zzkw()) > 4000000.0f || Math.abs(zzzq4ZzS.zzZn()) > 4000000.0f;
    }

    public final void resetCache() {
        this.zzFw = null;
    }

    public final void zzA5() {
        Iterator<zzGD> it = this.zzqS.iterator();
        while (it.hasNext()) {
            it.next().zzFv();
        }
    }

    public final zzP8 zzA6() {
        return this.zzFw;
    }

    @Override // com.aspose.words.internal.zzGE
    public final boolean zzFw() throws Exception {
        return zzFx() != null && zzFx().getCount() == 0;
    }

    @Override // com.aspose.words.internal.zzGE
    public final zzP8 zzFx() throws Exception {
        zzP8 zzp8 = this.zzFw;
        if (zzp8 != null) {
            return zzp8;
        }
        zzON zzonZzMA = zzMA();
        if (zzonZzMA == null || zzonZzMA.isInfinite()) {
            return null;
        }
        zzP8 zzp8ZzNl = zzonZzMA.zzNl();
        this.zzFw = zzp8ZzNl;
        if (zzK(zzp8ZzNl)) {
            this.zzFw = zzonZzMA.zzG(this.zzqT).zzNl();
        }
        return this.zzFw;
    }

    public final void zzL(zzP8 zzp8) {
        this.zzFw = zzp8;
    }

    public abstract zzON zzMA();

    @Override // com.aspose.words.internal.zzGE
    public final void zzZ(zzGD zzgd) {
        zzZQG.zzZ(this.zzqS, zzgd);
    }
}
