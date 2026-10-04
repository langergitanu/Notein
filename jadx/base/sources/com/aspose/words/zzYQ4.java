package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ4 {
    private zzYPA zzXMw;
    private String zzXMx;
    private ArrayList<zzYTE> zzZm = new ArrayList<>();
    private zzY6G zzZsO = new zzY6G();
    private int zzXMy = 1;

    public final int getCount() {
        return this.zzZm.size();
    }

    public final void zzE3(String str) {
        this.zzXMx = str;
    }

    public final zzYPA zzYuk() {
        return this.zzXMw;
    }

    public final String zzYul() {
        return this.zzXMx;
    }

    public final int zzYum() {
        return this.zzXMy;
    }

    public final void zzZ(zzYTE zzyte) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzyte);
    }

    public final zzY6G zzZYf() {
        return this.zzZsO;
    }

    public final void zzrK(int i) {
        this.zzXMy = i;
    }

    public final zzYTE zzrL(int i) {
        return this.zzZm.get(i);
    }

    public final void zzZ(int i, zzYTE zzyte) {
        this.zzZm.set(i, zzyte);
    }

    public final void zzZ(zzYPA zzypa) {
        this.zzXMw = zzypa;
    }
}
