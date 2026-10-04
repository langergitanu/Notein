package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4W implements Iterable<zzY4X> {
    private ArrayList<zzY4X> zzZm = new ArrayList<>();

    @Override // java.lang.Iterable
    public final Iterator<zzY4X> iterator() {
        return this.zzZm.iterator();
    }

    public final com.aspose.words.internal.zzZOR zzU(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        Iterator<zzY4X> it = this.zzZm.iterator();
        while (it.hasNext()) {
            zzzor = it.next().zzZB(zzzor);
        }
        return zzzor;
    }

    public final void zzX(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzQ("Transforms")) {
            if (!"Transform".equals(zzo.getLocalName())) {
                throw new IllegalStateException("");
            }
            zzZ(zzY4X.zzM(zzo));
        }
    }

    public final void zzZ(zzY4X zzy4x) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzy4x);
    }

    public final void zzX(com.aspose.words.internal.zzP zzp) {
        if (this.zzZm.size() == 0) {
            return;
        }
        zzp.zzY("Transforms");
        Iterator<zzY4X> it = this.zzZm.iterator();
        while (it.hasNext()) {
            it.next().zzX(zzp);
        }
        zzp.zzo();
    }
}
