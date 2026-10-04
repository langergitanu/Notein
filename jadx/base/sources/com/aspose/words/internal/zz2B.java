package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz2B {
    private ArrayList<String> zzge = new ArrayList<>();

    public final void add(String str) {
        zzZQG.zzZ(this.zzge, str);
    }

    public final int getCount() {
        return this.zzge.size();
    }

    public final void zzW(zzFY zzfy) throws Exception {
        zzfy.zzFf();
        for (int i = 0; i < this.zzge.size(); i++) {
            zzfy.zzYU(this.zzge.get(i));
            if (i < this.zzge.size() - 1) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
    }

    public final String zztj() {
        return this.zzge.get(0);
    }
}
