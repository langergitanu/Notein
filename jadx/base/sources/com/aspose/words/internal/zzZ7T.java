package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7T extends zzZDB {
    private Hashtable zzWqc = new Hashtable();
    private Vector zzWqb = new Vector();

    private zzZ7T(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZ7U zzz7uZzXb = zzZ7U.zzXb(enumerationZzXKE.nextElement());
            if (this.zzWqc.containsKey(zzz7uZzXb.zzXI0())) {
                throw new IllegalArgumentException("repeated extension found: " + zzz7uZzXb.zzXI0());
            }
            this.zzWqc.put(zzz7uZzXb.zzXI0(), zzz7uZzXb);
            this.zzWqb.addElement(zzz7uZzXb.zzXI0());
        }
    }

    public static zzZ7T zzR(zzZCY zzzcy) {
        return zzXa(zzZD4.zzX(zzzcy, false));
    }

    public static zzZ7T zzXa(Object obj) {
        if (obj instanceof zzZ7T) {
            return (zzZ7T) obj;
        }
        if (obj != null) {
            return new zzZ7T(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ7U zzQ(zzZDA zzzda) {
        return (zzZ7U) this.zzWqc.get(zzzda);
    }

    public final Enumeration zzXHX() {
        return this.zzWqb.elements();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        Enumeration enumerationElements = this.zzWqb.elements();
        while (enumerationElements.hasMoreElements()) {
            zzzdj.zzZ((zzZ7U) this.zzWqc.get((zzZDA) enumerationElements.nextElement()));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ7T(zzZ7U[] zzz7uArr) {
        for (int i = 0; i != zzz7uArr.length; i++) {
            zzZ7U zzz7u = zzz7uArr[i];
            this.zzWqb.addElement(zzz7u.zzXI0());
            this.zzWqc.put(zzz7u.zzXI0(), zzz7u);
        }
    }
}
