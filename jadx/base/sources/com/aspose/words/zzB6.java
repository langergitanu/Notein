package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzB6 {
    private zz8Z zzZ7J;
    private ArrayList<zzBC> zzZ7K = new ArrayList<>();

    public zzB6(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    public final void zzL(Iterable<zzBC> iterable) {
        Iterator<zzBC> it = iterable.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
    }

    public final void zzX8(int i) {
        this.zzZ7K.size();
        if (i == this.zzZ7K.size()) {
            return;
        }
        ArrayList<zzBC> arrayList = this.zzZ7K;
        com.aspose.words.internal.zzZQG.zzV(arrayList, i, arrayList.size() - i);
        this.zzZ7J.zzZCI().zzIZ(i);
    }

    public final void zzY(float f, zz9K zz9k) {
        zzZ(f, zz9k.zzJ2(16));
    }

    public final void zzZ(float f, zzZC9 zzzc9, boolean z) {
        zzZ(new zzB7(f, zzzc9, z));
    }

    public final ArrayList<zzBC> zzZF1() {
        return this.zzZ7K;
    }

    public final int zzZF2() {
        return this.zzZ7K.size();
    }

    public final boolean zzY(zzB9 zzb9) {
        Iterator<zzBC> it = this.zzZ7K.iterator();
        while (it.hasNext()) {
            if (it.next().zzZ(zzb9)) {
                return true;
            }
        }
        return false;
    }

    public final void zzZ(float f, zzZC9 zzzc9) {
        zzZ(new zzBB(f, zzzc9));
    }

    private void zzZ(float f, zz65 zz65Var) {
        if (Float.isInfinite(f)) {
            return;
        }
        zzZ(new zzBA(f, zz65Var));
    }

    public final void zzZ(float f, zz9K zz9k) {
        zzZ(f, zz9k.zzJ2(61));
    }

    private void zzZ(zzBC zzbc) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ7K, zzbc);
        this.zzZ7J.zzZCI().zzZ(zzbc, this.zzZ7K.size() - 1);
    }

    public final void zzZ(long j, zz9K zz9k) {
        zzZ(Float.intBitsToFloat((int) j), zz9k);
        zzY(com.aspose.words.internal.zzZPW.zzYz(j), zz9k);
    }
}
