package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzY09 {
    private int zzWTP;
    private ArrayList<zzYCP> zzpe;

    public zzY09() {
    }

    public static int zzUX(int i, int i2) {
        return i == 1073741823 ? i : i + i2;
    }

    public void offset(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        for (int i3 = 0; i3 < this.zzpe.size(); i3++) {
            ArrayList<zzYCP> arrayList = this.zzpe;
            arrayList.set(i3, arrayList.get(i3).zzmt(i));
        }
        this.zzWTP = zzUX(this.zzWTP, i2);
    }

    public final boolean zzXRU() {
        return this.zzWTP != 1073741823;
    }

    public final int zzXRV() {
        return this.zzWTP;
    }

    public final void zzYR(ArrayList<zzYCP> arrayList) {
        this.zzpe = arrayList;
    }

    public final void zzhw(int i) {
        this.zzWTP = i;
    }

    public final ArrayList<zzYCP> zzyD() {
        return this.zzpe;
    }

    public zzY09(ArrayList<zzYCP> arrayList, int i) {
        this.zzpe = arrayList;
        this.zzWTP = i;
    }
}
