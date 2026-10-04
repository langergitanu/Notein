package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3 {
    private int zz8r;
    private String zzZE2;
    private int zzZE8;
    private ArrayList<zzZ5> zzZEc;
    private int zzZEl;

    public zzZ3(String str, int i, int i2, ArrayList<zzZ5> arrayList) {
        this.zzZE2 = str;
        this.zz8r = i;
        this.zzZE8 = i2;
        this.zzZEc = arrayList;
    }

    public final int getByteCount() {
        return this.zz8r;
    }

    public final int getStartPosition() {
        return this.zzZEl;
    }

    public final void setStartPosition(int i) {
        this.zzZEl = i;
    }

    public final ArrayList<zzZ5> zzaD() {
        return this.zzZEc;
    }

    public final int zzat() {
        return this.zzZE8;
    }

    public final String zzau() {
        return this.zzZE2;
    }
}
