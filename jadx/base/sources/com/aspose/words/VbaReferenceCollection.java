package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class VbaReferenceCollection implements Iterable<VbaReference> {
    private VbaProject zzYT3;
    private ArrayList<VbaReference> zzge = new ArrayList<>();

    public VbaReferenceCollection(VbaProject vbaProject) {
        this.zzYT3 = vbaProject;
    }

    public final VbaReference get(int i) {
        return this.zzge.get(i);
    }

    public final int getCount() {
        return this.zzge.size();
    }

    @Override // java.lang.Iterable
    @ReservedForInternalUse
    @Deprecated
    public final Iterator<VbaReference> iterator() {
        return this.zzge.iterator();
    }

    public final void remove(VbaReference vbaReference) {
        this.zzge.remove(vbaReference);
        this.zzYT3.zzXU4();
    }

    public final void removeAt(int i) {
        this.zzge.remove(i);
        this.zzYT3.zzXU4();
    }

    public final VbaReferenceCollection zzXTS() {
        VbaReferenceCollection vbaReferenceCollection = new VbaReferenceCollection(this.zzYT3);
        Iterator<VbaReference> it = this.zzge.iterator();
        while (it.hasNext()) {
            vbaReferenceCollection.zzZ(it.next().zzXTT());
        }
        return vbaReferenceCollection;
    }

    public final void zzZ(VbaReference vbaReference) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzge, vbaReference);
    }
}
