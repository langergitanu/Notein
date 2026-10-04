package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ8A implements zzZ8B {
    private static int zzW(zzZDK zzzdk) {
        return zzZ88.canonicalize(zzZ88.zzV(zzzdk)).hashCode();
    }

    public static Hashtable zzY(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // com.aspose.words.internal.zzZ8B
    public final boolean zzZ(zzZ8C zzz8c, zzZ8C zzz8c2) {
        zzZ8D[] zzz8dArrZzXIo = zzz8c.zzXIo();
        zzZ8D[] zzz8dArrZzXIo2 = zzz8c2.zzXIo();
        if (zzz8dArrZzXIo.length != zzz8dArrZzXIo2.length) {
            return false;
        }
        boolean z = (zzz8dArrZzXIo[0].zzXIq() == null || zzz8dArrZzXIo2[0].zzXIq() == null) ? false : !zzz8dArrZzXIo[0].zzXIq().zzXIt().equals(zzz8dArrZzXIo2[0].zzXIq().zzXIt());
        for (int i = 0; i != zzz8dArrZzXIo.length; i++) {
            if (!zzZ(z, zzz8dArrZzXIo[i], zzz8dArrZzXIo2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzZ8B
    public final int zzY(zzZ8C zzz8c) {
        zzZ8D[] zzz8dArrZzXIo = zzz8c.zzXIo();
        int iHashCode = 0;
        for (int i = 0; i != zzz8dArrZzXIo.length; i++) {
            if (zzz8dArrZzXIo[i].zzXIr()) {
                zzZ8E[] zzz8eArrZzXIp = zzz8dArrZzXIo[i].zzXIp();
                for (int i2 = 0; i2 != zzz8eArrZzXIp.length; i2++) {
                    iHashCode = (iHashCode ^ zzz8eArrZzXIp[i2].zzXIt().hashCode()) ^ zzW(zzz8eArrZzXIp[i2].zzXIs());
                }
            } else {
                iHashCode = (iHashCode ^ zzz8dArrZzXIo[i].zzXIq().zzXIt().hashCode()) ^ zzW(zzz8dArrZzXIo[i].zzXIq().zzXIs());
            }
        }
        return iHashCode;
    }

    private static boolean zzZ(boolean z, zzZ8D zzz8d, zzZ8D[] zzz8dArr) {
        if (z) {
            for (int length = zzz8dArr.length - 1; length >= 0; length--) {
                zzZ8D zzz8d2 = zzz8dArr[length];
                if (zzz8d2 != null && zzZ88.zzZ(zzz8d, zzz8d2)) {
                    zzz8dArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != zzz8dArr.length; i++) {
                zzZ8D zzz8d3 = zzz8dArr[i];
                if (zzz8d3 != null && zzZ88.zzZ(zzz8d, zzz8d3)) {
                    zzz8dArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
