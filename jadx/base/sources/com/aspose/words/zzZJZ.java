package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJZ {
    private ArrayList<zzZK1> zzXK = new ArrayList<>();

    public final int getCount() {
        return this.zzXK.size();
    }

    public final zzZK1 zzA6(int i) {
        return this.zzXK.get(i);
    }

    public final boolean zzW(zzZK1 zzzk1) {
        return this.zzXK.contains(zzzk1);
    }

    public final void zzX(zzZK1 zzzk1) {
        this.zzXK.add(0, zzzk1);
    }

    public final void zzY(zzZK1 zzzk1) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXK, zzzk1);
    }

    public final int zzZ(zzZJZ zzzjz) {
        int iMin = Math.min(this.zzXK.size(), zzzjz.zzXK.size());
        for (int i = 0; i < iMin; i++) {
            if (zzA6(i).getId() != zzzjz.zzA6(i).getId()) {
                return i;
            }
        }
        return iMin;
    }

    public final zzZK1 zzZ4e() {
        if (this.zzXK.size() > 0) {
            return (zzZK1) C21505OooO0Oo.OooO00o(1, this.zzXK);
        }
        return null;
    }

    public final zzZK1 zzZ4f() {
        zzZK1 zzzk1ZzZ4e = zzZ4e();
        ArrayList<zzZK1> arrayList = this.zzXK;
        Class.getSimpleName();
        return zzzk1ZzZ4e;
    }
}
