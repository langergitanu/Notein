package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYN4 {
    public abstract zzYN3 zzqI(int i);

    public final int zzqJ(int i) {
        zzYN3 zzyn3ZzqI = zzqI(i);
        zzyn3ZzqI.hasNext();
        return zzyn3ZzqI.next().intValue();
    }

    public final int zzqK(int i) {
        Iterator<Integer> it = zzqI(i).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }
}
