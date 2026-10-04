package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz9H {
    private zz8J zzFp;
    private ArrayList<zzGF> zzqP = new ArrayList<>();
    private zzG9 zzqQ;
    private zzG6 zzqY;

    public zz9H(zzG9 zzg9, zzG6 zzg6) {
        this.zzqQ = zzg9;
        zz8J zz8j = new zz8J(zzZQ4.zzN(zzg9.zzKp().zzAg().zzyQ()), zzg9.zzMK().zzFo(), zzg9.zzMK().zzFt());
        this.zzFp = zz8j;
        zzZQG.zzZ((ArrayList<zz8J>) this.zzqP, zz8j);
        this.zzqY = zzg6;
        zzg6.zzZ(zzg9.zzMK().zzFo(), zzg9.zzMK().zzFt());
        zzZQG.zzZ((ArrayList<zzG6>) this.zzqP, this.zzqY);
    }

    public final zzG6 zzA0() {
        return this.zzqY;
    }

    public final zzG9 zzA1() {
        return this.zzqQ;
    }

    public final zzGA zzFk() {
        return this.zzqQ.zzFk();
    }

    public final void zzM(zzZL zzzl) throws Exception {
        Iterator<zzGF> it = this.zzqP.iterator();
        while (it.hasNext()) {
            it.next().zzM(zzzl);
        }
    }

    public final zzGC zzMK() {
        return this.zzqQ.zzMK();
    }

    public final void zzMM() {
        Iterator<zzGF> it = this.zzqP.iterator();
        while (it.hasNext()) {
            it.next().zzMM();
        }
    }

    public final zz8J zzMt() {
        return this.zzFp;
    }

    public final void zzN(zzZL zzzl) throws Exception {
        Iterator<zzGF> it = this.zzqP.iterator();
        while (it.hasNext()) {
            it.next().zzN(zzzl);
        }
    }
}
