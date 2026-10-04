package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFX {
    private ArrayList<zzZIG> zzZom = new ArrayList<>();

    public final void clear() {
        this.zzZom.clear();
    }

    public final int getCount() {
        return this.zzZom.size();
    }

    public final boolean isEmpty() {
        return this.zzZom.size() == 0;
    }

    public final zzZIG zzAb(int i) {
        return this.zzZom.get(i);
    }

    public final boolean zzJ(zzZIG zzzig) {
        return this.zzZom.contains(zzzig);
    }

    public final int zzX(zzZIG zzzig) {
        return this.zzZom.indexOf(zzzig);
    }

    public final void zzY(zzZIG zzzig) {
        this.zzZom.remove(zzzig);
    }

    public final void zzZ(zzZIG zzzig) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zzzig);
    }

    public final void zzZ09() {
        this.zzZom.size();
        ArrayList<zzZIG> arrayList = this.zzZom;
        Class.getSimpleName();
    }

    public final zzZIG zzZ0a() {
        this.zzZom.size();
        return (zzZIG) C21505OooO0Oo.OooO00o(1, this.zzZom);
    }

    public final void zzzc(int i) {
        this.zzZom.size();
        ArrayList<zzZIG> arrayList = this.zzZom;
        com.aspose.words.internal.zzZQG.zzV(arrayList, i, arrayList.size() - i);
    }

    public final void zzX(int i, zzZIG zzzig) {
        this.zzZom.set(i, zzzig);
    }

    public final void zzZ(int i, zzZIG zzzig) {
        this.zzZom.size();
        this.zzZom.add(i, zzzig);
    }
}
