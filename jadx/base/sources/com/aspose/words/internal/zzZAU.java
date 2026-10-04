package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAU {
    private Hashtable zzWFX;

    public zzZAU(Hashtable hashtable) {
        this.zzWFX = new Hashtable();
        this.zzWFX = zzZ(hashtable);
    }

    private void zzZ(zzZDA zzzda, zzZAV zzzav) {
        Vector vector;
        Object obj = this.zzWFX.get(zzzda);
        if (obj == null) {
            this.zzWFX.put(zzzda, zzzav);
            return;
        }
        if (obj instanceof zzZAV) {
            vector = new Vector();
            vector.addElement(obj);
            vector.addElement(zzzav);
        } else {
            vector = (Vector) obj;
            vector.addElement(zzzav);
        }
        this.zzWFX.put(zzzda, vector);
    }

    public final zzZDJ zzV(zzZDA zzzda) {
        zzZDJ zzzdj = new zzZDJ();
        Object obj = this.zzWFX.get(zzzda);
        if (obj instanceof Vector) {
            Enumeration enumerationElements = ((Vector) obj).elements();
            while (enumerationElements.hasMoreElements()) {
                zzzdj.zzZ((zzZAV) enumerationElements.nextElement());
            }
        } else if (obj != null) {
            zzzdj.zzZ((zzZAV) obj);
        }
        return zzzdj;
    }

    public final zzZAV zzW(zzZDA zzzda) {
        Object obj = this.zzWFX.get(zzzda);
        return obj instanceof Vector ? (zzZAV) ((Vector) obj).elementAt(0) : (zzZAV) obj;
    }

    public final zzZDJ zzXJZ() {
        zzZDJ zzzdj = new zzZDJ();
        Enumeration enumerationElements = this.zzWFX.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (objNextElement instanceof Vector) {
                Enumeration enumerationElements2 = ((Vector) objNextElement).elements();
                while (enumerationElements2.hasMoreElements()) {
                    zzzdj.zzZ(zzZAV.zzYf(enumerationElements2.nextElement()));
                }
            } else {
                zzzdj.zzZ(zzZAV.zzYf(objNextElement));
            }
        }
        return zzzdj;
    }

    public zzZAU(zzZDJ zzzdj) {
        this.zzWFX = new Hashtable();
        for (int i = 0; i != zzzdj.size(); i++) {
            zzZAV zzzavZzYf = zzZAV.zzYf(zzzdj.zzg8(i));
            zzZ(zzzavZzYf.zzXK1(), zzzavZzYf);
        }
    }

    public zzZAU(zzZD2 zzzd2) {
        this.zzWFX = new Hashtable();
        for (int i = 0; i != zzzd2.size(); i++) {
            zzZAV zzzavZzYf = zzZAV.zzYf(zzzd2.zzg6(i));
            zzZ(zzzavZzYf.zzXK1(), zzzavZzYf);
        }
    }

    private static Hashtable zzZ(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }
}
