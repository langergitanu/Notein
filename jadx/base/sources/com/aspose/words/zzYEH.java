package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEH implements Iterable<zzYEI> {
    private ArrayList<zzYEI> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final String getText() {
        StringBuilder sb = new StringBuilder();
        Iterator<zzYEI> it = this.zzZm.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzZAL);
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYEI> iterator() {
        return this.zzZm.iterator();
    }

    public final zzYEH zzYe4() {
        zzYEH zzyeh = new zzYEH();
        for (zzYEI zzyei : this.zzZm) {
            zzYEI zzyei2 = new zzYEI();
            zzyei2.zzZAL = zzyei.zzZAL;
            zzyei2.zzXqg = (zzYEF) zzyei.zzXqg.zzbn();
            zzyeh.zzZ(zzyei2);
        }
        return zzyeh;
    }

    public final zzYEI zzYe5() {
        return this.zzZm.get(0);
    }

    public final void zzZ(zzYEI zzyei) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzyei);
    }
}
