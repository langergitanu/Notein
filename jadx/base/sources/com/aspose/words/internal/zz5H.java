package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz5H {
    private ArrayList<zz5J> zzku = new ArrayList<>();
    private zzZYG<zz4R> zzkt = new zzZYG<>(false);
    private zzZYG<String> zzks = new zzZYG<>(false);

    public final String zzXY(String str) {
        if (zzZKN.zzU3(str)) {
            return null;
        }
        return this.zzks.get(str);
    }

    public final void zzY(zzFX zzfx) throws Exception {
        for (int i = 0; i < this.zzku.size(); i++) {
            this.zzku.get(i).zzZ(zzfx, this.zzkt);
        }
    }

    public final void zzZ(zz5J zz5j) {
        zzZQG.zzZ(this.zzku, zz5j);
    }

    public final void zzq(String str, String str2) {
        if (zzZKN.zzU3(str)) {
            return;
        }
        this.zzks.set(str, str2);
    }

    public final void zzZ(String str, zz4R zz4r) {
        if (this.zzkt.containsKey(str)) {
            return;
        }
        this.zzkt.set(str, zz4r);
    }
}
