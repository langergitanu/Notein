package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ6 {
    private String mName;
    private String mValue;
    private String zzWSm;
    private String zzZpC;

    public zzXZ6(com.aspose.words.internal.zzO zzo) {
        this.mName = zzo.getName();
        this.mValue = zzo.getValue();
        this.zzWSm = zzo.getNamespaceURI();
        this.zzZpC = zzo.getPrefix();
    }

    private int zzW(zzXZ6 zzxz6) {
        if (com.aspose.words.internal.zzZKN.equals(this.zzWSm, zzxz6.zzWSm)) {
            return com.aspose.words.internal.zzZKN.zzZJ(this.mName, zzxz6.mName);
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzWSm)) {
            return com.aspose.words.internal.zzZYD.zzXk(zzxz6.zzWSm) ? -1 : 0;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzxz6.zzWSm)) {
            return com.aspose.words.internal.zzZKN.zzZJ(this.zzWSm, zzxz6.zzWSm);
        }
        return 1;
    }

    private int zzX(zzXZ6 zzxz6) {
        int iZzZJ = com.aspose.words.internal.zzZKN.zzZJ(this.mName, zzxz6.mName);
        return iZzZJ != 0 ? iZzZJ : com.aspose.words.internal.zzZKN.zzZJ(this.mValue, zzxz6.mValue);
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final boolean zzXQQ() {
        return "xmlns".equals(this.zzZpC) || "xmlns".equals(this.mName);
    }

    public final int zzY(zzXZ6 zzxz6) {
        return zzXQQ() ? zzX(zzxz6) : zzW(zzxz6);
    }

    public final boolean zzZ(zzXZ6 zzxz6) {
        return zzY(zzxz6) == 0;
    }

    public final boolean zzz(Iterable<zzXZ6> iterable) {
        Iterator<zzXZ6> it = iterable.iterator();
        while (it.hasNext()) {
            if (zzZ(it.next())) {
                return true;
            }
        }
        return false;
    }

    public zzXZ6(String str, String str2) {
        this.mName = str;
        this.mValue = str2;
    }
}
