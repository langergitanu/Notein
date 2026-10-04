package com.aspose.words.internal;

import com.aspose.words.internal.zzYGU;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB4 extends zzZDB implements zzYGQ {
    private final zzZDK[] zzWGC;

    public zzZB4(zzZB5[] zzzb5Arr) {
        zzZDK[] zzzdkArr = new zzZDK[zzzb5Arr.length];
        this.zzWGC = zzzdkArr;
        System.arraycopy(zzzb5Arr, 0, zzzdkArr, 0, zzzb5Arr.length);
    }

    public static zzZB4 zzYn(Object obj) {
        if (obj instanceof zzZB4) {
            return (zzZB4) obj;
        }
        if (obj != null) {
            return new zzZB4(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZDK> iterator() {
        return new zzYGU.zzZ(this.zzWGC);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZC2(this.zzWGC);
    }

    private zzZB4(zzZD4 zzzd4) {
        this.zzWGC = new zzZDK[zzzd4.size()];
        int i = 0;
        while (true) {
            zzZDK[] zzzdkArr = this.zzWGC;
            if (i == zzzdkArr.length) {
                return;
            }
            zzzdkArr[i] = zzZB5.zzYo(zzzd4.zzg6(i));
            i++;
        }
    }
}
