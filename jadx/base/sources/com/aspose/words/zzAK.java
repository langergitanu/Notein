package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzAK {
    private boolean zzZ72;
    private zzAL zzZ73;

    public zzAK(zzAL zzal, boolean z) {
        this.zzZ73 = zzal;
        this.zzZ72 = z;
    }

    public static zzAK zzZ(zzAL zzal, int i, boolean z) {
        switch (i) {
            case 0:
                return new zzAJ(zzal, z);
            case 1:
                return new zzAI(zzal, z);
            case 2:
                return new zzAH(zzal, z);
            case 3:
                return new zzAG(zzal, z);
            case 4:
                return new zzAF(zzal, z);
            case 5:
                return new zzAE(zzal, z);
            case 6:
                return new zzAD(zzal, z);
            case 7:
                return new zzAC(zzal, z);
            case 8:
                return new zzAB(zzal, z);
            case 9:
                return new zzAA(zzal, z);
            case 10:
                return new zzA9(zzal, z);
            case 11:
                return new zzA8(zzal, z);
            case 12:
                return new zzA7(zzal, z);
            default:
                return new zzAC(zzal, z);
        }
    }

    public final zz93 zzQ(zz93 zz93Var) {
        ArrayList<zz93> arrayListZzZ = zzZ(8, zz93Var);
        arrayListZzZ.size();
        if (arrayListZzZ.size() == 0) {
            return null;
        }
        return arrayListZzZ.get(0);
    }

    public abstract ArrayList<zz93> zzR(zz93 zz93Var);

    public final void zzX(ArrayList<zz93> arrayList, zzAN zzan) {
        arrayList.add(this.zzZ73.zzS(zzan.zzZEB()));
    }

    public final void zzY(ArrayList<zz93> arrayList, zzAN zzan) {
        arrayList.add(this.zzZ73.zzS(zzan.zzZEz()));
    }

    public final zzAL zzZEk() {
        return this.zzZ73;
    }

    public final ArrayList<zz93> zzZ(int i, zz93 zz93Var) {
        return zzZ(this.zzZ73, i, this.zzZ72).zzR(zz93Var);
    }

    public final void zzZ(ArrayList<zz93> arrayList, zzAN zzan) {
        arrayList.add(this.zzZ73.zzS(zzan.zzZEx()));
    }

    public final void zzZ(ArrayList<zz93> arrayList, zzAN zzan, boolean z) {
        if (z && this.zzZ72) {
            return;
        }
        arrayList.add(this.zzZ73.zzS(zzan.zzZEw()));
    }
}
