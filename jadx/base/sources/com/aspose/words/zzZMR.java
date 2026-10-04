package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMR implements Cloneable, Iterable<zzZMS> {
    private HashMap<Integer, zzZMS> zzYwo = new HashMap<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isDefault() {
        Iterator<zzZMS> it = iterator();
        while (it.hasNext()) {
            if (!it.next().isDefault()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZMS> iterator() {
        return this.zzYwo.values().iterator();
    }

    public final zzZMS zzB1(int i) {
        return (zzZMS) com.aspose.words.internal.zzQW.zzZ(this.zzYwo, Integer.valueOf(i));
    }

    public final void zzZ(int i, zzZMS zzzms) {
        this.zzYwo.put(Integer.valueOf(i), zzzms);
    }

    public final zzZMR zzZ(DocumentBase documentBase, zzZA5 zzza5) {
        zzZMR zzzmr = (zzZMR) memberwiseClone();
        zzzmr.zzYwo = new HashMap<>();
        for (Map.Entry<Integer, zzZMS> entry : this.zzYwo.entrySet()) {
            zzZMS zzzms = (zzZMS) entry.getValue().zzZ(true, zzza5);
            zzzms.zzY(documentBase);
            com.aspose.words.internal.zzZQF.zzY(zzzmr.zzYwo, entry.getKey(), zzzms);
        }
        return zzzmr;
    }
}
