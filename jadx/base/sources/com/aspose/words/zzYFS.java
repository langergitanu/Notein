package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFS {
    private ArrayList<String> zzXsI = new ArrayList<>();

    public zzYFS(boolean z) {
        if (z) {
            add("Unknown");
        }
    }

    public final int add(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: author");
        }
        int iIndexOf = this.zzXsI.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXsI, str);
        return this.zzXsI.size() - 1;
    }

    public final String get(int i) {
        return i >= this.zzXsI.size() ? "Unknown" : this.zzXsI.get(i);
    }

    public final int getCount() {
        return this.zzXsI.size();
    }
}
