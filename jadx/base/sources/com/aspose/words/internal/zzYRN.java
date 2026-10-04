package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRN extends zzYRM {
    private static final Map zzVXj;
    public static final zzZ86 zzVXk;
    public static final zzZ86 zzVXl;
    public static final zzZ86 zzVXm;
    public static final zzZ86 zzVXn;
    public static final zzZ86 zzVXo;
    private final int zzWeK;
    private final int zzWfC;
    private final zzZ86 zzWyC;

    static {
        zzZDA zzzda = zzZ96.zzWy4;
        zzZC8 zzzc8 = zzZC8.zzWHS;
        zzVXo = new zzZ86(zzzda, zzzc8);
        zzZDA zzzda2 = zzZ96.zzWy2;
        zzVXn = new zzZ86(zzzda2, zzzc8);
        zzZDA zzzda3 = zzZ96.zzWy0;
        zzVXm = new zzZ86(zzzda3, zzzc8);
        zzZDA zzzda4 = zzZ9O.zzWAy;
        zzVXl = new zzZ86(zzzda4, zzzc8);
        zzZDA zzzda5 = zzZ9O.zzWAw;
        zzVXk = new zzZ86(zzzda5, zzzc8);
        HashMap map = new HashMap();
        zzVXj = map;
        map.put(zzzda, 20);
        map.put(zzzda2, 32);
        map.put(zzzda3, 64);
        map.put(zzZ96.zzWy3, 28);
        map.put(zzZ96.zzWy1, 48);
        map.put(zzZ9O.zzWAz, 28);
        map.put(zzzda4, 32);
        map.put(zzZ9O.zzWAx, 48);
        map.put(zzzda5, 64);
        map.put(zzZAE.zzWF0, 32);
        map.put(zzZ8W.zzWvV, 32);
        map.put(zzZ8W.zzWvU, 64);
        map.put(zzZA2.zzWCS, 32);
    }

    public final int getIterationCount() {
        return this.zzWfC;
    }

    public final int getSaltLength() {
        return this.zzWeK;
    }

    public final zzZ86 zzXC5() {
        return this.zzWyC;
    }
}
