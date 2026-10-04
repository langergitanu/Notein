package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDR implements Iterable<zzZDS> {
    private ArrayList<zzZDS> zzYki;

    public final int getCount() {
        ArrayList<zzZDS> arrayList = this.zzYki;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZDS> iterator() {
        ArrayList<zzZDS> arrayList = this.zzYki;
        return arrayList == null ? new ArrayList().iterator() : arrayList.iterator();
    }

    public final void remove(String str) {
        zzZDS zzzdsZzJH;
        com.aspose.words.internal.zzZYD.zzXk(str);
        if (this.zzYki == null || (zzzdsZzJH = zzJH(str)) == null) {
            return;
        }
        this.zzYki.remove(zzzdsZzJH);
    }

    public final zzZDS zzJH(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        if (this.zzYki == null) {
            return null;
        }
        for (int i = 0; i < this.zzYki.size(); i++) {
            zzZDS zzzds = this.zzYki.get(i);
            if (com.aspose.words.internal.zzZKN.equals(zzzds.getName(), str)) {
                return zzzds;
            }
        }
        return null;
    }

    public final void zzYXl() {
        ArrayList<zzZDS> arrayList = this.zzYki;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                this.zzYki.trimToSize();
            } else {
                this.zzYki = null;
            }
        }
    }

    public final void zzZ(zzZDS zzzds) {
        if (this.zzYki == null) {
            this.zzYki = new ArrayList<>();
        }
        if (zzJH(zzzds.getName()) == null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYki, zzzds);
        }
    }

    public final void zzZ(zzZI0 zzzi0) {
        ArrayList<zzZDS> arrayList = this.zzYki;
        if (arrayList == null) {
            return;
        }
        Iterator<zzZDS> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzi0);
        }
    }
}
