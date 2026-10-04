package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZNY {
    private static final List<zzZNY> zzZWd = new ArrayList(3);

    public static zzZO0 zzQy(int i) {
        Iterator<zzZNY> it = zzZWd.iterator();
        while (it.hasNext()) {
            zzZO0 zzzo0ZzQz = it.next().zzQz(i);
            if (zzzo0ZzQz != null) {
                return zzzo0ZzQz;
            }
        }
        return null;
    }

    public static int zzV2(String str) {
        Iterator<zzZNY> it = zzZWd.iterator();
        while (it.hasNext()) {
            Integer numZzV5 = it.next().zzV5(str);
            if (numZzV5 != null) {
                return numZzV5.intValue();
            }
        }
        return -1;
    }

    public static synchronized void zzZ(zzZNY zzzny) {
        zzZWd.add(zzzny);
    }

    public abstract zzZO0 zzQz(int i);

    public abstract Integer zzV5(String str);
}
