package com.aspose.words.internal;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6A implements zzZ6N {
    private final Hashtable zzWqX = new Hashtable();

    private Hashtable zzR(Map map) {
        zzZDA zzzdaZzYA;
        Hashtable hashtableZzY = zzY(this.zzWqX);
        zzZDA zzzda = zzZAR.zzWFS;
        if (!hashtableZzY.containsKey(zzzda) && (zzzdaZzYA = zzZDA.zzYA(map.get("contentType"))) != null) {
            zzZAV zzzav = new zzZAV(zzzda, new zzZC0(zzzdaZzYA));
            hashtableZzY.put(zzzav.zzXK1(), zzzav);
        }
        zzZDA zzzda2 = zzZAR.zzWFQ;
        if (!hashtableZzY.containsKey(zzzda2)) {
            zzZAV zzzav2 = new zzZAV(zzzda2, new zzZC0(new zzZAF(new Date())));
            hashtableZzY.put(zzzav2.zzXK1(), zzzav2);
        }
        zzZDA zzzda3 = zzZAR.zzWFR;
        if (!hashtableZzY.containsKey(zzzda3)) {
            zzZAV zzzav3 = new zzZAV(zzzda3, new zzZC0(new zzZC6((byte[]) map.get("digest"))));
            hashtableZzY.put(zzzav3.zzXK1(), zzzav3);
        }
        zzZDA zzzda4 = zzZAR.zzWFN;
        if (!hashtableZzY.contains(zzzda4)) {
            zzZAV zzzav4 = new zzZAV(zzzda4, new zzZC0(new zzZAS((zzZ86) map.get("digestAlgID"), (zzZ86) map.get("signatureAlgID"))));
            hashtableZzY.put(zzzav4.zzXK1(), zzzav4);
        }
        return hashtableZzY;
    }

    private static Hashtable zzY(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // com.aspose.words.internal.zzZ6N
    public final zzZAU zzS(Map map) {
        return new zzZAU(zzR(map));
    }
}
