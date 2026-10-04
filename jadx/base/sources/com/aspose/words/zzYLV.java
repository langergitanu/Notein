package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLV {
    private ArrayList<String> zzXES = new ArrayList<>();

    public final int add(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: editor");
        }
        int iIndexOf = this.zzXES.indexOf(str);
        return iIndexOf == -1 ? com.aspose.words.internal.zzZQG.zzZ(this.zzXES, str) : iIndexOf;
    }

    public final String get(int i) {
        return (i >= this.zzXES.size() || i < 0) ? "" : this.zzXES.get(i);
    }

    public final int getCount() {
        return this.zzXES.size();
    }
}
