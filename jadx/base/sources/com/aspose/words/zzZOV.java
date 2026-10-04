package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOV implements Iterable<zzZAY> {
    private ArrayList<zzZAY> zzYAP;

    private boolean zzZaX() {
        return this.zzYAP != null;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZAY> iterator() {
        return zzZaX() ? this.zzYAP.iterator() : com.aspose.words.internal.zzL2.zzIX();
    }

    public final Object zzA(Field field) {
        if (!zzZaX()) {
            return null;
        }
        Iterator<zzZAY> it = this.zzYAP.iterator();
        while (it.hasNext()) {
            Object objZzA = it.next().zzA(field);
            if (objZzA != null) {
                return objZzA;
            }
        }
        return null;
    }

    public final void zzX(zzZAY zzzay) {
        if (zzZaX()) {
            this.zzYAP.remove(zzzay);
            if (this.zzYAP.size() == 0) {
                this.zzYAP = null;
            }
        }
    }

    public final void zzZ(zzZAY zzzay) {
        if (!zzZaX()) {
            this.zzYAP = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYAP, zzzay);
    }

    public final zzTL zzz(Field field) throws Exception {
        if (!zzZaX()) {
            return null;
        }
        Iterator<zzZAY> it = this.zzYAP.iterator();
        while (it.hasNext()) {
            zzTL zztlZzz = it.next().zzz(field);
            if (zztlZzz != null) {
                return zztlZzz;
            }
        }
        return null;
    }
}
