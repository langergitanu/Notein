package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzZ0P;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYMB {

    /* JADX INFO: renamed from: G */
    private static Map<zzZ5W, zzZ86> f51198G = new HashMap();

    /* JADX INFO: renamed from: H */
    private static Map<zzZ5W, zzZDA> f51199H = new HashMap();

    static {
        Map<zzZ5W, zzZ86> map = f51198G;
        zzZ1J zzz1j = zzZ0P.zzZ.zzWdK;
        zzZDA zzzda = zzZ96.zzWy4;
        zzZC8 zzzc8 = zzZC8.zzWHS;
        map.put(zzz1j, new zzZ86(zzzda, zzzc8));
        f51198G.put(zzZ0P.zzZ.zzWdI, new zzZ86(zzZ96.zzWy3, zzzc8));
        f51198G.put(zzZ0P.zzZ.zzWdG, new zzZ86(zzZ96.zzWy2, zzzc8));
        f51198G.put(zzZ0P.zzZ.zzWdE, new zzZ86(zzZ96.zzWy1, zzzc8));
        f51198G.put(zzZ0P.zzZ.zzWdC, new zzZ86(zzZ96.zzWy0, zzzc8));
        f51198G.put(zzYW0.zzZ.zzW1T, new zzZ86(zzZAE.zzWF0, zzzc8));
        f51198G.put(zzYW0.zzZ.zzW1P, new zzZ86(zzZA0.zzWC2, zzzc8));
        f51198G.put(zzYW0.zzZ.zzW1J, new zzZ86(zzZA0.zzWC3, zzzc8));
        f51199H.put(zzZ0P.zzZ.zzWdL, zzZ9K.zzWyW);
        f51199H.put(zzZ0P.zzZ.zzWdJ, zzZ9O.zzWAI);
        f51199H.put(zzZ0P.zzZ.zzWdH, zzZ9O.zzWAL);
        f51199H.put(zzZ0P.zzZ.zzWdF, zzZ9O.zzWAK);
        f51199H.put(zzZ0P.zzZ.zzWdD, zzZ9O.zzWAJ);
        f51199H.put(zzYW0.zzZ.zzW1Q, zzZ8R.zzWBF);
        f51199H.put(zzYW0.zzZ.zzW1O, zzZ8R.zzWu4);
        f51199H.put(zzYW0.zzZ.zzW1I, zzZ9Y.zzWBD);
    }

    public static zzZDA zzQ(zzZ5W zzz5w) {
        zzZDA zzzda = f51199H.get(zzz5w);
        if (zzzda != null) {
            return zzzda;
        }
        throw new IllegalArgumentException("Unrecognized digest requested: " + zzz5w.getName());
    }
}
