package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9P {
    static final Hashtable zzWHx = new Hashtable();
    static final Hashtable zzWHv = new Hashtable();

    static {
        zzZ("B-571", zzZ8T.zzWuD);
        zzZ("B-409", zzZ8T.zzWuF);
        zzZ("B-283", zzZ8T.zzWuV);
        zzZ("B-233", zzZ8T.zzWuP);
        zzZ("B-163", zzZ8T.zzWuX);
        zzZ("K-571", zzZ8T.zzWuE);
        zzZ("K-409", zzZ8T.zzWuG);
        zzZ("K-283", zzZ8T.zzWuW);
        zzZ("K-233", zzZ8T.zzWuQ);
        zzZ("K-163", zzZ8T.zzWv7);
        zzZ("P-521", zzZ8T.zzWuH);
        zzZ("P-384", zzZ8T.zzWuI);
        zzZ("P-256", zzZ8T.zzWuB);
        zzZ("P-224", zzZ8T.zzWuJ);
        zzZ("P-192", zzZ8T.zzWuC);
    }

    public static Enumeration zzXKn() {
        return zzWHx.keys();
    }

    private static void zzZ(String str, zzZDA zzzda) {
        zzWHx.put(str, zzzda);
        zzWHv.put(zzzda, str);
    }

    public static zzZDA zzwM(String str) {
        return (zzZDA) zzWHx.get(zzYGI.toUpperCase(str));
    }

    public static zzZ72 zzwN(String str) {
        zzZDA zzzda = (zzZDA) zzWHx.get(zzYGI.toUpperCase(str));
        if (zzzda != null) {
            return zzZ8U.zzX(zzzda);
        }
        return null;
    }
}
