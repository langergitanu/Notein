package com.aspose.words.internal;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNU {
    private zzZNT zzZW8;

    public zzZNU(zzZNT zzznt) {
        this.zzZW8 = zzznt;
    }

    public final int getCount() {
        if (this.zzZW8.zzhL()) {
            return this.zzZW8.zzhI().groupCount() + 1;
        }
        return 1;
    }

    public final zzZNV zzQx(int i) {
        String strGroup;
        int iStart;
        if (!this.zzZW8.zzhL() || i < 0 || i >= getCount()) {
            strGroup = null;
            iStart = 0;
        } else {
            Matcher matcherZzhI = this.zzZW8.zzhI();
            strGroup = matcherZzhI.group(i);
            iStart = matcherZzhI.start(i);
        }
        return strGroup == null ? zzZNV.zzZWa : new zzZNV(strGroup, iStart, true);
    }
}
